
package com.mycompany.ejerciciotipoparcial.people.coach;

import com.mycompany.ejerciciotipoparcial.people.Person;
import com.mycompany.ejerciciotipoparcial.people.TypePerson;
import com.mycompany.ejerciciotipoparcial.sportCenter.Sport;

public class Coach extends Person {
    private Sport sport; //me sirve el mismo enum que hice anteriormente 
    private boolean available = true; //para asegurarme si el coach està disponible o no 
    
    
    public Coach(String name, String lastname, int age, String ID) {
        super(name, lastname, age, ID, TypePerson.COACH);
    }

    
    
    
    public Sport getSport() {
        return sport;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    
}
