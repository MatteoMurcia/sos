package sos.model.manager;

import java.util.List;

import sos.model.persistence.ProveedorDAO;
import sos.model.vo.Proveedor;

public class ProveedorManager {
	public static String insertProveedor(Proveedor p){
        ProveedorDAO pd = new ProveedorDAO();
        pd.insertObject(p);
        return "insert success";
    }
    
    public static Proveedor pedirProveedor(String cedulap){
        ProveedorDAO pd = new ProveedorDAO();
        Proveedor p=pd.getProveedor(cedulap);
        return p;
    }
    public static List<Proveedor> pedirListaProveedor(String profesion){
        ProveedorDAO pd = new ProveedorDAO();
        List<Proveedor> p = pd.getListaProveedor(profesion);
        return p;
    }
}
