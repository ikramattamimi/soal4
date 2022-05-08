package com;

public class Windows implements Materials{
    
    protected String description;
    protected String part;
    protected String price;

    public Windows(String part, String price, String description) {
        this.description = description;
        this.part = part;
        this.price = price;
    }

    @Override
    public void part() {
        // TODO Auto-generated method stub
        System.out.println(this.part);
    }
    
    @Override
    public void price() {
        // TODO Auto-generated method stub
        System.out.println("Price:");
        System.out.println(this.price);
    }
    
    @Override
    public void description() {
        // TODO Auto-generated method stub
        System.out.println("Description:");
        System.out.println(this.description);
    }

    public void print(){
        SamaDengan.printGP();
        part();
        SamaDengan.printGP();
        price();
        System.out.println();
        description();
        System.out.println();
    }

}
