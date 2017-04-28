
package com.registration.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 7790622876833971743L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid", unique = true, nullable = false)
    private Integer userid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleid", nullable = false)
    private Role role;

    @Column(name = "username", nullable = false, length = 45)
    private String username;

    @Column(name = "password", nullable = false, length = 45)
    private String password;

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @Column(name = "firstName", length = 45)
    private String firstName;

    @Column(name = "lastName", length = 45)
    private String lastName;

    @Column(name = "phone", length = 45)
    private String phone;

    @Column(name = "isactive")
    private String isactive;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "regdate", length = 19)
    private Date regdate;

    @Column(name = "isnonexpired")
    private String isnonexpired;

    @Column(name = "isnonlocked")
    private String isnonlocked;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expDate", length = 19)
    private Date expDate;

    public User() {
    }


    public User(Role role, String username, String password, String email) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(Role role, String username, String password, String email, String firstName, String lastName, String phone, String isactive, Date regdate, String isnonexpired, String isnonlocked, Date expDate) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.isactive = isactive;
        this.regdate = regdate;
        this.isnonexpired = isnonexpired;
        this.isnonlocked = isnonlocked;
        this.expDate = expDate;
    }


}
