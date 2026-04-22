public class MdeleteN {
    static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public  Node deleteNafterM(Node head, int M, int N){
        Node curr = head;

        while(curr != null){
            for(int i=1; i< M && curr != null; i++){
                curr = curr.next; 
            }
            if(curr == null) break;

            Node temp = curr.next;
            for(int i=0; i< N && temp != null; i++){
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
        return head;
    }

    //print
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MdeleteN ll = new MdeleteN();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        int M =2, N=2;

        head = ll.deleteNafterM(head, M, N);
        print(head);
        
    }
}
