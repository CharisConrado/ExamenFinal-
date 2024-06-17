
package com.mycompany.ejerciciotipoparcial.sportCenter;

import com.mycompany.ejerciciotipoparcial.people.TypePerson;
import java.util.ArrayList;

public class SportCenter {
    private String name; 
    private String location;
    private String schedule; //horario 
    
    private ArrayList<Scenary> scenaries = new ArrayList<>(); 

    public SportCenter(String name, String location, String schedule) {
        this.name = name;
        this.location = location;
        this.schedule = schedule;
    }
    
    public void AddScenary(Scenary scenary){
        this.scenaries.add(scenary); 
        
    }
    
    public void reservScenary (TypePerson type, Scenary scenary) throws Exception{
        if (type == TypePerson.COACH  || type == TypePerson.SPORTMAN){
            int index = this.scenaries.indexOf(scenary);
            if (index != -1){
                Scenary sc = this.scenaries.get(index);
                if (sc.isAvailable()){
                    System.out.println("Escenario reservado");
                    sc.setAvailable(false);
                    
                } else {
                    throw new Exception ("El escenario no està disponible"); 
                }
            }
        }
    }
}
