package br.com.alura;

import br.com.alura.client.HttpClientConfiguration;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class ListarAbrigosCommand implements Command {

    @Override
    public void execute() {
        try {
            HttpClientConfiguration client = new HttpClientConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.listarAbrigos();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
