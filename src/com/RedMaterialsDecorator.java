package com;

public class RedMaterialsDecorator extends MaterialsDecorator{

    public RedMaterialsDecorator(Materials materials) {
        super(materials);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void part() {
        // TODO Auto-generated method stub
        materials.part();
        setRedBorder();
    }

    @Override
    public void price() {
        // TODO Auto-generated method stub
        
    }

    public void setRedBorder() {
        System.out.println("Border: Red");
    }

    @Override
    public void description() {
        // TODO Auto-generated method stub
        
    }
    
}
