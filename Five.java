package day2;

public class Five {
    public static double getCircleArea(int r){
        return (int)(Math.PI*r*r);
    }
    public static void main(String[] args) {
        System.out.println(getCircleArea(4));
    }
}
