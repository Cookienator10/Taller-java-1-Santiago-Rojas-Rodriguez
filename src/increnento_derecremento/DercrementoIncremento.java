//se usan despues de una variable para aumentar o disminuir shj valior

package increnento_derecremento;

public class DercrementoIncremento {
    public static void main(String[] args) {
        // Inicializar el contador
        int contador = 6;

        // Incrementar contador en 1 tres veces
        contador++;
        contador++;
        contador++;
        System.out.println("Después de incrementar 3 veces: " + contador);

        // Decrementar contador en 2 dos veces
        contador -= 2;
        contador -= 2;
        System.out.println("Después de decrementar 2 veces: " + contador);
    }
}
