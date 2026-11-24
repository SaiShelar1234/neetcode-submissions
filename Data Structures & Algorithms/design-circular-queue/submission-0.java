class MyCircularQueue {

    int arr[];
    int front;
    int size;

    public MyCircularQueue(int k) {
        arr = new int[k];
        front=0;
        size=0;
    }
    
    public boolean enQueue(int value) {
        if(size==arr.length)
        {
            return false;
        }

        int rear=(front+size)%arr.length;
        arr[rear]=value;
        size++;

        return true;
    }
    
    public boolean deQueue() {
    if(size == 0) {
        return false;
    }

    front = (front + 1) % arr.length;

    size--;

    return true;
    }
    
    public int Front() {
        if(size==0)
        {
            return -1;
        }

        return arr[front];
    }
    
    public int Rear() {
        if(size==0)
        {
            return -1;
        }

        return arr[((front+size)-1)%arr.length];
    }
    
    public boolean isEmpty() {
        if(size==0)
        {
            return true;
        }

        return false;
    }
    
    public boolean isFull() {
        if(size==arr.length)
        {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */