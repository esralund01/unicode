package org.example.unicode.config;
import org.example.unicode.repository.UniCodeRepository;
import org.springframework.stereotype.Component;

@Component
public class InitData {

        private final UniCodeRepository unicodeRepository;

        public InitData(UniCodeRepository unicodeRepository) {
            this.unicodeRepository = unicodeRepository;
        }

        // 6: Gem Unicode-bogstaver automatisk i databasen

    }
