package com.willsmithte.NotManyBooks.model;

import com.willsmithte.NotManyBooks.util.BookNotFoundException;

import java.util.HashMap;

/**
 * Created by Will Smith on 15/3/19.
 */
public class BookHolding extends HashMap<Integer, Integer> {

    public BookHolding(int bookId, int quantity) {
        this.put(bookId, quantity);
    }

    public int increment(Integer bookId) throws BookNotFoundException {
        Integer maybeQuantity = this.get(bookId);
        if (maybeQuantity == null) {
            throw new BookNotFoundException("Failed to increment book of id -" + bookId + "- book not found on user");
        } else {
            this.put(bookId, ++maybeQuantity);
            return maybeQuantity;
        }
    }
}
