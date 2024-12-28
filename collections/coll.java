import java.util.ArrayList;
import java.util.Scanner;
public class coll{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr1=new ArrayList<>();
        for(int i=0; i<=5; i++){
            String k=new String();
            k=sc.nextLine();
            arr1.add(k);

        }
        for(String name: arr1){
            System.out.println(name);
        }
    }
}