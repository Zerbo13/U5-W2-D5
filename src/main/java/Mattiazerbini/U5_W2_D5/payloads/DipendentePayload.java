package Mattiazerbini.U5_W2_D5.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DipendentePayload {

    @NotBlank(message = "Username è obbligatorio")
    @Size(min = 1, max = 20, message = "L'username deve essere tra 1 e i 20 caratteri")
    private String username;
    @NotBlank(message = "Nome è obbligatorio")
    @Size(min = 1, max = 20, message = "Il nome deve essere tra 1 e i 20 caratteri")
    private String nome;
    @NotBlank(message = "Cognome è obbligatorio")
    @Size(min = 1, max = 20, message = "Il cognome deve essere tra 1 e i 20 caratteri")
    private String cognome;
    @NotBlank(message = "Email è obbligatorio")
    @Email(message = "Il formato dell'indirizzo email inserito non è corretto!")
    @Size(min = 5, message = "La email deve essere almeno di 5 caratteri")
    private String email;

    public DipendentePayload(String username, String nome, String cognome, String email) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }
}
