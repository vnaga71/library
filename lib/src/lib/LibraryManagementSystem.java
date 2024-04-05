/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author venka
 */
public class LibraryManagementSystem {

    public static void main(String[] args) {
        library.books.Book book1 = new library.books.Book("Java Programming", "John Doe", "1234567890");
        library.members.Member member1 = new library.members.Member("M001", "Alice", "alice@example.com");
        library.transaction.Transaction transaction1 = new library.transaction.Transaction(member1, book1, "2024-04-10", "2024-05-10");
        System.out.println("Transaction Details:");
        System.out.println(transaction1);
    }
}
