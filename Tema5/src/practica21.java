import java.util.Scanner;
public class practica21 {
	public static void main(String[] agrs) {
		practica21 programa = new practica21();
		programa.inici();
	}
	public void inici(){
		int num=0;
		int aux=0;
		
		num = llegir();
		
		aux=FM(num);
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
	
	public int FM(int n) {
		
		if (n>100){
			
			return n-10;
		}
		else{
			
			return FM(FM(n+11));
			
		}
		
		}
}