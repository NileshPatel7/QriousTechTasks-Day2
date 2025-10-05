package day2;

public class Six {
    public static String getFirstLetters(String st){
        String output="";
        for(int i=0;i<st.length()-1;i++){
            if((st.charAt(i)==' ' && st.charAt(i+1)!=' '))
                output+=(String.valueOf(st.charAt(i+1)));
            else if(i==0 && st.charAt(i)!=' ')
                output+=String.valueOf(st.charAt(i));
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(getFirstLetters("python code"));
    }
}
