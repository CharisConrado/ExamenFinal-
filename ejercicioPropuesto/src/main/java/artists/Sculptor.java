
package artists;

import createArtist.Artist;
import createArtist.Materials;
import createArtist.TypeArtist;

public class Sculptor extends Artist {
    
    public Sculptor(String name, int age, int experiencie) {
        super(name, age, experiencie, TypeArtist.Escultor, Materials.Arcilla);
    }
    
    public void Sculpting(String motivo){
        System.out.println(name+" está esculpiendo un/a "+motivo);
    }
    @Override
    public void ArtistStyle(){
        super.ArtistStyle();
        System.out.println("Le gusta crear figuras");
    }
}
