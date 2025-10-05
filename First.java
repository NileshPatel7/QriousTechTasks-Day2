package day2;
import java.util.ArrayList;
public class First  {
    public static ArrayList<Integer> checkMultiples(long n){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0)
                al.add(i);
        }
        return al;
    }
    public static void main(String[] args) {
        System.out.println(checkMultiples(15));
    }
}
