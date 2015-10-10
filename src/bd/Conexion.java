/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bd;

/**
 *
 * @author bruno
 */

import com.db4o.*;
import com.db4o.Db4o;

public class Conexion {
    public ObjectContainer connectionDB(){
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded
                .newConfiguration(), "C:\\bd\\plazapoints.db");
        
        return db;
    }
}
