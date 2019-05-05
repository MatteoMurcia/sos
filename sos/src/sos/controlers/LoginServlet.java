package sos.controlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URLDecoder;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import sos.model.manager.ClienteManager;
import sos.model.manager.ProveedorManager;
import sos.model.vo.Cliente;
import sos.model.vo.Proveedor;
import sos.utils.Utils;
import sos.utils.login;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("application/json");
		StringBuffer jb = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine())!=null) {
				jb.append(line);
			}
			System.out.println(jb.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//  		login l = (login) Utils.fromJson(Utils.readParams(request), login.class);
//        
//        Proveedor p= ProveedorManager.pedirProveedor(l.getCedula());
//        Cliente cli = ClienteManager.pedirCliente(l.getCedula());
//        
//            
//            
//            if(p.getClave()!=null && p.getClave().equals(l.getClave())){
//                String KEY = "token";
//                long tiempo = System.currentTimeMillis();
//                String jwt =Jwts.builder()
//                        .signWith(SignatureAlgorithm.HS256, KEY)
//                        .setSubject("token")
//                        .setIssuedAt(new Date(tiempo))
//                        .setExpiration(new Date(tiempo+900000001))
//                        .claim("nombre", p.getNombre())
//                        .claim("apellido", p.getApellido())
//                        .claim("cedula", p.getCedulap())
//                        .compact();
//                Cookie token = new Cookie("token",jwt);
//                response.addCookie(token);
//                response.getWriter().write("proveedor");
//            }
//            else if(cli.getClave()!=null && cli.getClave().equals(l.getClave())){
//                response.getWriter().write("cliente");
//                String KEY = "token";
//                long tiempo = System.currentTimeMillis();
//                String jwt =Jwts.builder()
//                        .signWith(SignatureAlgorithm.HS256, KEY)
//                        .setSubject("token")
//                        .setIssuedAt(new Date(tiempo))
//                        .setExpiration(new Date(tiempo+90000))
//                        .claim("nombre", cli.getNombre())
//                        .claim("apellido", cli.getApellido())
//                        .claim("cedula", cli.getCedulac())
//                        .compact();
//                Cookie token = new Cookie("token",jwt);
//                response.addCookie(token);
//            }
//            else{
//                response.getWriter().write("error");
//            }
	}
	
//	private static Reader traceReader(final Reader reader) {
//		return new Reader() {
//			
//			@Override
//			public int read(char[] buffer, final int offset,final int length ) throws IOException {
//				final int read = reader.read(buffer,offset,length);
//				if(read != -1) {
//					System.out.print(new String(buffer,offset,read));
//					System.out.flush();
//				}
//				return read;
//			}
//
//			@Override
//			public void close() throws IOException {
//				reader.close();
//			}
//		};
//		
//	}

}
