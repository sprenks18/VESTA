"""
This file contains test cases for the different standards recognized by the parser.
As interesting and complicated examples are found they should be added here.
Examples that break the parser should be added here before and after the fix is applied.
"""

from main import translate

# Test newlines (\n)
content  = "Mortus\nErcolanius"
expected = "<lb n=\"1\"/>\nMortus\n<lb n=\"2\"/>\nErcolanius"
assert translate(content) == expected, "Newline (escape) failed"

# Test newlines (<br>)
content  = "Mortus<br>Ercolanius"
expected = "<lb n=\"1\"/>\nMortus\n<lb n=\"2\"/>\nErcolanius"
assert translate(content) == expected, "Newline (br) failed"

# Test newlines (<BR>)
content  = "Mortus<BR>Ercolanius"
expected = "<lb n=\"1\"/>\nMortus\n<lb n=\"2\"/>\nErcolanius"
assert translate(content) == expected, "Newline (BR) failed"

# Test newlines (<BR> with spaces)
content  = "Mortus <BR> Ercolanius"
expected = "<lb n=\"1\"/>\nMortus\n<lb n=\"2\"/>\nErcolanius"
assert translate(content) == expected, "Newline (BR with spaces) failed"

# Test abbreviation
content  = "C(aius) Vettius Firmus"
expected = "<lb n=\"1\"/>\n<expan><abbr>C</abbr><ex>aius</ex></expan> Vettius Firmus"
assert translate(content) == expected, "Abbreviation failed"

# Test uncertain abbreviation
content  = "C(aius?) Vettius Firmus"
expected = "<lb n=\"1\"/>\n<expan><abbr>C</abbr><ex cert=\"low\">aius</ex></expan> Vettius Firmus"
assert translate(content) == expected, "Uncertain abbreviation failed"

# Test unknown abbreviation
content  = "C(---) Vettius Firmus"
expected = "<lb n=\"1\"/>\n<abbr>C</abbr> Vettius Firmus"
assert translate(content) == expected, "Unknown abbreviation failed"

# Test misspelling
content  = "Anneus (:Annaeus)"
expected = "<lb n=\"1\"/>\n<choice><reg>Annaeus</reg><orig>Anneus</orig></choice>"
assert translate(content) == expected, "Misspelling failed"

# Test uncertain misspelling
content  = "Anneus (:Annaeus?)"
expected = "<lb n=\"1\"/>\n<choice><reg cert=\"low\">Annaeus</reg><orig>Anneus</orig></choice>"
assert translate(content) == expected, "Uncertain misspelling failed"

# Test misspelling (no space)
content  = "Mamium(:Mammium) Anicetum"
expected = "<lb n=\"1\"/>\n<choice><reg>Mammium</reg><orig>Mamium</orig></choice> Anicetum"
assert translate(content) == expected, "Misspelling (no space) failed"

# Test uncertain misspelling (no space)
content  = "Mamium(:Mammium?) Anicetum"
expected = "<lb n=\"1\"/>\n<choice><reg cert=\"low\">Mammium</reg><orig>Mamium</orig></choice> Anicetum"
assert translate(content) == expected, "Uncertain misspelling (no space) failed"

# Test figural
content  = "((:cervus))"
expected = "<lb n=\"1\"/>\n<figure><figDesc>cervus</figDesc></figure>"
assert translate(content) == expected, "Figural failed"

# Test unclear (single)
content  = "VIC&#803;IC"
expected = "<lb n=\"1\"/>\nVI<unclear>C</unclear>IC"
assert translate(content) == expected, "Unclear (single) failed"

# Test unclear (many)
content  = "l&#803;u&#803;c&#803;i&#803;a&#803;n&#803;"
expected = "<lb n=\"1\"/>\n<unclear>lucian</unclear>"
assert translate(content) == expected, "Unclear (many) failed"

# Test missing character (single)
content  = "Par&#818;is"
expected = "<lb n=\"1\"/>\nPa<supplied reason=\"undefined\" evidence=\"previouseditor\">r</supplied>is"
assert translate(content) == expected, "Missing character (single) failed"

