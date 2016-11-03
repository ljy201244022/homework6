package homework6;
import java.util.*;
public class AptPersonCount {
	int[][] aptarray;
	int aptclassarr;
	int aptroomnumberarr;
	int[] classsum ; 
	int[] roomnumbersum;
	int totsum = 0;
	
	void input(){
		Scanner s =new Scanner(System.in);
		
		for(int i=0; i<aptclassarr; i++){
			for(int j=0; j<aptroomnumberarr; j++) {
				System.out.print((i+1) + "0" + (j+1) +"호에 살고 있는 사람의 숫자 : "); 
				if(s.hasNextInt())
					aptarray[i][j] = s.nextInt();
				else
					return;
				
			}
		}
		System.out.println();
	}
	
	void init(){
		aptarray = new int[5][3];
		aptclassarr = aptarray.length;
		aptroomnumberarr = aptarray[0].length;
		this.input();
		this.print();
	}
	
	void print(){
		
		
		classsum = new int[aptclassarr];
		roomnumbersum = new int[aptroomnumberarr];
		
		for(int i=0; i<aptclassarr; i++){
			for(int j=0; j<aptroomnumberarr; j++){
				classsum[i] += aptarray[i][j];
				roomnumbersum[j] += aptarray[i][j];
				
			}
			totsum += classsum[i];
		}
		
		System.out.println("이 아파트의 거주자는 모두 " + totsum + "명입니다.");
		
		for(int i=0; i<aptclassarr; i++)
			System.out.println((i+1)+"층에 사는 거주자는 모두 " + String.format("%2d", classsum[i])+ "명입니다");
		
		System.out.println();
		
		for(int i=0; i<aptroomnumberarr; i++)
			System.out.println((i+1)+"호 라인에 사는 거주자는 모두 " + String.format("%2d",roomnumbersum[i]) +"명입니다." );
	}
}
	
