
package economize;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
     private int id;
    private String nomeUser;
    private String senha;
    private Double renda;
    private Double limiteDespesas;
    private List <Despesas>lista=new ArrayList<>();
    private double meta;

   
    public Usuario() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public void setLimiteDespesas(Double limite){
        this.limiteDespesas=limite;
        
    }
    public Double getLimiteDespesas(){
        return limiteDespesas;
    }

    public List<Despesas> getLista() {
        return lista;
    }

    public void setLista(List<Despesas> lista) {
        this.lista = lista;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

  
    // Funções do sistema
    public void addListaDespesas(Despesas despesa){
        this.lista.add(despesa);
    }
    public void mostrarDespesas(){
        for (Despesas desp:lista){
            System.out.println(desp.toString());
            
        }
    }
    
    public double calcularTotalDespesas(){
          double totalDespesas=0;
          for (Despesas desp:lista){
            totalDespesas+=desp.getValor();
        }  
          //System.out.println("Total de despesas: "+totalDespesas);
          return  totalDespesas;
    }
    
    public double calcularSaldo(double renda, double total){
        double saldo=renda-total;
        return saldo;
    }
    // Calcular percentual total de despesas 
    public double percentualDespesas(double totalDesp ){
        double percent=0;
        percent=(totalDesp/this.renda)*100;
        return percent;
    }
    // Calcular percentual de despesas especificas 
    public double percentDespesasTipo(double totalDesp, double valorUniDesp, String nome){
          double percent=0;
            percent=(valorUniDesp/this.renda)*100;
          return percent;
    }
    
    
}
