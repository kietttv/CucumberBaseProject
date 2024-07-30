Feature: Manage Category

  Background:
    Given user loged in the CMS system

  Scenario Outline: Add new category
    Given user has access to the Category page
    When user has finished entering category name <name> information
    And user has finished entering category parent <parent> information
    And user has finished entering category ordering number <ordering number> information
    And user has finished entering category type <type> information
    And user has finished entering category banner <banner> information
    And user has finished entering category icon <icon> information
    And user has finished entering category meta title <meta title> information
    And user has finished entering category meta description <meta description> information
    And user has finished entering category filter attibutes <filter attibutes> information
    And click the save button
    Then the categories page <url> is displays

    Examples:
      | name            | parent | ordering number | type | banner | icon | meta title                 | meta description                 | filter attibutes | url                                                 |
      | ""              | ""     | "1"             | ""   | ""     | ""   | "Test category meta title" | "Test category meta description" | ""               | "https://cms.anhtester.com/admin/categories/create" |
      | "Test category" | ""     | "0"             | ""   | ""     | ""   | "Test category meta title" | "Test category meta description" | ""               | "https://cms.anhtester.com/admin/categories"        |
      | "Test category" | ""     | "-1"            | ""   | ""     | ""   | "Test category meta title" | "Test category meta description" | ""               | "https://cms.anhtester.com/admin/categories"        |
      | "Test category" | ""     | "1"             | ""   | ""     | ""   | ""                         | "Test category meta description" | ""               | "https://cms.anhtester.com/admin/categories"        |
      | "Test category" | ""     | "1"             | ""   | ""     | ""   | "Test category meta title" | ""                               | ""               | "https://cms.anhtester.com/admin/categories"        |
      | "Test category" | ""     | "1"             | ""   | ""     | ""   | "Test category meta title" | "Test category meta description" | ""               | "https://cms.anhtester.com/admin/categories"        |

  Scenario Outline: Update the Category existing
    Given user has access to the Category page
    When user search a category existing <categoryName>
    And user edit the category information
    And click the save button
    Then the message <message> displays
    Examples:
      | categoryName    | message                                  |
      | "Test category" | "Category has been updated successfully" |