package sos.model.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import sos.model.vo.Proveedor;

public class ProveedorDAO {

	
public EntityManager em=null;
    
    public boolean insertObject(Proveedor p){
        try{
            em = EMF.get().createEntityManager();
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            em.refresh(p);
            em.close();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }
   
    public Proveedor getProveedor(String cedulap){
        try{
            em =EMF.get().createEntityManager();
            em.getTransaction().begin();
            TypedQuery<Proveedor> query = (TypedQuery<Proveedor>) em.createQuery("SELECT p FROM Proveedor p WHERE p.cedulap = :cedula",Proveedor.class);
            query.setParameter("cedula", cedulap);
            em.getTransaction().commit();
           
            return (Proveedor) query.getResultList().get(0);
           
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            
            return new Proveedor();
        }finally{
            if(em!=null && em.isOpen()){
                em.close();
            }
        }
    }
     public List<Proveedor> getListaProveedor(String profesion){
        try{
            em =EMF.get().createEntityManager();
            em.getTransaction().begin();
            TypedQuery<Proveedor> query = (TypedQuery<Proveedor>) em.createQuery("SELECT p FROM Proveedor p WHERE p.profesion = :profesion",Proveedor.class);
            query.setParameter("profesion", profesion);
            em.getTransaction().commit();
            
            return (List<Proveedor>) query.getResultList();
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return new ArrayList<Proveedor>();
        }finally{
            if(em!=null && em.isOpen()){
                em.close();
            }
        }
    }
    
    
}
