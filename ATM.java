import java.util.Scanner;
public class ATM
{
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	     
	       int balance;
	   balance=sc.nextInt();
	
	    int pin;
	    pin=sc.nextInt();
	    
	    if(pin==123){
	          System.out.println("WELCOME");
	    }
	    
	    
	    System.out.println("1. DEPOSIT");
	    System.out.println("2. WITHDRAW");
	    System.out.println("3. BALANCE");
	  
	    int select;
	   select=sc.nextInt();
	   
	    if(select==1){
	        
	        System.out.println("How much amount do you want to deposit?"); 
	        
	        int Deposit;
	  
	   Deposit=sc.nextInt();
	   
	   
	    int pass;
	    pass=sc.nextInt();  
	    
	    if(pass==123){
	       
	        int balance1=balance+Deposit;
	     
	        System.out.println("Balance after Deposit : " +balance1);
	        System.out.println("DEPOSIT SUCCESS");
	       
	    }
	    }
	   
	    else if(select==2 && balance>=1000){
	   
	        System.out.println("How much amount do you want to withdraw?");
	        
	        int Withdraw;
	        
	   Withdraw=sc.nextInt();
	   
	    int pass;
	    pass=sc.nextInt();
	    
	    if(pass==123){
	        
	        int Balance2 = balance - Withdraw;
	        
	        System.out.println("Balance after Withdraw: " +Balance2  );
	    }
	    }
	  
	    else{
	        
	        System.out.println(+balance);
	         
	    }
	    
	    System.out.println("THANK YOU");
	    
	}
}
