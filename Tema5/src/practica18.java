import java.util.Scanner;
public class practica18 {
	public static void main(String[] agrs) {
		practica18 programa = new practica18();
		programa.inici();
	}
	public void inici(){
		int num=0;
		int aux=0;
		
		num = llegir();
		
		
		for(int i=0; i<=num; i++){
			
			System.out.print(elevado(i) + ", ");
			
			}
		
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
	
	public int elevado(int valor) {
		int aux;
		
		if(valor==0){
			
			return 1;
		
		}
		else{
			
			aux= elevado(valor-1) + elevado(valor-1);		
						
		}
		
		return aux;
	}
}