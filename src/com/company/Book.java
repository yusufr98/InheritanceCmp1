package com.company;

public final class Book extends Product {

    private String author;
    private int pages;

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}