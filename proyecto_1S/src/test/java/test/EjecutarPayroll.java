package test;

import control.elementos.ObjetosConfigAux;
import evidencia.doc.pdf.AdminDocPdf;
import io.github.bonigarcia.wdm.WebDriverManager;
import manager.param.AdminParam;
import model.Ambientes;
import model.DispositivoPrueba;
import model.Navegadores;
import model.TipoCone;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.ejecutarFlujoPayroll.*;

import java.io.IOException;

public class EjecutarPayroll {

    public class TestRecargas {

        ObjetosConfigAux objAux;


        //esto se realiza para cargar los objetos
        @BeforeTest
        public void before() throws IOException, InterruptedException {

            WebDriverManager.chromedriver().setup();

        }


        @Test(priority = 1)
        public void Caso1() throws IOException, InterruptedException {
            objAux.AdminDocPdf = new AdminDocPdf(Ambientes.PROYECTOS, Navegadores.CHROME, DispositivoPrueba.WEB);
            objAux.AdminParam = new AdminParam(TipoCone.EXCEL, "Home");
            objAux.AdminParam.ObtenerParametros();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.mohmal.com/es");
            driver.manage().window().maximize();
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id=\"choose\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"enterEmail\"]/div[1]/input")).sendKeys("pruebas1");
            driver.findElement(By.id("next")).click();
            driver.findElement(By.id("create")).click();
            System.out.println("-------------------------------------------Se crea la cuenta satisfacoriamente");
            Thread.sleep(500);
            //driver.findElement(By.xpath("//*[contains(text(),'Renovar')]")).click();
            System.out.println("-------------------------------------------Clic en el boton renovar");
            driver.findElement(By.xpath("//*[contains(text(),'Renovar')]")).click();
            
            System.out.println("-------------------------------------------Se genero el token");
            Thread.sleep(8000);
            driver.findElement(By.xpath("//*[contains(text(),'Renovar')]")).click();
            driver.findElement(By.xpath("//*[contains(text(),'Renovar')]")).click();
            System.out.println("-------------------------------------------Clic en el boton renovar");
            driver.findElement(By.xpath("//*[@id=\"inbox-table\"]/tbody/tr/td[1]/a")).click();
            System.out.println("-------------------------------------------Dar clic en el correo bandeja de entrada");
            Thread.sleep(1500);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,250)");
            System.out.println("-------------------------------------------Damos scroll para que se visualice todo el correo");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[contains(text(),'Renovar')]")).sendKeys(Keys.TAB);
        }

}}
