"""
This file contains test cases for the different standards recognized by the parser.
As interesting and complicated examples are found they should be added here.
Examples that break the parser should be added here before and after the fix is applied.
"""

from clean_main import translate

# Test newlines (\n)
content  = "Mortus\nErcolanius"
expected = "Mortus\nErcolanius"
assert translate(content) == expected, "Newline (escape) failed"

# Test newlines (<br>)
content  = "Mortus<br>Ercolanius"
expected = "Mortus\nErcolanius"
assert translate(content) == expected, "Newline (br) failed"

# Test newlines (<BR>)
content  = "Mortus<BR>Ercolanius"
expected = "Mortus\nErcolanius"
assert translate(content) == expected, "Newline (BR) failed"

# Test newlines (<BR> with spaces)
content  = "Mortus <BR> Ercolanius"
expected = "Mortus\nErcolanius"
assert translate(content) == expected, "Newline (BR with spaces) failed"

# Test abbreviation
content  = "C(aius) Vettius Firmus"
expected = "Caius Vettius Firmus"
assert translate(content) == expected, "Abbreviation failed"

# Test uncertain abbreviation
content  = "C(aius?) Vettius Firmus"
expected = "Caius Vettius Firmus"
assert translate(content) == expected, "Uncertain abbreviation failed"

# Test unknown abbreviation
content  = "C(---) Vettius Firmus"
expected = "C Vettius Firmus"
assert translate(content) == expected, "Unknown abbreviation failed"

# Test misspelling
content  = "Anneus (:Annaeus)"
expected = "Annaeus"
assert translate(content) == expected, "Misspelling failed"

# Test uncertain misspelling
content  = "Anneus (:Annaeus?)"
expected = "Annaeus"
assert translate(content) == expected, "Uncertain misspelling failed"

# Test misspelling (no space)
content  = "Mamium(:Mammium) Anicetum"
expected = "Mammium Anicetum"
assert translate(content) == expected, "Misspelling (no space) failed"

# Test uncertain misspelling (no space)
content  = "Mamium(:Mammium?) Anicetum"
expected = "Mammium Anicetum"
assert translate(content) == expected, "Uncertain misspelling (no space) failed"

# Test figural
content  = "((:cervus))"
expected = "((:cervus))"
assert translate(content) == expected, "Figural failed"

# Test unclear (single)
content  = "VIC&#803;IC"
expected = "VICIC"
assert translate(content) == expected, "Unclear (single) failed"

# Test unclear (many)
content  = "l&#803;u&#803;c&#803;i&#803;a&#803;n&#803;"
expected = "lucian"
assert translate(content) == expected, "Unclear (many) failed"

# Test missing character (single)
content  = "Par&#818;is"
expected = "Paris"
assert translate(content) == expected, "Missing character (single) failed"

# Test missing characters (many)
content  = "P&#818;a&#818;r&#818;i&#818;s&#818;"
expected = "Paris"
assert translate(content) == expected, "Missing characters (many) failed"

# Test missing characters and misspelling combination
content  = "Pars&#818; (:Paris)"
expected = "Paris"
assert translate(content) == expected, "Missing characters + misspelling failed"

# Test lost character
content  = "[F]usci"
expected = "Fusci"
assert translate(content) == expected, "Lost character failed"

# Test lost characters
content  = "[haustus pulchrum opus] est tenui"
expected = "haustus pulchrum opus est tenui"
assert translate(content) == expected, "Lost characters failed"

# Test nested abbrev in lost characters
content  = "[haustus pulchrum op(us)] est tenui"
expected = "haustus pulchrum opus est tenui"
assert translate(content) == expected, "Nested abbrev in lost characters failed"

# Test lost characters uncertain
content  = "[haustus pulchrum opus?] est tenui"
expected = "haustus pulchrum opus est tenui"
assert translate(content) == expected, "Lost characters uncertain failed"

