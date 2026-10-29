package Observadores ;

import LogicaNegocio.BibliJuegosEpic ;

public class ObsHistorial implements Observador{

  public void observador( String juego , double precio ){

    BibliJuegosEpic.obtInstancia( ).agregarJueguito( "Compraste el " + juego ) ;

  }

}