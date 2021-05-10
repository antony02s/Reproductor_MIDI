import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class programa{
    public static void nombre_cancion(String ruta){
        //De aquí se se saca la lista de las canciones que se debe mostrar al usuario
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
    public static void interfaz(){
        //MENU DE OPCIONES PARA EL USUARIO (INTERFAZ GRAFICA)
        System.out.println(" ______ _                              _          _                     _        " );
        System.out.println("| ___  (_)                            | |        | |                   | |       " );
        System.out.println("| |_/ / _  ___   _____ ____    __     | |   ___  | |  _ __   ___   ___ | |  __   " );
        System.out.println("|    / | || '_\\ / __/  _  \\| '_  \\ / _` |/ _ \\ | | |  __| / _  \\/  _ | | / /   " );
        System.out.println("| | \\\\ || | | | | (_ | (_) | | | || (_| |  __/ | | | |   |(_)  | (__ | <  |    " );
        System.out.println("\\ _|\\ _||_|_| |_| \\__ \\___/|_| |_| \\__,_| \\___ |_| |_|    \\___/  \\___|| \\_\\   " );
        System.out.println("");
        System.out.println("|                    Ingrese una opción así:                                    |");
		System.out.println("|                    1. Ver lista de reproducción                               |");
		System.out.println("|                    2. Reproducir canción                                      |");
		System.out.println("|                    3. Mostrar Letra                                           |");
		System.out.println("|                    4. Detener Canción                                         |");
		System.out.println("|                    5. Salir                                                   |");
        System.out.println("");
    }
    public static void main(String[] args) {
        interfaz();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una de las opciones: ");
        String usuario = scanner.nextLine();
        int opcion_usuario=Integer.parseInt(usuario);
        if(opcion_usuario==1){
            System.out.println();
            nombre_cancion("C:\\letras_proyecto.csv");
        }
        
    }
}