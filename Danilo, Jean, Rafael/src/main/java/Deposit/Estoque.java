//Classe Estoque
package Deposit;

import java.util.ArrayList;
import java.io.File;

public class Estoque{
    ArrayList <Item> produtos;
    File estoque;
    File transitions;
    
    public Estoque (){
        //Iniciará dois arquivos para o controle do estoque
    }
	
    public int addItem(String nome, String tipo, float preco, int quantidade){
	//Adiciona um item ao estoque
	return 0;
    }
	
    public int printEstoque()
    {
        //Printa os produtos em estoque
        return 0;
    }
	
    public int removeItem(int numeroSerie)
    {
        //Retira item do estoque
	return 0;   
    }
}