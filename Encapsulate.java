public class Encapsulate 
{ 
    // private variables declared  
    // can only be accessed by public methods of class 
    private String password; 
    private int numCap = 0;
    private int numCount = 0;

    // get method for name to access  
    // private variable geekName 
    public String getPassword()  
    { 
      return password; 
    } 
   
    // set method for name to access  
    // private variable geekName 
    public void setPassword(String newPassword) 
    { 
    	for(int i = 0; i < newPassword.length(); i++){
            if(Character.isUpperCase(newPassword.charAt(i))){
               numCap++;
            }
            if(Character.isDigit(newPassword.charAt(i))) {
            	numCount++;
            }
         }
    	if(newPassword.length() > 15 || newPassword.length() < 10) {
    		System.out.println("Make sure the password is within the correct length requirements.");
    	}else if (numCap < 1) {
    		System.out.println("Make sure you have a Capital Letter in the Password.");
    	}else if (numCount < 1) {
    		System.out.println("Make sure you have at least one number in the password");
    	}else {
    	    password = newPassword;
    	    
    	    System.out.println("The password: " + password + " fits all requirements!");
    	}

    } 
      

} 