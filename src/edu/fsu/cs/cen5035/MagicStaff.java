/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_se;

/**
 *
 * @author Home
 */
public class MagicStaff extends BasicWeapon implements Weapon {

    //super class is BasicWeapon
    public MagicStaff() {
        super(80);
    }

    //override Weapon class
    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        
        //Damage = 80. It ignores 20% of the armor.
        armor = (int)(armor * .2);
        //System.out.println(armor);
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}