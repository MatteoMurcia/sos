package sos.model.manager;

import sos.model.persistence.ClienteDAO;
import sos.model.vo.Cliente;

public class ClienteManager {

	public static String insertCliente(Cliente cli){
        ClienteDAO cd =new ClienteDAO ();
        cd.insertObject(cli);
        return "insert success";
    }
    
    public static Cliente pedirCliente(String cedula){
        ClienteDAO pd = new ClienteDAO();
        Cliente p=pd.getCliente(cedula);
        return p;
    }
}
