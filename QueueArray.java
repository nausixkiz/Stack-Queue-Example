import java.util.InputMismatchException;

public class QueueArray implements IStackAndQueue {

    protected int[] _array;
    protected int _size;
    protected int _headIndex;
    protected int _tailIndex;

    QueueArray(int initialCapacitySize){
        if(initialCapacitySize < 0){
            throw new InputMismatchException("Size can not be less than zero");
        }
        _size = initialCapacitySize;
        _array = new int[initialCapacitySize];
        _headIndex = _tailIndex = -1;
    }

    @Override
    public boolean Push(int value) {
        if(!isFull()){
            if(isEmpty())
                _headIndex++;
            
            _tailIndex++;
            _array[_tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int Pop() {
        if(!isEmpty()){
            int tempIndex = _headIndex;
            int value = _array[tempIndex];

            // int[] tempArray = new int[_array.length - 1];
            // for (int i = 0, k = 0; i < tempArray.length; i++) {  
            //     if (i == tempIndex) { 
            //         continue; 
            //     } 
            //     tempArray[k++] = _array[i]; 
            // } 

            // _array = tempArray;

            _headIndex++;
            if(_headIndex > _tailIndex){
                // Reset
                _headIndex = _tailIndex = -1;
            }
            return value;
        }

        return -1;
    }

    @Override
    public int Peek() {
        if(!isEmpty()){
            return _array[_headIndex];
        }
        return -1;
    }

    @Override
    public int Count() {
        if(isEmpty())
            return 0;
        return _tailIndex - _headIndex + 1;
        // return _array.length;
    }

    @Override
    public boolean isFull() {
        return _tailIndex == _size -1;
    }

    @Override
    public boolean isEmpty() {
        return _headIndex == -1 && _tailIndex == -1;
    }

    @Override
    public String ToString() {
        String str = "";
        if(isEmpty())
            return str;
        for(int i = _headIndex; i < _tailIndex + 1; i++){
            int value = _array[i];
            str += String.valueOf(value) + " ";
        }
        return str;
    }
    
}
