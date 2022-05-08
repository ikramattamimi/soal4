package com;
import java.util.*;
public class DecorationApp {
    
    public static void main(String[] args){

        List<Materials> materialList = new ArrayList<Materials>(
                Arrays.asList(Builder.build()));

        materialList.get(0).print();
    }

}
