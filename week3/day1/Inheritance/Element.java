package week3.day1;

public class Element extends Button {

    public static void main(String[] args) {

        // Button
        Button b=new Button();
        b.click();
        b.settext("Hello");
        b.submit();

        // Text Field
        TextField t=new TextField();
        t.click();
        t.settext("Madam");
        t.gettext();

        // Radio Button
        RadioButton rb=new RadioButton();
        rb.click();
        rb.settext("Sir");
        rb.submit();
        rb.selectradiobuttoon();

        // Check Box
        CheckBox ch=new CheckBox();
        ch.click();
        ch.clickcheckButton();
        ch.submit();

    }

}
