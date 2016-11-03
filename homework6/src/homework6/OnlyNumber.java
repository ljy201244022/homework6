package homework6;
import java.util.*;
public class OnlyNumber {
	
	int[] numarray;
	int numarray1;
	
	void input(){
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<numarray1;) {
			int temp;
			boolean found = false;
			
			System.out.print(String.format("%2d",i+1)+"��° ����");
			
			if(s.hasNextInt())
				temp = s.nextInt();
			else
				return;
			
			for(int j=0; j<i; j++){
				if(temp == numarray[j]){
					found = true;
					break;
				}
			}
			
			if(!found && temp >=1 && temp <=100)
				numarray[i++] = temp;
			else
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
		}
		
		System.out.println();
	}
	
	void init(){
		numarray = new int[10];
		numarray1 = numarray.length;
		this.input();
		this.print();
	}
	
	void print(){
		
		for(int i=(numarray1-1); i>=0; i--){
			for(int j=1; j<=i; j++) {
				if(numarray[j-1] > numarray[j]) {
					int temp1 = numarray[j-1];
					numarray[j-1] = numarray[j];
					numarray[j] = temp1;
				}
			}
			
			System.out.println(String.format("%2d", i+1)+ "��° ���ڴ�" + numarray[i] +"�Դϴ�.");
		}
		
		System.out.println();
	}
	
}
