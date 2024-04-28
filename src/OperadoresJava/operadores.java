
// son simbolos qye perm8iten operaciones aritmeticas, relacionar elementos o  o hacer preguntas dojnde haya mas de una cindicion
// existen  logicos, relacionales y aritmeticxios; ademas  de los operadores argumentativios array y k objeto como las variabkes y nuneros
package OperadoresJava;

public class operadores {
    int n1 = 45;
    int n2 = 10;

    public static void main(String[] args) {
//Resta
        operadores i = new operadores();
        int Resta = i.n1 - i.n2;
        System.out.println("la resta es:" + Resta);
        //Suma
        int Suma = i.n1 + i.n2;
        System.out.println("La suma es: " + Suma);
//muktiplicacion
        int multiplicacion = i.n1 * i.n2;
        System.out.println("La multiplicación es: " + multiplicacion);

    }

    public static class Main {
        public static void main(String[] args) {
            // Llamar al método logico() desde la clase logicos
            logicos.logico();
        }
    }

    public static class logicos {
        static boolean n3 = true;
        static boolean n4 = false;

        public static void logico() {
            // Operador AND (&&)
            boolean resultadoAND = n3 && n4;
            System.out.println("Resultado de AND: " + resultadoAND);

            // Operador OR (||)
            boolean resultadoOr = n3 || n4;
            System.out.println("Resultado de OR: " + resultadoOr);

            // Operador NOT (!)
            boolean resultadoNotn3 = !n3;
            System.out.println("Resultado de NOT para 'n3': " + resultadoNotn3);
            boolean resultadoNotn4 = !n4;
            System.out.println("Resultado de NOT para 'n4': " + resultadoNotn4);
        }
    }
}