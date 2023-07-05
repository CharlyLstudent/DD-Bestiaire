package com.ddbestiaire.ddbestiaire;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


public class Enemy {

    private Long id;
    private String name;
    private EnemyType type;
    private int healthPoint;

    public Enemy(Long id, String name, EnemyType type, int healthPoint) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.healthPoint = healthPoint;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnemyType getType() {
        return type;
    }

    public void setType(EnemyType type) {
        this.type = type;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Enemy(String name, EnemyType type, int healthPoint){
        this.name = name;
        this.type = type;
        this.healthPoint = healthPoint;
    }
    public Enemy(){

    }
}
