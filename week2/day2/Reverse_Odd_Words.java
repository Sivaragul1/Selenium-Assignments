package week2.day2;

public class Reverse_Odd_Words {

	public static void main(String[] args) {
		
        String test = "I am a software tester";
        String[] words = test.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            
            if (i % 2 != 0) {
                
                String reversed = "";
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    reversed += words[i].charAt(j);
                }
                words[i] = reversed; 
            }
        }
        
        String result = "";
        for (String word : words) {
            result += word + " ";
        }

        System.out.println(result.trim());
    }
}