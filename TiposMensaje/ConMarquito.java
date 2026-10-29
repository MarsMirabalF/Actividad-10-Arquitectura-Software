package TiposMensaje ;

public class ConMarquito implements Mensaje{

  private Mensaje mensaje ;

  public ConMarquito( Mensaje mensaje ){

    this.mensaje= mensaje ;

  }

  public String mostrarFacturita(){

    return   "[----------------------------------]\n" 
                +mensaje.mostrarFacturita()+ 
           "\n[----------------------------------]" ;

  }

}