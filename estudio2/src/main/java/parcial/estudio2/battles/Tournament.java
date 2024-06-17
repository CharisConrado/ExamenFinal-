package parcial.estudio2.battles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import pokemonCreate.Pokemon;

public class Tournament {
    private File registro;
    public Tournament() {
        this.registro = new File("./registro.txt");
    }
    
    
    public void Tournament(Pokemon p1, Pokemon p2, Pokemon p3, Pokemon p4, Pokemon p5) throws IOException{
        ArrayList<Pokemon> lista = new ArrayList<>();
        Battle battle = new Battle();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        CrearArchivo();
        int x = 0;
        for(int i=0;i<lista.size();i++){
            x=i+1;
            while(x<lista.size()){
                battle.Battle(lista.get(i), lista.get(x));
                x+=1;
            }
            
            
        }
        Ganador(p1,p2,p3,p4,p5);
    }
    
    public void CrearArchivo() throws IOException{
        try{
            registro.createNewFile();
            System.out.println("Archivo creado");
        }catch(IOException e){
            System.out.println("Archivo existente");
            
        }finally{
            FileWriter fw = new FileWriter(registro,false);
            PrintWriter pw = new PrintWriter(fw);
            fw.close();
            pw.close();
        }
        
    }
    public void Registro(String Line) throws IOException{
        FileWriter fw = new FileWriter(registro,true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(Line);
        fw.close();
        pw.close();
        
    }
    
    public void Ganador(Pokemon p1, Pokemon p2, Pokemon p3, Pokemon p4, Pokemon p5) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(registro);
        BufferedReader buffer = new BufferedReader(fr);
        int []lista = new int[5];
        String Line = "";
        while(Line!=null){
            Line = buffer.readLine();
            if(Line!=null){
                if(Line.equals(p1.name)){
                    lista[0]+=1;
                }else if(Line.equals(p2.name)){
                    lista[1]+=1;
                }else if(Line.equals(p3.name)){
                    lista[2]+=1;
                }else if(Line.equals(p4.name)){
                    lista[3]+=1;
                }else if(Line.equals(p5.name)){
                    lista[4]+=1;
                }
            }
            
            
        }
        fr.close();
        buffer.close();
        int x = 0;
        for(int number : lista){
            if(number>=lista[0] && number>=lista[1] && number>=lista[2] && number>=lista[3] && number>=lista[4]){
                if(x==0){
                    System.out.println("El ganador es "+p1.name);
                }else if(x==1){
                    System.out.println("El ganador es "+p2.name);
                }else if(x==2){
                    System.out.println("El ganador es "+p3.name);
                }else if(x==3){
                    System.out.println("El ganador es "+p4.name);
                }else if(x==4){
                    System.out.println("El ganador es "+p5.name);
                }
            }
            x+=1;
        }
    }
}
