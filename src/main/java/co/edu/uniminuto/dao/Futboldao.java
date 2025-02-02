package co.edu.uniminuto.dao;
import co.edu.uniminuto.etidades.Futbol_;
import com.sun.jdi.connect.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Futboldao {

    Conexion conexion;

    PreparedStatement statement;

    public Futboldao() {
        conexion = new Conexion();
        this.statement = null;

    }

    public Futbol_ registrarfutbol(Futbol_ futbol){
        Connection con = conexion.getconectar();
        String query = "INSERT INTO futbols VALUES(null,?,?,?,?)";
        try {
            if (this.statement == null) {
                this.statement = con.prepareStatement(query);
                this.statement.setString(1, futbol.getNombre());
                this.statement.setShort(2, futbol.getEdad());
                this.statement.setShort(3, futbol.getEstatus());
                int respuesta = this.statement.executeUpdate();
                if (respuesta > 0) {
                    JOptionPane.showMessageDialog(null, "registrado:" + respuesta);
                }
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        } finally {
            if (con != null) {
            }
        }
        return futbol;
    }

}
