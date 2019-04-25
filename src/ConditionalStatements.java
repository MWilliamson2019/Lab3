import java.util.Scanner;

public class ConditionalStatements {
	   public static void main (String [] args) { 
			  
		// TODO Auto-generated method stub
	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter Your First Name");
		
	String userName = scnr.nextLine();
	System.out.println(userName);
		   
	int Number;
    Scanner scnr2 = new Scanner(System.in);
    System.out.println(userName + " enter an integer between 1 and 100");
    Number = scnr2.nextInt();        
    if(Number% 2 == 1 ) {
    System.out.print(Number%2 + " Odd");
    	
    } 

    //Number = scnr.nextInt();
    if( Number % 2 == 0 && Number >= 2 && Number <= 25    ) {
      System.out.print(Number%2 + "less than 25");    
      }
    
    else if( Number % 2 == 0 && Number >= 26 && Number <= 60) {
    	System.out.print("Even");
    }
    	
    else if( Number % 2 == 0 && Number <= 1 && Number >= 60) {
    	System.out.print("Odd and over" +  60);
    
    	
    
    //else if (condition) {
    	
//    } else {
    	
//    }
//	
//   
//   else if(Number > 1 && Number < 60) {
//    System.out.println("Even and less than 25");
//    
//    }else{
//    System.out.println(Number + " Even");
//    
//   
//    System.out.println("Odd and over 60");
//    
//    System.out.println("Good Bye UserName:");
//    
//  
//    }
//    
    }	
    
	   }
	   
	   }
 
    
    
   /*
    System.out.print(integer + "odd ");
     
    int integer;
	int integer = even;
	if (range (2 to 25)) { 
    System.out.println("Even and less than 25");
		
	int integer = even;
    if (even(26 to 60)) {
	System.out.println("Even");
	
  	int num = even;
    if(integer > 60);
	System.out.println("Even");
	
    
    (integer is odd && > 60);
	System.out.println("Odd and over 60:" + integer);
    }
	
	*/
		// TODO Auto-generated method stub

	

