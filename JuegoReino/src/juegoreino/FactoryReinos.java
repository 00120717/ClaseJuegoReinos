/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoreino;

import Elfos.FactoryElfos;
import Orcos.FactoryOrcos;

/**
 *
 * @author Marvin Ramirez
 */
public class FactoryReinos {
    public static AbstractFactoryReino getReino(String reino){
        switch (reino){
            case("Elfo"):
                return new FactoryElfos();
            case("Orco"):
                    return new FactoryOrcos();
        }
        return null;
    }
}
