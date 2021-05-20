import java.io.BufferedReader;
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
        int j=1;
        int num_lines=0;
        String file=ruta;
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            String line;
            while((line=br.readLine())!=null){
                num_lines++;
                String [] str=line.split(";");
                if(num_lines==1 || num_lines==53 || num_lines==138 || num_lines==168 ||
                    num_lines==235 || num_lines==300 || num_lines==370 || num_lines==404 
                    || num_lines==452 || num_lines==554 || num_lines==643 || num_lines==690 ||
                    num_lines==745 || num_lines==796 || num_lines==860 || num_lines==919 || num_lines==944
                    || num_lines==1010){
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
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void interfaz_1(){
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
		System.out.println("|                    2. Salir                                                   |");
        System.out.println("");
    }

    public static void interfaz_2(){
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("|                          \\ \\|/ /                                        |");
        System.out.println("|                           (O O)                                           |");
        System.out.println("|               +--------oOO--(_)--------------+                            |");
        System.out.println("|               |      EL RINCON DEL ROCK      |                            |"); 
        System.out.println("|               +-----------------oOO----------+                            |");
        System.out.println("|                           |__|__|                                         |");
        System.out.println("|                            | | |                                          |");
        System.out.println("|                           ooO Ooo                                         |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                           |");
        System.out.println("|           Ingresa el número del indice de una canción                     |");
        System.out.println("|     Recuerda que el indice va desde la canción #1 hasta la #18            |");
        System.out.println("|---------------------------------------------------------------------------|");
    }
    public static void interfaz_3(){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                          \\ \\|/ /                                        |");
        System.out.println("|                           (O O)                                           |");
        System.out.println("|               +--------oOO--(_)--------------+                            |");
        System.out.println("|               |      EL RINCON DEL ROCK      |                            |"); 
        System.out.println("|               +-----------------oOO----------+                            |");
        System.out.println("|                           |__|__|                                         |");
        System.out.println("|                            | | |                                          |");
        System.out.println("|                           ooO Ooo                                         |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                      Excelente elección!!!                                |");
        System.out.println("|                     ¿Te sabes la letra?                                   |");
        System.out.println("|    Si la respues es Sí ingresa 1 para reproducir el audio de la canción   |");
        System.out.println("|                                                                           |");
        System.out.println("|   Si no te sabes la letra no te preocupes, nosotros te ayudamos           |");
        System.out.println("|         Ingresa 2 para ver la letra y reproducir el audio                 |");
        System.out.println("|---------------------------------------------------------------------------|");
        System.out.println("|     RECUERDA, NO PUEDES DETENER LA CANCION Y VOLVERLA A REPRODUCIR        |");
        System.out.println("|          LA IDEA ES QUE TE DIVIERTAS HACIENDO EL KARAOKE COMPLETO         |");
        System.out.println("|---------------------------------------------------------------------------|");
    }
    public static void interfaz_4(){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                          \\ \\|/ /                                        |");
        System.out.println("|                           (O O)                                           |");
        System.out.println("|               +--------oOO--(_)--------------+                            |");
        System.out.println("|               |      EL RINCON DEL ROCK      |                            |"); 
        System.out.println("|               +-----------------oOO----------+                            |");
        System.out.println("|                           |__|__|                                         |");
        System.out.println("|                            | | |                                          |");
        System.out.println("|                           ooO Ooo                                         |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                      Para escuchar otra canción ingresa 1                 |");
        System.out.println("|                     Si deseas cerrar el programa ingresa 2                |");
        System.out.println("|---------------------------------------------------------------------------|");
    }
    public static void letra_repro_cancion(int indice_cancion){
        int j=1;
        int num_lines=0;
        String file="C:\\letras_proyecto.csv";
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            String line;
            while((line=br.readLine())!=null){
                num_lines++;
                if(indice_cancion==1){
                    if(num_lines>=2 && num_lines<=51){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==2){
                    if(num_lines>=54 && num_lines<=136){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==3){
                    if(num_lines>=139 && num_lines<=166){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==4){
                    if(num_lines>=169 && num_lines<=233){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==5){
                    if(num_lines>=236 && num_lines<=298){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==6){
                    if(num_lines>=301 && num_lines<=368){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==7){
                    if(num_lines>=371 && num_lines<=402){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==8){
                    if(num_lines>=405 && num_lines<=450){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==9){
                    if(num_lines>=453 && num_lines<=552){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==10){
                    if(num_lines>=555 && num_lines<=641){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==11){
                    if(num_lines>=644 && num_lines<=688){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==12){
                    if(num_lines>=691 && num_lines<=743){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==13){
                    if(num_lines>=746 && num_lines<=794){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==14){
                    if(num_lines>=797 && num_lines<=858){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==15){
                    if(num_lines>=861 && num_lines<=918){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==16){
                    if(num_lines>=920 && num_lines<=943){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==17){
                    if(num_lines>=945 && num_lines<=1009){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==18){
                    if(num_lines>=1011 && num_lines<=1077){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==19){
                    if(num_lines>=1080 && num_lines<=1105){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }else if(indice_cancion==20){
                    if(num_lines>=1108 && num_lines<=1141){
                        line=line.replace(";", " ");
                        System.out.println(line);
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String [] rutas={"canciones\\Rosas.mid", "canciones\\Me_gustas_tu.mid", "canciones\\Rayando_el_sol.mid", "canciones\\A_Dios_le_pido.mid"
        , "canciones\\La_camisa_negra.mid", "canciones\\Vivo_por_ella.mid", "canciones\\Maldito_duende.mid", "canciones\\En_algun_lugar.mid",
        "canciones\\Como_Camaron.mid", "canciones\\La_Gasolina.mid", "canciones\\dame_amor.mid", "canciones\\Laura.mid","canciones\\Nada_valgo_sin_tu_amor.mid",
        "canciones\\Vino_Tinto.mid", "canciones\\Cuando_Sea_Grande.mid", "canciones\\Cielo.mid", "canciones\\Por_la_raja_de_tu_falda.mid",
        "canciones\\Hijo_de_la_luna.mid", "soda estereo","canciones\\Oye_mi_amor.mid"};
        Audio obj= new Audio();
        Scanner scanner_4 = new Scanner(System.in);
        System.out.println("Ingresa 1 para iniciar el programa");
        String usuario_4 = scanner_4.nextLine();
        int opcion_usuario_4=Integer.parseInt(usuario_4);
        do{
            //se despliega la interfaz para el usuario, MENU DE OPCIONES
            interfaz_1();
            // El usuario elige la opción que desea implementar
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa una de las opciones: ");
            String usuario = scanner.nextLine();
            int opcion_usuario=Integer.parseInt(usuario);
            //El usuario elige la opción 1
            if(opcion_usuario==1){
                System.out.println();
                nombre_cancion("letras_proyecto.csv");

                Scanner scanner_2 = new Scanner(System.in);
                interfaz_2();
                String usuario_2 = scanner.nextLine();
                int opcion_usuario_2=Integer.parseInt(usuario_2);

                System.out.println();

                Scanner scanner_3 = new Scanner(System.in);
                interfaz_3();
                String usuario_3 = scanner_3.nextLine();
                int opcion_usuario_3=Integer.parseInt(usuario_3);

                if(opcion_usuario_3==1){
                    obj.seleccionarCancion(rutas[opcion_usuario_2]);
                    obj.reproducir();
                    Scanner scanner_6 = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Ingrese 1 para detener la canción");
                    String usuario_6 = scanner_6.nextLine();
                    int opcion_usuario_6=Integer.parseInt(usuario_6);
                    if(opcion_usuario_6==1){
                        System.out.println();
                        obj.detener();
                    }
                }else if(opcion_usuario_3==2){
                    letra_repro_cancion(opcion_usuario_2);
                    obj.seleccionarCancion(rutas[opcion_usuario_2]);
                    obj.reproducir();
                    Scanner scanner_7 = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Ingrese 1 para detener la canción");
                    String usuario_7 = scanner_7.nextLine();
                    int opcion_usuario_7=Integer.parseInt(usuario_7);
                    if(opcion_usuario_7==1){
                        obj.detener();
                    }
                }
                interfaz_4();
                Scanner scanner_5 = new Scanner(System.in);
                String usuario_5 = scanner_5.nextLine();
                int opcion_usuario_5=Integer.parseInt(usuario_5);
                
                opcion_usuario_4=opcion_usuario_5;
            }else if(opcion_usuario==2){
                break;
            }
        }while(opcion_usuario_4==1);

    }
}