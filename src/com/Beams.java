package com;

public class Beams implements Materials{

    protected String description;
    protected String part = "Baja";
    protected String price;
    protected String name;

    public Beams(String name, String price, String description) {
        this.description = description;
        this.name = name;
        this.price = price;
    }

    @Override
    public void name() {
        // TODO Auto-generated method stub
        System.out.println(this.name);
    }
    
    @Override
    public void price() {
        // TODO Auto-generated method stub
        System.out.println("PRICE-------------------------------------------------------------------------------------------------");
        System.out.println(this.price);
    }
    
    @Override
    public void description() {
        // TODO Auto-generated method stub
        System.out.println("DESCRIPTION-------------------------------------------------------------------------------------------");
        System.out.println(this.description);
    }

    @Override
    public void print(){
        Print.SD();
        name();
        Print.SD();
        System.out.println();
        price();
        System.out.println();
        description();
    }
    
    @Override
    public String getPart(){
        return this.part;
    }
}
