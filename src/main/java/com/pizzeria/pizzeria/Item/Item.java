package com.pizzeria.pizzeria.Item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private String name;
    private String shortDescription;
    @Column(length = 1024)
    private String description;
    private String imgUrl;
}