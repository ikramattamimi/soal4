package com;
import java.io.IOException;
import java.util.*;

public class Print {
    private static int n = 1;
    private static List<Integer> indexes = new ArrayList<>();

    public static void SD(){
        System.out.println("======================================================================================================");
    }

    public static void GP(){
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

    public static void mainMenu(){
        clear();
        SD();
        System.out.println("                                                 Main Menu");
        SD();
        System.out.println("Please Select the Number of Below Option:");
        System.out.println(" 1. Beams");
        System.out.println(" 2. Doors");
        System.out.println(" 3. Windows");
        System.out.println("Select: ");
    }
    
    public static void materials(List<Materials> materials, String sPart){
        clear();
        SD();
        System.out.println("                                                 " + sPart);
        SD();
        System.out.println("Please Select the Number of Below Option:");
        for (int i = 0; i < materials.size(); i++) {
            if(materials.get(i).getPart() == sPart){
                System.out.print(n + ". ");
                n = n+1;
                materials.get(i).name();
                indexes.add(i);
            }
            
        }
        n = 1;
        System.out.println("Select: ");
    }
    
    public static void selectedPart(List<Materials> materials, int sPart){
        clear();
        materials.get(indexes.get(sPart-1)).print();
    }

    public static void exit(){
        // clear();
        SD();
        System.out.println("Do you want to exit?");
        SD();
        System.out.println(" 0. Yes");
        System.out.println(" 1. Back to main menu");
        System.out.println("Select: ");

    }

    public static void clear(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
