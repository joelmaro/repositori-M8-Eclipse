import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Divisores {

	static int[] leerRango() throws Exception {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entra dos numeros :");
		String respuesta = entrada.readLine();
		String[]parts = respuesta.split("/");
		int[]rango = new int [2];
		rango[0]= Integer.parseInt(parts[0]);
		rango[1]= Integer.parseInt(parts[1]);
		
		return rango;
	}
	
	static int numDivisores(int i) {
		int sum = 0;
		for (int j=1;j<=i;j++) {
			double num = i%j;
			if (num == 0) {
				sum++;
			}
		}
		return sum;		
	}

	public static void repetir(int i, char c) {

		for (int j = 0; j < i; j++) {
			System.out.print(c);
		}

	}
	
}
