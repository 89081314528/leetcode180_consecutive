package ru.julia.leetcode180_consecutive.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "numbers")
public class Num {
    @Column(name = "id")
    @Id
    Long id;
    @Column(name = "number")
    Integer number;

    public Long getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public Num(Long id, Integer number) {
        this.id = id;
        this.number = number;
    }

    public Num() {
    }
}
