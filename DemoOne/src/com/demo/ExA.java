package com.demo;
import java.util.Scanner;
public class ExA {
			   void accept()
			   {
				   Scanner sc = new Scanner(System.in);
				   int n1,n2;
				   char op;
				   while(true)
				   {
				   System.out.println("Enter numbers:");
				   n1=sc.nextInt();
				   n2=sc.nextInt();
				   System.out.println("Enter operator:");
				   op=sc.next().charAt(0);
				   System.out.println("Result:");
				   switch(op)
				   {
				   case '+':System.out.println(n1+n2);break;
				   case '-':System.out.println(n1-n2);break;
				   case '*':System.out.println(n1*n2);break;
				   case '/':System.out.println(n1/n2);break;
				   case 'e':System.exit(0);
				   default:System.out.println("Invalid Operator");
				   }
				   }
			   }
			   public static void main(String[] args)
			   {
				ExA c=new ExA();
				c.accept();
			   }
			
}


