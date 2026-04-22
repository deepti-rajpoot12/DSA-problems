
import java.util.Stack;

public class Palindrome {
    public static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static boolean isPalindrome(Node head){
        Node curr = head;
        boolean isPalin = true;
        Stack<Integer> s =new Stack<>(); 

        while(curr != null){
            s.push(curr.data);
           curr = curr.next;
        }

        while(head != null){
            if(head.data == s.pop() ){
               isPalin = true;
            } else{
                isPalin = false;
                break;
            }
            head = head.next ;
        }
        return isPalin;
    }

    public static void main(String[] args) {

        
        Node newNode1 = new Node(1);
        Node newNode2 = new Node(2);
        Node newNode3= new Node(3);
        Node newNode4 = new Node(1);
        Node newNode5 = new Node(2);
        Node newNode6 = new Node(1);

        newNode1.next =  newNode2;
        newNode2.next =  newNode3;
        newNode3.next =  newNode4;
        newNode4.next =  newNode5;
        newNode5.next =  newNode6;
        System.out.println(isPalindrome(newNode1));     
    }
}
