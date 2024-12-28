import java.util.Stack;

public class stack{
    public static void main(String[] args){
        Stack<String> st1=new Stack<>();
        st1.push("Hritik");
        st1.push("divyansh");
        st1.push("keshav rastogi");
        
        st1.pop();
        for(String name:st1){
            System.out.println(name);
        }
        

    }
}