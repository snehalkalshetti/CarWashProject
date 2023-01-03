package CarWash;
import java.util.*;

public class Admin 
{
	Scanner sc = new Scanner(System.in);
	Admin()
	{
		loginAdmin();
	}

	public void loginAdmin()
	{
		
       // Scanner sc = new Scanner(System.in);
		
		String adminname, adminpassword;
		int num;
		
		System.out.print("Enter Admin name:");
		adminname = sc.nextLine();
		
		System.out.print("Enter Password:");
		adminpassword = sc.nextLine();
		
		System.out.print("Successfully Logged !!!!");
	  do 
	  {
		  
		System.out.print("\n1.Add places\n2.Add Services\n3.View bookings\n4.AcceptReject");
	    num=sc.nextInt();
	    
		switch(num)
		{
		case 1:addPlaces();
		break;
		
		case 2:addServices();
		break;
		
		case 3:viewBookings();
		break;
		
		case 4:AcceptReject();
		break;
		
		default:System.out.print("Enter correct number");
			break;
	    }
		
	  }while(num<=4);
}

	public void AcceptReject()
	{
		// TODO Auto-generated method stub
		System.out.print("Service will be accepted or rejected on the basis of bookings");
		/*
		 * Here we can write a query to chake the Car can be washed or not
		 */
	}

	public void addPlaces() 
	{
		String cityname;
		
		System.out.print("Enter the respective city name:\n");
		cityname = sc.nextLine();
				
		System.out.print("\nEntered CityName: "+cityname);
		
	}
	public void addServices()
	{
		
		 System.out.print("\nServices provided are:");
		 System.out.println("\n1.Full Service Handwash\n2.Automated Car Wash Services\n3.Automated Full Service Wash");
		 System.out.println("Choose the Service\n");
		 
	}
	public void viewBookings() 
	{
		System.out.print("Upcoming bookings are....");
		System.out.print("Maruti Car");
		System.out.print("Nano Car...\n");
	}
	
}
