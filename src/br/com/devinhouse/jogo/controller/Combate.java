package br.com.devinhouse.jogo.controller;

import br.com.devinhouse.jogo.model.Inimigo;
import br.com.devinhouse.jogo.model.Jogador;

import java.util.Scanner;

public class Combate {

    public static void iniciaCombate(Jogador jogador, Inimigo inimigo, boolean jogadorComeca) throws NumberFormatException{
        boolean repetir = true;

        if (jogadorComeca) {
            do {
                try {
                    perguntaSeQuerContinuar();
                    jogador.atacar(inimigo);
                    if (!inimigo.isEstaVivo()) {
                        System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
                        break;
                    } else {
                        inimigo.atacar(jogador);
                        if (!jogador.isEstaVivo()) {
                            System.out.println(jogador.getMensagemMotivacao());
                            System.exit(0);
                        }
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            } while(repetir);
        } else {
            do {
                try {
                    inimigo.atacar(jogador);
                    if(!jogador.isEstaVivo()) {
                        System.out.println(jogador.getMensagemMotivacao());
                        System.exit(0);
                    } else {
                        perguntaSeQuerContinuar();
                        jogador.atacar(inimigo);
                        if (!inimigo.isEstaVivo()) {
                            System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            } while(repetir);
        }
    }

    private static void perguntaSeQuerContinuar() throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
        int escolhaContinuar;
        do {
            System.out.println("Você decide...");
            System.out.println("[ 1 ] - Atacar");
            System.out.println("[ 2 ] - Fugir");
            escolhaContinuar = Integer.parseInt(sc.nextLine().trim());
        } while (escolhaContinuar != 1 && escolhaContinuar != 2);
        if (escolhaContinuar == 2) {
            System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez...");
            System.exit(0);
        }
    }
}
