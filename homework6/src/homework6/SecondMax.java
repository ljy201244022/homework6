package homework6;
import java.util.*;
public class SecondMax {
	
	int arr;
	int[] numarray;
	
	void input(){
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < arr; i++){
			System.out.print(String.format("%2d", i+1) + "번째 수를 입력하시오 : ");
			
			if(s.hasNextInt())
				numarray[i] = s.nextInt();
			else
				return;
		
	}
		System.out.println();
	}
	void init(){
		numarray = new int[10];
		arr = numarray.length;
		this.input();
		this.print();
	}
	void print(){
		int i = 0;
		int maxnum;
		int maxadd = 0;
		int max = Integer.MIN_VALUE;
		int temp = Integer.MIN_VALUE;
		int tempadd = 0;
		for(i = 0; i < arr; i++)
		{
			if(numarray[i] >  max){
				
				temp = max;
				tempadd = maxadd;
				max = numarray[i];
				maxadd = i;
				
			}
			else if(numarray[i] > temp){
				
				temp = numarray[i];
				tempadd = i;
			}
		}
		
		System.out.println("두번째로 큰 수는" + (tempadd+1) + "번째수 " + temp + "입니다");
	}
}
		


