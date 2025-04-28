# new feature
# Tags: optional

Feature: Login exitoso


    @test
    Scenario Outline: Login Sauce Labs
        Given Estoy en la pagina de Swag Labs
        And  ingreso mis datos "<Usuario>" y "<Contrasena>"
        Examples:
            | Usuario       | Contrasena   |
            | standard_user | secret_sauce |