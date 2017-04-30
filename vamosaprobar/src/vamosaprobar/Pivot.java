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
public class Pivot extends Jugador {

    private int rebotes;

    public Pivot(int rebotes, int altura, String nombr, int tipo) {
        super(altura, nombr, tipo);
        this.rebotes = rebotes;
    }

    public int Damerebotes() {
        return rebotes;
    }
}
