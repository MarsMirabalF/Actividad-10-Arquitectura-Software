package LogicaNegocio ;

import java.util.ArrayList ; 

public class BibliJuegosEpic{

  private static BibliJuegosEpic miBlioteca ;

  private ArrayList<String> jueguitos ;

  private BibliJuegosEpic(){

    jueguitos = new ArrayList<String>() ;

  }

  public static BibliJuegosEpic obtInstancia(){

    if( miBlioteca == null ){

      miBlioteca = new BibliJuegosEpic() ;

    }

    return miBlioteca;

  }

  public void agregarJueguito( String texto ){

    jueguitos.add(texto) ;

  }

  public void mostrarBibliotequita(){

    System.out.println( "Biblioteca de Epic Games :P " ) ;

    if( jueguitos.size() == 0 ){

      System.out.println( "No compraste ningun juego... que pena :(" ) ;

    }else{

      for( int i = 0 ; i < jueguitos.size() ; i++ ){

        System.out.println(   (i + 1)+"    " +jueguitos.get(i) ) ;

      }

    }

  }

}