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
public class Arrow extends BasicWeapon implements Weapon {

    //super class is BasicWeapon
    public Arrow() {
        super(70);
    }

    //override Weapon class
    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        //ignoring 5 points of the armor 
        
        armor-=5;
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

    
}
