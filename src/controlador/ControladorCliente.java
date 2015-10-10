/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;
import com.db4o.*;
import domain.Cliente;
import bd.Conexion;
/**
 *
 * @author bruno
 */
public class ControladorCliente {
    public void nuevoCliente( Cliente cliente){
        Conexion cn = new Conexion();
        ObjectContainer db = cn.connectionDB();
        try{
            db.store(cliente);
            db.commit();
        }catch(Exception e){
            System.out.println("Excepcion0: "+e.getMessage());
        }finally{
            db.close();
        }
        mostrarCliente();
    }
    
    public void mostrarCliente(){
        Conexion cn = new Conexion();
        ObjectContainer db = cn.connectionDB();
        try{
            Cliente cliN = new Cliente();
            ObjectSet os = db.queryByExample(cliN);
            while(os.hasNext()){
                Cliente cliN1 = new Cliente();
                cliN1 = (Cliente)os.next();
                
                System.out.println("Muestra"+ cliN1.getNombre());
            }
            
        }catch(Exception e){
            System.out.println("Excepcion1: "+e.getMessage());
        }finally{
            db.close();
        }
    }
}
