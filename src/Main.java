import java.util.Scanner;

public class Main {
    private static CircularLinkedList list = new CircularLinkedList();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido al programa de los turnos de Bancolombia: ");
        int option;
        do{
            System.out.println("\nIngrese la opcion que quiere hacer: ");
            System.out.println("1. Dar turno\n" +
                    "2. Mostrar turno actual\n" +
                    "3. Pasar turno\n" +
                    "4. Eliminar turno actual y seguir\n" +
                    "5. Mostrar la lista\n" +
                    "6. Salir");

            option = sc.nextInt();
            executeoption(option);
        } while (option != 6);
    }

    public static void executeoption(int option) {
        switch (option){
            case 1:
                list.giveTurn();
                break;
            case 2:
                list.printCurrent();
                break;
            case 3:
                list.moveCurrent();
                System.out.println("El turno fue movido");
                break;
            case 4:
                list.deleteCurrentTurn();
                System.out.println("Se ha eliminado el turno actual y se siguió");
                break;
            case 5:
                list.print();
                break;
            case 6:
                System.out.println("Muchas gracias por utilizar el programa :)");
        }
    }
}
