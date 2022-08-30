package com.conversorone;

import javax.swing.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Teste {

    public static void main(String[] args) {
        try {
            var result = getRequest("https://economia.awesomeapi.com.br/json/available");
            var groups = Arrays.stream(result
                    .replace("{", "")
                    .replace("}", "")
                    .split(",")).collect(Collectors.toList());

            List<Combinacao> combinacoesList = new ArrayList<>();
            groups.forEach(v -> {
                var keyName = v.split(":");
                combinacoesList.add(new Combinacao(keyName[0],keyName[1]));
            });

            var combinacoesNomes = combinacoesList.stream().map(v -> v.nome).sorted().toArray(String[]::new);

            var op1 = janelaInicial(combinacoesNomes);
            if(op1 == null) return;
            var input = janelaForm(op1);

            var combinacaoSelecionada = combinacoesList.stream()
                    .filter(v -> v.nome.equals(op1)).findFirst().orElseThrow().codigo.replace("\"", "");

            var bid = getRequest("https://economia.awesomeapi.com.br/json/last/"+combinacaoSelecionada);
            var p = Pattern.compile("(\"bid\":\".+?\")");
            var m = p.matcher(bid);

            Double cotacao;
            if(!m.find()) return;
            cotacao = Double.parseDouble(m.group().split(":")[1].replace("\"", ""));

            double resultado = input * cotacao;

            janelaResultado(resultado);


        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public static String getRequest(String uri) throws Exception {
        URI uri1 = new URI(uri);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri1)
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body().toString();
    }

    public static String janelaInicial(String[] opcoes) {
        return (String) JOptionPane.showInputDialog(
                null,
                "Conversor de moeda",
                "Conversor ONE",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
    }

    public static double janelaForm(String msg) {
        var input = JOptionPane.showInputDialog(
                null,
                msg,
                "Conversor ONE",
                JOptionPane.PLAIN_MESSAGE
        );
        return Double.parseDouble(input);
    }

    public static void janelaResultado(double total) {
        JOptionPane.showConfirmDialog(null, String.valueOf(total), "Conversor", JOptionPane.PLAIN_MESSAGE);
    }
}
