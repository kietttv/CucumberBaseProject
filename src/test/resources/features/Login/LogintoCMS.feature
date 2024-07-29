Feature: Login CMS

  Scenario Outline: Login success
    Given User navigate to Login page <url>
    When user enter email <emailStr> and password <passwordStr>
    And click login button
    Then user redirect to admin page <adminPageUrl>
    Examples:
      | url                               | emailStr            | passwordStr         | adminPageUrl                      |
      | "https://cms.anhtester.com/login" | "admin@example.com" | "123456"            | "https://cms.anhtester.com/admin" |
      | "https://cms.anhtester.com/login" | "admin@example.com" | "truongvantuankiet" | "https://cms.anhtester.com/login" |
      | "https://cms.anhtester.com/login" | "truongvantuankiet" | "123456"            | "https://cms.anhtester.com/login" |