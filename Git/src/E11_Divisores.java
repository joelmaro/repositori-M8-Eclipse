/*
 
Programa que lee dos enteros entre 1 y 10 y muestra un gráfico de barras
indicando la cantidad de divisores de cada número que está entre estos dos.
 
Implementar los métodos que faltan
 
Salida del programa:
------------------------
Entra dos numeros : 4 10
 
 4|***
 5|**
 6|****
 7|**
 8|****
 9|***
10|****
  +------------------->
 
 */
 

 
public class E11_Divisores {
 
    public static void main(String[] args) throws Exception {
 
        int[] rango = Divisores.leerRango();
        for (int i = rango[0]; i <= rango[1]; i++) {
 
            System.out.printf("%2d|", i);
            Divisores.repetir(Divisores.numDivisores(i), '*');
            System.out.println();
        }
        System.out.println("  +------------------->");
    }
     
}