package org.example.BrowserLaunchers;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import java.time.Duration;
import java.util.Scanner;

public class browserLauncherUsingSel4 {

    public static void main(String[] args){

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser = Scan.nextLine().toLowerCase();

        WebDriver driver = null;

        switch(browser) {

            case "chrome":
                 driver = new ChromeDriver();
                break;
            case "Firefox":
                 driver = new FirefoxDriver();
                break;
            case "edge":
                 driver = new EdgeDriver();
                break;
            default:
                System.out.println("invalid browser");
                System.exit(0);

        }

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }
}
