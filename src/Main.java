import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner leer = new Scanner(System.in);
        int seleccion_de_operacion = 0;
        int valor_num_1 = 0;
        int valor_num_2 = 0;
        Calculadora metodo = new Calculadora();

        do {
            System.out.println("\n");
            System.out.println("SELECCIONE LA OPERACION QUE DESEA REALIZAR: ");
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Saludo");
            System.out.println("4-Salir");



            seleccion_de_operacion= leer.nextInt();
            if (seleccion_de_operacion == 3) {



            } else if (seleccion_de_operacion <3) {
                System.out.print("Inserte el valor del primer numero ");
                valor_num_1 = leer.nextInt();
                System.out.print("Inserte el valor del segundo numero ");
                valor_num_2 = leer.nextInt();

            }
            switch(seleccion_de_operacion) {

                case 1:
                    seleccion_de_operacion = 1;
                    int resultado =metodo.suma(valor_num_1,valor_num_2);
                    System.out.println("El resultado de la operacion es: "+ resultado);



                    break ;
                case 2:
                    seleccion_de_operacion = 2;
                    int result =metodo.resta (valor_num_1,valor_num_2);
                    System.out.println("El resultado de la operacion es: "+ result);
                    break ;

                case 3:
                    seleccion_de_operacion = 3;
                    String saludo =metodo.saludar();
                    System.out.println(saludo);

                    break ;

            }


        } while(seleccion_de_operacion !=4);
        System.out.println("HA ELEGIDO SALIR DE LA CALCULADORA");






    }
}
