package day2;

public class Third {
    public static int findHighest(int []ar) {
        int max=-888888;
        if (ar.length == 0)
        {
            System.out.println("No Value in Array");
            return 0;
        }
        for(int i=0;i<ar.length;i++){
            if(max<ar[i])
                max=ar[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int []ar={5,12,91,43,7,82,35};
        System.out.println(findHighest(ar));
    }
}
