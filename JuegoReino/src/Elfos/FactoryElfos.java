/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elfos;

import Orcos.Orco;
import juegoreino.AbstractFactoryReino;

/**
 *
 * @author Marvin Ramirez
 */
public class FactoryElfos implements AbstractFactoryReino{
        @Override
    public Elfo getElfo(String elfo) {
        switch (elfo){
            case ("Arquero"):
                return new Arquero();
            case ("Mago"):
                return new Mago();
            case ("ReyElfo"):
                return new ReyElfo();
        }
        return null;
                
    }
    @Override
    public Orco getOrco(String orco){
        return null;
    }
}
