package com.kauan.cep.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public record API_Address(
        boolean erro,
        String uf,
        String localidade,
        String logradouro,
        String bairro,
        String cep) {

    public static API_Address parseAPI_Address(String json) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        API_Address apiAddress = gson.fromJson(json, API_Address.class);

        return apiAddress;
    }

}