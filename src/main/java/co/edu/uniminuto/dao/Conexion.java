
package co.edu.uniminuto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    private String usuario;
    private String contra;
    private String puerto;
    private String servidor;
    private String nombreDB;
    private String cadena;
    
    Connection conex;

    public Conexion() {
        this.usuario="root";
        this.contra="localhost";
        this.puerto="3306";
        this.servidor="localhost";
        this.nombreDB="futbols";
        this.cadena="jdbc:mysql://"+this.servidor+":"+this.puerto+"/"+this.nombreDB;
        this.conex =null;
        
    }
    
    private Connection conectar (){
        try {
            class.forName("com.mysql.cj.jdbc.Driver");
            this.conex = DriverManager.getConnection(this.cadena,this.usuario,this.cadena);
            JOptionPane.showMessageDialog(null, "Hay conexion");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay conexion"+e.getMessage());
        } finally {
        }
        return this.conex;
    }
    
    public connection getconectar(){
        return this.conectar();
    }
    
}
    
