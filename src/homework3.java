import java.util.*;
public class homework3 {
//3 Ptice
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int round,num1=0,num2=0,num3=0;
		String Adrian,Bruno,Goran,answer="";
		
		Adrian="ABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABC";
		Bruno="BABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABC";
		Goran="CCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABB";
		
		System.out.printf("Input Round : ");
		round = scan.nextInt();
		while(round <=0 || round >100)
		{
			System.out.println("Error Round");
			System.out.printf("Input Round : ");
			round = scan.nextInt();
		}
		System.out.println();

		System.out.printf("Input Answer : ");
		answer = scan.next();
		while(answer.length() != round)
		{
			System.out.println("Error Answer");
			System.out.printf("Input Answer : ");
			answer = scan.next();
		}
		System.out.println();
		
		
		for(int i=0;i<round;i++)
		{
			if(answer.charAt(i) == Adrian.charAt(i))
			{
				num1 = num1 + 1;
			}
			if(answer.charAt(i) == Bruno.charAt(i))
			{
				num2 = num2 + 1;
			}
			if(answer.charAt(i) == Goran.charAt(i))
			{
				num3 = num3 + 1;
			}
		}
		
		
		
		if(num1 == num2)
		{
			if(num1 == num3)
			{
				System.out.println(num1);
				System.out.println("Adrian");
				System.out.println("Bruno");
				System.out.println("Goran");
			}
			else
			{
				System.out.println(num1);
				System.out.println("Adrian");
				System.out.println("Bruno");
			}
		}
		else if(num2 == num3)
		{
			System.out.println(num2);
			System.out.println("Bruno");
			System.out.println("Goran");
		}
		else if(num1 == num3)
		{
			System.out.println(num1);
			System.out.println("Adrian");
			System.out.println("Goran");
		}
		else if(num1 > num2)
		{
			if(num1 > num3)
			{
				System.out.println(num1);
				System.out.println("Adrian");
			}
			else
			{
				System.out.println(num3);
				System.out.println("Goran");
			}
		}
		else if(num2 > num3)
		{
			System.out.println(num2);
			System.out.println("Bruno");
		}
		else 
		{
			System.out.println(num3);
			System.out.println("Goran");
		}
	}

}