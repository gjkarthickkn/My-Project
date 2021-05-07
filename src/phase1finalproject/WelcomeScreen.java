package phase1finalproject;

import java.util.Scanner;
public class WelcomeScreen {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		FileName abc=new FileName();
		CreateFile def = new CreateFile();
		DeleteFile ghi=new DeleteFile();
		FileSearch jkl=new FileSearch();
		CloseApplicaion mno=new CloseApplicaion();
		System.out.println("------Welcome to LockedMe.com-----");
		System.out.println("   Developed by : Karthick G J    ");
		System.out.println("Contact Details : gjkt93@gmail.com");
		System.out.println("for any queries write a mail to us");
		System.out.println("----------------------------------");
		System.out.println("Your Menu Options Are as Follows");
		System.out.println("Choose 1 : To show current file name in root directory in ascending order");
		System.out.println("Choose 2 : To show options to Create, Delete and Search file");
		System.out.println("Choose 3 : To Exit App");
		System.out.println("Please Enter Your Option:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number>3)
		{
			System.out.println("Please Enter a Valid Option");
		}
		if (number<1)
		{
			System.out.println("Please Enter a Valid Option");
		}
		if (number==1)
		{
			abc.main(args);
			WelcomeScreen.main(args);
		}
		
		if (number==3)
		{
			mno.main(args);
		}
		if (number==2)
		{
			System.out.println("Choose 1 : To Add a file to the existing directory list");
			System.out.println("Choose 2 : To Delete a user specified file from the existing directory list");
			System.out.println("Choose 3 : To Search a user specified file from the main directory");
			System.out.println("Choose 4 : To return to the main context");
			System.out.println("Please Enter Your Option:");
			Scanner input1 = new Scanner(System.in);
			int number1 = input1.nextInt();
			if (number1>4)
			{
				System.out.println("Please Enter a Valid Option");
			}
			if (number1<1)
			{
				System.out.println("Please Enter a Valid Option");
			}
			if (number1==1)
			{
				def.main(args);
				WelcomeScreen.main(args);
			}
			if (number1==2)
			{
				ghi.main(args);
				WelcomeScreen.main(args);
			}
			if (number1==3)
			{
				jkl.main(args);
				WelcomeScreen.main(args);
				
			}
			if(number1==4)
			{
				WelcomeScreen.main(args);
			}
		}
	}
}
		