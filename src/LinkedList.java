import java.util.ArrayList;

public class LinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size;

    public int getSize(){
        return this.size;
    }

    public ArrayList<T> getLinkedListToArrayList(){
        ArrayList<T> arrayList = new ArrayList<>();

        Node<T> currentNode = this.head;
        while (currentNode != null){
            arrayList.add(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
        return arrayList;
    }

    public ArrayList<T> getLinkedListToArrayListReversed(){
        ArrayList<T> arrayList = new ArrayList<>();

        Node<T> currentNode = this.tail;
        while (currentNode != null){
            arrayList.add(currentNode.getValue());
            currentNode = currentNode.getPreviousNode();
        }
        return arrayList;
    }

    public void addValue(T value){
        if(head == null){
            this.head = new Node<T>(value);
            this.tail = this.head;
        } else {
            Node<T> newNode = new Node<T>(value);
            newNode.setNextNode(this.head);
            this.head.setPreviousNode(newNode);
            this.head = newNode;
        }
        this.size += 1;
    }

    public void addAtIndex(int index, T value){
        if (index > this.size){
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<>(value);
        if (index == 0){
            if (this.head != null) {
                this.head.setPreviousNode(newNode);
                newNode.setNextNode(this.head);
            }
            this.head = newNode;
        } else if(index == this.size){
            this.tail.setNextNode(newNode);
            newNode.setPreviousNode(this.tail);
            this.tail = newNode;
        } else {
            int currentIndex = 1;
            Node<T> currentNode = this.head.getNextNode();

            while (currentIndex != index){
                currentNode = currentNode.getNextNode();
                currentIndex += 1;
            }

            newNode.setPreviousNode(currentNode.getPreviousNode());
            newNode.getPreviousNode().setNextNode(newNode);

            newNode.setNextNode(currentNode);
            currentNode.setPreviousNode(newNode);
        }
        this.size += 1;
    }

    public void removeValueAtIndex(int index){
        if (index > size){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            if (head != null) {
                head.getNextNode().setPreviousNode(null);
                head = head.getNextNode();
            } else {
                throw new IndexOutOfBoundsException();
            }
        } else if(index == size){
            tail.getPreviousNode().setNextNode(null);
            tail = tail.getPreviousNode();
        } else {
            int currentIndex = 1;
            Node<T> currentNode = head.getNextNode();

            while (currentIndex != index){
                currentNode = currentNode.getNextNode();
                currentIndex += 1;
            }
            currentNode.getPreviousNode().setNextNode(currentNode.getNextNode());
            currentNode.getNextNode().setPreviousNode(currentNode.getPreviousNode());
        }
        size -= 1;
    }
}
