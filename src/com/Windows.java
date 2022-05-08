package com;

public class Windows implements Materials{
    
    protected String description;
    protected String part = "Jendela";
    protected String price;
    protected String name;

    public Windows(String name, String price, String description) {
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
        price();
        description();
        System.out.println();
    }
    
    @Override
    public String getPart(){
        return this.part;
    }

}
