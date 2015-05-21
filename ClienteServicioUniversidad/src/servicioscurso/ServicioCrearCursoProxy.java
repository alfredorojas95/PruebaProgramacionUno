package servicioscurso;
/**
 * 
 * @author Alfredo
 *
 */
public class ServicioCrearCursoProxy implements servicioscurso.ServicioCrearCurso {
  private String _endpoint = null;
  private servicioscurso.ServicioCrearCurso servicioCrearCurso = null;
  
  public ServicioCrearCursoProxy() {
    _initServicioCrearCursoProxy();
  }
  
  public ServicioCrearCursoProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicioCrearCursoProxy();
  }
  
  private void _initServicioCrearCursoProxy() {
    try {
      servicioCrearCurso = (new servicioscurso.ServicioCrearCursoServiceLocator()).getServicioCrearCurso();
      if (servicioCrearCurso != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicioCrearCurso)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicioCrearCurso)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicioCrearCurso != null)
      ((javax.xml.rpc.Stub)servicioCrearCurso)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicioscurso.ServicioCrearCurso getServicioCrearCurso() {
    if (servicioCrearCurso == null)
      _initServicioCrearCursoProxy();
    return servicioCrearCurso;
  }
  
  public java.lang.String asignarProfesor(int id, java.lang.String nombreCurso, java.lang.String rutProfe) throws java.rmi.RemoteException{
    if (servicioCrearCurso == null)
      _initServicioCrearCursoProxy();
    return servicioCrearCurso.asignarProfesor(id, nombreCurso, rutProfe);
  }
  
  public java.lang.String crearCurso(java.lang.String nombre) throws java.rmi.RemoteException{
    if (servicioCrearCurso == null)
      _initServicioCrearCursoProxy();
    return servicioCrearCurso.crearCurso(nombre);
  }
  
  
}