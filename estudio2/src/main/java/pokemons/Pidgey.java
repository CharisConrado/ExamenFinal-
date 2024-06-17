
package pokemons;

import pokemonCreate.Pokemon;
import pokemonCreate.TypePokemon;

public class Pidgey extends Pokemon {
    public Pidgey(String name, int speed, int damage) {
        super(TypePokemon.Air, name, speed, damage, TypePokemon.Electric);
    }
    
    @Override
    public void attack(){
        super.attack();
        System.out.println("¡"+name+" usa VientoCortante!");
    }
}
