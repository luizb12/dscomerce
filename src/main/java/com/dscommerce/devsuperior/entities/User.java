package com.dscommerce.devsuperior.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String password;

     @OneToMany(mappedBy = "client")
    private List <Order> orders = new ArrayList<>();

    public User (){
    }

    public User(String phone, Long id, String name, String email, LocalDate borthDate, String password) {
        this.phone = phone;
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = borthDate;
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
