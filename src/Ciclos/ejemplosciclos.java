package Ciclos;

public class ejemplosciclos {
    public static void main(String[] args) {
        // Ejemplos de ciclos for
        System.out.println("Ejemplos de ciclos for:");
        // Ejemplo 1: Imprimir números del 1 al 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Ejemplo 2: Imprimir números pares del 2 al 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Ejemplo 3: Imprimir tabla de multiplicar del 3
        for (int i = 1; i <= 10; i++) {
            System.out.print("3 x " + i + " = " + (3 * i) + ", ");
        }
        System.out.println("\n");

        // Ejemplos de ciclos while
        System.out.println("Ejemplos de ciclos while:");
        int contador = 1;
        // Ejemplo 1: Contar del 1 al 5
        while (contador <= 5) {
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println();

        // Ejemplo 2: Contar del 10 al 1
        int numero = 10;
        while (numero >= 1) {
            System.out.print(numero + " ");
            numero--;
        }
        System.out.println();

        // Ejemplo 3: Sumar los primeros 5 números naturales
        int suma = 0;
        int i = 1;
        while (i <= 5) {
            suma += i;
            i++;
        }
        System.out.println("La suma de los primeros 5 números naturales es: " + suma + "\n");

        // Ejemplos de ciclos do-while
        System.out.println("Ejemplos de ciclos do-while:");
        // Ejemplo 1: Mostrar los números impares del 1 al 9
        int numImpar = 1;
        do {
            System.out.print(numImpar + " ");
            numImpar += 2;
        } while (numImpar <= 9);
        System.out.println();

        // Ejemplo 2: Mostrar la tabla de multiplicar del 5
        int tabla = 5;
        int j = 1;
        do {
            System.out.print(tabla + " x " + j + " = " + (tabla * j) + ", ");
            j++;
        } while (j <= 10);
        System.out.println("\n");

        // Ejemplo 3: Calcular el factorial de 5
        int numFactorial = 5;
        int factorial = 1;
        int k = 2; // Inicializar en 2 ya que el factorial de 0 y 1 es 1
        do {
            factorial *= k;
            k++;
        } while (k <= numFactorial);
        System.out.println("El factorial de 5 es: " + factorial);
    }
}
