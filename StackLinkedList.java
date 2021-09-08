import java.util.ArrayList;

public class StackLinkedList implements IStackAndQueue {

    protected Node _topNode;

    private class Node{

        int value;

        Node next;

        Node(int value){
            this.value = value;
        }
    }

    StackLinkedList(){
        _topNode = null;
    }


    @Override
    public boolean Push(int value) {
        if(!isFull())
        {
            Node tempNode= new Node(value);
            tempNode.next = _topNode;
            _topNode = tempNode;

            return true;
        }
        return false;
    }

    @Override
    public int Pop() {
        if(!isEmpty()){
            int value = _topNode.value;
            _topNode = _topNode.next;
            return value;
        }
        return -1;
    }

    @Override
    public int Peek() {
        if(!isEmpty()){
            return _topNode.value;
        }
        return -1;
    }

    @Override
    public int Count() {
        return 0;
    }

    @Override
    public boolean isFull() {
        //K rõ
        return false;
    }

    @Override
    public boolean isEmpty() {
        return _topNode == null;
    }

    @Override
    public String ToString() {
        String str = "";
        if(isEmpty())
            return str;
        ArrayList<Integer> tempArray = new ArrayList<>(); 
        Node tempNode = _topNode;
        while(tempNode != null){
            tempArray.add(tempNode.value);
            tempNode = tempNode.next;
        }
        
        for (int i = tempArray.size() - 1; i >= 0; i--) {
            str += String.valueOf(tempArray.get(i)) + " ";
        }
        return str;
    }
    
}
