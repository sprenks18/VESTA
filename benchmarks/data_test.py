
import csv
from main import translateToEpidoc as translate



def successRate(filename, failname):
    with open(filename, "r", encoding="utf-8") as file:
        reader = csv.reader(file)
        data = [(row[0], row[3]) for row in reader]
        fail_count = 0
        success = 0
        ids = []
        for ID, content in data:
            if (success + fail_count) % 25 == 0: print("Count -", success+fail_count)
            try:
                # Remove excess periods and commas
                content = content.replace(".", "").replace(",","")
                translate(content)
                success += 1
            except:
                fail_count += 1
                ids.append(ID)
    with open(failname, "w", encoding="utf-8") as file:
        for i in ids:
            file.write(i + "\n")
        file.write("Successes: " + str(success) + "\n")
        file.write("Failures: " + str(fail_count) + "\n")
        file.write("Success Rate: " + str(success / (success + fail_count) * 100) + "%")
    