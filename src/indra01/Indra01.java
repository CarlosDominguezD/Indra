/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indra01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos A Dominguez D
 */
public class Indra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> celdas = new ArrayList<>();
        int CeldaFinal = 0;
        int NumeroDias = 1;
        int[] celdaEntrada = new int[9];
        celdaEntrada[0] = 1;
        celdaEntrada[1] = 0;
        celdaEntrada[2] = 0;
        celdaEntrada[3] = 0;
        celdaEntrada[4] = 0;
        celdaEntrada[5] = 1;
        celdaEntrada[6] = 0;
        celdaEntrada[7] = 0;
        celdaEntrada[8] = CeldaFinal;
        for (int i = 0; i < celdaEntrada.length; i++) {
            if (i == 0) {
                if (celdaEntrada[i] == celdaEntrada[i + 1]) {
                    celdas.add(0);
                } else {
                    celdas.add(1);
                }
            } else {
                if (i == celdaEntrada.length - 1) {
                    celdas.add(0);
                } else {
                    if (celdaEntrada.length - 1 == i) {
                        celdas.add(0);
                    } else if (celdaEntrada[i] == celdaEntrada[i + 1]) {
                        celdas.add(0);
                    } else {
                        celdas.add(1);
                    }
                }
            }
        }
        System.out.println("indra01.Indra01.main()" + celdas);
    }

}
