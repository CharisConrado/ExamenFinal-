
package com.mycompany.ejerciciotipoparcial.people.sportsman;

import com.mycompany.ejerciciotipoparcial.people.Person;
import com.mycompany.ejerciciotipoparcial.sportCenter.Sport;
import com.mycompany.ejerciciotipoparcial.people.TypePerson;

public class Sportsman extends Person implements Doping, Feeding {
    private Sport sport; 
    
    public Sportsman(String name, String lastname, int age, String ID, Sport sport) {  //NO OLVIDES PONER EL ATRIBUTO DE SPORT 
        super(name, lastname, age, ID, TypePerson.SPORTMAN);
        
        this.sport=sport; //PONER ATRIBUTO 
    }

    @Override
    public void doTest() {
        System.out.println("Hacer prueba de sangre");  //esto en vez de ser una salida deberia ser un metodo, como el de diet 
    }

    @Override
    public void diet() {
        if (this.sport == sport.FOOTBALL){
            System.out.println("Haciendo dieta futbolera");
        }  else if (this.sport == sport.BASKETBALL){
            System.out.println("Haciendo dieta de basquetbolera");
        } else if (this.sport == sport.TENNIS){
            System.out.println("Haciendo dieta tennisera");
        }
    }
    
    
    
}
