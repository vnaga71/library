/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.members;

/**
 *
 * @author venka
 */

public class Member {
    private String memberId;
    private String name;
    private String email;

    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
        @Override
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name + ", Email: " + email;
    }
}
