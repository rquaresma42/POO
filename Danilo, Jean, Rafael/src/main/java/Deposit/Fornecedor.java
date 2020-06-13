package Deposit;

public class Fornecedor extends Pessoa{
    private Float preco;
    private String Produto;
    private int id;
    static int cnt = 0;

    public Fornecedor(String nome , String telefone , String email ,Float preco, String Produto, int id) {
        super(nome , telefone , email);
        this.id = cnt;
        cnt++;
        this.preco = preco;
        this.Produto = String.valueOf(Produto);
    }
}
