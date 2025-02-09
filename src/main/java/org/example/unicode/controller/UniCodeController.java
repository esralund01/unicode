package org.example.unicode.controller;

import org.example.unicode.model.UniCode;
import org.example.unicode.repository.UniCodeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/unicode")
public class UniCodeController {

    private final UniCodeRepository unicodeRepository;

    public UniCodeController(UniCodeRepository unicodeRepository) {
        this.unicodeRepository = unicodeRepository;
    }

    // 2: Konverter Unicode til karakter
    @GetMapping("/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char) i;
        return "unicode=" + i + " char=" + c;
    }

    // 3: Konverter karakter til Unicode
    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {
        int unicode = (int) c;
        return "char=" + c + " unicode=" + unicode;
    }

    // Ekstra: Hent gemte Unicode-tegn fra databasen
    @GetMapping("/all")
    public List<UniCode> getAllUnicodeCharacters() {
        return unicodeRepository.findAll();
    }
}
