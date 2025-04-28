package stepsdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.Step;

public class StepsDef {
    private Step Sauce;
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\neide\\OneDrive\\Desktop\\DRIVER\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Given("Estoy en la pagina de Swag Labs")
    public void estoyEnLaPaginaDeSwagLabs() {
        Sauce = new Step(driver);
        Sauce.navegarA("https://www.saucedemo.com/");
    }

//---------------------------------------------------------------------------------

    @And("ingreso mis datos {string} y {string}")
    public void ingresoMisDatosY(String usuario, String contrasena) {
        Sauce.inicioSesion(usuario,contrasena);
    }

    @Then("evidenciamos el mensaje de error")
    public void evidenciamosElMensajeDeError() {
        Sauce.mensajerError();
    }

    @And("selecciono  mis productos")
    public void seleccionoMisProductos() {
        Sauce.clickEnProductos();
    }

    @And("hago click en carrito")
    public void hagoClickEnCarrito() {
        Sauce.clickCarrito();
    }

    @And("valido el carrito y doy click en el boton checkout")
    public void validoElCarritoYDoyClickEnElBotonCheckout() {
        Sauce.btnCheckout();
    }


    @And("completo la informacion de checkout {string}  {string} {string} y doy click en continuar")
    public void completoLaInformacionDeCheckoutYDoyClickEnContinuar(String firtsName, String lastName, String zipCode) {
        Sauce.formularioCheckout(firtsName,lastName,zipCode);
    }

    @And("valido el Overview y doy click en Finish")
    public void validoElOverviewYDoyClickEnFinish() {
        Sauce.checkoutOverview();
    }

    @And("visualizo compra exitosa")
    public void visualizoCompraExitosa() {
        Sauce.validarCompraExitosa();
    }
}

