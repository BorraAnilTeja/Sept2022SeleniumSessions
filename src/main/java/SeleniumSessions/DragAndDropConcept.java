package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement dragEle = driver.findElement(By.id("draggable"));
		WebElement dropEle = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		act.dragAndDrop(dragEle, dropEle).build().perform();
	}

	}

