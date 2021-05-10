import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class programa{
    public static void nombre_cancion(String ruta){
        File file=new File(ruta);
        try{
            String strIP;
            Scanner sc=new Scanner(file);
            int num_lines=0;
            int j=1;
            while(sc.hasNext()){
                String line=sc.nextLine();
                num_lines++;
                String[] str=line.split(";");
                strIP=Arrays.toString(str);
                if(num_lines==1 || num_lines==53 || num_lines==138 || num_lines==168 ||
                 num_lines==235 || num_lines==300 || num_lines==370 || num_lines==404 
                || num_lines==452 || num_lines==554 || num_lines==643 || num_lines==690 ||
                 num_lines==745 || num_lines==796 || num_lines==860 || num_lines==919 ){
                    System.out.println("Canción "+j+" "+":");
                    System.out.println("Nombre canción: "+str[0]);
                    System.out.println("Autor: "+str[1]);
                    System.out.println("Album: "+str[2]);
                    System.out.println("Año: "+str[3]);
                    System.out.println("Enlace canción: "+str[4]);
                    System.out.println();
                    j++;
                }   
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        nombre_cancion("C:\\letras_proyecto.csv");
    }
}