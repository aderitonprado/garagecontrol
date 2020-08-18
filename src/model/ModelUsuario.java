package model;
/**
*
* @author Adériton Prado
*/
public class ModelUsuario {

    private int usu_id;
    private String usu_nome;
    private String usu_login;
    private String usu_senha;
    private int usu_nivel;
    private int usu_status;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de usu_id
    * @param pUsu_id
    */
    public void setUsu_id(int pUsu_id){
        this.usu_id = pUsu_id;
    }
    /**
    * @return pk_usu_id
    */
    public int getUsu_id(){
        return this.usu_id;
    }

    /**
    * seta o valor de usu_nome
    * @param pUsu_nome
    */
    public void setUsu_nome(String pUsu_nome){
        this.usu_nome = pUsu_nome;
    }
    /**
    * @return usu_nome
    */
    public String getUsu_nome(){
        return this.usu_nome;
    }

    /**
    * seta o valor de usu_login
    * @param pUsu_login
    */
    public void setUsu_login(String pUsu_login){
        this.usu_login = pUsu_login;
    }
    /**
    * @return usu_login
    */
    public String getUsu_login(){
        return this.usu_login;
    }

    /**
    * seta o valor de usu_senha
    * @param pUsu_senha
    */
    public void setUsu_senha(String pUsu_senha){
        this.usu_senha = pUsu_senha;
    }
    /**
    * @return usu_senha
    */
    public String getUsu_senha(){
        return this.usu_senha;
    }

    /**
    * seta o valor de usu_nivel
    * @param pUsu_nivel
    */
    public void setUsu_nivel(int pUsu_nivel){
        this.usu_nivel = pUsu_nivel;
    }
    /**
    * @return usu_nivel
    */
    public int getUsu_nivel(){
        return this.usu_nivel;
    }
    
    public int getUsu_status() {
        return this.usu_status;
    }
    
    /**
    * seta o valor de usu_nivel
    * @param pUsu_status
    */
    public void setUsu_status(int pUsu_status){
        this.usu_status = pUsu_status;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::usu_id = " + this.usu_id + "::usu_nome = " + this.usu_nome + "::usu_login = " + this.usu_login + "::usu_senha = " + this.usu_senha + "::usu_nivel = " + this.usu_nivel +  "}";
    }

}