package seleniumbasics;

import java.util.Scanner;

public class ArrayList {
	
	int num = 0;
    int sum = 0;
    int avg = 0;
    int min = 0;
    int max = 0;
    int i = 0;

    ArrayList arr = new ArrayList ();

    Scanner sc = new Scanner (System.in); {

    for (i = 0; i < 3; ++i){

        System.out.println("Enter a number");
        num = sc.nextInt();
        arr.add(num);

        sum += num;

        if(num > max){
            max = num;
        }

        if(num < min){
            min = num;
        }

    }

    avg = sum / i;

    System.out.println("Sum: " + sum);
    System.out.println("Avg: " + avg);
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);


}

	private void add(int num2) {
		// TODO Auto-generated method stub
		
	}
}
		
	
