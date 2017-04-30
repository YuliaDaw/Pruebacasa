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
public class Alero extends Jugador {

    private int puntos;

    public Alero(int puntos, int altura, String nombr, int tipo) {
        super(altura, nombr, tipo);
        this.puntos = puntos;
    }

    public int Damepuntos() {
        return this.puntos;
    }
}
