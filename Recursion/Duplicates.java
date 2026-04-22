public class Duplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean map[] ){
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, sb, map);
        } else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, sb.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
