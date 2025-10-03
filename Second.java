package day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;

public class Second {
    public static ArrayList<Object> seprateDataType(ArrayList<Object> obj){
        ArrayList<Object> newList=new ArrayList<>();
            //seperating data types using seprate loop for each data type. flow is int ,double ,boolean,string,long,float

            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof Integer)
                    newList.add(obj.get(i));
            }

            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof Double)
                    newList.add(obj.get(i));
            }

            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof Boolean)
                    newList.add(obj.get(i));
            }

            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof String)
                    newList.add(obj.get(i));
            }
            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof Long)
                    newList.add(obj.get(i));
            }
            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof Float)
                    newList.add(obj.get(i));
            }
        return newList;
    }
    public static void main(String[] args) {
        ArrayList<Object> ob=new ArrayList<>();
        ob.add(10);
        ob.add("HIi");
        ob.add(30.223);
        ob.add(12.5f);
        ob.add(90122L);
        ob.add(false);
        ob.add(20);
        ob.add(72.32f);
        ob.add(true);
        ob.add(34);
        ob.add(600000L);
        System.out.println(seprateDataType(ob));
        // order of data type int ,double,boolean, string, long , float
    }
}
