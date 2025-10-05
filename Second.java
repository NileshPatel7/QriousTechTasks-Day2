package day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;

public class Second {
    public static void seprateDataType(ArrayList<Object> obj){

            //seperating data types using seprate loop for each data type. flow is int ,double ,boolean,string,long,float
            ArrayList<Integer> integerList=new ArrayList<>();
            ArrayList<Double> doubleList=new ArrayList<>();
            ArrayList<Boolean> boolList=new ArrayList<>();
            ArrayList<String> stringList=new ArrayList<>();
            ArrayList<Long> longList=new ArrayList<>();
            ArrayList<Float> floatList=new ArrayList<>();

            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof Integer)
                    integerList.add((int)obj.get(i));
            }

            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof Double)
                    doubleList.add((double)obj.get(i));
            }

            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof Boolean)
                    boolList.add((boolean)obj.get(i));
            }

            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof String)
                    stringList.add((String) obj.get(i));
            }
            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof Long)
                    longList.add((long)obj.get(i));
            }
            for(int i=0;i<obj.size();i++){
                if(obj.get(i) instanceof Float)
                    floatList.add((float)obj.get(i));
            }

        System.out.println("integer :- "+integerList);
        System.out.println("double :- "+doubleList);
        System.out.println("bool :- "+boolList);
        System.out.println("string :- "+stringList);
        System.out.println("long :- "+longList);
        System.out.println("float :- "+floatList);
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
        seprateDataType(ob);
        // order of data type int ,double,boolean, string, long , float
    }
}
