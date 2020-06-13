package Deposit;
import java.io.File;

public class Funcionario  extends Pessoa{
    static int cnt = 0;
    private int id;
    private float salario;
    private String cargo;
    private File registration;
    static Empresa caixa;
    private float vendas;

    Funcionario(String nome , String telefone , String email , float salario , String cargo){
        super(nome , telefone , email);
        id = cnt;
        cnt++;
        this.salario = salario;
        this.cargo = String.valueOf(cargo);
        //Cria um arquivo de dados para guardar tudo que será feito pelo funcionário na empresa
    }

    void SetterEmpresa(Empresa caixa){
        this.caixa = caixa;
    }

    int removeItem(int numeroSerie){
        //Faz um busca
        //int pos
        //Caso ache é usado um parametro para retirar o valor
        //Caso não ache é apresentado uma mensagem de erro para o usuário
           /*
           if(pos < 0){
                sout("Nao existe esse produto")
                return -1
           }
           else{
            //Acessa o caixa
            if(get() == 0){
                sout("Produto esgotado")
            }
            else{
                empresa.dinheiro+= get();
                diminui o quanto do item se tem no inventário
                escreve no registration
                vendas = vendas + get();
            }
           }

            */
        return 0;
    }

    void cancelarOperacaoPassada(){
        //Acessa registration
        //Ve se é válido a ação
        //Volta e pega os valores do item retirado
        //diminui o dinheiro da empresa baseado no item
        //Aumenta a quantidade do item em estoque
        //Escreve na memória de registration que essa ação foi realizada
    }

    void cancelarVendaProduto(int numeroSerie){
        //Acessa registration
        //Ve se é válido a ação
        //Volta e pega os valores dos itens retirados no dia
        //Procura o item
        //Caso achar refaz o que foi mudado (dinheiro e estoque)
        //Escreve na memória de registration que essa ação foi realizada
    }

}
