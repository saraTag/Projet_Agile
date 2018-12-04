#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: US_01 Commande Client
  En tant que Client
  Je veux pouvoir commander les produits de la carte 
  Afin de recevoir manger les produits que je souhaite

  @tag1
  Scenario: Commande 	avec menu
    Given Un restaurant existe 
    And il y a un client
    When le client commande un menu dans ce restaurant
    Then Valider que le prix du menu est affiche 
    And Valider que le prix correspond a la somme des produits du menu

  @tag2
  Scenario: Commande avec boisson
    Given Un restaurant existe 
    And il y a un client
    When le client commande une boisson dans ce restaurant
    Then Valider que le prix du produit est affiche 
   
 