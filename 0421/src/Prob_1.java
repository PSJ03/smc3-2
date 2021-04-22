import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {
			int a=0;
			int b=0;
			int sum=0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("시작 숫자: ");
			a = scan.nextInt();
			System.out.print("마지막 숫자: ");
			b = scan.nextInt();
			
			for(int i=a; i<=20; i++){
				sum+=i;
			}
			
			System.out.println(a + "부터 " + b + "까지의 합은 " + sum);
		}

	}