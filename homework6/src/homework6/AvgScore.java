package homework6;
import java.util.*;
public class AvgScore {
	
	int arr;
	double numarray[];
	double temp;
	void input(){
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < arr; i++){
			System.out.print(String.format("%2d", i+1) + "�� �ɻ����� �Է�  : ");
			
			if(s.hasNextDouble())
				numarray[i] = s.nextDouble();
			else
				return;
		
	}
	}
	void init(){
		numarray = new double[10];
		arr = numarray.length;
		this.input();
		this.print();
	}
	void print(){
		
		double avgscore = 0.0;
		
		for(int i=(arr-1); i>=0; i--){
			for(int j=1; j<=i; j++){
				if(numarray[j-1] > numarray[j]){
					
					temp = numarray[j-1];
					numarray[j-1] = numarray[j];
					numarray[j] = temp;
					
				}
			}
		}
		
		for(int i=1; i < (arr-1); i++)
			
			avgscore += numarray[i];
		
			avgscore = avgscore/8.0;
		
		System.out.println("���� ū ������ ���� ���� ������ ������ 8���� ���� ����� " + String.format("%.1f", avgscore) + "�Դϴ�.");
			
	}

}
