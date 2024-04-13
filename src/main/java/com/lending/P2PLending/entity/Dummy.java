package com.lending.P2PLending.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dummy")
@Data
public class Dummy {
    private Integer id;
    private String data;
}
