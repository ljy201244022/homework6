package homework6;
import java.util.*;
public class ExamVariousArray {

	public static void main(String[] args) {
		
		int num;
		do{
			Scanner s = new Scanner(System.in);
			System.out.println("1. �ι�°�� ū �� ã�� ");
			System.out.println("2. �ɻ� ���� ��� ");
			System.out.println("3. �л� ����, ��հ� ���ϱ� ");
			System.out.println("4. 5�� ����Ʈ�� ������ ���� ���ϱ� ");
			System.out.println("5. ��ġ�� �ʴ� ���� 10�� �Է¹ޱ� ");
			System.out.println("6. �����ϱ� ");
			
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
		System.out.println("���α׷� ����!");
	}
}
				
		
		

	