# Test missing characters (many)
content  = "P&#818;a&#818;r&#818;i&#818;s&#818;"
expected = "<lb n=\"1\"/>\n<supplied reason=\"undefined\" evidence=\"previouseditor\">Paris</supplied>"
assert translate(content) == expected, "Missing characters (many) failed"

# Test missing characters and misspelling combination
content  = "Pars&#818; (:Paris)"
expected = "<lb n=\"1\"/>\n<choice><reg>Paris</reg><orig>Par<supplied reason=\"undefined\" evidence=\"previouseditor\">s</supplied></orig></choice>"
assert translate(content) == expected, "Missing characters + misspelling failed"

# Test lost character
content  = "[F]usci"
expected = "<lb n=\"1\"/>\n<supplied reason=\"lost\">F</supplied>usci"
assert translate(content) == expected, "Lost character failed"

# Test lost characters
content  = "[haustus pulchrum opus] est tenui"
expected = "<lb n=\"1\"/>\n<supplied reason=\"lost\">haustus pulchrum opus</supplied> est tenui"
assert translate(content) == expected, "Lost characters failed"

# Test nested abbrev in lost characters
content  = "[haustus pulchrum op(us)] est tenui"
expected = "<lb n=\"1\"/>\n<supplied reason=\"lost\">haustus pulchrum <expan><abbr>op</abbr><ex>us</ex></expan></supplied> est tenui"
assert translate(content) == expected, "Nested abbrev in lost characters failed"

# Test lost characters uncertain
content  = "[haustus pulchrum opus?] est tenui"
expected = "<lb n=\"1\"/>\n<supplied reason=\"lost\" cert=\"low\">haustus pulchrum opus</supplied> est tenui"
assert translate(content) == expected, "Lost characters uncertain failed"

# Test gap unknown
content  = "[---]foro"
expected = "<lb n=\"1\"/>\n<gap reason=\"lost\" extent=\"unknown\" unit=\"character\"/>foro"
assert translate(content) == expected, "Gap unknown failed"

# Test gap unknown (with spaces)
content  = "[- - -]foro"
expected = "<lb n=\"1\"/>\n<gap reason=\"lost\" extent=\"unknown\" unit=\"character\"/>foro"
assert translate(content) == expected, "Gap unknown (with spaces) failed"

# Test erased
content  = "[[Neronis]] Caesaris"
expected = "<lb n=\"1\"/>\n<del rend=\"erasure\"><supplied reason=\"lost\">Neronis</supplied></del> Caesaris"
assert translate(content) == expected, "Erased failed"

# Test illegible
content  = "Ver+++"
expected = "<lb n=\"1\"/>\nVer<gap reason=\"illegible\" quantity=\"3\" unit=\"character\"/>"
assert translate(content) == expected, "Illegible failed"

# Test unknown missing lines
content  = "------<br>Augustus"
expected = "<lb n=\"1\"/>\n<gap reason=\"lost\" extent=\"unknown\" unit=\"line\"/>\n<lb n=\"2\"/>\nAugustus"
assert translate(content) == expected, "Unknown missing lines failed"

# Test missing lines
content  = "[------]<br>[------]<br>[------]<br>Augustus"
expected = "<lb n=\"1\"/>\n<gap reason=\"lost\" extent=\"3\" unit=\"line\"/>\n<lb n=\"2\"/>\nAugustus"
assert translate(content) == expected, "Missing lines failed"

# Test surplus
content = "{Aus} Augustiana"
expected = "<lb n=\"1\"/>\n<surplus>Aus</surplus> Augustiana"
assert translate(content) == expected, "Surplus failed"

# Test Greek uppercase
content = "&#913;&#916;&#931;"
expected = "<lb n=\"1\"/>\nΑΔΣ"
assert translate(content) == expected, "Greek uppercase failed"

# Test Greek lowercase
content = "&#945;&#950;&#948;"
expected = "<lb n=\"1\"/>\nαζδ"
assert translate(content) == expected, "Greek lowercase failed"

