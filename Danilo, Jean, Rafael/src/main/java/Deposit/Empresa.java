package Deposit;

import java.time.LocalDate;

public class Empresa {
    private Float dinheiro;
    private final String nomeEmpresa;
    private final LocalDate BirthDate;
    private Estoque mercadorias;

    public Empresa(Float dinheiro, String nomeEmpresa, String BirthDate, Estoque mercadorias) {
        this.dinheiro = dinheiro;
        this.nomeEmpresa = String.valueOf(nomeEmpresa);
        this.BirthDate =  LocalDate.parse(BirthDate);
        this.mercadorias = mercadorias;
    }   
    
    //get
    public Float getDinheiro() {
        return dinheiro;
    }
    
    public Estoque getMercadorias() {
        return mercadorias;
    }
    
    //set
    public void setDinheiro(Float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void setMercadorias(Estoque mercadorias) {
        this.mercadorias = mercadorias;
    }
    
}
