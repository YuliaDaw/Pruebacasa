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
public abstract class Jugador {

    protected int estatura;
    protected String nombre;
    protected int tipo; //tipo0 base, tipo2 alero, tipo3 pivot

    Jugador(int altura, String nombr, int tipo) {
        estatura = altura;
        nombre = nombr;
        this.tipo = tipo;
    }

    public String Damenombre() {
        return nombre;
    }

    public int Dameestatura() {
        return estatura;
    }

    public int getTipo() {
        return tipo;
    }

}
