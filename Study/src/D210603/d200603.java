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
		
		System.out.println("1�� �ĺ� --> " + backup[0]);
		System.out.println("2�� �ĺ� --> " + backup[1]);
		System.out.println("3�� �ĺ� --> " + backup[2]);
		
		if(backup[0] > backup[1]) {
			if(backup[0] > backup[2]) {
				System.out.println("���� ���� ��ǥ �� -- > " + backup[0] + "�̰�, �ĺ��ڴ� 1�� �ĺ��� �Դϴ�.");
				
				if(backup[0] >= 5) {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �缱");
				}else {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �̴缱");
				}
			}else if(backup[0] < backup[2]){
				System.out.println("���� ���� ��ǥ �� -- > " + backup[2] + "�̰�, �ĺ��ڴ� 3�� �ĺ��� �Դϴ�.");
				
				if(backup[2] >= 5) {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �缱");
				}else {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �̴缱");
				}
			}else {
				System.out.println("���� ���� ��ǥ �� -- > " + backup[0] + "�̰�, �ĺ��ڴ� 1,3�� �ĺ��� �Դϴ�.");
				
				if(backup[0] >= 5) {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> ����");
				}else {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �̴缱");
				}
			}
		}else if(backup[0] < backup[1]){
			if(backup[1] > backup[2]) {
				System.out.println("���� ���� ��ǥ �� -- > " + backup[1] + "�̰�, �ĺ��ڴ� 2�� �ĺ��� �Դϴ�.");
				
				if(backup[1] >= 5) {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �缱");
				}else {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �̴缱");
				}
			}else if(backup[1] < backup[2]){
				System.out.println("���� ���� ��ǥ �� -- > " + backup[2] + "�̰�, �ĺ��ڴ� 3�� �ĺ��� �Դϴ�.");
				
				if(backup[2] >= 5) {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �缱");
				}else {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �̴缱");
				}
			}else {
				System.out.println("���� ���� ��ǥ �� -- > " + backup[1] + "�̰�, �ĺ��ڴ� 2,3�� �ĺ��� �Դϴ�.");
				
				if(backup[1] >= 5) {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> ����");
				}else {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �̴缱");
				}
			}
		}else {
			if(backup[0] > backup[2]) {
				System.out.println("���� ���� ��ǥ �� -- > " + backup[0] + "�̰�, �ĺ��ڴ� 1,2�� �ĺ��� �Դϴ�.");
				
				if(backup[0] >= 5) {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> ����");
				}else {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �̴缱");
				}
			}else if(backup[0] < backup[2]) {
				System.out.println("���� ���� ��ǥ �� -- > " + backup[2] + "�̰�, �ĺ��ڴ� 3�� �ĺ��� �Դϴ�.");
				
				if(backup[2] >= 5) {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �缱");
				}else {
					System.out.println("���ݼ� �̻� �����߽��ϴ�. --> �̴缱");
				}
			}else {
				System.out.println("���� ���� ��ǥ �� -- > " + backup[0] + "�̰�, �ĺ��ڴ� 1, 2, 3�� �ĺ��� �Դϴ�.");
				System.out.println("���ݼ� �̻� �����߽��ϴ�. --> ����");
			}
		}
	}
}