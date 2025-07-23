package dayTwo;

public class Strings {

	public static void main(String[] args) {
				
		// finding length
		String text = "Deepali";
		System.out.println(text.length()); 
		
		
		// String Indexing indexOf()
        String str = "USA country";
        System.out.println(str.indexOf("country"));
        
        // Concatenation 
        String first_name = "Mary";
        String last_name = "Alice";
        
        System.out.println(first_name + " " + last_name);
        System.out.println(first_name.concat(" "+last_name));
        
        // String with number
        String a = "20";
        int b = 24;
        String c= a + b;
        System.out.println(c);
        
        // String Special Characters
         // \", \', \n, \t
        
        String t = "hello \"coders\" doing well";
        System.out.println(t);
        

        String message = "hello \nworld";
        System.out.println(message);
        

	}

}
