package com;

import java.util.*;

public class ColorsMaterialsDecorator extends MaterialsDecorator {
    public List<String> colors = new ArrayList<>();

    public ColorsMaterialsDecorator(Materials materials, String[] colors) {
        // TODO Auto-generated constructor stub
        super(materials);
        this.colors.addAll(Arrays.asList(colors));
        // colors.add("Biru");
        // colors.add("Oren");
    }

    @Override
    public void print() {
        materials.print();
        colors();
    }

    public void colors() {
        System.out.println("AVAILABLE COLORS--------------------------------------------------------------------------------------");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(i+1 + ". ");
            System.out.println(colors.get(i));
        }
        System.out.println();
    }
}
