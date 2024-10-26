package com.devsuperior.desafio_CRUD.dto.client;

import com.devsuperior.desafio_CRUD.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {

    private long id;
    @Size(min = 3, max = 80, message = "Dever ter no minimo 3 caracateres")
    @NotBlank(message = "Nome Requerido")
    private String name;
    private String cpf;
    @Positive(message = "O valor não pode ser negativo")
    private Double income;
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO(){}

    public ClientDTO(long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entities) {
        id = entities.getId();
        name = entities.getName();
        cpf = entities.getCpf();
        income = entities.getIncome();
        birthDate = entities.getBirthDate();
        children = entities.getChildren();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
