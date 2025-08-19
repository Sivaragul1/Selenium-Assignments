package week3.day1;

public class API_Client {

    // Method 1: one argument
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to: " + endpoint);
    }

    // Method 2: overloaded
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        System.out.println("Request Status: " + requestStatus);
    }

    public static void main(String[] args) {
        API_Client client = new API_Client();
        client.sendRequest("end point");
        client.sendRequest("end point", "Body", true);
        client.sendRequest("webpage", "exist", false);
    }
}

