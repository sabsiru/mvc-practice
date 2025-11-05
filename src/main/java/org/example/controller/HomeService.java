package org.example.controller;


import org.example.annotation.Service;

@Service
public class HomeService {
    public String getWelcomeMessage() {
        return "Welcome to the Home Page!";
    }
}
