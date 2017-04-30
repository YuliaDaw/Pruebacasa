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
public class Equipo {

    private Jugador[] equipo = new Jugador[5];
    private String Nombreequipo;

    Equipo(String nomequipo, Jugador A, Jugador B, Jugador C, Jugador D, Jugador E) {
        equipo[0] = A;
        equipo[1] = B;
        equipo[2] = C;
        equipo[3] = D;
        equipo[4] = E;
        Nombreequipo = nomequipo;
        System.out.println("Nombre de equipo " + Nombreequipo);
        for (int i = 0; i < 5; i++) {
            if (equipo[i].tipo == 0) {
                System.out.println("jugador numero " + i + " es base");
            }
            if (equipo[i].tipo == 1) {
                System.out.println("jugador numero " + i + " es alero");
            }
            if (equipo[i].tipo == 2) {
                System.out.println("jugador numero " + i + " es pivot");
            }
        }
    }

    public String Damenombre() {
        return Nombreequipo;
    }

    public double Estaturamedia() {
        double estat = 0;
        double estatcalc = 0;
        for (int i = 0; i < 5; i++) {

            estat = estat + equipo[i].Dameestatura();
        }
        estatcalc = estat / 5;
        return estatcalc;
    }

    public int Estaturamax() {
        int aux = 0;
        int estatmax;
        for (int i = 0; i < 5; i++) {
            if (equipo[i].Dameestatura() > aux) {
                aux = equipo[i].Dameestatura();
            }
        }
        estatmax = aux;
        return estatmax;
    }

    public int PuntMedAleros() {
        int puntmed = 0;
        int med = 0;
        int n = 0;

        for (int i = 0; i < 5; i++) {
            if (equipo[i].tipo == 1) {
                n++;
                puntmed = puntmed + ((Alero) equipo[i]).Damepuntos();
            }
        }
        if (n > 0) {
            med = puntmed / n;
        }
        return med;
    }
}
