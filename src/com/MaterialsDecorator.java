package com;

public abstract class MaterialsDecorator implements Materials{
    protected Materials materials;
    
    public MaterialsDecorator(Materials materials){
        this.materials = materials;
    }

    @Override
    public void part(){
        materials.part();
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
}
