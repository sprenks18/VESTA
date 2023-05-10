
import csv, random
from main import translate

with open("filtered-results.csv", "r", encoding="utf-8") as file:
    reader = csv.reader(file)
    data = [(row[0], row[3]) for row in reader]
    # data = random.sample(data, 100)
    fail_count = 0
    success = 0
    for ID, content in data:
        if (success + fail_count) % 25 == 0: print("Count -", success+fail_count)
        try:
            translate(content)
            success += 1
        except:
            fail_count += 1
            print(ID)
            # print(content)
    print("Successes:", success)
    print("Failures:", fail_count)
    