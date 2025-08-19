package week3.day1;

// Superclass
public class Test_Data {
    public void enterCredentials() {
        System.out.println("Entered credentials successfully.");
    }

    public void navigateToHomePage() {
        System.out.println("Navigated to Home Page.");
    }
}

// Subclass
class LoginTestData extends Test_Data {
    public void enterUsername() {
        System.out.println("Username entered.");
    }

    public void enterPassword() {
        System.out.println("Password entered.");
    }

    public static void main(String[] args) {
        // Create object of subclass
        LoginTestData login = new LoginTestData();

        // Call methods from subclass and superclass
        login.enterUsername();
        login.enterPassword();
        login.enterCredentials();
        login.navigateToHomePage();
    }
}

