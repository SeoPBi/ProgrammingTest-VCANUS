package com.example.codingtest.test.programmingTest1;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = Main.class.getResourceAsStream("/bread.json");
            String json = new String(is.readAllBytes());

            ObjectMapper mapper = new ObjectMapper();
            List<Map<String, Object>> breadMaps = mapper.readValue(json, List.class);

            List<Bread> breads = new ArrayList<>();
            for (Map<String, Object> breadMap : breadMaps) {
                String breadType = (String) breadMap.get("breadType");
                Map<String, Integer> recipe = (Map<String, Integer>) breadMap.get("recipe");
                Bread bread = BreadFactory.createBread(breadType, recipe);
                breads.add(bread);
            }

            for (Bread bread : breads) {
                bread.print();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
