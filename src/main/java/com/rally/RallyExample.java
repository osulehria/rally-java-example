package com.rally;

import com.google.gson.JsonElement;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.request.QueryRequest;
import com.rallydev.rest.response.QueryResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class RallyExample {

    public static void main(String[] args) throws URISyntaxException, IOException {
        RallyRestApi restApi = new RallyRestApi(new URI(""), "", "");

        QueryResponse response = restApi.query(new QueryRequest("defect"));

        for (JsonElement element : response.getResults()) {
            System.out.println(element.getAsString());
        }
    }
}
