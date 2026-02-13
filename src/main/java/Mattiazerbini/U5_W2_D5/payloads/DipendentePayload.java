package Mattiazerbini.U5_W2_D5.payloads;

public class DipendentePayload {

    private String username;
    private String nome;
    private String cognome;
    private String email;

    public DipendentePayload(String username, String nome, String cognome, String email) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }
}
