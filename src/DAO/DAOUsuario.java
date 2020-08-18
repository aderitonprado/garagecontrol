package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.ModelUsuario;
import util.conn.ConexaoMySql;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adériton Prado
 */
public class DAOUsuario extends ConexaoMySql {

    /**
     * grava Usuario
     *
     * @param pModelUsuario
     * @return int
     */
    public boolean salvarUsuarioDAO(ModelUsuario pModelUsuario) {
        conectar();
        String sql = "INSERT INTO tbl_usuarios ("
                + "usu_nome, "
                + "usu_login, "
                + "usu_senha, "
                + "usu_status, "
                + "usu_nivel) "
                + "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pModelUsuario.getUsu_nome());
            preparedStatement.setString(2, pModelUsuario.getUsu_login());
            preparedStatement.setString(3, pModelUsuario.getUsu_senha());
            preparedStatement.setInt(4, pModelUsuario.getUsu_status());
            preparedStatement.setInt(5, pModelUsuario.getUsu_nivel());
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        desconectar();
        return true;
    }

    /**
     * recupera Usuario
     *
     * @param pUsu_id
     * @return ModelUsuario
     */
    public ModelUsuario getUsuarioDAO(int pUsu_id) {
        conectar();
        ModelUsuario modelUsuario = new ModelUsuario();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT usu_id, "
                + "usu_nome, "
                + "usu_login, "
                + "usu_senha, "
                + "usu_nivel"
                + " FROM tbl_usuarios";

        preparedStatement = criarPreparedStatement(sql);
        try {
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                modelUsuario = new ModelUsuario();
                modelUsuario.setUsu_id(resultSet.getInt("usu_id"));
                modelUsuario.setUsu_nome(resultSet.getString("usu_nome"));
                modelUsuario.setUsu_login(resultSet.getString("usu_login"));
                modelUsuario.setUsu_senha(resultSet.getString("usu_senha"));
                modelUsuario.setUsu_nivel(resultSet.getInt("usu_nivel"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        this.desconectar();
        return modelUsuario;
    }

    /**
     * recupera uma lista de Usuario
     *
     * @return ArrayList
     */
    public List<ModelUsuario> getListaUsuarioDAO() {
        List<ModelUsuario> listaUsuario = new ArrayList<>();
        ModelUsuario modelUsuario = new ModelUsuario();

        conectar();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT usu_id, "
                + "usu_nome, "
                + "usu_login,"
                + "usu_nivel, "
                + "usu_status"
                + " FROM tbl_usuarios";

        try {
            preparedStatement = criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();

            //System.out.println(resultSet);
            while (resultSet.next()) {
                modelUsuario = new ModelUsuario();
                modelUsuario.setUsu_id(resultSet.getInt(1));
                modelUsuario.setUsu_nome(resultSet.getString(2));
                modelUsuario.setUsu_login(resultSet.getString(3));
                modelUsuario.setUsu_nivel(resultSet.getInt(4));
                modelUsuario.setUsu_status(resultSet.getInt(5));
                listaUsuario.add(modelUsuario);
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        desconectar();
        return listaUsuario;
    }

    /**
     * atualiza Usuario
     *
     * @param pModelUsuario
     * @return boolean
     */
    public boolean atualizarUsuarioDAO(ModelUsuario modelUsuario) {
        this.conectar();

        String sql = "UPDATE tbl_usuarios SET usu_nome =?, usu_login=?, usu_senha=? WHERE usu_id='" + modelUsuario.getUsu_id() + "'";
        PreparedStatement preparedStatement = this.criarPreparedStatement(sql);

        try {
            preparedStatement.setString(1, modelUsuario.getUsu_nome());
            preparedStatement.setString(2, modelUsuario.getUsu_login());
            preparedStatement.setString(3, modelUsuario.getUsu_senha());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, e);
            return false;
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.desconectar();
        return true;
    }

    /**
     * exclui Usuario
     *
     * @param pUsu_id
     * @return boolean
     */
    public boolean excluirUsuarioDAO(int pUsu_id) {
        this.conectar();
        PreparedStatement preparedStatement;
        String sql = "DELETE FROM tbl_usuarios WHERE usu_id = '" + pUsu_id + "'";
        preparedStatement = this.criarPreparedStatement(sql);
        try {
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.desconectar();
        }
        return true;
    }

    public boolean validarUsuario(ModelUsuario modelUsuario) {
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT usu_id, "
                + "usu_nome, "
                + "usu_login, "
                + "usu_senha"
                + " FROM tbl_usuarios WHERE usu_login = '" + modelUsuario.getUsu_login() + "' AND "
                + "usu_senha = '" + modelUsuario.getUsu_senha() + "'";

        preparedStatement = criarPreparedStatement(sql);
        try {
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
