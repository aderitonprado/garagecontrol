package model;
/**
*
* @author Adériton Prado
*/
public class ModelControleDeOc {

    private int oc_id;
    private int oc_numero;
    private String oc_descricao;
    private int oc_usu_id;
    private String oc_aplicacao;
    private String oc_frota;
    private String oc_fornecedor;
    private double oc_valor;
    private String oc_prioridade;
    private String oc_situacao;

    /**
    * Construtor
    */
    public ModelControleDeOc(){}

    /**
    * seta o valor de oc_id
    * @param pOc_id
    */
    public void setOc_id(int pOc_id){
        this.oc_id = pOc_id;
    }
    /**
    * @return pk_oc_id
    */
    public int getOc_id(){
        return this.oc_id;
    }

    /**
    * seta o valor de oc_numero
    * @param pOc_numero
    */
    public void setOc_numero(int pOc_numero){
        this.oc_numero = pOc_numero;
    }
    /**
    * @return oc_numero
    */
    public int getOc_numero(){
        return this.oc_numero;
    }

    /**
    * seta o valor de oc_descricao
    * @param pOc_descricao
    */
    public void setOc_descricao(String pOc_descricao){
        this.oc_descricao = pOc_descricao;
    }
    /**
    * @return oc_descricao
    */
    public String getOc_descricao(){
        return this.oc_descricao;
    }

    /**
    * seta o valor de oc_usu_id
    * @param pOc_usu_id
    */
    public void setOc_usu_id(int pOc_usu_id){
        this.oc_usu_id = pOc_usu_id;
    }
    /**
    * @return oc_usu_id
    */
    public int getOc_usu_id(){
        return this.oc_usu_id;
    }

    /**
    * seta o valor de oc_aplicacao
    * @param pOc_aplicacao
    */
    public void setOc_aplicacao(String pOc_aplicacao){
        this.oc_aplicacao = pOc_aplicacao;
    }
    /**
    * @return oc_aplicacao
    */
    public String getOc_aplicacao(){
        return this.oc_aplicacao;
    }

    /**
    * seta o valor de oc_frota
    * @param pOc_frota
    */
    public void setOc_frota(String pOc_frota){
        this.oc_frota = pOc_frota;
    }
    /**
    * @return oc_frota
    */
    public String getOc_frota(){
        return this.oc_frota;
    }

    /**
    * seta o valor de oc_fornecedor
    * @param pOc_fornecedor
    */
    public void setOc_fornecedor(String pOc_fornecedor){
        this.oc_fornecedor = pOc_fornecedor;
    }
    /**
    * @return oc_fornecedor
    */
    public String getOc_fornecedor(){
        return this.oc_fornecedor;
    }

    /**
    * seta o valor de oc_valor
    * @param pOc_valor
    */
    public void setOc_valor(double pOc_valor){
        this.oc_valor = pOc_valor;
    }
    /**
    * @return oc_valor
    */
    public double getOc_valor(){
        return this.oc_valor;
    }

    /**
    * seta o valor de oc_prioridade
    * @param pOc_prioridade
    */
    public void setOc_prioridade(String pOc_prioridade){
        this.oc_prioridade = pOc_prioridade;
    }
    /**
    * @return oc_prioridade
    */
    public String getOc_prioridade(){
        return this.oc_prioridade;
    }

    /**
    * seta o valor de oc_situacao
    * @param pOc_situacao
    */
    public void setOc_situacao(String pOc_situacao){
        this.oc_situacao = pOc_situacao;
    }
    /**
    * @return oc_situacao
    */
    public String getOc_situacao(){
        return this.oc_situacao;
    }

    @Override
    public String toString(){
        return "ModelControleDeOc {" + "::oc_id = " + this.oc_id + "::oc_numero = " + this.oc_numero + "::oc_descricao = " + this.oc_descricao + "::oc_usu_id = " + this.oc_usu_id + "::oc_aplicacao = " + this.oc_aplicacao + "::oc_frota = " + this.oc_frota + "::oc_fornecedor = " + this.oc_fornecedor + "::oc_valor = " + this.oc_valor + "::oc_prioridade = " + this.oc_prioridade + "::oc_situacao = " + this.oc_situacao +  "}";
    }
}