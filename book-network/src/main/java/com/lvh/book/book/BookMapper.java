package com.lvh.book.book;

public class BookMapper {
    public Book toBook(BookRequest request) {
        return Book.builder().id(request.id())
                .title(request.title())
                .authorName(request.authorName())
                .synopsis(request.synopsis())
                .archived(false)
                .shareable(request.shareable())
                .build();

    }
}
