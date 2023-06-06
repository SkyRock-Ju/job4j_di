package ru.job4j.di.service;

import org.springframework.stereotype.Component;
import ru.job4j.di.repository.Store;

@Component
public class StartUI {

    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}