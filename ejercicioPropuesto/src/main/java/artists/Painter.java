
package artists;

import createArtist.Artist;
import createArtist.Materials;
import createArtist.TypeArtist;

public class Painter extends Artist{
    
    public Painter(String name, int age, int experiencie) {
        super(name, age, experiencie, TypeArtist.Pintor, Materials.Pintura);
    }
    
    public void Painting(String motivo){
        System.out.println(name+" está pintando un/a "+motivo);
    }
    @Override
    public void ArtistStyle(){
        super.ArtistStyle();
        System.out.println("Lo motiva recrear paisajes");
    }
    
    
}
