/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.farmacia.repository.util;

/**
 *
 * @author bruno
 */

import com.db4o.*;
import com.db4o.Db4o;

public class Conexion {
    private ObjectContainer db;

    public Conexion() {
        this.connectionDB();
    }
    
    
    public ObjectContainer connectionDB(){
        db = Db4oEmbedded.openFile(Db4oEmbedded
                .newConfiguration(), "D:\\upao\\documents\\poo\\farmacia.db");
        
        return db;
    }
    
    public void close(){
        
    }

    public ObjectContainer getDb() {
        return db;
    }

    public void setDb(ObjectContainer db) {
        this.db = db;
    }
    
    
}
