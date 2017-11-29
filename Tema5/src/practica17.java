import java.util.Scanner;
public class practica17 {
	public static void main(String[] agrs) {
		practica17 programa = new practica17();
		programa.inici();
	}
	public void inici(){
		int num=0;
		int aux=0;
		
		num = llegir();
		
		for(int i=0; i<num;i++){
			
		System.out.print(fibonachi(i) + ", ");
		
		}
	}

	public int llegir() {
		int aux=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero:");
		
		while (!input.hasNextInt()){
			System.out.println("Error");
			input.next();
		}
		aux=input.nextInt();
		input.close();
		return aux;


	}
	
	public int fibonachi(int valor) {
		int aux;
		
		if(valor==0|| valor==1){
			
			aux=valor;
		}
		else{
			
			aux= fibonachi(valor-1) + fibonachi(valor-2);
			
						
		}
		
		return aux;
	}
}