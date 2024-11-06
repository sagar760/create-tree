import java.util.ArrayList;

public class removeduplicate {
    static ArrayList<Character>  solve(String str){
        ArrayList<Character> t = new ArrayList<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!t.contains(ch)){
                t.add(ch);
            }
        }
        return t;

    }
    public static void main(String[] args) {
        String s = "sagar";
       ArrayList<Character> ch = solve(s);
       for(char c:ch){
        System.out.print(c);
       }
    }
}
