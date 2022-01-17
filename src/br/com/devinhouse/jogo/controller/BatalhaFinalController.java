package br.com.devinhouse.jogo.controller;

import br.com.devinhouse.jogo.model.Jogador;
import br.com.devinhouse.jogo.model.enums.Arma;
import br.com.devinhouse.jogo.model.enums.Classe;
import br.com.devinhouse.jogo.model.herois.Arqueiro;
import br.com.devinhouse.jogo.model.herois.Guerreiro;
import br.com.devinhouse.jogo.model.herois.Mago;
import br.com.devinhouse.jogo.model.herois.Paladino;

import java.util.Scanner;

public class BatalhaFinalController {

    Scanner sc = new Scanner(System.in);

    public String passarPelaPorta() throws IllegalArgumentException{
        int escolhaPassarPorta;
        System.out.println("Você passa pela porta:");
        System.out.println("[ 1 ] - ANDANDO CUIDADOSAMENTE");
        System.out.println("[ 2 ] - CORRENDO");
        System.out.println("[ 3 ] - SALTANDO");
        escolhaPassarPorta = Integer.parseInt(sc.nextLine());
        switch (escolhaPassarPorta) {
            case 1:
                return "ANDANDO CUIDADOSAMENTE";
            case 2:
                return "CORRENDO";
            case 3:
                return "SALTANDO";
            default:
                throw new IllegalArgumentException("Opção inválida para passar pela porta!");
        }
    }

    public boolean perguntaSeQuerDesistir() throws IllegalArgumentException{
        int escolhaContinuar;
        System.out.println("Você segue em frente ou gostaria de desistir? ");
        System.out.println("[ 1 ] - Seguir em frente");
        System.out.println("[ 2 ] - Desistir");
        escolhaContinuar = Integer.parseInt(sc.nextLine());
        if (escolhaContinuar == 1) {
            System.out.println("Você decide seguir em frente...");
            return false;
        } else if (escolhaContinuar == 2) {
            return true;
        } else {
            throw new IllegalArgumentException("Opção inválida!");
        }
    }

    public Jogador criaJogador() throws IllegalArgumentException, IndexOutOfBoundsException, NullPointerException{
        String nome = solicitaNome();
        char sexo = solicitaSexo();
        Classe classe = solicitaClasse();
        Arma arma = solicitaArma(classe);
        Jogador jogador = null;

        switch (classe.getValue()) {
            case "arqueiro":
                jogador = new Arqueiro(nome, sexo, arma);
                break;
            case "guerreiro":
                jogador = new Guerreiro(nome, sexo, arma);
                break;
            case "mago":
                jogador = new Mago(nome, sexo, arma);
                break;
            case "paladino":
                jogador = new Paladino(nome, sexo, arma);
                break;
        }
        return jogador;
    }

    private String solicitaNome() throws NullPointerException, IllegalArgumentException{
        String nome;

        System.out.print("Nome do Personagem: ");
        nome = sc.nextLine();
        validaNome(nome);
        return nome;
    }

    private void validaNome(String nome) throws NullPointerException, IllegalArgumentException{
        if (nome.isBlank() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser nulo!");
        }
    }

    private Character solicitaSexo() throws IndexOutOfBoundsException, IllegalArgumentException {
        String sexo;
        System.out.print("Sexo do Personagem [ M / F ]: ");
        sexo = sc.nextLine();
        return validaSexo(sexo);
    }

    private Character validaSexo(String sexo) throws IndexOutOfBoundsException, IllegalArgumentException {
        char caracterSexo = sexo.trim().toUpperCase().charAt(0);
        if (caracterSexo != 'M' && caracterSexo != 'F') {
            throw new IllegalArgumentException("Sexo deve ser M (masculino) ou F (feminino)!");
        }
        return caracterSexo;
    }

    private Classe solicitaClasse() throws IllegalArgumentException{
        int escolhaClasse;

        System.out.println("[ 1 ] - Arqueiro");
        System.out.println("[ 2 ] - Guerreiro");
        System.out.println("[ 3 ] - Mago");
        System.out.println("[ 4 ] - Paladino");
        System.out.print("Escolha a sua classe: ");
        escolhaClasse = Integer.parseInt(sc.nextLine());

        switch (escolhaClasse) {
            case 1:
                return Classe.ARQUEIRO;
            case 2:
                return Classe.GUERREIRO;
            case 3:
                return Classe.MAGO;
            case 4:
                return Classe.PALADINO;
            default:
                throw new IllegalArgumentException("Opção inválida!");
        }
    }

    private Arma solicitaArma(Classe classe) throws IllegalArgumentException{
        int escolhaClasse;

        Arma arma = null;

        System.out.println("Armas disponíveis para a classe "+ classe.getDisplayName());

        switch (classe) {
            case GUERREIRO:
                System.out.println("[ 1 ] - Espada");
                System.out.println("[ 2 ] - Machado");
                System.out.print("Escolha a sua arma: ");
                escolhaClasse = Integer.parseInt(sc.nextLine());
                if (escolhaClasse == 1) {
                    arma = Arma.espada;
                } else if (escolhaClasse == 2) {
                    arma = Arma.machado;
                } else {
                    throw new IllegalArgumentException("Opção de arma inválida!");
                }
                break;
            case PALADINO:
                System.out.println("[ 1 ] - Martelo");
                System.out.println("[ 2 ] - Clava");
                System.out.print("Escolha a sua arma: ");
                escolhaClasse = Integer.parseInt(sc.nextLine());
                if (escolhaClasse == 1) {
                    arma = Arma.martelo;
                } else if (escolhaClasse == 2) {
                    arma = Arma.clava;
                } else {
                    throw new IllegalArgumentException("Opção de arma inválida!");
                }
                break;
            case ARQUEIRO:
                System.out.println("[ 1 ] - Arco");
                System.out.println("[ 2 ] - Besta");
                System.out.print("Escolha a sua arma: ");
                escolhaClasse = Integer.parseInt(sc.nextLine());
                if (escolhaClasse == 1) {
                    arma = Arma.arco;
                } else if (escolhaClasse == 2) {
                    arma = Arma.besta;
                } else {
                    throw new IllegalArgumentException("Opção de arma inválida!");
                }
                break;
            case MAGO:
                System.out.println("[ 1 ] - Cajado");
                System.out.println("[ 2 ] - Livro de Magias");
                System.out.print("Escolha a sua arma: ");
                escolhaClasse = Integer.parseInt(sc.nextLine());
                if (escolhaClasse == 1) {
                    arma = Arma.cajado;
                } else if (escolhaClasse == 2) {
                    arma = Arma.livro_de_magias;
                } else {
                    throw new IllegalArgumentException("Opção de arma inválida!");
                }
                break;
        }
        return arma;
    }
}
