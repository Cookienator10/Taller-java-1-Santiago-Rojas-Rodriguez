package IfElse;

public class IfElseEjemplos {
        public static void main(String[] args) {
            // Ejemplo 1: Verificar si un número es positivo o negativo
            int numero = -10;
            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else {
                System.out.println("El número es negativo.");
            }

            // Ejemplo 2: Calificar un examen
            int puntaje = 75;
            if (puntaje >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }

            // Ejemplo 3: Determinar si un número es par o impar
            int numero2 = 7;
            if (numero2 % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }

            // Ejemplo 4: Verificar si un estudiante tiene derecho a votar
            int edad = 18;
            if (edad >= 18) {
                System.out.println("El estudiante tiene derecho a votar.");
            } else {
                System.out.println("El estudiante no tiene derecho a votar.");
            }
        }
    }


