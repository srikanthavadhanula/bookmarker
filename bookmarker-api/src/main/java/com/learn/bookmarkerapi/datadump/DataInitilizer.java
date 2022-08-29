package com.learn.bookmarkerapi.datadump;

import com.learn.bookmarkerapi.domain.Bookmark;
import com.learn.bookmarkerapi.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitilizer implements CommandLineRunner{

    private final BookmarkRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Bookmark(null,"Srikanth1","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth2","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth3","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth4","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth5","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth6","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth7","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth8","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth9","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth10","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth11","saisrikanthavadhanula.com", Instant.now()));
        repo.save(new Bookmark(null,"Srikanth12","saisrikanthavadhanula.com", Instant.now()));
    }
}
