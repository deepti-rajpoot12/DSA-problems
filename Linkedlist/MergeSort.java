
public class MergeSort {
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
    public void print() {
        
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newleft, newRight);
    }

    //Zig zag
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node midNode = slow;
        
        //reverse 2nd half
        Node curr = midNode.next;
        midNode.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR ;

        //alternate merge => zig-zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left =  nextL;
            right = nextR;
        }

    }

    public static void main(String args[]){
        MergeSort ll = new MergeSort();
        ll.addFirst(1);
        ll.addFirst(6);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(5);

        ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();
        ll.zigZag();
        ll.print();
        
    }

}
