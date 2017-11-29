import java.util.Scanner;
public class practica19 {
	public static void main(String[] agrs) {
		practica19 programa = new practica19();
		programa.inici();
	}
	public void inici(){
		int num=0;
		int aux=0;
		
		num = llegir();
		
		elevado(num);
		
		
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
	
	public void elevado(int valor) {
		
		if(valor<2){
			
			System.out.print(valor);
			
		}
		else{
			
			elevado(valor/2);
			System.out.print(valor%2);
			
		}
		
		}
}