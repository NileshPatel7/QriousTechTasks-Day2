package day2;

public class First  {
    public static void checkMultiples(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+", ");
        }
    }
    public static void main(String[] args) {
        checkMultiples(15);
    }
}
