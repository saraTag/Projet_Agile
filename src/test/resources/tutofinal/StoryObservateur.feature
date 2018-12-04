#Author: your.email@your.domain.com
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
Feature: US_00 Preparation des commnde
  En tant qu'adjoint
  Je veux etre alerte lorsqu'une commande est faite dans  mon restaurant
  Afin que je puisse preparer la commande du client

 @tag1
Scenario: Alerter l'adjoint
Given un restauarnt existe
And un adjoint est afecté à ce restaurant
And un client accede au restaurant
When le client passe une commande
Then l'adoit est entrain de preparer 


 @tag2
 Scenario: Preparer la commande
 Given un client passe une commande dans un restaurant
 And  l'adjoint est alerte
 When l'adjoint prepare la commande

 Then  la commande est a l'etat in progress

  @tag2
  Scenario: Terminer la commande
Given un restauarnt existe
And un adjoint est affecte à ce restaurant
And un client passe une commande dans ce restaurant
When valide la commande
Then valider que la commande est au statut done
And Commande terminee est affiche
