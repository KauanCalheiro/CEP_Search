package com.kauan.cep.services;

import com.google.gson.GsonBuilder;
import com.kauan.cep.data.API_Address;
import com.kauan.cep.data.Address;
import com.kauan.cep.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public Program(){

        Json json = new Json();
        List<Address> addressList = new ArrayList<>();

        Util.title("""
                Digite "sair" para encerrar o programa""");

        while (true){
            Util.title("Consulta");
            String cep = Util.nextCEP("Digite o cep: ");

            if (cep.equalsIgnoreCase("sair")) {
                break;
            }

            String jsonQueriedFromAPI = new ViaCEP().viaCEPQuery(cep);

            API_Address apiAddress = API_Address.parseAPI_Address(jsonQueriedFromAPI);

            if (!apiAddress.erro()) {
                Address address = new Address();
                address.parseAddress(apiAddress);
                addressList.add(address);
                System.out.println("\n" + address);
            } else {
                System.out.println("\nCEP de formato válido, porém inexistente!");
            }
        }
        json.fileWrite(new GsonBuilder().setPrettyPrinting().create().toJson(addressList));
        Util.title("Saindo...");
    }
}
