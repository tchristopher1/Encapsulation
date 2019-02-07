import java.util.Scanner;

class Password1 {

public static int value = printDirections();
public static int printDirections() {
    
    System.out.println("Welcome to Password Checker.");
    System.out.println("Please create a password that has at least 10 characters.");
    System.out.println("Your password must include at least one capital letter and one number between (1-9).");

    return 0;

}

public static void main (String [] args) {

    String enterPass;
    
    Scanner enter = new Scanner (System.in);
            
    System.out.print("\r\nTry Your Password: ");
    enterPass = enter.next();             
    System.out.println(Validate(enterPass));        
    System.out.println("");
    
    main(args);

}

public static String Validate (String Pass) {

    String outcome = "Your password meets the criteria. Thanks for playing.";
    
    int passLength = 0;                   
    int numbers = 0;
    int caps = 0;
    
    for ( int x = 0; x < Pass.length(); x++ ) {
        
        if (( Pass.charAt(x) > 48 && Pass.charAt(x) < 58 )) {
            numbers++;
        }
        
        
        if ((Pass.charAt(x) > 64 && Pass.charAt(x) < 91 )) {
            caps++;
        
        }
        
        
        
        passLength = (x + 1);                   

    }
    
    if ( numbers < 1 ){                                 
        
        outcome = "Please add at least one number (1-9) to your password.";
        
    }
    
    if ( caps < 1 ){
    
            outcome = "Please add at least one capital letter.";
    
    }
   

    if ( passLength < 10 ){                              
        
        outcome = "Please make your password longer.";
        
    }
                  
    return (outcome);                        
    
}
