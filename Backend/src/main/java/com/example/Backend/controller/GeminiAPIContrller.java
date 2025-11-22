package com.example.Backend.controller;

import com.example.Backend.dto.Prompt;
import com.example.Backend.service.GeminiAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class GeminiAPIContrller{

    @Autowired
    private GeminiAPIService geminiService;

    @PostMapping("/ask")
    public String APIRequest(@RequestBody Prompt prompt) {
        return geminiService.makeGeminiAPIRequest(prompt.question);
    }
}
