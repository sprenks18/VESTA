
TEST_EPIDOC = True
TEST_CLEAN  = False

if TEST_EPIDOC:
    import test_suite.epidoc
if TEST_CLEAN:
    import test_suite.clean