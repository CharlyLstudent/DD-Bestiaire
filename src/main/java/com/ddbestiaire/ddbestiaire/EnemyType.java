package com.ddbestiaire.ddbestiaire;

public enum EnemyType {
    GOBELIN("Gobelin"),
    SORCIER("Sorcier"),
    DRAGON("Dragon");

    private final String displayName;

    EnemyType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
