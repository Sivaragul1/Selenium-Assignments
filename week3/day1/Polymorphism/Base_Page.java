package week3.day1;

// Superclass
public class Base_Page {

    public void findElement(String locator) {
        System.out.println("Finding element using: " + locator);
    }

    public void clickElement(String elementName) {
        System.out.println("Clicked on: " + elementName);
    }

    public void enterText(String text) {
        System.out.println("Entered text: " + text);
    }

    public void performCommonTasks() {
        System.out.println("Common tasks from BasePage.");
    }
}

// Subclass
class LoginPage extends Base_Page {

    @Override
    public void performCommonTasks() {
        System.out.println("Performing login-specific tasks in LoginPage.");
    }

    public static void main(String[] args) {
        // BasePage object
        Base_Page base = new Base_Page();
        base.findElement("id=username");
        base.clickElement("Login Button");
        base.enterText("admin");
        base.performCommonTasks();

        // LoginPage object
        LoginPage login = new LoginPage();
        login.findElement("id=loginField");
        login.clickElement("Submit Button");
        login.enterText("password123");
        login.performCommonTasks();
    }
}
