package org.example.unicode.config;
import jakarta.annotation.PostConstruct;
import org.example.unicode.model.UniCode;
import org.example.unicode.repository.UniCodeRepository;
import org.springframework.stereotype.Component;
import java.util.Set;

@Component
public class InitData {

        private final UniCodeRepository unicodeRepository;

        public InitData(UniCodeRepository unicodeRepository) {
            this.unicodeRepository = unicodeRepository;
        }

        // 6: Gem Unicode-bogstaver automatisk i databasen
        @PostConstruct
        public void init() {
            Set<Character> characters = Set.of('A', 'B', 'C', 'Æ', 'Ø', 'Å');

            for (char c : characters) {
                UniCode unicode = new UniCode();
                unicode.setUnicode((int) c);
                unicode.setBogstav(c);
                unicode.setDescription("Dette er karakteren: " + c);

                unicodeRepository.save(unicode);
            }
        }
    }
