package com;

import java.util.*;

public class DecorationApp {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        String select;
        boolean exit = false;
        String part = "";
        List<Materials> materialList = new ArrayList<Materials>(
                Arrays.asList(Builder.build()));

        while (exit == false) {
            Print.clear();

            // Print main menu
            Print.mainMenu();

            // Select menu
            select = scann.nextLine();
            part = Select.part(Integer.parseInt(select));

            // Print selected material list
            Print.materials(materialList, part);

            // Select materials
            select = scann.nextLine();

            // Print selected material price and description
            Print.selectedPart(materialList, Integer.parseInt(select));

            // scann.read();
            Print.exit();
            select = scann.nextLine();
            if (Integer.parseInt(select) == 0) {
                exit = true;
            }
        }
        scann.close();
    }

}
