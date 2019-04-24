package sos.model.manager;

import sos.model.persistence.ServicioDAO;
import sos.model.vo.Listaenviados;
import sos.model.vo.Servicio;

public class ServicioManager {
	
	public static String insertServicio(Servicio s){
        ServicioDAO sd =new ServicioDAO ();
        sd.insertObject(s);
        return "insert success";
    }
    
    public static String insertListaEnviados(Listaenviados le){
        ServicioDAO sd =new ServicioDAO ();
        sd.insertListaEnviados(le);
        return "insert success";
    }
     
    public static int idServ (){
        ServicioDAO sd =new ServicioDAO ();
        int i = sd.idServicio();
        return i;
    }
    
    public static int idListaE (){
        ServicioDAO sd =new ServicioDAO ();
        int i = sd.idListaE();
        return i;
    }
}
