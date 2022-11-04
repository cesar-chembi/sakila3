Feature: Adds an actor to the database
  As a user, I would like to add an actor to the database

  Scenario: Successfully added an actor to the database
    Given a users desired actor
    When a user inputs the actor
    Then the actor should be added
