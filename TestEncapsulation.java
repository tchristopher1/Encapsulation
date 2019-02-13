import java.util.Scanner;

public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
    	Scanner in = new Scanner(System.in);
        Encapsulate obj = new Encapsulate(); 
    	
    	
    	System.out.println("Please enter a password, 10-15 characters, use numbers and letters, must contain at least one Capital.");

    	//Use setPassword to write to value
        obj.setPassword(in.next()); 

               
    } 
} 
