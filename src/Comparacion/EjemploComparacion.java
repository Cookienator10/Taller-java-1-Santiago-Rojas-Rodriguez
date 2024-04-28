package Comparacion;
// los operadores de comparacion son: ==, !=,>, <, <=, >=
public class EjemploComparacion {

        public static void main(String[] args) {
            // Igualdad (==)
            int x = 5;
            int y = 5;
            boolean igualdad = (x == y); // Devuelve true
            System.out.println("Igualdad: " + igualdad);

            // Desigualdad (!=)
            int a = 10;
            int b = 20;
            boolean desigualdad = (a != b); // Devuelve true
            System.out.println("Desigualdad: " + desigualdad);

            // Mayor que (>)
            int m = 15;
            int n = 10;
            boolean mayorQue = (m > n); // Devuelve true
            System.out.println("Mayor que: " + mayorQue);

            // Menor que (<)
            int p = 5;
            int q = 8;
            boolean menorQue = (p < q); // Devuelve true
            System.out.println("Menor que: " + menorQue);

            // Mayor o igual que (>=)
            int c = 10;
            int d = 10;
            boolean mayorIgualQue = (c >= d); // Devuelve true
            System.out.println("Mayor o igual que: " + mayorIgualQue);

            // Menor o igual que (<=)
            int e = 15;
            int f = 20;
            boolean menorIgualQue = (e <= f); // Devuelve true
            System.out.println("Menor o igual que: " + menorIgualQue);
        }
    }


