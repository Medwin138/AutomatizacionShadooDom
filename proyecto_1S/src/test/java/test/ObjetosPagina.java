package test;

import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import control.elementos.ObjetosConfigAux;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;


public class ObjetosPagina {


    ObjetosConfigAux objAux;
    static String texto1 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-basic-data\").shadowRoot.querySelector(\"#bdb-ml-basic-data > div.bdb-mol-basic-data__input > bdb-at-input\").shadowRoot.querySelector(\"#idNumber\")";
    static String clickBtnContinuar1 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-basic-data\").shadowRoot.querySelector(\"#bdb-ml-basic-data > div.bdb-mol-basic-data__button > button\")";
    static String txtGastosMensuales1 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-financial-data\").shadowRoot.querySelector(\"#gastos\").shadowRoot.querySelector(\"#Gastos\")";
    static String txtValorBienes1 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-financial-data\").shadowRoot.querySelector(\"#bienes\").shadowRoot.querySelector(\"#Bienes\")";
    static String txtValorDeudas1 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-financial-data\").shadowRoot.querySelector(\"#deudas\").shadowRoot.querySelector(\"#Deudas\")";
    static String clickBtnContinuar21 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-financial-data\").shadowRoot.querySelector(\"#boton\")";
    static String clickBtnTratamientoDatos1 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#check__0\").shadowRoot.querySelector(\"#check_0 > div\")";
    static String clickBtnAcepCuentAhorro1 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#check__1\").shadowRoot.querySelector(\"#check_0 > div\")";
    static String clickBtnDeclaracionRecur1 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#check__2\").shadowRoot.querySelector(\"#check_0 > div\")";
    static String clickBtnContinuar31 = "return document.querySelector(\"#root > bdb-tp-progress > div > button\")";
    static String clickBtnFatca1 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#check__3\").shadowRoot.querySelector(\"#check_0 > div\")";
    static String txtIngresepais1 = "document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#fatca > div.container__fatca__input--sm > bdb-at-autocomplete\").shadowRoot.querySelector(\"#bdb-at-autocomplete > bdb-at-input\").shadowRoot.querySelector(\"#bdb-at-autocomplete\")";
    static String txtNumeroTributaria1 = "document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#fatca > div.container__fatca__input--sm2 > bdb-at-input\").shadowRoot.querySelector(\"#bdb-at-input\")";
    static String txtToken11 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_0\")";
    static String txtToken21 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_1\")";
    static String txtToken31 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_2\")";
    static String txtToken41 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_3\")";
    static String txtToken51 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_4\")";
    static String txtToken61 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_5\")";
    static String clickBtnContinuar41 = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"div > div.bdb-ml-bm-token__actions > div.bdb-ml-bm-token__actions__send > button\")";
    static String btnFinalizar1 = "return document.querySelector(\"#root > bdb-tp-progress > div.bdb-ml-otp__buttons > button.bdb-ml-otp__buttons__link.bdb-at-btn.bdb-at-btn--text.bdb-at-btn--lg\")";

    public ObjetosPagina(ObjetosConfigAux objAux) {
        this.objAux = objAux;

    }

    @BeforeTest
    public void chromedriver() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mohmal.com/es");
        driver.manage().window().maximize();

    }


    public void Texto1() throws IOException {

        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                        .executeScript(texto1))).sendKeys("1024000034");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void clickBtnContinuar() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(clickBtnContinuar1))).click();
        System.out.println("-------------------------------------------2do paso clic boton continuar");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtGastosMensuales() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtGastosMensuales1))).sendKeys("89000000");
        System.out.println("-------------------------------------------3ro Ingresar gastos mensuales");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtValorBienes() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtValorBienes1))).sendKeys("39000000");
        System.out.println("-------------------------------------------4o Valor Benes");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtValorDeudas() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtValorDeudas1))).sendKeys("78007760");
        System.out.println("-------------------------------------------5o Valor Deudas");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void clickBtnContinuar2() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(clickBtnContinuar21))).click();
        System.out.println("-------------------------------------------6to clic boton continuar");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());

    }

    public void clickBtnTratamientoDatos() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(clickBtnTratamientoDatos1))).click();
        System.out.println("-------------------------------------------7to clic boton clickBtnTratamientoDatos");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void clickBtnAcepCuentAhorro() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(clickBtnAcepCuentAhorro1))).click();
        System.out.println("-------------------------------------------8to clic boton clickBtnAcepCuentAhorro");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void clickBtnDeclaracionRecur() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(clickBtnDeclaracionRecur1))).click();
        System.out.println("-------------------------------------------9to clic boton clickBtnDeclaracionRecur");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void clickBtnContinuar31() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(clickBtnContinuar31))).click();
        System.out.println("-------------------------------------------11to clic boton ClickBtnContinuar3");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void clickBtnFatca() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(clickBtnFatca1))).click();
        System.out.println("-------------------------------------------10o clic boton clickBtnfatca");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtIngresepais() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtIngresepais1))).sendKeys("Panamá");
        System.out.println("-------------------------------------------12to clic boton ClickBtnContinuar3");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtNumeroTributaria() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtNumeroTributaria1))).sendKeys("890988");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtToken1() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtToken11))).sendKeys("3");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtToken2() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtToken21))).sendKeys("3");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtToken3() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtToken31))).sendKeys("3");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtToken4() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtToken41))).sendKeys("3");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtToken5() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtToken51))).sendKeys("3");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void txtToken6() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(txtToken61))).sendKeys("3");
        System.out.println("-------------------------------------------12to Ingresar token");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void clickBtnContinuar4() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(clickBtnContinuar41))).click();
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }

    public void btnFinalizar() throws IOException {
        WebDriver driver = new ChromeDriver();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) driver)
                .executeScript(btnFinalizar1))).click();
        System.out.println("-------------------------------------------13to Clic btn finalizar");
        objAux.AdminDocPdf.generaEvidencia("Texto1 Ingreso", objAux.getDriver());
    }


    public void Flujofeliz() throws IOException {

        // int x=0;
        // while (x<=3)
        // {

        Texto1();
        clickBtnContinuar();
        txtGastosMensuales();
        txtGastosMensuales();
        txtValorBienes();
        txtValorDeudas();
        clickBtnContinuar2();
        clickBtnTratamientoDatos();
        clickBtnAcepCuentAhorro();
        clickBtnDeclaracionRecur();
        clickBtnContinuar31();
        clickBtnFatca();
        txtIngresepais();
        txtNumeroTributaria();
        txtToken1();
        txtToken2();
        txtToken3();
        txtToken4();
        txtToken5();
        txtToken6();
        clickBtnContinuar4();
        btnFinalizar();
        // x= x +1;
        // }
    }


}
