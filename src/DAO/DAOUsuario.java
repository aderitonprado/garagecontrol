package DAO;

import model.ModelUsuario;
import util.conn.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Adériton Prado
*/
public class DAOUsuario extends ConexaoMySql {

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_usuarios ("
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "usu_nivel"
                + ") VALUES ("
                    + "'" + pModelUsuario.getUsu_nome() + "',"
                    + "'" + pModelUsuario.getUsu_login() + "',"
                    + "'" + pModelUsuario.getUsu_senha() + "',"
                    + "'" + pModelUsuario.getUsu_nivel() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Usuario
    * @param pUsu_id
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(int pUsu_id){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_usu_id,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "usu_nivel"
                 + " FROM"
                     + " tbl_usuarios"
                 + " WHERE"
                     + " pk_usu_id = '" + pUsu_id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setUsu_id(this.getResultSet().getInt(1));
                modelUsuario.setUsu_nome(this.getResultSet().getString(2));
                modelUsuario.setUsu_login(this.getResultSet().getString(3));
                modelUsuario.setUsu_senha(this.getResultSet().getString(4));
                modelUsuario.setUsu_nivel(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioDAO(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_usu_id,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "usu_nivel"
                 + " FROM"
                     + " tbl_usuarios"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setUsu_id(this.getResultSet().getInt(1));
                modelUsuario.setUsu_nome(this.getResultSet().getString(2));
                modelUsuario.setUsu_login(this.getResultSet().getString(3));
                modelUsuario.setUsu_senha(this.getResultSet().getString(4));
                modelUsuario.setUsu_nivel(this.getResultSet().getInt(5));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_usuarios SET "
                    + "pk_usu_id = '" + pModelUsuario.getUsu_id() + "',"
                    + "usu_nome = '" + pModelUsuario.getUsu_nome() + "',"
                    + "usu_login = '" + pModelUsuario.getUsu_login() + "',"
                    + "usu_senha = '" + pModelUsuario.getUsu_senha() + "',"
                    + "usu_nivel = '" + pModelUsuario.getUsu_nivel() + "'"
                + " WHERE "
                    + "pk_usu_id = '" + pModelUsuario.getUsu_id() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Usuario
    * @param pUsu_id
    * @return boolean
    */
    public boolean excluirUsuarioDAO(int pUsu_id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_usuarios "
                + " WHERE "
                    + "pk_usu_id = '" + pUsu_id + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}