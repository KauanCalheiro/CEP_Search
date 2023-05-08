package com.kauan.cep.data;

public class Address {
    private String state;
    private String city;
    private String street;
    private String neighborhood;
    private String cep;

    public void parseAddress(API_Address APIAddress) {
        this.state = APIAddress.uf();
        this.city = APIAddress.localidade();
        this.street = APIAddress.logradouro();
        this.neighborhood = APIAddress.bairro();
        this.cep = APIAddress.cep();
    }

    @Override
    public String toString() {
        return """
                Estado: %s
                Cidade: %s
                Rua: %s
                Bairro: %s
                CEP: %s""".formatted(
                this.state,
                this.city,
                this.street.replace("Rua ", ""),
                this.neighborhood,
                this.cep);
    }
}
