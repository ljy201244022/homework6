package homework6;
import java.util.*;
public class ExamVariousArray {

	public static void main(String[] args) {
		
		int num;
		do{
			Scanner s = new Scanner(System.in);
			System.out.println("1. 두번째로 큰 수 찾기 ");
			System.out.println("2. 심사 점수 계산 ");
			System.out.println("3. 학생 총점, 평균값 구하기 ");
			System.out.println("4. 5층 아파트의 거주자 숫자 구하기 ");
			System.out.println("5. 겹치지 않는 숫자 10개 입력받기 ");
			System.out.println("6. 종료하기 ");
			
			num = s.nextInt();
			if(num == 1)
				new SecondMax().init();
			else if(num == 2)
				new AvgScore().init();
			else if(num == 3)
				new StudentScore().init();
			else if(num == 4)
				new AptPersonCount().init();
			else if(num == 5)
				new OnlyNumber().init();
		} while (num != 6);
		System.out.println("프로그램 종료!");
	}
}
				
		
		

	


