package com.nostresswithles.turbofanapi.models;

import javax.persistence.*;

@Entity
@Table(name="rul_fd001")
public class RUL {

    private long id;
    private Integer cycle;


    public RUL(){}

    public RUL(long id, Integer cycle){
        this.id = id;
        this.cycle = cycle;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "cycle", nullable = false)
    public Integer cycle() {
        return cycle;
    }
}
