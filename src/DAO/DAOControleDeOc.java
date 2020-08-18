package DAO;

import com.mysql.jdbc.ResultSetImpl;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import model.ModelControleDeOc;
import util.conn.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Adériton Prado
 */
public class DAOControleDeOc extends ConexaoMySql {

    /**
     * grava ControleDeOc
     *
     * @param pModelControleDeOc
     * @return int
     */
    public int salvarControleDeOcDAO(ModelControleDeOc pModelControleDeOc) {
        this.conectar();
        String sql = "INSERT INTO tbl_controle_oc ("
                + "pk_oc_id,"
                + "oc_numero,"
                + "oc_descricao,"
                + "oc_usu_id,"
                + "oc_aplicacao,"
                + "oc_frota,"
                + "oc_fornecedor,"
                + "oc_valor,"
                + "oc_prioridade,"
                + "oc_situacao"
                + ") VALUES ("
                + "'" + pModelControleDeOc.getOc_id() + "',"
                + "'" + pModelControleDeOc.getOc_numero() + "',"
                + "'" + pModelControleDeOc.getOc_descricao() + "',"
                + "'" + pModelControleDeOc.getOc_usu_id() + "',"
                + "'" + pModelControleDeOc.getOc_aplicacao() + "',"
                + "'" + pModelControleDeOc.getOc_frota() + "',"
                + "'" + pModelControleDeOc.getOc_fornecedor() + "',"
                + "'" + pModelControleDeOc.getOc_valor() + "',"
                + "'" + pModelControleDeOc.getOc_prioridade() + "',"
                + "'" + pModelControleDeOc.getOc_situacao() + "'"
                + ")";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return this.salvarControleDeOcDAO(pModelControleDeOc);
    }

    /**
     * recupera ControleDeOc
     *
     * @param pOc_id
     * @return ModelControleDeOc
     */
    public ModelControleDeOc getControleDeOcDAO(int pOc_id) {
        this.conectar();
        ModelControleDeOc modelControleDeOc = new ModelControleDeOc();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT pk_oc_id, oc_numero, oc_descricao, oc_usu_id, oc_aplicacao, oc_frota, oc_fornecedor,"
                + "oc_valor, oc_prioridade, oc_situacao FROM tbl_controle_oc WHERE pk_oc_id = '" + pOc_id + "';";
        preparedStatement = criarPreparedStatement(sql);
        try {
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                modelControleDeOc.setOc_id(resultSet.getInt(1));
                modelControleDeOc.setOc_numero(resultSet.getInt(2));
                modelControleDeOc.setOc_descricao(resultSet.getString(3));
                modelControleDeOc.setOc_usu_id(resultSet.getInt(4));
                modelControleDeOc.setOc_aplicacao(resultSet.getString(5));
                modelControleDeOc.setOc_frota(resultSet.getString(6));
                modelControleDeOc.setOc_fornecedor(resultSet.getString(7));
                modelControleDeOc.setOc_valor(resultSet.getDouble(8));
                modelControleDeOc.setOc_prioridade(resultSet.getString(9));
                modelControleDeOc.setOc_situacao(resultSet.getString(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
        return modelControleDeOc;
    }

    /**
     * recupera uma lista de ControleDeOc
     *
     * @return ArrayList
     */
    public ArrayList<ModelControleDeOc> getListaControleDeOcDAO() {
        this.conectar();
        ArrayList<ModelControleDeOc> listamodelControleDeOc = new ArrayList();
        ModelControleDeOc modelControleDeOc = new ModelControleDeOc();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        String sql = "SELECT pk_oc_id, oc_numero, oc_descricao, oc_usu_id, oc_aplicacao, oc_frota, oc_fornecedor, oc_valor,"
                + "oc_prioridade, oc_situacao FROM tbl_controle_oc;";
        preparedStatement = criarPreparedStatement(sql);

        try {
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                modelControleDeOc = new ModelControleDeOc();

                modelControleDeOc.setOc_id(resultSet.getInt(1));
                modelControleDeOc.setOc_numero(resultSet.getInt(2));
                modelControleDeOc.setOc_descricao(resultSet.getString(3));
                modelControleDeOc.setOc_usu_id(resultSet.getInt(4));
                modelControleDeOc.setOc_aplicacao(resultSet.getString(5));
                modelControleDeOc.setOc_frota(resultSet.getString(6));
                modelControleDeOc.setOc_fornecedor(resultSet.getString(7));
                modelControleDeOc.setOc_valor(resultSet.getDouble(8));
                modelControleDeOc.setOc_prioridade(resultSet.getString(9));
                modelControleDeOc.setOc_situacao(resultSet.getString(10));

                listamodelControleDeOc.add(modelControleDeOc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
        return listamodelControleDeOc;
    }

    /**
     * atualiza ControleDeOc
     *
     * @param pModelControleDeOc
     * @return boolean
     */
    public boolean atualizarControleDeOcDAO(ModelControleDeOc pModelControleDeOc) {
        this.conectar();
        PreparedStatement preparedStatement;
        String sql = "UPDATE tbl_controle_oc SET "
                    + "pk_oc_id = '" + pModelControleDeOc.getOc_id() + "',"
                    + "oc_numero = '" + pModelControleDeOc.getOc_numero() + "',"
                    + "oc_descricao = '" + pModelControleDeOc.getOc_descricao() + "',"
                    + "oc_usu_id = '" + pModelControleDeOc.getOc_usu_id() + "',"
                    + "oc_aplicacao = '" + pModelControleDeOc.getOc_aplicacao() + "',"
                    + "oc_frota = '" + pModelControleDeOc.getOc_frota() + "',"
                    + "oc_fornecedor = '" + pModelControleDeOc.getOc_fornecedor() + "',"
                    + "oc_valor = '" + pModelControleDeOc.getOc_valor() + "',"
                    + "oc_prioridade = '" + pModelControleDeOc.getOc_prioridade() + "',"
                    + "oc_situacao = '" + pModelControleDeOc.getOc_situacao() + "'"
                    + " WHERE "
                    + "pk_oc_id = '" + pModelControleDeOc.getOc_id() + "'"
                    + ";";
        preparedStatement = this.criarPreparedStatement(sql);
        try {
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconectar();
        }
        return true;
    }

    /**
     * exclui ControleDeOc
     *
     * @param pOc_id
     * @return boolean
     */
    public boolean excluirControleDeOcDAO(int pOc_id) {
        this.conectar();
        PreparedStatement preparedStatement;
        String sql = "DELETE FROM tbl_controle_oc WHERE pk_oc_id = '" + pOc_id + "';";
        preparedStatement = this.criarPreparedStatement(sql);
        try {
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconectar();
        }
        return true;
    }
}
