package D210606;

import java.util.Scanner;

public class d210606 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String text;
		char[] divide;
		char[] encoding;
		char[] decrypt;
		//a = 97 , z = 122 , A = 65 , Z = 90
		System.out.print("평문 입력 : ");
		text = scan.nextLine();
		
		divide = text.toCharArray();
		
		encoding = new char[divide.length];
		decrypt = new char[divide.length];
		
		System.out.print("암호화 : ");
		
		for(int i = 0; i < divide.length; i++) {
			if(((divide[i] - 29) >= 65) && ((divide[i] - 29 <= 90))) {
				encoding[i] = (char)(divide[i] - 29);
			}else if((divide[i] - 29) >= 91) {
				encoding[i] = (char)(divide[i] - 55);
			}else if((divide[i] == 32)){
				encoding[i] = divide[i];
			}
			
			System.out.print(encoding[i]);
		}
		
		System.out.println();
		System.out.print("복호화 : ");
		
		for(int i = 0; i < divide.length; i++) {
			if(((encoding[i] + 32) >= 100) && ((encoding[i] + 32 <= 122))) {
				decrypt[i] = (char)(encoding[i] + 29);
				
			}else if(((encoding[i] + 32) >= 97) && ((encoding[i] + 32) <= 99)){
				decrypt[i] = (char)(encoding[i] + 55);
			}else if((divide[i] == 32)){
				decrypt[i] = encoding[i];
			}
			
			System.out.print(decrypt[i]);
		}
	}
}