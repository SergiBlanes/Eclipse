import java.util.Scanner;

public class barcos2 {
	static int[][] gtablero = null;

	public static void main(String[] agrs) {
		barcos2 programa = new barcos2();
		programa.inici();
	}

	public void inici() {
		int nbarco = 0;
		int[] longitud = null;

		gtablero = new int[10][10];
		for (int i = 0; i < gtablero.length; i++) {

			for (int j = 0; j < gtablero[i].length; j++) {

				gtablero[i][j] = 0;
			}
		}

		System.out.println("Introduce el numero de barcos:");
		nbarco = numeroInt(0, 6);			//Funcion que coge un numero entre dos numeros.
		longitud = new int[nbarco];

		for (int i = 0; i < nbarco; i++) {

			System.out.println("Introduce la longitud:");
			longitud[i] = 0;
			longitud[i] = numeroInt(0, 5);

		}

		for (int i = 0; i < nbarco-1; i++) {

			longitud[i] = numeroInt(1, 5);

		}
		
		for (int i = 0; i < nbarco; i++) {

			System.out.println("Longitud:"+longitud[i]);

		}

		

	}

	public int numeroInt(int indmenor, int indmayor) {
		boolean semaforo=false;
		int nbarco = -1;

		Scanner input = new Scanner(System.in);

		

		while (nbarco < indmenor || nbarco > indmayor) {
			
			if(nbarco!=-1){
			
			System.out.println("Introduce un numero entre "+ (indmenor+1)+ " y "+(indmayor-1));
			
			}
			
			while (!input.hasNextInt()) {

				System.out.println("Error");
				input.next();

			}

			nbarco = input.nextInt();
			

		}

		return nbarco;

	}
	
	
	
	

}