package org.example.unicode.repository;
import org.example.unicode.model.UniCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UniCodeRepository extends JpaRepository<UniCode, Long> {

    }

