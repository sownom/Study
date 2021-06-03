package D210603;

import java.util.Random;

public class d200603 {
	public static void main(String args[]) {
		Random random = new Random();
		int[] backup = {0,0,0};
		int vote = 0;
		
		for(int i = 0; i < 10; i++) {
			vote = random.nextInt(3);
			
			if(vote == 0) {
				backup[0] += 1;
			}else if (vote == 1) {
				backup[1] += 1;
			}else{
				backup[2] += 1;
			}
		}
		
		System.out.println("1번 후보 --> " + backup[0]);
		System.out.println("2번 후보 --> " + backup[1]);
		System.out.println("3번 후보 --> " + backup[2]);
		
		if(backup[0] > backup[1]) {
			if(backup[0] > backup[2]) {
				System.out.println("가장 많은 득표 수 -- > " + backup[0] + "이고, 후보자는 1번 후보자 입니다.");
				
				if(backup[0] >= 5) {
					System.out.println("과반수 이상 성공했습니다. --> 당선");
				}else {
					System.out.println("과반수 이상 실패했습니다. --> 미당선");
				}
			}else if(backup[0] < backup[2]){
				System.out.println("가장 많은 득표 수 -- > " + backup[2] + "이고, 후보자는 3번 후보자 입니다.");
				
				if(backup[2] >= 5) {
					System.out.println("과반수 이상 성공했습니다. --> 당선");
				}else {
					System.out.println("과반수 이상 실패했습니다. --> 미당선");
				}
			}else {
				System.out.println("가장 많은 득표 수 -- > " + backup[0] + "이고, 후보자는 1,3번 후보자 입니다.");
				
				if(backup[0] >= 5) {
					System.out.println("과반수 이상 성공했습니다. --> 동률");
				}else {
					System.out.println("과반수 이상 실패했습니다. --> 미당선");
				}
			}
		}else if(backup[0] < backup[1]){
			if(backup[1] > backup[2]) {
				System.out.println("가장 많은 득표 수 -- > " + backup[1] + "이고, 후보자는 2번 후보자 입니다.");
				
				if(backup[1] >= 5) {
					System.out.println("과반수 이상 성공했습니다. --> 당선");
				}else {
					System.out.println("과반수 이상 실패했습니다. --> 미당선");
				}
			}else if(backup[1] < backup[2]){
				System.out.println("가장 많은 득표 수 -- > " + backup[2] + "이고, 후보자는 3번 후보자 입니다.");
				
				if(backup[2] >= 5) {
					System.out.println("과반수 이상 성공했습니다. --> 당선");
				}else {
					System.out.println("과반수 이상 실패했습니다. --> 미당선");
				}
			}else {
				System.out.println("가장 많은 득표 수 -- > " + backup[1] + "이고, 후보자는 2,3번 후보자 입니다.");
				
				if(backup[1] >= 5) {
					System.out.println("과반수 이상 성공했습니다. --> 동률");
				}else {
					System.out.println("과반수 이상 실패했습니다. --> 미당선");
				}
			}
		}else {
			if(backup[0] > backup[2]) {
				System.out.println("가장 많은 득표 수 -- > " + backup[0] + "이고, 후보자는 1,2번 후보자 입니다.");
				
				if(backup[0] >= 5) {
					System.out.println("과반수 이상 성공했습니다. --> 동률");
				}else {
					System.out.println("과반수 이상 실패했습니다. --> 미당선");
				}
			}else if(backup[0] < backup[2]) {
				System.out.println("가장 많은 득표 수 -- > " + backup[2] + "이고, 후보자는 3번 후보자 입니다.");
				
				if(backup[2] >= 5) {
					System.out.println("과반수 이상 성공했습니다. --> 당선");
				}else {
					System.out.println("과반수 이상 실패했습니다. --> 미당선");
				}
			}else {
				System.out.println("가장 많은 득표 수 -- > " + backup[0] + "이고, 후보자는 1, 2, 3번 후보자 입니다.");
				System.out.println("과반수 이상 실패했습니다. --> 동률");
			}
		}
	}
}