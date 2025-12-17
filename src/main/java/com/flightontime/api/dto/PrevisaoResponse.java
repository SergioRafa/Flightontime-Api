package com.flightontime.api.dto;

import lombok.Data;

@Data
public class PrevisaoResponse {

    private String previsao; // Ex: "Atrasado" ou "Pontual"
    private Double probabilidade; // Ex: 0.78
}