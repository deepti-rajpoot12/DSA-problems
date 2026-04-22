// find te intersection point of the two nodes

public class Intersection {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }

    }

    public Node getIntersection(Node head1, Node head2){
        Node temp2 = head2;
        while(temp2 !=null){
            Node temp1 = head1;
            while(temp1 != null){
                if(temp1 == temp2){
                    return temp2;
                }
                temp1 = temp1.next;
            }
            temp2 = temp2.next;
        }
        return null;
    }
    

    public static void main(String[] args) {
        Intersection ll = new Intersection();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

         newNode= new Node(9);
         head2.next.next = newNode;

         newNode = new Node(15);
         head1.next = newNode;

         newNode = new Node(30);
         head1.next.next = newNode;
         head2.next.next.next = newNode;

        Node intersectionPoint = ll.getIntersection(head1, head2);
         if(intersectionPoint == null){
            System.out.println("No Intersection point");
         }else{
             System.out.println("intersection point : " + intersectionPoint.data);
         }
    }
}
