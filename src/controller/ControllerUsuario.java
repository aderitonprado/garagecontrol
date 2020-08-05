package controller;

import model.ModelUsuario;
import DAO.DAOUsuario;
import java.util.ArrayList;

/**
*
* @author Adériton Prado
*/
public class ControllerUsuario {

    private DAOUsuario daoUsuario = new DAOUsuario();

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param pUsu_id
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioController(int pUsu_id){
        return this.daoUsuario.getUsuarioDAO(pUsu_id);
    }

    /**
    * recupera uma lista deUsuario
    * @param pUsu_id
    * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioController(){
        return this.daoUsuario.getListaUsuarioDAO();
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    /**
    * exclui Usuario
    * @param pUsu_id
    * @return boolean
    */
    public boolean excluirUsuarioController(int pUsu_id){
        return this.daoUsuario.excluirUsuarioDAO(pUsu_id);
    }
}