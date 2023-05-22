
from benchmarks import data_test

# Unit Tests
TEST_EPIDOC = False
TEST_CLEAN  = False

#Benchmarks
EDR_DATA = True

if TEST_EPIDOC:
    import test_suite.epidoc
if TEST_CLEAN:
    import test_suite.clean
if EDR_DATA:
    data_test.successRate("filtered-results.csv",
                          "fails.txt")