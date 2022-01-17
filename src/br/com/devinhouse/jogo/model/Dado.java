package br.com.devinhouse.jogo.model;

import java.util.Random;

public class Dado {

    private static final Random random = new Random();

    public static int rolarDadoDeDez() {
        return random.nextInt((10 - 1) + 1) + 1;
    }
}
