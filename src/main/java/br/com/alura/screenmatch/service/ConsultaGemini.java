package br.com.alura.screenmatch.service;

import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
public class ConsultaGemini {
    private static String apiKey = System.getenv("API_KEY_GOOGLE_AI_STUDIO");

    public static String obterTraducao(String texto) {
        GoogleAiGeminiChatModel model = GoogleAiGeminiChatModel.builder()
                .apiKey(apiKey)
                .modelName("gemini-2.5-flash")
                .temperature(0.7)
                .build();

        String prompt = "Traduza para o português o seguinte texto: " + texto + " /// OBS: não ultrapase os 1000 caracteres";

        return model.chat(prompt).trim();
    }
}