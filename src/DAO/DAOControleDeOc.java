package DAO;

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
    * @param pModelControleDeOc
    * @return int
    */
    public int salvarControleDeOcDAO(ModelControleDeOc pModelControleDeOc){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_controle_oc ("
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
    * recupera ControleDeOc
    * @param pOc_id
    * @return ModelControleDeOc
    */
    public ModelControleDeOc getControleDeOcDAO(int pOc_id){
        ModelControleDeOc modelControleDeOc = new ModelControleDeOc();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
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
                 + " FROM"
                     + " tbl_controle_oc"
                 + " WHERE"
                     + " pk_oc_id = '" + pOc_id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelControleDeOc.setOc_id(this.getResultSet().getInt(1));
                modelControleDeOc.setOc_numero(this.getResultSet().getInt(2));
                modelControleDeOc.setOc_descricao(this.getResultSet().getString(3));
                modelControleDeOc.setOc_usu_id(this.getResultSet().getInt(4));
                modelControleDeOc.setOc_aplicacao(this.getResultSet().getString(5));
                modelControleDeOc.setOc_frota(this.getResultSet().getString(6));
                modelControleDeOc.setOc_fornecedor(this.getResultSet().getString(7));
                modelControleDeOc.setOc_valor(this.getResultSet().getDouble(8));
                modelControleDeOc.setOc_prioridade(this.getResultSet().getString(9));
                modelControleDeOc.setOc_situacao(this.getResultSet().getString(10));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelControleDeOc;
    }

    /**
    * recupera uma lista de ControleDeOc
        * @return ArrayList
    */
    public ArrayList<ModelControleDeOc> getListaControleDeOcDAO(){
        ArrayList<ModelControleDeOc> listamodelControleDeOc = new ArrayList();
        ModelControleDeOc modelControleDeOc = new ModelControleDeOc();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
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
                 + " FROM"
                     + " tbl_controle_oc"
                + ";"
            );

            while(this.getResultSet().next()){
                modelControleDeOc = new ModelControleDeOc();
                modelControleDeOc.setOc_id(this.getResultSet().getInt(1));
                modelControleDeOc.setOc_numero(this.getResultSet().getInt(2));
                modelControleDeOc.setOc_descricao(this.getResultSet().getString(3));
                modelControleDeOc.setOc_usu_id(this.getResultSet().getInt(4));
                modelControleDeOc.setOc_aplicacao(this.getResultSet().getString(5));
                modelControleDeOc.setOc_frota(this.getResultSet().getString(6));
                modelControleDeOc.setOc_fornecedor(this.getResultSet().getString(7));
                modelControleDeOc.setOc_valor(this.getResultSet().getDouble(8));
                modelControleDeOc.setOc_prioridade(this.getResultSet().getString(9));
                modelControleDeOc.setOc_situacao(this.getResultSet().getString(10));
                listamodelControleDeOc.add(modelControleDeOc);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelControleDeOc;
    }

    /**
    * atualiza ControleDeOc
    * @param pModelControleDeOc
    * @return boolean
    */
    public boolean atualizarControleDeOcDAO(ModelControleDeOc pModelControleDeOc){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_controle_oc SET "
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
    * exclui ControleDeOc
    * @param pOc_id
    * @return boolean
    */
    public boolean excluirControleDeOcDAO(int pOc_id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_controle_oc "
                + " WHERE "
                    + "pk_oc_id = '" + pOc_id + "'"
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