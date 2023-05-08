package com.kauan.cep.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCEP {

    private static final HttpClient client = HttpClient.newHttpClient();

    public String viaCEPQuery(String cep) {
        try {
            return viaCEPResponse(cep);
        } catch (IOException | InterruptedException e) {
            System.out.println("CEP inválido");
        }
        return null;
    }

    public HttpRequest viaCEPRequest(String cep) {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                .build();

        return request;
    }

    public String viaCEPResponse(String cep) throws IOException, InterruptedException {
        HttpResponse<String> response = client
                .send(
                        viaCEPRequest(cep),
                        HttpResponse.BodyHandlers.ofString()
                );

        return response.body();
    }
}
