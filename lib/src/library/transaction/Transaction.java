/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.transaction;

/**
 *
 * @author venka
 */
import library.books.Book;
import library.members.Member;

public class Transaction {
    private Member member;
    private Book book;
    private String issueDate;
    private String dueDate;
    private boolean returned;

    public Transaction(Member member, Book book, String issueDate, String dueDate) {
        this.member = member;
        this.book = book;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returned = false;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }
     public String getIssueDate() {
        return issueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "Member: " + member.getName() + ", Book: " + book.getTitle() + ", Issue Date: " + issueDate + ", Due Date: " + dueDate + ", Returned: " + returned;
    }
}

