import java.util.Stack;

public class Parenthesis {

    
    public static Boolean isBalance(String s){
        Boolean ans;
        //Check  if parenthesis are balanced
        Stack<> st = new Stack<>();

        int n = s.length();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)!=st.peek() || st.isEmpty){
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }

        return ans;
    }
    public static void main(String[] args){
        // Check if parenthesis are balanced
        String s = new String("{[{[]}]}");

        Boolean ans = isBalance(s);


    }
}
