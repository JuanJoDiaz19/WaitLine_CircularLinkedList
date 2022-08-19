public class CircularLinkedList {

    private int lastTurn;
    private Node head;
    private Node current;

    public CircularLinkedList() {
        lastTurn = 0;
    }

    public void giveTurn() {
        if (head == null) {
            lastTurn = 0;
        }
        lastTurn++;
        Node tempNode = new Node(lastTurn);
        addLast(tempNode);
    }

    private void addLast(Node input) {
        if (head == null) {
            head = input;
            head.setNext(input);
            head.setPrevious(input);
            current = head;
        } else {
            Node tail = head.getPrevious();

            //Los enlaces next
            tail.setNext(input);
            input.setNext(head);

            //Los enlaces previous
            head.setPrevious(input);
            input.setPrevious(tail);
        }
    }

    public void print() {
        if(head == null) {
            System.out.println("La lista de espera esta vacia, porfavor ingrese algun elemento");
        } else{
            System.out.println("La lista actual es: ");
            print(head);
        }

    }

    //Metodo recursivo
    private void print(Node current) {
        //Caso base:
        if (current.getNext() == head) {
            System.out.println(current.getNumber());
            return;
        }
        //Llamado recursivo:
        System.out.print(current.getNumber() + " ");
        print(current.getNext());
    }

    public void printCurrent() {
        if(current == null) {
            System.out.println("No hay elementos en la lista, porfavor ingrese personas en la lista");
        } else {
            System.out.println("El turno actual es:  ");
            System.out.println(current);
        }
    }

    public void moveCurrent() {
        //FALTA COMPROBAR QUE YA TENGA MAS DE 3 SKIPSSSSSSSSS

        if(current == null) {
            System.out.println("No se puede mover ya no hay elementos en la lista :(");
        } else {
            if(current.getNumberOfSkips() == 2) {
                deleteCurrentTurn();
                System.out.println("Se ha eliminado el turno actual ya que ya fue llamado 3 veces :(\n");
            } else {
                current.setNumberOfSkips(current.getNumberOfSkips() + 1);
                current = current.getNext();
            }
        }

    }

    public void deleteCurrentTurn() {
        //Aqui falta el caso cuando se trata de eliminar con un solo

        if(current == null) {
            System.out.println("No se puede eliminar el turno actual ya que la lista esta vacia :(");
        } else {
            Node act = current;
            if(current.getNext() == current) {
                head = null;
                current = null;
            }
            Node ant = act.getPrevious();
            Node des = act.getNext();
            ant.setNext(des);
            des.setPrevious(ant);
            if (act == head) {
                head = des;
            }
            current = des;
        }
    }
}
