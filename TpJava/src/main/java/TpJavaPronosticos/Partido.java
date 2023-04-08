/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpJavaPronosticos;

/**
 *
 * @author miluu
 */
public class Partido {
    
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEq1;
    private int golesEq2;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }
    
    

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEq1() {
        return golesEq1;
    }

    public void setGolesEq1(int golesEq1) {
        this.golesEq1 = golesEq1;
    }

    public int getGolesEq2() {
        return golesEq2;
    }

    public void setGolesEq2(int golesEq2) {
        this.golesEq2 = golesEq2;
    }

    String resultado(Equipo equipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
