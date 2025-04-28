package steps;

import org.openqa.selenium.WebDriver;
import page.Page;

public class Step {

    WebDriver driver;
    Page page;

    public Step(WebDriver driver) {
        this.driver = driver;
        this.page = new Page(driver);  // Inicializas la variable 'page'
    }

    public void navegarA(String url) {
        driver.get(url);
    }



//----------------------------------------------------------------------

    public void inicioSesion(String usuario, String contrasena) {
        page.typeUsuario(usuario);
        page.typeContrasena(contrasena);
        page.login();
    }


    public void mensajerError() {
        page.mensajeError();
    }

    public void clickEnProductos() {
        page.selectProductos();
    }

    public void clickCarrito() {
        page.clickCarrito();
    }

    public void btnCheckout() {
        page.checkout();
    }


    public void formularioCheckout(String firtsName, String lastName, String zipCode) {
        page.typeFirstName(firtsName);
        page.typeLastName(lastName);
        page.typeZipCode(zipCode);
        page.clickContinue();
    }

    public void checkoutOverview() {
        page.checkoutOverview();
        page.clickFinish();
    }

    public void validarCompraExitosa() {
        page.compraExitosa();
    }
}

