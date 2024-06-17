package pokemons;

import pokemonCreate.Actions;
import pokemonCreate.Pokemon;
import pokemonCreate.TypePokemon;

public class Pikachu extends Pokemon implements Actions {
    
    public Pikachu(String name, int speed, int damage) {
        super(TypePokemon.Electric, name, speed, damage, TypePokemon.Grass);
    }
    
    @Override
    public void attack(){
        super.attack();
        System.out.println("¡"+name+" usa Electrobola!");
    }

    
    
}
