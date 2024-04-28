package sentencuaBreakyContinue;
// cuando se ejecuta estas sentencias las 2 detuenen el bucke  de un cidigo ya sea  parcual o titalmente

public class BreakContinue {
        public static void main(String[] args) {
            System.out.println("Imprimir números del 1 al 10 con break y continue:");

            for (int i = 1; i <= 10; i++) {
                // Si el número es 5, saltamos a la siguiente iteración sin imprimirlo
                if (i == 5) {
                    continue; // Salta a la siguiente iteración del bucle
                }

                // Imprimir el número actual
                System.out.print(i + " ");

                // Si el número es 7, salimos del bucle
                if (i == 7) {
                    break; // Sale del bucle
                }
            }
        }
    }


