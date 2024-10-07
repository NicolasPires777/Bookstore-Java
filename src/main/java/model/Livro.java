package model;

public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private String data;
    private String genero;
    private boolean disponibilidade;

    public Livro(String nome, String autor, String editora, String data, String genero) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.data = data;
        this.genero = genero;
        this.disponibilidade = true;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public boolean isDisponibilidade() { return disponibilidade; }
    public void setDisponibilidade(boolean disponibilidade) { this.disponibilidade = disponibilidade; }
}
