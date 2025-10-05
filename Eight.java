package day2;

public class Eight {
    public static void printPattern(int n){
        int printNumber=0;
        int spaceCount=0;

        for(int i=1;i<=n*2-1;i++){
            //in this first loop is going for half pattern printing like n=5 then 5 rows print with this condition
            if(i<(n+1)){
                printNumber++;
                for(int j=1;j<i;j++)
                    System.out.print(" ");

                for(int j=i;j<=n;j++)
                    System.out.print(printNumber+" ");
                spaceCount=i;
                System.out.println();
            }else{ // after completion of half pattern this else reduce print Values and go until upper loop terminate
                printNumber--;
                spaceCount--;
                for(int j=1;j<spaceCount;j++)
                    System.out.print(" ");

                for(int j=n;j<=i;j++)
                    System.out.print(printNumber+" ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
