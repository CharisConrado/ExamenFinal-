
package pokemons;

import pokemonCreate.Pokemon;
import pokemonCreate.TypePokemon;

public class Charmander extends Pokemon{
    
    public Charmander(String name, int speed, int damage) {
        super(TypePokemon.Fire, name, speed, damage, TypePokemon.Water);
    }
    @Override
    public void attack(){
        super.attack();
        System.out.println("¡"+name+" usa Lanzallamas!");
    }
    
    
    
}
