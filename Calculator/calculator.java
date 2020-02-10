package Calculator;

import java.util.Scanner;

public class calculator {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char choice = 'y';
		int opt;
		float num1,num2;
		do
		{
			System.out.println("Choose any one of options");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			System.out.print("Enter your option:");
			opt = sc.nextInt();
			System.out.println("Enter number-1:");
	         num1 = sc.nextFloat();
	         System.out.println("Enter number-2:");
	         num2 = sc.nextFloat();
			switch(opt)
			{
			  case 1: Addition a = new Addition();
				     System.out.println(num1+"+"+num2+"="+a.Add(num1, num2));
			         break;
			  case 2: Subtraction s = new Subtraction();
				     System.out.println(num1+"-"+num2+"="+s.Subtract(num1, num2));
		             break;
			  case 3: Multiplication m = new Multiplication();
				    System.out.println(num1+"*"+num2+"="+m.Multiply(num1, num2));
		             break;
			  case 4: Division d = new Division();
				     System.out.println(num1+"/"+num2+"="+d.Divide(num1, num2));
		             break;    
		      default:System.out.println("Choose correct optio!!");
		              break;
			}
			System.out.println("Do you want to continue(y/n)?:");
			choice = sc.next().charAt(0);
		}while(choice!='n');
		sc.close();
	}

}
