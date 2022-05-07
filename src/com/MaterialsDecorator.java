package com;

public abstract class MaterialsDecorator implements Materials{
    protected Materials materials;
    
    public MaterialsDecorator(Materials materials){
        this.materials = materials;
    }

    
    public void part(){
        materials.part();
    }
}
