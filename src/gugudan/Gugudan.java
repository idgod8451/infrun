package gugudan;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		//2단 3단 구구단 구현
		//2단
//		System.out.println("2 x 1 = " + 2*1);
//		System.out.println("2 x 2 = " + 2*2);
//		System.out.println("2 x 3 = " + 2*3);
//		System.out.println("2 x 4 = " + 2*4);
//		System.out.println("2 x 5 = " + 2*5);
//		System.out.println("2 x 6 = " + 2*6);
//		System.out.println("2 x 7 = " + 2*7);
//		System.out.println("2 x 8 = " + 2*8);
//		
//		//3단 시작
//		System.out.println("3 x 1 = " + 3*1);
//		System.out.println("3 x 2 = " + 3*2);
//		System.out.println("3 x 3 = " + 3*3);
//		System.out.println("3 x 4 = " + 3*4);
		
		//Scanner 클래스를 통해서 입력값 받기
		//입력받은 숫자의 단수만 구구단 계산
		Scanner sc = new Scanner(System.in);
		
//		String str = sc.next(); 넥스트 함수는 스트링값을 입력받는다.
		//nextInt함수로 숫자를 입력받아 단수 결정
		int s = sc.nextInt();
		int result = 0;
		int num = 9;
		for(int i=1; i<=1; i++) {
			System.out.println(s+"단");
			for(int j=1; j<=num; j++) {
				result =  s* j;
				System.out.println(s+"x"+j+"="+result);
			}
		}
		
		
		
		
	}
}
