/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{   
    public static boolean specialCase(String str) {
        String specialPatternRegex = "[!@#$%^&*()-+]";
        
        Pattern r = Pattern.compile(specialPatternRegex, Pattern.CASE_INSENSITIVE); 
        Matcher m = r.matcher(str);
  
       return m.find();
    }
    
    public static boolean atLeastOneDigit(String str) {
        String specialPatternRegex = "[^0-9]";
        
        Pattern r = Pattern.compile(specialPatternRegex, Pattern.CASE_INSENSITIVE); 
        Matcher m = r.matcher(str);
  
       return m.find();
    }
    
    public static boolean downCase(String str) {
        String specialPatternRegex = "[^a-z]";
        
        Pattern r = Pattern.compile(specialPatternRegex, Pattern.CASE_INSENSITIVE); 
        Matcher m = r.matcher(str);
  
        return m.find();
    }
    
    public static int minimunChars(String str) {
        if (str.length() >= 6) {
            return 0;
        } else {
           return ((str.length() - 6) * -1);
        }
    }
    
    public static boolean upperCase(String str) {
        String specialPatternRegex = "[^A-Z]";
        
        Pattern r = Pattern.compile(specialPatternRegex, Pattern.CASE_INSENSITIVE); 
        Matcher m = r.matcher(str);
        
        return m.find();
    }
    
    public static void strongPassword(String str) {
       if(minimunChars(str) == 0 && specialCase(str) && atLeastOneDigit(str) && downCase(str) && upperCase(str)) {
            System.out.println("Você tem uma senha forte.");
       } else if (minimunChars(str) != 0) {
           System.out.println("Você precisa de mais caracteres: " + minimunChars(str));
       } else {
           System.out.println("Sua senha ainda não está forte o suficiente.");
       }
      
    }
    
	public static void main(String[] args) {
		strongPassword("Ya33123123");
	}
}
