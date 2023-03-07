import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
    public static void main(String[] args) {
        // Configura o WebDriverManager para o Chrome
        WebDriverManager.chromedriver().setup();

        // Instancia o objeto WebDriver para o Chrome
        WebDriver driver = new ChromeDriver();

            // Navega até a página de login do Instagram
            driver.get("https://www.instagram.com/accounts/login/");

            // Insere as informações de login nos campos de usuário e senha

        driver.findElement(By.cssSelector("//*[@id=\"loginForm\"]/div/div[3]")).sendKeys("seu_usuario");
            driver.findElement(By.name("password")).sendKeys("sua_senha");

            // Clica no botão "Entrar"
            driver.findElement(By.xpath("//button[@type='submit']"))
                    .click();

            // Valida se o login foi bem-sucedido
            Assert.assertTrue("Não foi possível fazer o login no Instagram",
                    driver.getCurrentUrl().contains("instagram.com"));
        }



}



