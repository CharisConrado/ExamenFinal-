
package com.mycompany.ejerciciotipoparcial.sportCenter;


public class Scenary {
    private String name;
    private Sport sport; //ENUM 
    private int size; 
    private boolean available = true; 

    public Scenary(String name, Sport sport, int size) {
        this.name = name;
        this.sport = sport;
        this.size = size;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;  
    }
    
    
    
    
    
}
