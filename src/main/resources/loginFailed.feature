# new feature
# Tags: optional

Feature: Login fallido


    @test
    Scenario Outline: Login Sauce Labs
        Given Estoy en la pagina de Swag Labs
        And  ingreso mis datos "<Usuario>" y "<Contrasena>"
        Then evidenciamos el mensaje de error
        Examples:
            | Usuario       | Contrasena   |
            | locked_out_user | secret_sauce |