# Test gap unknown
content  = "[---]foro"
expected = "foro"
assert translate(content) == expected, "Gap unknown failed"

# Test gap unknown (with spaces)
content  = "[- - -]foro"
expected = "foro"
assert translate(content) == expected, "Gap unknown (with spaces) failed"

# Test erased
content  = "[[Neronis]] Caesaris"
expected = "Neronis Caesaris"
assert translate(content) == expected, "Erased failed"

# Test illegible
content  = "Ver+++"
expected = "Ver"
assert translate(content) == expected, "Illegible failed"

# Test unknown missing lines
content  = "------<br>Augustus"
expected = "Augustus"
assert translate(content) == expected, "Unknown missing lines failed"

# Test missing lines
content  = "[------]<br>[------]<br>[------]<br>Augustus"
expected = "Augustus"
assert translate(content) == expected, "Missing lines failed"

# Test surplus
content = "{Aus} Augustiana"
expected = "Augustiana"
assert translate(content) == expected, "Surplus failed"

# Test Greek uppercase
content = "&#913;&#916;&#931;"
expected = "ΑΔΣ"
assert translate(content) == expected, "Greek uppercase failed"

# Test Greek lowercase
content = "&#945;&#950;&#948;"
expected = "αζδ"
assert translate(content) == expected, "Greek lowercase failed"

# Test Greek missing
content = "&#945;&#818;"
expected = "α"
assert translate(content) == expected, "Greek missing failed"

# Test Greek and Latin
content = "&#913;&#916;&#931;ABC"
expected = "ΑΔΣABC"
assert translate(content) == expected, "Greek and Latin failed"

# Test joined letters
content = "M&#770;a&#770;i"
expected = "Mai"
assert translate(content) == expected, "Joined letters failed"

# Test joined letters in abbreviation
content = "M&#770;a&#770;i(as)"
expected = "Maias"
assert translate(content) == expected, "Joined letters failed"

# Test symbol
content = "((denarius))"
expected = "denarius"
assert translate(content) == expected, "Symbol failed"

# Test lost characters
content = "[+4?+]"
expected = ""
assert translate(content) == expected, "Lost characters failed"

# Test lost characters
content = "Quartill[-]a"
expected = "Quartilla"
assert translate(content) == expected, "Lost characters known failed"

# Test lost characters
content = "Quartill[-------]a"
expected = "Quartilla"
assert translate(content) == expected, "Lost characters known failed"

# Test empty space
content = "MM\n<:vacat>\nM"
expected = "MM\n\nM"
assert translate(content) == expected, "Empty space (vacat) failed"

# Test empty space html
content = "MM\n&#12296;:vacat&#12297;\nM"
expected = "MM\n\nM"
assert translate(content) == expected, "Empty space (vacat html) failed"

# Test space for door
content = "IIIII &#12296;:ianua&#12297; IIIII"
expected = "IIIII IIIII"
assert translate(content) == expected, "Empty space (vacat html) failed"

# Test subaudible brackets
content = "&#12296;:servus&#12297;"
expected = "servus"
assert translate(content) == expected, "Subaudible (brackets) failed"

# Test subaudible parens
content = "(servus)"
expected = "servus"
assert translate(content) == expected, "Subaudible (parens) failed"

# Test omitted parens
content = "<Aug>ustus"
expected = "Augustus"
assert translate(content) == expected, "Omitted failed"

# Test extra newline
content = "Augustus<br>"
expected = "Augustus"
assert translate(content) == expected, "Extra newline failed"

# Test space before a newline
content = "Ic (:hic) sumus \n"
expected = "hic sumus"
assert translate(content) == expected, "Extra newline failed"

# Test lost letters and gap
# content = "Quartill[a ---]"
# expected = "<lb n=\"1\"/>\nQuartill<supplied reason=\"lost\">a</supplied> <gap reason=\"lost\" extent=\"unknown\" unit=\"character\"/>"
# assert translate(content) == expected, "Lost letters and gap failed"

