package com.ferrianwebsterdictionary.app.demo.controller;

import com.ferrianwebsterdictionary.app.demo.dto.TranslationRequestDto;
import com.ferrianwebsterdictionary.app.demo.dto.TranslationResponseDto;
import com.ferrianwebsterdictionary.app.demo.service.TranslationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/translate")
public class TranslationController {

    private final TranslationService translationService;


    public TranslationController(TranslationService translationService) {
        this.translationService = translationService;
    }

    @GetMapping("/word")
    public TranslationResponseDto getTranslation(@RequestBody TranslationRequestDto translationRequestDto) {
        return translationService.translate(translationRequestDto);
    }
}
