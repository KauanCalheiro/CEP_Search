package com.kauan.cep.services;

import com.kauan.cep.util.Util;

import java.io.FileWriter;
import java.io.IOException;

public class Json {

    public void fileWrite(String json) {
        try {
            FileWriter fileWriter = new FileWriter("./cep.json");
            Util.title("Escrevendo arquivo .json");
            fileWriter.write(json);
            fileWriter.close();
            Util.title("Arquivo .json pronto");
        } catch (IOException ex) {
            System.out.println("\nErro ao escrever o arquivo!\n");
        }
    }
}
