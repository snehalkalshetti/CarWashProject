package CarWash;
import java.util.*;

public class User 
{
	Scanner sc = new Scanner(System.in);
	User()
	{
		userLogin();
	}
	public void userLogin() 
	{
               
        //SignUpPage s1 = new SignUpPage();
        //s1.SignUpPage();
        
        String username, userpassword;
        int num;
		        
        System.out.print("\nUser LogIn");
		
		System.out.print("\nEnter User name:");
		username = sc.nextLine();
		
		System.out.print("\nEnter Password:");
		userpassword = sc.nextLine();
        
		/*
		 * Using database here we will check Registration of User
		 * If user not present then we will go to Registration Page
		 */
		
		System.out.print("\nSuccessfully Logged in !!!!\n");
		
	  do 
	  {  
		System.out.print("\n1.Search places\n2.Booking availability \n3.Booking status\n4.Logout\n");
	    num=sc.nextInt();
	    
		switch(num)
		{
		case 1:searchPlaces();
		break;
		
		case 2:bookingavailability();
		break;
		
		case 3:bookingstatus();
		break;
		
		case 4:Logout();
		break;
		
		default:System.out.print("Enter correct number");
		break;
	    } 
	  }while(num <=4);
}
	public void searchPlaces() 
	{
	  System.out.print("Search Box...\n");
	  System.out.print("Enter the place to be searched...\n");
	  System.out.print("Puna\nMumbai\nSolapur....\n");
	}
	
	public void bookingavailability() 
	{
		System.out.print("First search will be from nearest City");
		System.out.print("Enter Date and Time Check In above city car wash system is available or not:\n");

	}
	public void bookingstatus() 
	{
		String Ans = "Yes";
		
		
		if(Ans=="Yes")
		{
			System.out.print("Booking confirmed\n");
		}
		else if(Ans == "No")
		{
			System.out.print("Booking Pending\n");
		}
		else
		{
			System.out.print("Booking Cancelled\n");
		}
	}
	public void Logout() 
	{
		System.out.print("\nClick on button of LogOut");
		try
		{
			Thread.sleep(3000);
			System.out.print("\nSuccessfully LoggedOut!!!");
		}
		catch(Exception expn)
		{
			System.out.println(expn);  
		}
		
	}
}
