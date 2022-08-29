package com.learn.bookmarkerapi.repository;

import com.learn.bookmarkerapi.domain.Bookmark;
import com.learn.bookmarkerapi.domain.BookmarkDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    @Query("""
            select new com.learn.bookmarkerapi.domain.BookmarkDTO(b.id, b.title, b.url, b.createdAt) from Bookmark b
            """)
    Page<BookmarkDTO> findBy(Pageable pageable);
}
