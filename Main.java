package CarWash;
import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("******Welcome to Car Wash System******"
				+ "\n\n1.User \n2.Admin\nPlease enter the right number\n");
		num = sc.nextInt();
				   
		switch(num)
		{
		case 1:
			User u1 = new User();
			break;
		case 2:
			Admin A1 = new Admin();	
			break;
		}					
	}

}
