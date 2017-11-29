import java.util.Scanner;
public class practica20 {
	
	private int[] arrayA = {9,7,5,3,2,1,10};
	
	
	public static void main(String[] agrs) {
		practica20 programa = new practica20();
		programa.inici();
	}
	public void inici(){
		int aux=SumaVector(arrayA.length);
		System.out.println(aux);

	}

	
	public int SumaVector(int n) {
		
		if(n==1){
			
			return arrayA[0];
			
		}
		else{
			return arrayA[n-1] + SumaVector(n-1);
			
		}
	}
}