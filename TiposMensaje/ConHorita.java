package TiposMensaje ;

public class ConHorita implements Mensaje{

  private Mensaje mensaje ;

  public ConHorita( Mensaje mensaje ){

    this.mensaje =mensaje ;

  }

  public String mostrarFacturita(){

    return "[16:00 pm] " + mensaje.mostrarFacturita() ;

  }

}