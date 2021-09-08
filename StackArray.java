import java.util.InputMismatchException;

public class StackArray implements IStackAndQueue {

    protected int[] _array;
    protected int _size;
    protected int _topIndex;

    StackArray(int initialCapacitySize){
        if(initialCapacitySize < 0){
            throw new InputMismatchException("Size can not be less than zero");
        }
        _size = initialCapacitySize;
        _array = new int[initialCapacitySize];
        _topIndex = -1;
    }


    @Override
    public boolean Push(int value) {
        if(!isFull()){
            _topIndex++;
            _array[_topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int Pop() {
        if(!isEmpty()){
            int tempIndex = _topIndex;
            int value = _array[tempIndex];
            _topIndex--;

            // int[] tempArray = new int[_array.length - 1];
            // for (int i = 0, k = 0; i < tempArray.length; i++) {  
            //     if (i == tempIndex) { 
            //         continue; 
            //     } 
            //     tempArray[k++] = _array[i]; 
            // } 

            // _array = tempArray;
            return value;
        }
        
        return -1;
    }

    @Override
    public boolean isFull() {
        return _topIndex == _size - 1;
    }

    @Override
    public boolean isEmpty() {
        return _topIndex < 0;
    }


    @Override
    public int Peek() {
        if(!isEmpty()){
            return  _array[_topIndex];
        }
        
        return -1;
    }

    @Override
    public String ToString() {
        String str = "";
        if(isEmpty())
            return str;
        for(int i = 0; i < _topIndex + 1; i++){
            int value = _array[i];
            str += String.valueOf(value) + " ";
        }
        return str;
    }


    @Override
    public int Count() {
        return _topIndex + 1;
        // return _array.length;
    }
    
}