# Test Greek missing
content = "&#945;&#818;"
expected = "<lb n=\"1\"/>\n<supplied reason=\"undefined\" evidence=\"previouseditor\">α</supplied>"
assert translate(content) == expected, "Greek missing failed"

# Test Greek and Latin
content = "&#913;&#916;&#931;ABC"
expected = "<lb n=\"1\"/>\nΑΔΣABC"
assert translate(content) == expected, "Greek and Latin failed"

# Test joined letters
content = "M&#770;a&#770;i"
expected = "<lb n=\"1\"/>\n<hi rend=\"ligature\">Mai</hi>"
assert translate(content) == expected, "Joined letters failed"

# Test joined letters in abbreviation
content = "M&#770;a&#770;i(as)"
expected = "<lb n=\"1\"/>\n<expan><abbr><hi rend=\"ligature\">Mai</hi></abbr><ex>as</ex></expan>"
assert translate(content) == expected, "Joined letters failed"

# Test symbol
content = "((denarius))"
expected = "<lb n=\"1\"/>\n<expan><abbr><am><g type=\"denarius\"/></am></abbr><ex>denarius</ex></expan>"
assert translate(content) == expected, "Symbol failed"

# Test lost characters
content = "[+4?+]"
expected = "<lb n=\"1\"/>\n<gap reason=\"lost\" quantity=\"4\" unit=\"character\" precision=\"low\"/>"
assert translate(content) == expected, "Lost characters failed"

# Test lost characters
content = "Quartill[-]a"
expected = "<lb n=\"1\"/>\nQuartill<gap reason=\"lost\" quantity=\"1\" unit=\"character\"/>a"
assert translate(content) == expected, "Lost characters known failed"

# Test lost characters
content = "Quartill[-------]a"
expected = "<lb n=\"1\"/>\nQuartill<gap reason=\"lost\" quantity=\"7\" unit=\"character\"/>a"
assert translate(content) == expected, "Lost characters known failed"

# Test empty space
content = "MM\n<:vacat>\nM"
expected = "<lb n=\"1\"/>\nMM\n<lb n=\"2\"/>\n<space/>\n<lb n=\"3\"/>\nM"
assert translate(content) == expected, "Empty space (vacat) failed"

# Test empty space html
content = "MM\n&#12296;:vacat&#12297;\nM"
expected = "<lb n=\"1\"/>\nMM\n<lb n=\"2\"/>\n<space/>\n<lb n=\"3\"/>\nM"
assert translate(content) == expected, "Empty space (vacat html) failed"

# Test space for door
content = "IIIII &#12296;:ianua&#12297; IIIII"
expected = "<lb n=\"1\"/>\nIIIII <space type=\"door\"/> IIIII"
assert translate(content) == expected, "Empty space (vacat html) failed"

# Test subaudible brackets
content = "&#12296;:servus&#12297;"
expected = "<lb n=\"1\"/>\n<supplied reason=\"subaudible\">servus</supplied>"
assert translate(content) == expected, "Subaudible (brackets) failed"

# Test subaudible parens
content = "(servus)"
expected = "<lb n=\"1\"/>\n<supplied reason=\"subaudible\">servus</supplied>"
assert translate(content) == expected, "Subaudible (parens) failed"

# Test omitted parens
content = "<Aug>ustus"
expected = "<lb n=\"1\"/>\n<supplied reason=\"omitted\">Aug</supplied>ustus"
assert translate(content) == expected, "Omitted failed"

# Test extra newline
content = "Augustus<br>"
expected = "<lb n=\"1\"/>\nAugustus"
assert translate(content) == expected, "Extra newline failed"

# Test space before a newline
content = "Ic (:hic) sumus \n"
expected = "<lb n=\"1\"/>\n<choice><reg>hic</reg><orig>Ic</orig></choice> sumus"
assert translate(content) == expected, "Extra newline failed"

# Test lost letters and gap
# content = "Quartill[a ---]"
# expected = "<lb n=\"1\"/>\nQuartill<supplied reason=\"lost\">a</supplied> <gap reason=\"lost\" extent=\"unknown\" unit=\"character\"/>"
# assert translate(content) == expected, "Lost letters and gap failed"

