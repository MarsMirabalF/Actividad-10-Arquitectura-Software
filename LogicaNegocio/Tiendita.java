package LogicaNegocio ;

import java.util.ArrayList ;

import Observadores.Observador;

public class Tiendita{

  private ArrayList < Observador > misObservadores ;

  public Tiendita(){

    misObservadores = new ArrayList < Observador > ( ) ;

  }

  public void agregarObs( Observador obs ){

    misObservadores.add( obs) ;

  }

  public void avisarComp( String juego , double precio ){

    for( int i = 0 ; i < misObservadores.size( ) ; i++ ){

      misObservadores.get(i).observador( juego , precio ) ;

    }

  }

  public void comprarJuego( String juego , double precio ){

    System.out.println( "Tu haz comprando el tremendo juegazo " + juego + " por " + precio + " bolivianos") ;

    avisarComp( juego , precio ) ;

  }

}