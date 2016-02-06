import java.util.*;
public class homework1 {	
//ข้อ 1 Seven Dwarves
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,sum;
		
		
		System.out.printf("Enter number People1 : ");
		num1 = scan.nextInt();
		while(num1 >= 100)
		{
			System.out.println("Error Score");
			System.out.printf("Enter number People1 : ");
			num1 = scan.nextInt();
			System.out.println();
		}
		System.out.printf("Enter number People2 : ");
		num2 = scan.nextInt();
		while(num2 >= 100 || num2 == num1)
		{
			System.out.println("Error Score");
			System.out.printf("Enter number People2 : ");
			num2 = scan.nextInt();
			System.out.println();
		}
		System.out.printf("Enter number People3 : ");
		num3 = scan.nextInt();
		while(num3 >= 100 || num3 == num2 || num3 == num1)
		{
			System.out.println("Error Score");
			System.out.printf("Enter number People3 : ");
			num3 = scan.nextInt();
			System.out.println();
		}
		System.out.printf("Enter number People4 : ");
		num4 = scan.nextInt();
		while(num4 >= 100 || num4 == num3 || num4 == num2 || num4 == num1)
		{
			System.out.println("Error Score");
			System.out.printf("Enter number People4 : ");
			num4 = scan.nextInt();
			System.out.println();
		}
		System.out.printf("Enter number People5 : ");
		num5 = scan.nextInt();
		while(num5 >= 100 || num5 == num4 || num5 == num3 || num5 == num2 || num5 == num1)
		{
			System.out.println("Error Score");
			System.out.printf("Enter number People5 : ");
			num5 = scan.nextInt();
			System.out.println();
		}
		System.out.printf("Enter number People6 : ");
		num6 = scan.nextInt();
		while(num6 >= 100 || num6 == num5 || num6 == num4 || num6 == num3 || num6 == num2 || num6 == num1)
		{
			System.out.println("Error Score");
			System.out.printf("Enter number People6 : ");
			num6 = scan.nextInt();
			System.out.println();
		}
		System.out.printf("Enter number People7 : ");
		num7 = scan.nextInt();
		while(num7 >= 100 || num7 == num6 || num7 == num5 || num7 == num4 || num7 == num3 || num7 == num2 || num7 == num1)
		{
			System.out.println("Error Score");
			System.out.printf("Enter number People7 : ");
			num7 = scan.nextInt();
			System.out.println();
		}
		System.out.printf("Enter number People8 : ");
		num8 = scan.nextInt();
		while(num8 >= 100 || num8 == num7 || num8 == num6 || num8 == num5 || num8 == num4 || num8 == num3 || num8 == num2 || num8 == num1)
		{
			System.out.println("Error Score");
			System.out.printf("Enter number People8 : ");
			num8 = scan.nextInt();
			System.out.println();
		}
		System.out.printf("Enter number People9 : ");
		num9 = scan.nextInt();
		while(num9 >= 100 || num9 == num8 || num9 == num7 || num9 == num6 || num9 == num5 || num9 == num4 || num9 == num3 || num9 == num2 || num9 == num1)
		{
			System.out.println("Error Score");
			System.out.printf("Enter number People9 : ");
			num9 = scan.nextInt();
			System.out.println();
		}
		
		
		sum = num1+num2+num3+num4+num5+num6+num7+num8+num9;
		

		
				if((sum - num1 - num2) == 100)
				{
					System.out.println(" \n= "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num1 - num3) == 100)
				{
					System.out.println(" \n= "+num2+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num1 - num4) == 100)
				{
					System.out.println(" \n= "+num2+" "+num3+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num1 - num5) == 100)
				{
					System.out.println(" \n= "+num2+" "+num3+" "+num4+" "+num6+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num1 - num6) == 100)
				{
					System.out.println(" \n= "+num2+" "+num3+" "+num4+" "+num5+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num1 - num7) == 100)
				{
					System.out.println(" \n= "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num8+" "+num9);
				}
				else if((sum - num1 - num8) == 100)
				{
					System.out.println(" \n= "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num9);
				}
				else if((sum - num1 - num9) == 100)
				{
					System.out.println(" \n= "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8);
				}
				else if((sum - num2 - num3) == 100)
				{
					System.out.println(" \n= "+num1+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num2 - num4) == 100)
				{
					System.out.println(" \n= "+num1+" "+num3+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num2 - num5) == 100)
				{
					System.out.println(" \n= "+num1+" "+num3+" "+num4+" "+num6+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num2 - num6) == 100)
				{
					System.out.println(" \n= "+num1+" "+num3+" "+num4+" "+num5+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num2 - num7) == 100)
				{
					System.out.println(" \n= "+num1+" "+num3+" "+num4+" "+num5+" "+num6+" "+num8+" "+num9);
				}
				else if((sum - num2 - num8) == 100)
				{
					System.out.println(" \n= "+num1+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num9);
				}
				else if((sum - num2 - num9) == 100)
				{
					System.out.println(" \n= "+num1+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8);
				}
				else if((sum - num3 - num4) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num3 - num5) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num4+" "+num6+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num3 - num6) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num4+" "+num5+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num3 - num7) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num4+" "+num5+" "+num6+" "+num8+" "+num9);
				}
				else if((sum - num3 - num8) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num4+" "+num5+" "+num6+" "+num7+" "+num9);
				}
				else if((sum - num3 - num9) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8);
				}
				else if((sum - num4 - num5) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num6+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num4 - num6) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num5+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num4 - num7) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num5+" "+num6+" "+num8+" "+num9);
				}
				else if((sum - num4 - num8) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num5+" "+num6+" "+num7+" "+num9);
				}
				else if((sum - num4 - num9) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num5+" "+num6+" "+num7+" "+num8);
				}
				else if((sum - num5 - num6) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num4+" "+num7+" "+num8+" "+num9);
				}
				else if((sum - num5 - num7) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num4+" "+num6+" "+num8+" "+num9);
				}
				else if((sum - num5 - num8) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num4+" "+num6+" "+num7+" "+num9);
				}
				else if((sum - num5 - num9) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num4+" "+num6+" "+num7+" "+num8);
				}
				else if((sum - num6 - num7) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num8+" "+num9);
				}
				else if((sum - num6 - num8) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num7+" "+num9);
				}
				else if((sum - num6 - num9) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num7+" "+num8);
				}
				else if((sum - num7 - num8) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num9);
				}
				else if((sum - num7 - num9) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num8);
				}
				else if((sum - num8 - num9) == 100)
				{
					System.out.println(" \n= "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7);
				}
				else
				{
					System.out.println("Error Score All");
				}
				
				
		}
		
}
