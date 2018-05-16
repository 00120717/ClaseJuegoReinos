/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoreino;

import Elfos.Elfo;
import Orcos.Orco;

/**
 *
 * @author Marvin Ramirez
 */
public interface AbstractFactoryReino {
    public Elfo getElfo(String elfo);
    public Orco getOrco(String orco);
}
