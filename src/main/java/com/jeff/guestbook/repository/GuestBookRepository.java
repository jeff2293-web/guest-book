package com.jeff.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeff.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
