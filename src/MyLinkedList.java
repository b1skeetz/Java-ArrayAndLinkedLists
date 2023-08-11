public class MyLinkedList implements MyList {
    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {

    }

    @Override
    public void add(String value) {
        Node node;
        if (size == 0) {
            node = new Node(null, null, value);
            first = node;
        } else {
            node = new Node(last, null, value);
            last.setNext(node);
        }
        last = node;
        size++;
    }



    @Override
    public void add(int index, String value) {
        Node node;
        if (size == 0) {
            node = new Node(null, null, value);
            first = node;
        } else {
            Node newNode = new Node(null, null, value);
            node = loop(index);
            if(node.getPrev() != null && node.getNext() != null){
                newNode.setPrev(node.getPrev());
                newNode.setNext(node);

                node.getPrev().setNext(newNode);
                node.setPrev(newNode);
            } else if (node.getPrev() == null){
                node.setPrev(newNode);
                newNode.setNext(node);
                first = newNode;
            } else if(node.getNext() == null){
                node.setNext(newNode);
                newNode.setPrev(node);
                last = newNode;
            }
        }
        size++;
    }

    public Node loop(int index){
        Node node = first;
        for(int i = 0; i < index; i++){
            node = node.getNext();
        }
        return node;
    }

    @Override
    public void set(int index, String value) {
        loop(index).setValue(value);
    }

    @Override
    public String get(int index) {
        return loop(index).getValue();
    }

    @Override
    public void remove(int index) {
        if(size == 0){
            return;
        }
        Node node = loop(index);
        if(node.getPrev() != null && node.getNext() != null){
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        } else if (node.getPrev() == null){
            first = node.getNext();
        } else if(node.getNext() == null){
            last = node.getPrev();
        }
        size--;
    }

    @Override
    public boolean contains(String value) {
        Node node = first;
        for(int i = 0; i < size; i++){
            node = node.getNext();
            if(node.getValue().equals(value)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String value) {
        Node node = first;
        for(int i = 0; i < size; i++){
            node = node.getNext();
            if(node.getValue().equals(value)){
                return ++i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String value) {
        Node node = last;
        for(int i = size - 1; i >= 0; i--){
            node = node.getPrev();
            if(node.getValue().equals(value)){
                return --i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }
}
