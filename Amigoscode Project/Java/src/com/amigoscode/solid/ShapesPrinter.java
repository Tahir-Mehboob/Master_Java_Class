package com.amigoscode.solid;

import java.util.List;

public class ShapesPrinter {

    public String json(int sum){
        return "{Sum in JSON : %s}".formatted(sum);
    }

    public String csv(int sum){
        return "Sum in CSV , %s".formatted(sum);
    }

}
