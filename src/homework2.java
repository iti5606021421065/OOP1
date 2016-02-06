import java.util.*;
public class homework2 {
// ข้อ2 Trik
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String round;
		boolean num1= true,num2 = false,num3=false,num4=false;
		
		System.out.printf("INPUT A,B,C  = ");
		round = scan.next();
		
		for(int i=0;i<round.length();i++)
		{
			char a;
			a = round.charAt(i);
			if((a != 'A') && (a != 'B') && (a != 'C'))
			{
				System.out.println("Error Character");
				round = " ";
			}
		}
		
		for(int i=0;i<round.length();i++)
		{
			char a;
			a = round.charAt(i);
			if(a == 'A')
			{
				num4 = num2;
				num2 = num1;
				num1 = num4;
			}
			else if(a == 'B')
			{
				num4 = num3;
				num3 = num2;
				num2 = num4;
			}
			else if(a == 'C')
			{
				num4 = num3;
				num3 = num1;
				num1 = num4;
			}
		}
		
		if(round.equals(" "))
		{
			
		}
		else if(num1)
		{
			System.out.println("1");
		}
		else if(num2)
		{
			System.out.println("2");
		}
		else if(num3)
		{
			System.out.println("3");
		}
	}

}
