public class Main {
    public static void main(String[] arg){
        long startTime = System.nanoTime();

        TestQueueLinkedList();
        
        long elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Total execution time: " + elapsedTime/1000000);
    }
    public static void TestStackArray() {
        StackArray stackArray = new StackArray(5);

        stackArray.Push(1);
        stackArray.Push(2);
        stackArray.Push(3);
        stackArray.Push(4);
        stackArray.Push(5);

        System.out.println(stackArray.ToString());

        System.out.println(stackArray.Pop());

        System.out.println(stackArray.ToString());

        System.out.println(stackArray.Peek());

        System.out.println(stackArray.ToString());

        stackArray.Pop();
        stackArray.Pop();
        stackArray.Pop();
        stackArray.Pop();

        System.out.println(stackArray.ToString());
    }

    public static void TestQueueArray() {
        QueueArray queueArray = new QueueArray(3);
        queueArray.Push(1);
        queueArray.Push(2);
        queueArray.Push(3);
        System.out.println(queueArray.ToString());
        System.out.println(queueArray.Count());
        queueArray.Peek();
        System.out.println(queueArray.ToString());
        System.out.println(queueArray.Count());
        queueArray.Pop();
        queueArray.Pop();
        queueArray.Pop();
        System.out.println(queueArray.ToString());
        System.out.println(queueArray.Count());
    }

    public static void TestStackLinkedList()
    {
        StackLinkedList stack = new StackLinkedList();
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Push(4);
        stack.Push(5);
        System.out.println(stack.ToString());

        System.out.println(stack.Pop());

        System.out.println(stack.ToString());

        System.out.println(stack.Peek());

        System.out.println(stack.ToString());

        stack.Pop();
        stack.Pop();
        stack.Pop();
        stack.Pop();

        System.out.println(stack.ToString());
    }
    public static void TestQueueLinkedList()
    {
        QueueLinkedList queue = new QueueLinkedList();
        queue.Push(1);
        queue.Push(2);
        queue.Push(3);
        queue.Push(4);
        queue.Push(5);
        System.out.println(queue.ToString());
        //System.out.println(queue.Count());
        System.out.println(queue.Peek());
        System.out.println(queue.ToString());
        //System.out.println(queue.Count());
        queue.Pop();
        queue.Pop();
        queue.Pop();
        System.out.println(queue.ToString());
        //System.out.println(queue.Count());
    }
}
