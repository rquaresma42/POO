package Deposit;
import java.util.ArrayList;
import java.io.File;

public class Gerente extends Funcionario{

    ArrayList<Funcionario> pessoal;
    int qtdFuncionarios;
    File funcionarios;

    Gerente(String nome , String telefone , String email , float salario , String cargo){
        super(nome ,telefone , email ,salario , cargo);
        this.qtdFuncionarios = 0;
        //Cria um arquivo vazio contendo todos seus funcionários
    }

    void pagamento(){
        //Percorre o arraylist de funcionarios decrementando o salários destes do caixa
        //Percorre todos os itens e todos os fornecedores decrementando o salario destes do caixa
    }

    void lookDay(){
        int day;
        int month;
        int year;
        //Escaneia a data requerida
        //Acha a data no arquivo de dados da empresa
        //Printa todas as ações ocorridas naquele dia
    }

    void lookMonth(){
        int month;
        int year;
        //Escaneia a data requerida
        //Acha a data no arquivo de dados da empresa
        //Printa todas as ações ocorridas naquele dia
    }

    void lookYear(){
        int year;
        //Escaneia a data requerida
        //Acha a data no arquivo de dados da empresa
        //Printa todas as ações ocorridas naquele dia
    }

    void statusFuncionario(int ID){
        //Ve quantas vendas o funcionário já realizou
        //A quanto tempo o funcionário está no local
        //Faz uma conta para saber a quantos meses ele está trabalhando
        //Conta qual o saldo gerado pelo funcionário

    }

    void addFornecedor(Fornecedor iniciar , int numeroSerie){
        //Vai até o estoque da empresa e adiciona um fornecedor até um item
    }

    void removeFornecedor(int ID){
        //Vai até o estoque da empresa e retira um fornecedor de um item
    }

    void addItem(int numeroSerie){
        //Compra x itens fora de hora
    }

    void addFuncionario(int salario , String cargo , String nome , String telefone , String email){
        Funcionario novo = new Funcionario(nome , telefone , email ,salario ,cargo);
        //pessoal.add(novo);
        //Escreve o funcionário no arquivo
        qtdFuncionarios++;
    }

    void removeFuncionario(int ID){
        if(qtdFuncionarios != 0){
            //Vai até o ArrayList e retira um funcionário
            //Vai até o arquivo e retira o funcionário
            qtdFuncionarios--;
        }

    }

}
