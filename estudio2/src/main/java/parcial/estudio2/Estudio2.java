package parcial.estudio2;
//MiniJUEGO de POKEMON

import java.io.IOException;
import parcial.estudio2.battles.Battle;
import parcial.estudio2.battles.Tournament;
import pokemons.Bulbasaur;
import pokemons.Charmander;
import pokemons.Pidgey;
import pokemons.Pikachu;
import pokemons.Squirtle;

public class Estudio2 {

    public static void main(String[] args) throws IOException {
        Pikachu pikachu = new Pikachu("Pikachu", 80, 15 );
        Charmander charmander = new Charmander("Charmander", 70, 20);
        Squirtle squirtle = new Squirtle("Squirtle", 70, 18);
        Pidgey pidgey = new Pidgey("Pidgey",80,15);
        Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur",60,25);
        
        Tournament t1 = new Tournament();
        t1.Tournament(pikachu, charmander, squirtle, pidgey, bulbasaur);
        
    }
}
