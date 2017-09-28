Feature: Verify that Cucumber is running

  Scenario: Cucumber tests run from Gradle
    Given A working build
    When I add 34 and 45
    Then The result should be 79