package D210602;

public class d210602 {
	public static void main(String arg[]) {
		int[] int_array = {4,13,150,17,-2};
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < int_array.length; i++) {
			if(i == 0) {
				min = int_array[0];
				max = int_array[0];
			}else {
				if(int_array[i] <= min) {
					min = int_array[i];
				}
				
				if(int_array[i] >= max) {
					max = int_array[i];
				}
			}
		}
		
		System.out.println("현재 배열 내 가장 작은 값은 : " + min);
		System.out.println("현재 배열 내 가장 큰 값은 : " + max);
	}
}