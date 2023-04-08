/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpJavaPronosticos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miluu
 */
public class MainTp {
    
    public static void main(String[] args)  {
        //leo resultados
        Path pathResultados = Paths.get("src/main/java/resultados.csv");
        List<String> lineasResultados = null;
        try {
            lineasResultados = Files.readAllLines(pathResultados);
        } catch (IOException ex) {
            Logger.getLogger(MainTp.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (String lineaResultado : lineasResultados) {
            System.out.println(lineaResultado);
        }
    }
    
}
