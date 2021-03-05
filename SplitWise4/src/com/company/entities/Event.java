package com.company.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Event {
    String giver;
    String receiver;
    Double amount;

}
