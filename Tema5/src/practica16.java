import java.util.Scanner;
public class practica16 {
	public static void main(String[] agrs) {
		practica16 programa = new practica16();
		programa.inici();
	}
	public void inici(){
		int num=0;
		int aux=0;
		
		num = llegir();
		aux=factorial(num);
		System.out.println("el factorial de "+ num+ " es:"+ aux);
		
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
	
	public int factorial(int valor) {
		
		if(valor==0){
			
			return 1;
		}
		else{
			
			return valor*factorial(valor-1);
			
		}
	}
}
