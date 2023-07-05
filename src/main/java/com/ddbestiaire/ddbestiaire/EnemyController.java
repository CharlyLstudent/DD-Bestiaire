package com.ddbestiaire.ddbestiaire;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnemyController {

    private EnemyRepository enemyRepository;
    private EnemiesConverter enemiesConverter;


    public EnemyController(EnemyRepository enemyRepository, EnemiesConverter enemiesConverter) {
        this.enemyRepository = enemyRepository;
        this.enemiesConverter = enemiesConverter;
        this.enemyRepository.save(new EnemyEntity((long) 1, "Plankton", EnemyType.GOBELIN, 2, 2));
        this.enemyRepository.save(new EnemyEntity((long) 2, "Venom", EnemyType.DRAGON, 6, 8));
        this.enemyRepository.save(new EnemyEntity((long) 3, "Voldemort", EnemyType.SORCIER, 4, 6));
    }

    @RequestMapping(value = "/enemies", method = RequestMethod.GET)
    public List<EnemyDTO> ennemies() {
        return this.enemiesConverter.fromEntityListToDTOList(
                this.enemiesConverter.convertIterableToList(
                        enemyRepository.findAll()));
    }
}
