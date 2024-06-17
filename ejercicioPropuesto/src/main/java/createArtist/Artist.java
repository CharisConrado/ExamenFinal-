package createArtist;
import contratos.Portafolio;
import contratos.StyleArtist;


public class Artist implements Portafolio, StyleArtist {
    public String name;
    public int age;
    public int experiencie;
    public TypeArtist type;
    public Materials materials;
    public boolean Available;

    public Artist(String name, int age, int experiencie, TypeArtist type, Materials materials) {
        this.name = name;
        this.age = age;
        this.experiencie = experiencie;
        this.type = type;
        this.materials = materials;
        this.Available = true;
    }

    @Override
    public void Registro() {
        System.out.println("El artista "+name+" ha completado el registro.");
    }

    @Override
    public void ArtistStyle() {
        System.out.println("El artista "+name+" sigue un estilo artístico:");
    }
    
    public void Contratar(){
        System.out.println("Contratando al artista "+name);
        if(Available){
            Available = false;
            System.out.println("Artista contratado");
        }else{
            System.out.println("Artista no disponible");
        }
        
        
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }
    
    
}
