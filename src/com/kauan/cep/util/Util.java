package com.kauan.cep.util;

import java.util.Scanner;

public class Util {

    static Scanner s = new Scanner(System.in);

    public static String readString(String msg) {
        try {
            System.out.print(msg);
            return s.nextLine();
        } catch (Exception ex) {
            System.out.println("\nValor inválido!\nDigite um valor válido!\n");
            return readString(msg);
        }
    }

    public static String nextCEP(String msg) {
        String cep = readString(msg)
                .replace("-", "")
                .replace(".", "");
        if ( cep.length() == 8 || cep.equalsIgnoreCase("sair")) return cep;
        System.out.println("\nCEP inválido!\nDigite um valor válido!\n");
        return nextCEP(msg);
    }

    public static void title(String titulo){
        int size = 43;
        String line = "";
        String space = "";
        String newTitulo = "";
        int n = (size - titulo.length() )/2;

        for (int i = 0; i < size; i++) {
            line = line.concat("=");
        }
        for (int i = 0; i < n; i++) {
            space = space.concat(" ");
        }
        newTitulo = newTitulo.concat(space) + newTitulo.concat(titulo.toUpperCase()) + newTitulo.concat(space);
        titulo = "\n" + line + "\n" + newTitulo + "\n" + line;

        System.out.println(titulo);
    }
}
