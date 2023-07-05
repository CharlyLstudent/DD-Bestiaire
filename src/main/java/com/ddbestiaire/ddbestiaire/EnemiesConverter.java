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

    public List<EnemyEntity> toEntityList(List<Enemy> HeroList) {
        List<EnemyEntity> list = new ArrayList<>();
        for (Enemy Enemy : HeroList) {
            list.add(this.toEntity(Enemy));
        }
        return list;
    }

    public List<Enemy> fromEntityListToServiceList(List<EnemyEntity> HeroList) {
        List<Enemy> list = new ArrayList<>();
        for (EnemyEntity EnemyEntity : HeroList) {
            list.add(this.toService(EnemyEntity));
        }
        return list;
    }

    public List<Enemy> fromDTOListToServiceList(List<EnemyDTO> HeroList) {
        List<Enemy> list = new ArrayList<>();
        for (EnemyDTO EnemyDTO : HeroList) {
            list.add(this.toService(EnemyDTO));
        }
        return list;
    }

    public List<EnemyDTO> toDTOList(List<Enemy> HeroList) {
        List<EnemyDTO> list = new ArrayList<>();
        for (Enemy Enemy : HeroList) {
            list.add(this.toDTO(Enemy));
        }
        return list;
    }

    public List<EnemyDTO> fromEntityListToDTOList(List<EnemyEntity> entityList) {
        return this.toDTOList(this.fromEntityListToServiceList(entityList));
    }

    public List<EnemyEntity> fromDTOListToEntityList(List<EnemyDTO> dtoList) {
        return this.toEntityList(this.fromDTOListToServiceList(dtoList));
    }

    public <T> List<T> convertIterableToList(Iterable<T> iterable) {
        List<T> list = new ArrayList<>();
        iterable.forEach(list::add);
        return list;
    }
}
