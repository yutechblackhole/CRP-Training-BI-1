public class StringBuilder1{
    public static void main(String [] args){

        StringBuilder sb = new StringBuilder("Hello");

        for(int i =0; i< sb.length()/2; i++){
        int front = i;
        int back = sb.length()-i-1;
        char frontc = sb.charAt(i);
        char backc = sb.charAt(sb.length()-1-i);

        sb.setCharAt(front,backc);
        sb.setCharAt(back,frontc);
        }
        System.out.println(sb);
        }
    }
