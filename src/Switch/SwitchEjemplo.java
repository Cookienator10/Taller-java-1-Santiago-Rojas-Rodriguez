package Switch;
//es un condicional que permite evaluar mas de ubn caso y nos permite seleccionar una opciopn entre varias osea lo recibe y evalua hasta encontrar el que corresponda
public class SwitchEjemplo {

        public static void main(String[] args) {
            // Definir una variable para el día de la semana (1 para lunes, 2 para martes, ..., 7 para domingo)
            int diaSemana = 3;

            // Usar la sentencia switch para imprimir el nombre del día de la semana
            switch (diaSemana) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Número de día inválido");
                    break;
            }
        }
    }


