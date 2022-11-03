package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

public class terminosCondiciones {


    static String texto ="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-basic-data\").shadowRoot.querySelector(\"#bdb-ml-basic-data > div.bdb-mol-basic-data__input > bdb-at-input\").shadowRoot.querySelector(\"#idNumber\")";
    static String clickBtnContinuar ="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-basic-data\").shadowRoot.querySelector(\"#bdb-ml-basic-data > div.bdb-mol-basic-data__button > button\")";
    static String txtGastosMensuales= "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-financial-data\").shadowRoot.querySelector(\"#gastos\").shadowRoot.querySelector(\"#Gastos\")";
    static String txtValorBienes= "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-financial-data\").shadowRoot.querySelector(\"#bienes\").shadowRoot.querySelector(\"#Bienes\")";
    static String txtValorDeudas= "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-financial-data\").shadowRoot.querySelector(\"#deudas\").shadowRoot.querySelector(\"#Deudas\")";
    static String clickBtnContinuar2 ="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-financial-data\").shadowRoot.querySelector(\"#boton\")";
    static String clickBtnTratamientoDatos = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#check__0\").shadowRoot.querySelector(\"#check_0 > div\")";
    static String clickBtnAcepCuentAhorro = "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#check__1\").shadowRoot.querySelector(\"#check_0 > div\")";
    static String clickBtnDeclaracionRecur= "return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#check__2\").shadowRoot.querySelector(\"#check_0 > div\")";
    static  String clickBtnContinuar3="return document.querySelector(\"#root > bdb-tp-progress > div > button\")";
    static String clickBtnFatca="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#check__3\").shadowRoot.querySelector(\"#check_0 > div\")";
    static String txtIngresepais="document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#fatca > div.container__fatca__input--sm > bdb-at-autocomplete\").shadowRoot.querySelector(\"#bdb-at-autocomplete > bdb-at-input\").shadowRoot.querySelector(\"#bdb-at-autocomplete\")";
    static String txtNumeroTributaria="document.querySelector(\"#root > bdb-tp-progress > bdb-ml-accept-docs\").shadowRoot.querySelector(\"#fatca > div.container__fatca__input--sm2 > bdb-at-input\").shadowRoot.querySelector(\"#bdb-at-input\")";

    static String txtToken1 ="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_0\")";
    static String txtToken2 ="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_1\")";
    static String txtToken3 ="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_2\")";
    static String txtToken4 ="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_3\")";
    static String txtToken5 ="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_4\")";
    static String txtToken6 ="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"#inputs > bdb-at-input-token\").shadowRoot.querySelector(\"#input_5\")";
    static String clickBtnContinuar4="return document.querySelector(\"#root > bdb-tp-progress > bdb-ml-bm-token\").shadowRoot.querySelector(\"div > div.bdb-ml-bm-token__actions > div.bdb-ml-bm-token__actions__send > button\")";
    static String btnFinalizar="return document.querySelector(\"#root > bdb-tp-progress > div.bdb-ml-otp__buttons > button.bdb-ml-otp__buttons__link.bdb-at-btn.bdb-at-btn--text.bdb-at-btn--lg\")";



    public  void Insertardata () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://terminosycondicionesnomina.labdigitalbdbtvsstg.com/token/5a6d4ecf-5596-40c8-b106-0f54aac2db44");
        System.out.println("------------------------------------------- paso 0 Cargar PG");
        Thread.sleep(8000);


        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                        .executeScript(texto)))
                .sendKeys("1024000034");
        System.out.println("-------------------------------------------1er paso ingresar Doc");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(clickBtnContinuar))).click();
        System.out.println("-------------------------------------------2do paso clic boton continuar");
        Thread.sleep(8000);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtGastosMensuales))).sendKeys("89000000");
        System.out.println("-------------------------------------------3ro Ingresar gastos mensuales");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtValorBienes))).sendKeys("39000000");
        System.out.println("-------------------------------------------4o Valor Bienes");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtValorDeudas))).sendKeys("78007760");
        System.out.println("-------------------------------------------5o Valor Deudas");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(clickBtnContinuar2))).click();
        System.out.println("-------------------------------------------6to clic boton continuar");
        Thread.sleep(9000);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(clickBtnTratamientoDatos))).click();
        System.out.println("-------------------------------------------7to clic boton clickBtnTratamientoDatos");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(clickBtnAcepCuentAhorro))).click();
        System.out.println("-------------------------------------------8to clic boton clickBtnAcepCuentAhorro");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(clickBtnDeclaracionRecur))).click();
        System.out.println("-------------------------------------------9to clic boton clickBtnDeclaracionRecur");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(clickBtnContinuar3))).click();
        System.out.println("-------------------------------------------11to clic boton ClickBtnContinuar3");

      /*

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(clickBtnFatca))).click();
        System.out.println("-------------------------------------------10o clic boton clickBtnfatca");

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtIngresepais))).sendKeys("Panamá");
        System.out.println("-------------------------------------------12to clic boton ClickBtnContinuar3");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtNumeroTributaria))).sendKeys("890988");*/
        Thread.sleep(8000);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtToken1))).sendKeys("3");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtToken2))).sendKeys("3");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtToken3))).sendKeys("3");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtToken4))).sendKeys("3");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtToken5))).sendKeys("3");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(txtToken6))).sendKeys("3");
        System.out.println("-------------------------------------------12to Ingresar token");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(clickBtnContinuar4))).click();

        Thread.sleep(8000);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((WebElement)((JavascriptExecutor)driver)
                .executeScript(btnFinalizar))).click();
        System.out.println("-------------------------------------------13to Clic btn finalizar");
        driver.quit();


    }
    }






