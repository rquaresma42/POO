package Deposit;
//Classe Items
import java.util.ArrayList;
import java.io.File;

public class Item
{
    int quantidade;
    int numeroSerie;
    float preco;
    String tipo;
    String nome;
    ArrayList<Fornecedor> fornecedores;
    File produto;
    
    public Item(int quantidade, int numeroSerie,float preco, String tipo, String nome)
    {
	this.fornecedores = null;
        this.quantidade = quantidade;
        this.numeroSerie = numeroSerie; 
        this.preco = preco;
        this.tipo = String.valueOf(tipo);
        this.nome = String.valueOf(nome);
        produto = null;

	//Em produto, provavelmente teremos a concateanação do nome do produto com seu numeroSerie
    }
	
    public int mudarPreco(int idFornecedor, float lucro)
    {
        //Muda o preço cobrado pelo item
        return 0;
    }
}
