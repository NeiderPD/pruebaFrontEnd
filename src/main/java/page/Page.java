package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class Page {
    private final WebDriverWait wait;
    private WebDriver driver;  // ya no es estática
//loquizador de campos
    public static By inputUser = By.xpath("//input[@id='user-name']");
    public static By inputPassword =By.xpath("//input[@id='password']");
    public static By loginButton=By.xpath("//input[@id='login-button']");
    public static By mensajeDeError=By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out')]");
    public static By btnAddToCartBag=By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static By btnAddToCartBike=By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    public static By carrito=By.xpath("///a[@class='shopping_cart_link']");
    public static By btnCheckout=By.xpath("//a[@class='shopping_cart_link']");
    public static By campoFirstName = By.xpath("//input[@id='first-name']");
    public static By campoLastName = By.xpath("//input[@id='last-name']");
    public static By campoZipCode = By.xpath("//input[@id='postal-code']");
    public static By btnFormularioContinue = By.xpath("//input[@id='continue']");
    public static By checkOverview = By.xpath("//span[@class='title']");
    public static By btnFinish = By.xpath("//button[@id='finish']");
    public static By compraExitosa = By.xpath("//img[@alt='Pony Express']");


    public Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void typeUsuario(String usuario) {
        WebElement userInput = driver.findElement(inputUser);
        userInput.sendKeys(usuario);
    }

    public void typeContrasena(String contrasena) {
        WebElement passwordInput = driver.findElement(inputPassword);
        passwordInput.sendKeys(contrasena);
    }

    public void login() {
        WebElement btnLogin = driver.findElement(loginButton);
        btnLogin.click();
    }

    public void mensajeError() {
        wait.until(ExpectedConditions.elementToBeClickable(mensajeDeError));
    }

    public void selectProductos() {
        wait.until(ExpectedConditions.elementToBeClickable(btnAddToCartBag));
        WebElement botonAddToCart=driver.findElement(btnAddToCartBag);
        botonAddToCart.click();
        WebElement botonAddToCartBike=driver.findElement(btnAddToCartBike);
        botonAddToCartBike.click();
    }

    public void clickCarrito() {
        WebElement btnCarrito = driver.findElement(carrito);
        btnCarrito.click();

    }

    public void checkout() {
        wait.until(ExpectedConditions.elementToBeClickable(btnCheckout));
        WebElement botonCheckout=driver.findElement(btnCheckout);
        botonCheckout.click();
    }

    public void typeFirstName(String firtsName) {
        wait.until(ExpectedConditions.elementToBeClickable(campoFirstName));
        WebElement inputFirstName = driver.findElement(campoFirstName);
        inputFirstName.sendKeys(firtsName);
    }

    public void typeLastName(String lastName) {
        WebElement inputLastName = driver.findElement(campoLastName);
        inputLastName.sendKeys(lastName);
    }

    public void typeZipCode(String zipCode) {
        WebElement inputZipCode = driver.findElement(campoZipCode);
        inputZipCode.sendKeys(zipCode);
    }

    public void clickContinue() {
        WebElement botonFormContinue=driver.findElement(btnFormularioContinue);
        botonFormContinue.click();

    }

    public void checkoutOverview() {
        wait.until(ExpectedConditions.elementToBeClickable(checkOverview));
    }

    public void clickFinish() {
        WebElement botonFinish=driver.findElement(btnFinish);
        botonFinish.click();

    }

    public void compraExitosa() {
        wait.until(ExpectedConditions.elementToBeClickable(compraExitosa));
    }
}

