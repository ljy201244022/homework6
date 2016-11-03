package homework6;
import java.util.*;
public class StudentScore {
	
	int [][] totavg;
	int numarray;
	int numarray1;
	double cAvg;
	double sAvg;
	int[] sSum;
	int[] cSum;
void input(){
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<numarray; i++){
			System.out.print(String.format("%2d", i+1) + "번 학생 국어, 영어, 수학 : ");
			
			for(int j=0; j < numarray1; j++){
				if(s.hasNextInt())
						totavg[i][j] = s.nextInt();
				else
					return;
			}
		}
}
			
		
		
		void init(){
			totavg = new int[5][3];
			numarray = totavg.length;
			numarray1 = totavg[0].length;
			this.input();
			this.print();
		}
		
		void print(){
			
			String[] cName = {"국어", "영어", "수학"};
			sSum = new int[numarray];
			cSum = new int[numarray1];
			
			for(int i=0; i<numarray; i++){
				for(int j=0; j<numarray1; j++){
					sSum[i] += totavg[i][j];
					cSum[j] += totavg [i][j];
				}
			}
			
			for(int i=0; i < numarray1; i++){
				cAvg = cSum[i] / (double)numarray;
				System.out.println(cName[i] + "총정은" + cSum[i] +"점이고, 평균은" + String.format("%.1f", cAvg) + "입니다.");
				}

			System.out.println();
			
			for(int i=0; i<numarray; i++){
				
				sAvg = sSum[i] / (double)numarray1;
				System.out.println(String.format("%2d", i+1) + "번 학생의 총점은" + sSum[i] + "점이고,평균은" + String.format("%.1f", sAvg)+ "입니다.");
				
			}
		}
}
		
	

