package com;

public class Select {
    public static String part = "";
    public static String part(int select){
        switch (select) {
            case 1:
                part = "Baja";
                break;

            case 2:
                part = "Pintu";
                break;
            
            case 3:
                part = "Jendela";
                break;
        
            default:
                break;
        }
        return part;
    }
}
