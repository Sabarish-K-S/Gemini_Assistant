package com.example.Backend.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.stereotype.Service;

@Service
public class GeminiAPIService {

    public String makeGeminiAPIRequest(String question) {
        Client client = new Client();
        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        question,
                        null);
        return response.text();
    }
}
