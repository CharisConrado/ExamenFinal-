package artistsRegister;

import createArtist.Artist;
import createArtist.TypeArtist;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Register {
    private File registro;
    private File pintores;
    private File escultores;

    public Register() {
        this.registro = new File("./registroArtistas.txt");
        this.pintores = new File("./registroPintores.txt");
        this.escultores = new File("./registroEscultores.txt");
    }
    public void newFiles(){
        try{
            registro.createNewFile();
            pintores.createNewFile();
            escultores.createNewFile();
        }catch(IOException e){
            System.out.println("Archivos creados");
        }
    }
    
    public void Register(ArrayList<Artist> lista) throws IOException{
        
        FileWriter fw = new FileWriter(registro, false);
        PrintWriter pw = new PrintWriter(fw);
        FileWriter fw2 = new FileWriter(pintores, false);
        PrintWriter pw2 = new PrintWriter(fw2);
        FileWriter fw3 = new FileWriter(escultores, false);
        PrintWriter pw3 = new PrintWriter(fw3);
        
        for(Artist Element: lista){
            pw.println(Element.name+";"+Element.type+";"+Element.age+";"+Element.experiencie+";"+Element.materials);
            if(Element.type == TypeArtist.Pintor){
                pw2.println(Element.name+";"+Element.type+";"+Element.age+";"+Element.experiencie+";"+Element.materials);
            }else if(Element.type == TypeArtist.Escultor){
                pw3.println(Element.name+";"+Element.type+";"+Element.age+";"+Element.experiencie+";"+Element.materials);
            }
        }
        
        
        System.out.println("Registro de artistas realizado.");
        fw.close();
        pw.close();
        fw2.close();
        pw2.close();
        fw3.close();
        pw3.close();
        
    }
    
}
