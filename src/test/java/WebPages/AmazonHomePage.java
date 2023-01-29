package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {

	static WebElement element = null;

	public static WebElement textbox_product_search(WebDriver driver) {

		element = driver.findElement(By.id("twotabsearchtextbox"));
		return element;

	}

	public static WebElement button_Search(WebDriver driver) {

		element = driver.findElement(By.id("nav-search-submit-button"));
		return element;

	}

	public static WebElement product_Selection(WebDriver driver) {
		element = driver.findElement(By.linkText("Gimbal Stabilizer for Smartphone with Extendable Bluetooth Selfie Stick and Tripod, 1-Axis Multifunction Remote 360°Automatic Rotation, Auto Balance iPhone/Android"));
						return element;
	}

	public static WebElement product_AddToCart(WebDriver driver) {
		element = driver.findElement(By.id("add-to-cart-button"));
		return element;
	}

}