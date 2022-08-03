package models.usuario;

public class User {

    private static int SEQ = 1;
    private int id;
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public User(String nome, String sobrenome) {
        this.id = SEQ++;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}
