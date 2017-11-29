import java.util.Scanner;
public class practica22 {
	public static void main(String[] agrs) {
		practica22 programa = new practica22();
		programa.inici();
	}
	public void inici(){
		int num=0;
		int aux=0;
		
		num = llegir();
		descendente(num);

		
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
	
	public void descendente(int n) {
		
		if(n==1){
			System.out.println(n);
			
		}
		else{
			
			System.out.println(n);
			descendente(n-1);
			
			
		}
	}
}