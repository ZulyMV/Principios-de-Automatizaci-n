#Autor: Zuly Mejia

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screemplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Brandon wants to learn automation at the academy choucair
      | strUser    | StrPassword   |
      | 1121958708 | Choucair2021* |
    When he search for the course on the choucair academy platform
      | strCourse               |
      | ISTQB Agile Tester Extension  |
    Then he finds the course called resources
      | strCourse               |
      | ISTQB Agile Tester Extension |