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
print(translate(content))
assert translate(content) == expected, "Greek lowercase failed"

# Test Greek missing
content = "&#945;&#818;"
expected = "<lb n=\"1\"/>\n<supplied reason=\"undefined\" evidence=\"previouseditor\">α</supplied>"
assert translate(content) == expected, "Greek missing failed"