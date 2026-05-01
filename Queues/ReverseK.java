import java.util.*;
public class ReverseK {
    public static void reverse(Queue<Integer> q, int k){
        Stack<Integer> s = new Stack();
        if(k <= 0 || q == null || q.size() < k){
            return;
        }

        for(int i=0; i<k; i++){
          s.push(q.poll());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        int size = q.size();
        for(int i=0; i<size-k; i++){
            q.add(q.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
       
        int k = 5;

        reverse(q, k);
    
        System.out.print(q);
    }
}
