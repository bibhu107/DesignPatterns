package com.company.entities;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;

@Data
@Builder
@RequiredArgsConstructor
public class User  {
    String userName;
    String number;
    HashMap<String, String> contactList;
}
