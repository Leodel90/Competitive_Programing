class MyCircularQueue {
    int queue[];
    int count;
    int p;
    int k;
    public MyCircularQueue(int k) {
        queue = new int [k];
        count=0;
        p=0;
        this.k=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        queue[(p+count)%k]=value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        count--;
        p=(p+1)%k;
        return true;
    }
    
    public int Front() {
        return isEmpty()? -1:queue[p];
    }
    
    public int Rear() {
        return isEmpty()? -1:queue[(k+p+count-1)%k];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count==k;
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
