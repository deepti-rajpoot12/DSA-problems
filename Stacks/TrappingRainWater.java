import java.util.*;
public class TrappingRainWater {
    public static int trappedWater(int height[]){
        Stack<Integer> s = new Stack<>();
        int water = 0;
        for(int i=0; i<height.length; i++){
          while(!s.isEmpty() && height[i] > height[s.peek()]){
            int mid = s.pop(); 
            if(s.isEmpty()){
                break;
            } 
            int left = s.peek();
            int width = i - left  -1;
            
            int heightDiff = Math.min(height[i] , height[left] ) - height[mid] ;
            water += heightDiff * width;
            
            
          }
          s.push(i);
        }
        return water;
        
       }
    public static void main(String[] args) {
        int height[] = {7, 0, 4, 2, 5, 0, 6, 4, 0 ,5};
        System.out.println("trapped rain water is " + trappedWater(height));
    }
}
