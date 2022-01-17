package br.com.devinhouse.jogo.controller;

import br.com.devinhouse.jogo.model.Jogador;
import br.com.devinhouse.jogo.model.enums.Motivacao;

import java.util.Scanner;

public class JogadorController {

    static Scanner sc = new Scanner(System.in);

    public static void escolheMotivacao(Jogador jogador) throws IllegalArgumentException {
        int escolhaMotivacao;
        System.out.println("Por que você está nessa missão de destruir os inimigos?");
        System.out.println("[ 1 ] - Vingança");
        System.out.println("[ 2 ] - Glória");
        System.out.print("Motivação: ");
        escolhaMotivacao = Integer.parseInt(sc.nextLine());
        if (escolhaMotivacao == 1) {
            jogador.setMotivacao(Motivacao.vinganca);
        } else if (escolhaMotivacao == 2) {
            jogador.setMotivacao(Motivacao.gloria);
        } else {
            throw new IllegalArgumentException("Opção de motivação inválida!");
        }
    }
}
