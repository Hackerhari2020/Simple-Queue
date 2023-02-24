
class QueueOperations {

    int[] Queue;
    int Front;
    int Rear;
    int capacity;

    QueueOperations(int size) {
        Queue = new int[size];
        this.Front = -1;
        this.Rear = -1;
        this.capacity = size;

    }

    boolean isFull() {

        return (Front == 0 && Rear == capacity - 1);
    }

    boolean isEmpty() {

        return Front == -1;
    }

    public void Enqueue(int value) {

        if (isFull()) {
            System.out.println("Queue is Full");
            System.exit(1);
        } else {
            if (Front == -1) {
                Front = 0;
            }
            Queue[++Rear] = value;
        }

    }

    public int Dequeue() {
        int value = 0;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            value = Queue[Front];
            if (Front == Rear) {
                Front = Rear = -1;
            } else {
                Front++;
            }
        }
        return value;
    }

    void display() {

        for (int i = Front; i <= Rear; i++) {
            System.out.print(Queue[i] + "\t");
        }

    }

}

public class test5 {

    public static void main(String[] args) {
        QueueOperations q = new QueueOperations(5);
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);

        q.display();
        q.Dequeue();
        q.Dequeue();
        System.out.println();
        q.display();

    }

}
