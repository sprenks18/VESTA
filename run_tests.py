
from benchmarks import data_test

# Unit Tests
TEST_EPIDOC = False
TEST_CLEAN  = False

#Benchmarks
EDR_DATA = True

DATA_FILE = "filtered-results.csv"
SAVE_FILE = "fails/fails_05_23_23.txt"

if TEST_EPIDOC:
    import test_suite.epidoc
if TEST_CLEAN:
    import test_suite.clean
if EDR_DATA:
    data_test.successRate(DATA_FILE, SAVE_FILE)