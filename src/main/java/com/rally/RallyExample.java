package com.rally;

import com.google.gson.JsonElement;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.request.QueryRequest;
import com.rallydev.rest.response.QueryResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static com.rally.authentication.Credentials.RALLY_SERVER_URL;
import static com.rally.authentication.Credentials.SECRET_KEY;
import static com.rally.authentication.Credentials.USER_NAME;

public class RallyExample {

    public static void main(String[] args) throws URISyntaxException, IOException {
        RallyRestApi restApi = new RallyRestApi(new URI(RALLY_SERVER_URL), USER_NAME, SECRET_KEY);

        QueryResponse response = restApi.query(new QueryRequest("defect"));

        for (JsonElement element : response.getResults()) {
            System.out.println(element.getAsString());
        }
    }
}
