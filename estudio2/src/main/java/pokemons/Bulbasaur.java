package pokemons;

import pokemonCreate.Pokemon;
import pokemonCreate.TypePokemon;

public class Bulbasaur extends Pokemon{
    public Bulbasaur(String name, int speed, int damage) {
        super(TypePokemon.Grass, name, speed, damage, TypePokemon.Fire);
    }
    
    @Override
    public void attack(){
        super.attack();
        System.out.println("¡"+name+" usa LluviaDeHojas!");
    }
}
