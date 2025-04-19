package br.com.pokedex.pokedex_api;

public class Pokemon {
    private String nome;
    private String tipo;
    private int nivel;

    public Pokemon(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setId(long l) {
    }

    public void setDescricao(String s) {
    }

    public void setImagem(String url) {
    }

    public void setCategoria(String semente) {
    }

    public void setAreaHabita(String floresta) {
    }

    public void setAltura(double v) {
    }

    public void setPeso(double v) {

    }
}