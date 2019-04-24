package sos.model.persistence;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import sos.model.vo.Listaenviados;
import sos.model.vo.Servicio;

public class ServicioDAO {

	
	 public EntityManager em=null;
	    
	    public boolean insertObject(Servicio s){
	        try{
	            em = EMF.get().createEntityManager();
	            em.getTransaction().begin();
	            em.persist(s);
	            em.getTransaction().commit();
	            em.refresh(s);
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
	    
	    public int idServicio (){
	        try{
	            em =EMF.get().createEntityManager();
	            em.getTransaction().begin();
	            TypedQuery<Servicio> query = (TypedQuery<Servicio>) em.createQuery("SELECT e FROM Servicio e",Servicio.class);
	            em.getTransaction().commit();
	            return query.getResultList().size();
	        }catch(Exception e){
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	            return 0;
	        }finally{
	            if(em!=null && em.isOpen()){
	                em.close();
	            }
	        }
	    }
	    
	    public boolean insertListaEnviados(Listaenviados s){
	        try{
	            em = EMF.get().createEntityManager();
	            em.getTransaction().begin();
	            em.persist(s);
	            em.getTransaction().commit();
	            em.refresh(s);
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
	    
	    public int idListaE(){
	        try{
	            em =EMF.get().createEntityManager();
	            em.getTransaction().begin();
	            TypedQuery<Listaenviados> query = (TypedQuery<Listaenviados>) em.createQuery("SELECT e FROM Listaenviados e",Listaenviados.class);
	            em.getTransaction().commit();
	            return query.getResultList().size();
	        }catch(Exception e){
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	            return 0;
	        }finally{
	            if(em!=null && em.isOpen()){
	                em.close();
	            }
	        }
	    }
}
