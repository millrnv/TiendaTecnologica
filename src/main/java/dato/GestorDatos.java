package dato;

import modelo.*;

import java.io.*;
import java.util.List;

public class GestorDatos {

    public static TiendaTecnologica leerArchivoVehiculos(TiendaTecnologica tiendaTecnologica, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            // Lee cada línea del archivo hasta que la línea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                if (data[0].equals("PC")) {
                    tiendaTecnologica.getDispositivos().add(new PC(data[1], data[2], data[3], data[4], data[5], data[6], Integer.parseInt(data[7]), Double.parseDouble(data[8]), Integer.parseInt(data[9]), data[10], data[11],data[12],new Pantalla(data[13],data[14], Integer.parseInt(data[15]))));

                if(data[0].equals("Notebook")){
                    tiendaTecnologica.getDispositivos().add(new Notebooks(data[1],data[2],data[3],data[4],data[5],data[6],Integer.parseInt(data[7]),Double.parseDouble(data[8]),Integer.parseInt(data[9]),data[10],data[11],data[12]));

                }
                } else {
                    tiendaTecnologica.getDispositivos().add(new Tablets(data[1],data[2],data[3],data[4],data[5],data[6],Integer.parseInt(data[7]),Double.parseDouble(data[8]),Integer.parseInt(data[9]),data[10]));
                }
            }

            // Cerrar recursos
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
        return tiendaTecnologica;
    }


    public static boolean registrarDatos(List objeto, String direccionArchivo) {
        boolean lineaVacia=false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia=true;
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
//Si el documento no es nuevo y tiene registrado datos, se debe
            if(!lineaVacia){
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar dato, favor contactar con administrador");
            return false;
        }
    }



}
