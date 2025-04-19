

package br.com.pokedex.pokedex_api.model;
import br.com.pokedex.pokedex_api.model.Pokemon;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "nome")
    @NotNull
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "areaHabita")
    private String areaHabita;

    @Column(name = "altura")
    private Double altura;

    @Column(name = "peso")
    private Double peso;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAreaHabita() {
        return areaHabita;
    }

    public void setAreaHabita(String areaHabita) {
        this.areaHabita = areaHabita;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}