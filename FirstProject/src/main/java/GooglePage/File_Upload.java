package GooglePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestNgBase.ProjectSpecificMethods;
import design.Locators;

public class File_Upload extends ProjectSpecificMethods{
	
	public File_Upload clickSearch() {
		try {
			click(Locators.xpath,"//div[@class='nDcEnd']");
			reportStep("icon pressed", "pass");
		} catch (Exception e) {
			reportStep("unable to press icon", "fail");
			e.printStackTrace();
		}
		return this;
	}
	
	public File_Upload uploadimage(){
		WebElement uploadButton = getDriver().findElement(By.xpath("//span[contains(text(),'upload a file')]"));
		fileupload(uploadButton, "C:\\Users\\rahul\\testleaf\\FirstProject\\src\\main\\java\\UploadData\\desktop-wallpaper-kung-fu-panda-master-shifu-meditating-master-shifu.jpg");
		return this;
	}
}
