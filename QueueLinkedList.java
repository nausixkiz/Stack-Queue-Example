public class QueueLinkedList implements IStackAndQueue {

    protected Node _headNode, _tailNode;

    private class Node{

        int value;

        Node next;

        Node(int value){
            this.value = value;
        }
    }

    QueueLinkedList(){
        _headNode = _tailNode = null;
    }

    @Override
    public boolean Push(int value) {

        if(!isFull())
        {
            Node tempNode= new Node(value);
            if(isEmpty()){
                _headNode = _tailNode = tempNode;
            }
            else{
                _tailNode.next = tempNode;
                _tailNode = tempNode;
            }

            return true;
        }
        return false;
    }

    @Override
    public int Pop() {
        if(!isEmpty()){
            int value = _headNode.value;
            if(_headNode == _tailNode){
                _headNode = _tailNode = null;
            }
            else{
                _headNode = _headNode.next;
            }
            return value;
        }
        return -1;
    }

    @Override
    public int Peek() {
        if(!isEmpty()){
            return _headNode.value;
        }
        return -1;
    }

    @Override
    public int Count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return _headNode == null && _tailNode == null;
    }

    @Override
    public String ToString() {
        String str = "";
        if(isEmpty())
            return str;
        Node tempNode = _headNode;
        while(tempNode != null){
            str += String.valueOf(tempNode.value + " ");
            tempNode = tempNode.next;
        }

        return str;
    }
    
}
