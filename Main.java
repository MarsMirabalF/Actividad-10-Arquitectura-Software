import java.util.Scanner ;
import LogicaNegocio.Tiendita ;
import LogicaNegocio.BibliJuegosEpic ; 
import Observadores.ObsGracias ;
import Observadores.ObsHistorial ;
import TiposMensaje.Mensaje ;
import TiposMensaje.MensajeSimple ;
import TiposMensaje.ConHorita ;
import TiposMensaje.ConMarquito ;

public class Main{

  public static void main( String [ ] args ){

    Scanner leer = new Scanner( System.in ) ;

    String [ ] nombres = { "Hollow Knight " , "Resident Evil 4 Remake " , "Dragon Ball Xenoverse " , "Hotline Miami 2 " , "The evil Within 2 " } ;

    double precios [ ] = { 80.0 , 250.0 , 60.0 , 150.0 , 100.0 } ;

    Tiendita tienda = new Tiendita( ) ;

    tienda.agregarObs ( new ObsGracias( ) ) ;

    tienda.agregarObs ( new ObsHistorial( ) ) ;

    int opcion=0 ;

    while( opcion !=2 ){

      System.out.println( "EPIC GAMES " ) ;

      System.out.println( "1   Tienda de Epic Games " ) ;

      System.out.println( "2   Salir " ) ;

      opcion= leer.nextInt( ) ;

        if( opcion==1 ){

        System.out.println( "Tienda de EPIC GAMES" ) ;

        for( int i=0 ; i<nombres.length ; i++ ){

          System.out.println( (i + 1) + "   Juego  :  " + nombres[i] + "   tiene Precio  :  " + precios[i] + " bolivianos"  ) ;

        }

        System.out.print( "Que juego quieres comprar? :) " ) ;

        int num=leer.nextInt( ) ;

        if( num>=1 && num<=nombres.length ){

          String juego= nombres [num-1] ;

          double precio= precios [num-1] ;

          tienda.comprarJuego( juego , precio ) ;

          Mensaje factura = new ConMarquito( new ConHorita( new MensajeSimple( "Compra realizada: " + juego ) ) ) ;

          System.out.println( factura.mostrarFacturita( ) ) ;

        }else{

          System.out.println( "Ese juego no hay no existe" ) ;

        }

      }else if( opcion==2 ){

        System.out.println( "Gracias por visitar Epic Games vuelva prontos" ) ;

        BibliJuegosEpic.obtInstancia( ).mostrarBibliotequita( ) ;

      }else{

        System.out.println( "Opcion no valida intenta de nuevo..." ) ;

      }

    }

  }

}