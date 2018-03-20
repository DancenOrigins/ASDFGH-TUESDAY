package numbros_yo_pkg;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		System.out.println("why dont you put in a number you hairless chimpanzee");
		Scanner scanner = new Scanner (System.in);
		int text = scanner.nextInt();
		int i = 1;
		
		for(i=1;i<=10;i++){
			System.out.println(i + " times " + text + " is");
			System.out.println(text*i);
			
		scanner.close();
		}

	}

}
