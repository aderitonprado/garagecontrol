package controller;

import model.ModelControleDeOc;
import DAO.DAOControleDeOc;
import java.util.ArrayList;

/**
*
* @author Adériton Prado
*/
public class ControllerControleDeOc {

    private DAOControleDeOc daoControleDeOc = new DAOControleDeOc();

    /**
    * grava ControleDeOc
    * @param pModelControleDeOc
    * @return int
    */
    public int salvarControleDeOcController(ModelControleDeOc pModelControleDeOc){
        return this.daoControleDeOc.salvarControleDeOcDAO(pModelControleDeOc);
    }

    /**
    * recupera ControleDeOc
    * @param pOc_id
    * @return ModelControleDeOc
    */
    public ModelControleDeOc getControleDeOcController(int pOc_id){
        return this.daoControleDeOc.getControleDeOcDAO(pOc_id);
    }

    /**
    * recupera uma lista deControleDeOc
    * @param pOc_id
    * @return ArrayList
    */
    public ArrayList<ModelControleDeOc> getListaControleDeOcController(){
        return this.daoControleDeOc.getListaControleDeOcDAO();
    }

    /**
    * atualiza ControleDeOc
    * @param pModelControleDeOc
    * @return boolean
    */
    public boolean atualizarControleDeOcController(ModelControleDeOc pModelControleDeOc){
        return this.daoControleDeOc.atualizarControleDeOcDAO(pModelControleDeOc);
    }

    /**
    * exclui ControleDeOc
    * @param pOc_id
    * @return boolean
    */
    public boolean excluirControleDeOcController(int pOc_id){
        return this.daoControleDeOc.excluirControleDeOcDAO(pOc_id);
    }
}