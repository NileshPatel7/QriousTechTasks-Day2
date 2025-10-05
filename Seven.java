package day2;

public class Seven {
    public static String largestString(String st){
        int count=0;
        int lastSpace=0;
        String bigString="";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==' '){
                if((i-lastSpace)>count){
                    bigString=st.substring(lastSpace,i);
                    count=i-lastSpace;
                    lastSpace=i+1;
                }
                lastSpace=i+1;
            }
        }
        return bigString;
    }
    public static void main(String[] args) {
        System.out.println(largestString(" Pythononasdf code is easy"));
    }
}
