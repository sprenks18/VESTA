
import random, webbrowser

with open("fails.txt", "r", encoding="utf-8") as file:
    fails = [l.strip() for l in file.readlines() if l.startswith("AGP")]

fails = random.sample(fails, 25)
for f in fails:
    webbrowser.open("http://ancientgraffiti.org/Graffiti/graffito/%s" % (f,))