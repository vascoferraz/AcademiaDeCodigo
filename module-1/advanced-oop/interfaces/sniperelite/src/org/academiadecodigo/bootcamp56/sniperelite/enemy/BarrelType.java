package org.academiadecodigo.bootcamp56.sniperelite.enemy;

public enum BarrelType {

    PLASTIC (50),
    WOOD (75),
    METAL (100);

    private int maxDamage;
    
    BarrelType(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage(){
        return maxDamage;
    }

}
