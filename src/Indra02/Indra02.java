/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Indra02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.print.attribute.HashAttributeSet;

/**
 *
 * @author Carlos A Dominguez D
 */
public class Indra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int TamanioCamion = 90;
        int reservar = 30;

        List<Integer> paquetes = new ArrayList<>();
        paquetes.add(10);
        paquetes.add(60);
        paquetes.add(40);
        paquetes.add(35);
        paquetes.add(20);

        HashMap<String, List<Integer>> hashMap = new HashMap<>();

        int TamanioCamionSeguro = TamanioCamion - reservar;

        for (Integer paquete : paquetes) {
            for (int i = 0; i < paquetes.size(); i++) {
                if (!paquete.equals(paquetes.get(i))) {

                    int tmp = paquete + paquetes.get(i);
                    if (tmp == TamanioCamionSeguro) {
                        List<Integer> valores = new ArrayList<>();
                        valores.add(paquetes.get(i));
                        valores.add(paquete);
                        hashMap.put("ValoresIguales", valores);
                        System.out.println("indra01.Indra02.main()");
                    }
                }
            }
        }

        if (hashMap.containsKey("ValoresIguales")) {
            System.out.println("indra01.Indra02.main()" + hashMap.get("ValoresIguales"));
        } else {
            System.out.println("El sistema no cumple con la carga maxima para el camion");

        }
    }

}
