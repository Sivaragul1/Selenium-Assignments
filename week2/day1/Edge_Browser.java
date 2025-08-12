package week1.day3;

public class Edge_Browser {
	
    public static void main(String[] args) {
        Browser obj = new Browser();
        String name = obj.launchBrowser("Edge");
        System.out.println("Launched Browser: " + name);
        obj.loadUrl();
    }
}


