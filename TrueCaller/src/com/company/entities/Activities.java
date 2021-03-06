package com.company.entities;

import lombok.Getter;

@Getter
public enum Activities {
    CALL("CALL"),
    ADD("ADD"),
    SEARCH("SEARCH");

    private final String activity;

    Activities(String activity) {
        this.activity = activity;
    }
}
