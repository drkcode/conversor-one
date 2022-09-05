package com.conversorone.utils;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cotacao {

    private final String uri;

    public Cotacao(String de, String para) {
        this.uri = "https://economia.awesomeapi.com.br/json/last/"+ de +"-"+ para;
    }

    public CotacaoVO get() throws Exception {

        URI uri = new URI(this.uri);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body().toString();

        Pattern pattern = Pattern.compile("(\"name\":\".+?\")|(\"bid\":\".+?\")");
        Matcher matcher = pattern.matcher(responseBody);
        List<String> props = new ArrayList<>();
        while (matcher.find()) props.add(matcher.group());

        CotacaoVO responseDTO = new CotacaoVO();
        props.forEach(p -> {
            var keyValue = p.split(":");
            if(keyValue[0].contains("name")) {
                responseDTO.setName(keyValue[1].replace("\"", ""));
            } else {
                Double bid = Double.parseDouble(keyValue[1].replace("\"", ""));
                responseDTO.setBid(bid);
            }
        });

        return responseDTO;
    }


}
