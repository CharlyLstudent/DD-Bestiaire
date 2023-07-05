package com.ddbestiaire.ddbestiaire;

import jakarta.persistence.*;

@Entity(name = "enemy")
public class EnemyEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private EnemyType type;
    private int healthPoint;
    private int attack;

    public EnemyEntity(Long id, String name, EnemyType type, int healthPoint, int attack) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.healthPoint = healthPoint;
        this.attack = attack;
    }

    public EnemyEntity(Long id, String name, EnemyType type, int healthPoint) {
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public EnemyEntity() {

    }
}
