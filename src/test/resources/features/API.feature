@apif
Feature: End to end test

  Description:The purpose

  Book Store Swagger URL : http://bookstore.toolsqa.com/swagger/index.html

  Background: user generates token for Authorisation

    Given I am an authorized user

    Scenario: Authorized user is able to Add and Remove book
      Given A list of books are available
      When I add a book to my reading list
      Then The book is added
      When I remove a book from my reading list
      Then The book is removed
