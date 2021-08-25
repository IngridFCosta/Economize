
package economize;

public class Despesas {
     private int id;
    private String nome;
    private String descricao;
    private Double valor;
    private String tipo;
    
    public Despesas(){
        
    }
    public Despesas(String nome,Double valor) {
        this.nome = nome;
         this.valor = valor;
    }

    public Despesas(String nome, String descricao, Double valor, String tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Despesas{" + "nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + '}';
    }
}
