import java.util.Scanner;
public class ArrayExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		int input = 0;
		int index = 0;
		int max = 0;
		
		for(int i=0;i<5;i++){
			System.out.println((i+1) + "번 입력 : ");
			input = scan.nextInt();
			
			if(input > max){
				max = input;
				index = i+1;
			}
		}
		System.out.println("가장 큰 수는 " + index + "번째 숫자인 " + max);
	}
}
