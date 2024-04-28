package Datos_primitivos;
//son tipos de datos del lenguaje de programacion no orientada a objetos como el C.

public class primitivos {
    byte n1 = 34;
    byte n2 = 22;
    byte n3 = 88;
short n4 = 4500;
short n5 = 5500;
short n6 = 5700;
int n7 = 140;
int n8 = 200;
int n9 = 150;
long n10 = 1000;
long n11 = 200;
long n12 = 700;
float n13 = 1.75f;
float n14 = 1.47f;
float n15 =4.78f;
double n16 = 4.78;
double n17 = 5.54;
double n18 = 5.47;
boolean n19 = true;
boolean n20 = false;
char nombre = 'S';
char nombre2 = 'P';
char telefono = 'N';
public static void main(String[] args) {
    primitivos instancia =  new primitivos();
    String resultado = "n1: " + instancia.n1 + ", n2: " + instancia.n2 +
            ", n3: " + instancia.n3 +
            ", n4: " + instancia.n4 + ", n5: " + instancia.n5 + ", n6: " + instancia.n6 +
            ", n7: " + instancia.n7 + ", n8: " + instancia.n8 + ", n9: " + instancia.n9 +
            ", n10: " + instancia.n10 + ", n11: " + instancia.n11 + ", n12: " + instancia.n12 +
            ", n13: " + instancia.n13 + ", n14: " + instancia.n14 + ", n15: " + instancia.n15 +
            ", n16: " + instancia.n16 + ", n17: " + instancia.n17 + ", n18: " + instancia.n18 +
            ", n19: " + instancia.n19 + ", n20: " + instancia.n20 +
            ", nombre: " + instancia.nombre + ", nombre2: " + instancia.nombre2 + ", telefono: " + instancia.telefono;

            System.out.println(resultado);

}
}
