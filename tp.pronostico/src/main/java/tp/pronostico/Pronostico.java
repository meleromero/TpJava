package tp.pronostico;

public class Pronostico {
    private final Partido partido;
    private final Equipo equipo;
    private final String resultado;

    public Pronostico(Partido partido, Equipo equipo, String resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    
    
    public Partido getPartido() {
        return partido;
    }

    

    public Equipo getEquipo() {
        return equipo;
    }

    

    public String getResultado() {
        return resultado;
    }

    public int puntos(){
        String resultadoReal = partido.resultado(equipo);
        if(resultado.equals(resultadoReal)){
            return 1;
        } else {
            return 0;
        }
    
    }
}
