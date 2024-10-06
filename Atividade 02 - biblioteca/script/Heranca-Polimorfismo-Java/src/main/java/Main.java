package main.java;
import main.java.atividade02.*;

import javax.swing.*;

import main.java.atividade03.Caminhao;
import main.java.atividade03.Carro;
import main.java.atividade03.CorreçãoProfessor.CorrecaoCaminhao;
import main.java.atividade03.CorreçãoProfessor.CorrecaoCarro;
import main.java.atividade03.CorreçãoProfessor.CorrecaoFrota;
import main.java.atividade03.CorreçãoProfessor.CorrecaoMoto;
import main.java.atividade03.Frota;
import main.java.atividade03.Veiculo;
import main.java.atividade04.CorrecaoEmailNotificacao;
import main.java.atividade04.CorrecaoGerenciadorNotificacoes;
import main.java.atividade04.CorrecaoPushNotificacao;
import main.java.atividade04.CorrecaoSMSNotificacao;
import main.java.atividade05.CorrecaoBoleto;
import main.java.atividade05.CorrecaoCartaoCredito;
import main.java.atividade05.CorrecaoProcessadorPagamento;
import main.java.atividade05.CorrecaoTransferenciaBancaria;
import main.java.atividade06.*;
import main.java.atividade07.*;
import main.java.atividade09.*;
import main.java.atividade10.*;
import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //CorrecaoAtividade01();
        CorrecaoAtividade02();
       // CorrecaoAtividade03();
        //CorrecaoAtividade04();
        //CorrecaoAtividade05();
        //CorrecaoAtividade06();
        //CorrecaoAtividade07();
        //CorrecaoAtividade08();
        //CorrecaoAtividade09();
       // CorrecaoAtividade10();


    }


    private static void CorrecaoAtividade02() {
    
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarItem(new LivroFisico("Harry Potter","Matheus",2024,true,500));
        if (biblioteca.emprestarLivro("Harry Potter")){
            System.out.println("Livro emprestado");
        } else {
            System.out.println("Livro Indisponivel");
        }

        if (biblioteca.devolverLivro("Harry Potter")){
            System.out.println("Livro devolvido");
        } else {
            System.out.println("Erro em devolver");
        }

        System.out.println("Valor da multa: "+biblioteca.multaLivro("Harry Potter",10));

        biblioteca.listarLivros();
    }

}
