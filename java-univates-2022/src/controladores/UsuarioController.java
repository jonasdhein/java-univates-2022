package controladores;

import ferramentas.Conexao;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
//import model.Usuario;

/**
 *
 * @author jonas
 */
public class UsuarioController {
    
    //Usuario objUsuario;
    //JTable jtbUsuarios = null;
    
    //public UsuarioDAO(Usuario objUsuario, JTable jtbUsuarios) {
    //    this.objUsuario = objUsuario;
    //    this.jtbUsuarios = jtbUsuarios;
    //}
    
    public boolean login(String user, String pass)
    {
        try {
            Conexao.abreConexao();
            ResultSet rs = null;

            String wSql = "";
            wSql = " SELECT nome ";
            wSql += " FROM usuarios ";
            wSql += " WHERE login = '" + user + "'";
            wSql += " AND senha = md5('" + pass + "') ";
            //stm.executeQuery(wSql);

            try{
                System.out.println("Vai Executar Conexão em buscar Usuario");
                rs = Conexao.stmt.executeQuery(wSql);
                System.out.println("Executou Conexão em buscar Usuario");

                //objUsuario = new Usuario();
                
                if(rs.next() == true) //caso exista pelo menos um registro
                {
                    return true;
                }else{
                    return false;
                }
            }

            catch (SQLException ex )
            {
                System.out.println("ERRO de SQL: " + ex.getMessage().toString());
                return false;
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage().toString());
            return false;
        }
		
    }
}
