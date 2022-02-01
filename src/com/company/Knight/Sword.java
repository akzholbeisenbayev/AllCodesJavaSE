package com.company.Knight;

public class Sword extends Ammunition {

    private int damage;
    private int dmgRange;

    //конструктор
    public Sword(int damage, int dmgRange, int cost, double weight) {
        super(cost, weight);
        this.damage = damage;
        this.dmgRange = dmgRange;
    }

    //выводит информацию(атрибуты этого класса) на консоль
    @Override
    public String toString() {
        return "Sword{" +
                "damage=" + damage +
                ", dmgRange=" + dmgRange + " " + super.toString();
    }

    //сеттеры
    public void setDamage(int damage) throws Exception {
        if (damage < 0) {
            throw new Exception("Damage can't be less than 0!");
        }
        this.damage = damage;
    }

    public void setDmgRange(int dmgRange) throws Exception {
        if (damage < 0) {
            throw new Exception("Damage can't be less than 0!");
        }
        this.dmgRange = dmgRange;
    }

    //геттеры
    public int getDamage() {
        return damage;
    }

    public int getDmgRange() {
        return dmgRange;
    }


}
