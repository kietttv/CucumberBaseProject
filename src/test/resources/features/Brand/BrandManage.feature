Feature: Manage Brand

  Background:
    Given user loged in the CMS system

  Scenario: Add a new brand
    Given user is on the Brand Management page
    When user enters the brand name "Kiet Test Brand"
    And user uploads the brand logo "path/to/logo.png"
    And user enters the brand meta title "Kiet meta title"
    And user enters the brand meta description "This is a Kiet test brand"
    And user clicks the save button
    Then the message "Brand has been inserted successfully" is displayed
    And the new brand "Kiet Test Brand" appears in the brand list

  Scenario: Edit an existing brand
    Given user is on the Brand Management page
    And the brand "Kiet Test Brand" exists
    When user clicks the edit button for "Kiet Test Brand"
    And user updates the brand name to " is edited"
    And user clicks the save button
    Then the message "Brand has been updated successfully" is displayed
    And the updated brand "Kiet Test Brand is edited" appears in the brand list

  Scenario: Delete a brand
    Given user is on the Brand Management page
    And the brand "Kiet Test Brand" exists
    When user clicks the delete button
    And user confirms the deletion
    Then the message "Brand has been deleted successfully" is displayed
    And the brand "Kiet Test Brand" does not appear in the brand list

