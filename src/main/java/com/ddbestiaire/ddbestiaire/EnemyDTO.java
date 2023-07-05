package com.ddbestiaire.ddbestiaire;

public class EnemyDTO {
    private String name;
    private EnemyType type;
    private int healthPoint;

    public EnemyDTO(){

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

    public EnemyDTO(String name, EnemyType type, int healthPoint){
        this.name = name;
        this.type = type;
        this.healthPoint = healthPoint;
    }
}
