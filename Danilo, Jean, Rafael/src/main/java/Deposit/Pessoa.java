package Deposit;

public class Pessoa {
    private final String nome;
    String telefone;
    String email;

    Pessoa(String nome , String telefone , String email){
        this.nome = String.valueOf(nome);
        this.telefone = String.valueOf(telefone);
        this.email = String.valueOf(email);
    }

    //get
    public String getTelefone() {
        return telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    //set
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
