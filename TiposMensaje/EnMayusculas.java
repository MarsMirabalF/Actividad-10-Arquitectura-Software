package TiposMensaje ;

public class EnMayusculas implements Mensaje{

  private Mensaje mensaje ;

  public EnMayusculas( Mensaje mensaje ){

    this.mensaje = mensaje ;

  }

  public String mostrarFacturita(){

    return mensaje.mostrarFacturita().toUpperCase() ;

  }

}