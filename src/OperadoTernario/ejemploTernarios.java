package OperadoTernario;

public class ejemploTernarios {

        public static void main(String[] args) {
            // Programa 1: Determinar si un número es par o impar
            int numero1 = 6;
            String resultado1 = (numero1 % 2 == 0) ? "Par" : "Impar";
            System.out.println("El número " + numero1 + " es " + resultado1);

            // Programa 2: Obtener el valor absoluto de un número
            int numero2 = -5;
            int valorAbsoluto = (numero2 >= 0) ? numero2 : -numero2;
            System.out.println("El valor absoluto de " + numero2 + " es " + valorAbsoluto);

            // Programa 3: Determinar si un número es positivo, negativo o cero
            int numero3 = -7;
            String resultado3 = (numero3 > 0) ? "Positivo" : (numero3 < 0) ? "Negativo" : "Cero";
            System.out.println("El número " + numero3 + " es " + resultado3);

            // Programa 4: Comparar dos números y encontrar el mayor
            int num1 = 10, num2 = 7;
            int mayor = (num1 > num2) ? num1 : num2;
            System.out.println("El número mayor entre " + num1 + " y " + num2 + " es " + mayor);

            // Programa 5: Calcular el factorial de un número
            int numero5 = 5;
            int factorial = (numero5 == 0) ? 1 : 1;
            for (int i = 1; i <= numero5; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero5 + " es " + factorial);
        }
    }


