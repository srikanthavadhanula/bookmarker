package com.learn.bookmarkerapi.service;

import com.learn.bookmarkerapi.domain.BookmarkDTO;
import com.learn.bookmarkerapi.domain.BookmarksDTO;
import com.learn.bookmarkerapi.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository repository;

    public BookmarksDTO getBookmarks(Integer page) {
        // since the page in the pagable starts with 0, we need to update that
        int pageNo = page < 0? 1 : page -1;
        Pageable pageable = (Pageable) PageRequest.of(pageNo,10, Sort.Direction.DESC,"createdAt");
        Page<BookmarkDTO> bookmarkPage = repository.findBy(pageable);
        return new BookmarksDTO(bookmarkPage);
    }
}
