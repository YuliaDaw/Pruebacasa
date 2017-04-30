/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vamosaprobar;

/**
 *
 * @author verum_000
 */
public class Base extends Jugador {

    private int asistencias;

    public Base(int asistencias, int altura, String nombr, int tipo) {
        super(altura, nombr, tipo);
        this.asistencias = asistencias;
    }

    public int Dameasistencias() {
        return asistencias;
    }
}
