package parcial.ejerciciopropuesto;

import artists.Painter;
import artists.Sculptor;
import artistsRegister.Register;
import createArtist.Artist;
import java.io.IOException;
import java.util.ArrayList;

public class EjercicioPropuesto {

    public static void main(String[] args) throws IOException {
        
        Painter p1 = new Painter("Santiago",20,5);
        Sculptor s1 = new Sculptor("Charis",21,6);
        Sculptor s2 = new Sculptor("Alberto",45,20);
        Painter p2 = new Painter("Merieth",32,15);
        
        Register r1 = new Register();
        r1.newFiles();
        
        p1.Contratar();
        p1.Contratar();
        
        ArrayList<Artist> lista = new ArrayList<>();
        lista.add(s1);
        lista.add(p1);
        lista.add(s2);
        lista.add(p2);
        r1.Register(lista);
    }
}