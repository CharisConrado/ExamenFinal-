
package com.mycompany.ejerciciotipoparcial;

import com.mycompany.ejerciciotipoparcial.people.TypePerson;
import com.mycompany.ejerciciotipoparcial.people.coach.Coach;
import com.mycompany.ejerciciotipoparcial.sportCenter.Scenary;
import com.mycompany.ejerciciotipoparcial.sportCenter.Sport;
import com.mycompany.ejerciciotipoparcial.sportCenter.SportCenter;


public class EjercicioTipoParcial {

    public static void main(String[] args) throws Exception {
        SportCenter sportCenter = new SportCenter("Megaparque", "Ocaña", "Todo el dìa");
        
        Scenary scenary = new Scenary("Polideportivo", Sport.TENNIS, 200);
        Scenary scenary1 = new Scenary("Polideportivo", Sport.TENNIS, 200);
        
        sportCenter.AddScenary(scenary);
        sportCenter.AddScenary(scenary1);
        
        Coach coach = new Coach ("Pepa", "Pig", 8, "asd"); 
        
        try{
            sportCenter.reservScenary(TypePerson.COACH, scenary);
            
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            sportCenter.reservScenary(TypePerson.COACH, scenary1);
            
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
