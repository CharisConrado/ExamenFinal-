
package parcial.estudio2.battles;

import java.io.IOException;
import pokemonCreate.Pokemon;
public class Battle {
    public void Battle(Pokemon p1, Pokemon p2) throws IOException{
        Tournament torneo = new Tournament();
        int a = 1;
        int daño1 = p1.damage;
        int daño2 = p2.damage;
        
        if(p1.type == p2.debility){
            p1.setDamage(p1.damage*2);
        }else if(p2.type == p1.debility){
            p2.setDamage(p2.damage*2);
        }
        while (a==1){
            if(p1.healt > 0 && p2.healt >0){
                if(p1.healt > 0){
                    p1.attack();
                    p2.evade(p1.damage);
                    System.out.println("");
                }
                if(p2.healt > 0){
                    p2.attack();
                    p1.evade(p2.damage);
                    System.out.println("");
                }
                
            }else{
                if(p1.healt <= 0){
                    System.out.println(p1.name+" ha sido derrotado "+p2.name+" es el ganador");
                    torneo.Registro(p2.name);
                    p1.heal();
                    p2.heal();
                    System.out.println("");
                    System.out.println("------------------------------------------------------------------------------");
                    p1.setDamage(daño1);
                    p2.setDamage(daño2);
                    break;
                }else{
                    System.out.println(p2.name+" ha sido derrotado "+p1.name+" es el ganador");
                    torneo.Registro(p1.name);
                    p1.heal();
                    p2.heal();
                    System.out.println("");
                    System.out.println("------------------------------------------------------------------------------");
                    p1.setDamage(daño1);
                    p2.setDamage(daño2);
                    break;
                }
                
            }
            
        }
        
        
    }
}
