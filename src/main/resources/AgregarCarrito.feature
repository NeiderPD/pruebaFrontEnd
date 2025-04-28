# new feature
# Tags: optional

Feature: Login exitoso


    @test
    Scenario Outline: Login Sauce Labs
        Given Estoy en la pagina de Swag Labs
        And  ingreso mis datos "<Usuario>" y "<Contrasena>"
        And  selecciono  mis productos
        And  hago click en carrito
        And  valido el carrito y doy click en el boton checkout
        And  completo la informacion de checkout "<firstName>"  "<lastName>" "<zipCode>" y doy click en continuar
        And  valido el Overview y doy click en Finish
        And  visualizo compra exitosa
        Examples:
            | Usuario       | Contrasena   |firstName|lastName|zipCode|
            | standard_user | secret_sauce |Neider   |Perez   |1234   |
