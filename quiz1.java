/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{   
    public static void staircase(int n) {
        
        for(int i = 0; i < n; i++){
            
            for(int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            
            for(int k = 0; k <= i; k++) {
               System.out.print("*");
            }
            
            System.out.print("\n");
        }
    }
    
	public static void main(String[] args) {
		staircase(6);
	}
}
