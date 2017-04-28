
package com.registration.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = 7406695508037970942L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleid", unique = true, nullable = false)
    private Integer roleid;

    @Column(name = "rolename", nullable = false, length = 45)
    private String rolename;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
    private Set<User> users = new HashSet<User>(0);

    public Role() {
    }

    public Role(String rolename, int userid) {
        this.rolename = rolename;
    }

    public Role(String rolename, int userid, String email, Date expDate, String firstName, Boolean isactive, Boolean isnonexpired, Boolean isnonlocked, String lastName, String password, String phone, Date regdate, String username, Set<User> users) {
        this.rolename = rolename;
        this.users = users;
    }


}
