package numbros_yo_pkg;

import java.util.Scanner;

public class Classss {
	
	public static void main(String[] args) {
		System.out.println("why dont you put in your name you hairless chimpanzee");
		Scanner scanner = new Scanner (System.in);
		String text = scanner.nextLine();
		
		scanner.close();
		
		int lenth = text.length();
		int i = 0;
		
		for(i = lenth-1; i >= 0; i--){
			char c1 = text.charAt(i);
			System.out.print(c1);
	}

}
}
