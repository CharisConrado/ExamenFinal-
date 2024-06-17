package pokemonCreate;

import java.util.Random;

public class Pokemon implements Actions {
    public TypePokemon type;
    public String name;
    public int healt;
    public int speed;
    public int damage;
    public TypePokemon debility;

    public Pokemon(TypePokemon type,String name, int speed, int damage, TypePokemon debility) {
        this.type = type;
        this.name = name;
        this.healt = 100;
        this.speed = speed;
        this.damage = damage;
        this.debility = debility;
    }

    @Override
    public void attack() {
        System.out.println("¡"+name+" está atacando!");
    }

    @Override
    public void evade(int damage) {
        Random random = new Random();
        System.out.println("¡"+name+" trata de esquivar el ataque!");
        int probability = random.nextInt(100);
        if(probability<=speed){
            System.out.println("¡Ha logrado esquivar!");
        }else{
            System.out.println("No pudo esquivar");
            healt = healt-damage;
            System.out.println("Vida restante de: "+name+": "+healt);
        }
    }

    @Override
    public void heal() {
        System.out.println("¡"+name+" se ha curado!");
        healt = 100;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
    
}
