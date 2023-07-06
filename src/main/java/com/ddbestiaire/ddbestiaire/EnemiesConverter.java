package com.ddbestiaire.ddbestiaire;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class EnemiesConverter {
    public EnemyDTO toDTO(Enemy Enemy) {
        return new EnemyDTO(Enemy.getName(), Enemy.getType(), Enemy.getHealthPoint());
    }

    public Enemy toService(EnemyDTO EnemyDTO) {
        return new Enemy(
                EnemyDTO.getName(),
                EnemyDTO.getType(),
                EnemyDTO.getHealthPoint());
    }

    public Enemy toService(EnemyEntity EnemyEntity) {
        return new Enemy(
                EnemyEntity.getId(),
                EnemyEntity.getName(),
                EnemyEntity.getType(),
                EnemyEntity.getHealthPoint());
    }

    public EnemyEntity toEntity(Enemy Enemy) {
        return new EnemyEntity(
                Enemy.getId(),
                Enemy.getName(),
                Enemy.getType(),
                Enemy.getHealthPoint());
    }

    public EnemyEntity toEntity(EnemyDTO EnemyDTO) {
        return this.toEntity(this.toService(EnemyDTO));
    }

    public EnemyDTO toDTO(EnemyEntity EnemyEntity) {
        return this.toDTO(this.toService(EnemyEntity));
    }
}
