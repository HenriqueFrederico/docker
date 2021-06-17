package com.example.docker.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 7591279533401801918L;

    @EqualsAndHashCode.Include
    private String id;
    private String nome;
    private Integer idade;
    private Integer idadeMental;
}
