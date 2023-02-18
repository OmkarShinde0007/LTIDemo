package seleniumbasics;


import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
        int num1, num2;
  
        
        Scanner sc = new Scanner(System.in);
        
        
  
        System.out.println("Enter the numbers");
  
     
        num1 = sc.nextInt();
  
        num2 = sc.nextInt();
  
        System.out.println("Enter the operation to perform (+,-,*,/)");
  
        char op = sc.next().charAt(0);
  
        double o = 0;
  
        switch (op) {
  
        
        case '+':
  
            o = num1 + num2;
  
            break;
  
      
        case '-':
  
            o = num1 - num2;
  
            break;
  
        
        case '*':
  
            o = num1 * num2;
  
            break;
  
        
        case '/':
  
            o = num1 / num2;
  
            break;
  
        default:
  
            System.out.println("You enter wrong input");
  
            break;
        }
  
        System.out.println("The Result is:");
  
        System.out.println();
  
        
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
    }
	}


