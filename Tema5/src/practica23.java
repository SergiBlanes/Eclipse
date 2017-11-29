import java.util.Scanner;
public class practica23 {
	private static int x=2;
	public static void main(String[] agrs) {
		practica23 programa = new practica23();
		programa.inici();
	}
	public void inici(){
		int num=0;
		int aux=0;
		
		num = llegir();
		aux=descendente(num);
		System.out.println(aux);
		
	}

	public int llegir() {
		int aux=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero:");
		
		while (!input.hasNextInt()){
			System.out.println("Error");
			input.nextInt();
		}
		aux=input.nextInt();
		input.close();
		return aux;


	}
	
	public int descendente(int n) {
		
		if(n==1){
			return 1;
			
		}
		else{
			
			return x*descendente(n-1) ;
			
		}
	}
}