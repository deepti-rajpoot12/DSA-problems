
public class LinkedList {
    //Create node class
    public static class Node{
        int data;
        Node next;

        //create a construrctor for node class
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }    

    //define as a property
    public static Node head;
    public static Node tail;
    public static int size;

    //add in first    
    public void addFirst (int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

            
        //step2 = newNode next = head
        newNode.next = head; //link

        //step 3 = head = newNode
        head = newNode;
    } 
    
    //Add in last
    public void addLast(int data){
        //step1 => create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = tail = newNode;
        }
        //step2 => tail.next = newNode
        tail.next = newNode;
       
        //step 3 => tail = newNode   
        tail = newNode  ;        
    }

    //add in middle
    public void add(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // print ll  T.C => 0(n)
    public void print() {
        
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if( size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    } 
    
    //Remove last ele ll
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size ==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2v
        Node prev = head;
        for(int i=0; i < size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
        
    }

    //Iterative Search
    public int itrSearch(int key){
        Node temp = head;
        int i=0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found 
        return -1;
    }
    public static void main(String[] args) {
        //create object of AddFirst class for creating nodes in the object 
        LinkedList ll =new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(5);
        ll.add(3, 4);
         ll.removeFirst();
        // ll.removeLast();
        ll.print();
         System.out.println(ll.size);

        // System.out.println(ll.removeFirst());

        
    }
}
