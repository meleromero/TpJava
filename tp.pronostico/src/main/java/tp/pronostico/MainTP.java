package tp.pronostico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class MainTP {
    
    public static void main(String[] args)  {
        //leo resultados
    	
    	Collection<Partido> partidos = new ArrayList<Partido>();
    	
        Path pathResultados = Paths.get("src/test/resources/resultados.csv");
        List<String> lineasResultados = null;
        try {
            lineasResultados = Files.readAllLines(pathResultados);
        } catch (IOException ex) {
          System.out.println("no se pudo leer la linea");
          System.exit(1);
    }
    boolean primera = true;
    for (String lineaResultado : lineasResultados) {
    	if(primera) {
    		primera = false;
    	} else {
    	String[] campos = lineaResultado.split(",");
    	Equipo equipo1 = new Equipo(campos[0]);
    	Equipo equipo2 = new Equipo(campos[3]);
    	Partido partido = new Partido(equipo1, equipo2);
    	partido.setGolesEq1(Integer.parseInt(campos[1]));
    	partido.setGolesEq2(Integer.parseInt(campos[2]));
    	partidos.add(partido);
    	
    	
}
} 
    //leo pronosticos
    
    int puntos = 0;
    
    Path pathPronostico = Paths.get("src/test/resources/pronosticos.csv");
    List<String> lineasPronostico = null;
    try {
        lineasPronostico = Files.readAllLines(pathPronostico);
    } catch (IOException ex) {
      System.out.println("no se pudo leer la linea");
      System.exit(1);
    }
    primera = true;
    for (String lineaPronostico : lineasPronostico) {
    	if(primera) {
    		primera = false;
    	} else {
    		//sumar puntos
    		String[] campos = lineaPronostico.split(",");
    		Equipo equipo1 = new Equipo(campos[0]);
        	Equipo equipo2 = new Equipo(campos[4]);
        	Partido partido = null;
        	
        	for(Partido partidoCol : partidos) {
        		if(partidoCol.getEquipo1().getNombre().equals(equipo1.getNombre()) &&
        		partidoCol.getEquipo2().getNombre().equals(equipo2.getNombre())) {
        			partido = partidoCol;
        		}
        	}
        	Equipo equipo = null;
        	String resultado = null;
        	if("X".equals(campos[1])) {
        		equipo = equipo1;
        		resultado = "ganador";
        	} if("X".equals(campos[2])) {
        		equipo = equipo1;
        		resultado = "empate";
        	} if("X".equals(campos[3])) {
        		equipo = equipo1;
        		resultado = "perdedor";
        	}
        	Pronostico pronostico = new Pronostico(partido, equipo, resultado);
        	puntos += pronostico.puntos();
    	}
}
    //mostrar puntos
    System.out.println("Los puntos obtenidos son:");
    System.out.println(puntos);
}
}
