/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orcos;

import Elfos.Elfo;
import juegoreino.AbstractFactoryReino;

/**
 *
 * @author Marvin Ramirez
 */
public class FactoryOrcos implements AbstractFactoryReino{
    @Override 
    public Elfo getElfo(String elfo){
        return null;
    }
     public Orco getOrco(String orco) {
        switch (orco){
            case ("Hechicero"):
                return new Hechicero();
            case ("Lanzador"):
                return new Lanzador();
            case ("BestiaMayor"):
                return new BestiaMayor();
        }
        return null;
                
    }
}
