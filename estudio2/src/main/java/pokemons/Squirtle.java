
package pokemons;

import pokemonCreate.Pokemon;
import pokemonCreate.TypePokemon;

public class Squirtle extends Pokemon {
    public Squirtle(String name, int speed, int damage) {
        super(TypePokemon.Water, name, speed, damage, TypePokemon.Grass);
    }
    
    @Override
    public void attack(){
        super.attack();
        System.out.println("¡"+name+" usa HidroBomba!");
    }
}
