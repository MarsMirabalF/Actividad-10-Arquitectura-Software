package TiposMensaje ;

public class MensajeSimple implements Mensaje{

  private String texto ;

  public MensajeSimple( String texto ){

    this.texto = texto ;

  }

  public String mostrarFacturita(){

    return texto ;

  }

}