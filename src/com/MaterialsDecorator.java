package com;

public class MaterialsDecorator implements Materials{
    protected Materials materials;
    
    public MaterialsDecorator(Materials materials){
        this.materials = materials;
    }

    @Override
    public void name(){
        materials.name();
    }

    @Override
    public void description(){
        materials.description();
    }
    
    @Override
    public void price(){
        materials.price();
    }
    
    @Override
    public void print(){
        materials.print();
    }
    @Override
    public String getPart(){
        return materials.getPart();
    }
}
