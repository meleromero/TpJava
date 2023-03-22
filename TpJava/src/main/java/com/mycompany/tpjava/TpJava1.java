

package com.mycompany.tpjava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 *
 * @author miluu
 */
public class TpJava {

        
    public static void main(String[] args) throws IOException {
        String resultados = "C:\\Users\\miluu\\OneDrive\\Escritorio\\java\\TpJava\\resultados.xlsx";
        for (String linea : Files.readAllLines(Paths.get(resultados))){
            System.out.println(linea);
        }
        
    }
}
    
