/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoreino;

import Elfos.Elfo;
import Elfos.FactoryElfos;
import Orcos.Orco;

/**
 *
 * @author Marvin Ramirez
 */
public class JuegoReino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactoryReino Reino;
        
        // ELfos en accion
        Reino = FactoryReinos.getReino("Elfo");
        Elfo elfo = Reino.getElfo("ReyElfo");
        elfo.Atacar();
                
        Reino = FactoryReinos.getReino("Elfo");
        Elfo elfo1 = Reino.getElfo("Mago");
        elfo1.Atacar();
        
        Reino = FactoryReinos.getReino("Elfo");
        Elfo elfo2 = Reino.getElfo("Arquero");
        elfo2.Atacar();
        
        // Orcos en batalla
        Reino = FactoryReinos.getReino("Orco");
        Orco orco = Reino.getOrco("Hechicero");
        orco.Atacar();
        Reino = FactoryReinos.getReino("Orco");
        Orco orco2 = Reino.getOrco("Lanzador");
        orco2.Atacar();
        Reino = FactoryReinos.getReino("Orco");
        Orco orco3 = Reino.getOrco("BestiaMayor");
        orco3.Atacar();
    }
    
}
