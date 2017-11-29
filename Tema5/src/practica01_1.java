import java.util.Scanner;

public class practica01_1 {
	private static int[] llistaEnters = new int[10];
	

	public static void main(String[] agrs) {
		inici();
	}
	public static void inici(){
		llegirLlista();
		ordenarLlista();
		mostrarLlista();
	}

	public static void llegirLlista() {
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < llistaEnters.length; i++) {
			System.out.println("Introduce un numero "+ i +":");
			while (!input.hasNextInt()) {
				System.out.println("Introduce un numero entero:");
				input.next();
			}

			llistaEnters[i] = input.nextInt();
		}

	}

	public static void ordenarLlista() {

		for (int i = 0; i < llistaEnters.length; i++) {
			for (int j = i + 1; j < llistaEnters.length; j++) {
				if (llistaEnters[i] > llistaEnters[j]) {
					int canvi = llistaEnters[i];
					llistaEnters[i] = llistaEnters[j];
					llistaEnters[j] = canvi;

				}

			}
		}
	}

	public static void mostrarLlista() {

		for (int i = 0; i < llistaEnters.length; i++) {

			System.out.println(llistaEnters[i]);

		}
	}

}