// implementation of queue by array

public class Array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
          arr = new int[n];
          size = n;
          rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
            }

        public static void add(int data){
            if(rear == -1){
                System.out.println("queue is empty");
                return;
            }
            rear = rear +1;
            arr[rear] = data;
        }

        public static int remove(){
            if(rear == -1){
                System.out.println("queue is empty");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear ; i++){
                arr[i] = arr[i+1];
            }
            return front;
        }
        public static int peek(){
             if(rear == -1){
                System.out.println("queue is empty");
                return -1;
            }

            int front = arr[0];
            return front;
        }

    }
    public static void main(String[] args) {
        Queue.add(1);
        Queue.add(2);
        Queue.add(3); 

        while(!Queue.isEmpty()){
           System.out.println(Queue.peek());
           Queue.remove();
        }
    }
}

