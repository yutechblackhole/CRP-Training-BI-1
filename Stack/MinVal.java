import java.util.*;
public class MinVal{

    // Remove k digits from a number to get smallest number
    static int smallestAfterk(int num, int k){

            String s = Integer.toString(num);

            Stack<Integer> st = new Stack<>();
            int n = s.length();
            st.push(s.charAt(1)-'0');
            for(int i =1; i<n; i++){
                if(k>0 && st.peek()<s.charAt(i)-'0'){
                    k--;
                    continue;
                }
                st.push(s.charAt(i)-'0');

            }
            StringBuilder sb = new StringBuilder();
            for(int i =1; i<=n-k;i++){
                if(st.isEmpty()) break;

                sb.append(st.pop());
            }
            int ans = Integer.parseInt(sb.reverse().toString());

            return ans;

            
        }
    public static void main(String[] args){

        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = smallestAfterk(n,k);
        System.out.println(ans);

    }
}