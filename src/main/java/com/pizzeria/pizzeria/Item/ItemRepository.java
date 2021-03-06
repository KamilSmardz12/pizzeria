package com.pizzeria.pizzeria.Item;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ItemRepository extends CrudRepository<Item, Long> {
    Optional<Item> findByNameIgnoreCase(String replaceAll);
}
