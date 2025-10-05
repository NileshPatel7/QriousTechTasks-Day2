package day2;

public class Third {
    public static int findHighest(int []ar) {
        int max=0;
        if (ar.length == 0)
        {
            System.out.println("No Value in Array");
            return 0;
        }
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]<ar[i+1])
                if(max<ar[i+1] || i==0)
                    max=ar[i+1];
        }
        return max;
    }
    public static void main(String[] args) {
        int []ar={-9999999,-8888888,-7777777,1203};
        System.out.println(findHighest(ar));
    }
}
