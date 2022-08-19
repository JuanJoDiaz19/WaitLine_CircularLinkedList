public class Node {

    private int numberOfSkips;
    private int number;
    private Node previous;
    private Node next;

    public Node(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  "" + number;
    }

    public int getNumberOfSkips() {
        return numberOfSkips;
    }

    public void setNumberOfSkips(int numberOfSkips) {
        this.numberOfSkips = numberOfSkips;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
