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
public class Axe extends BasicWeapon implements Weapon {

    //super class is BasicWeapon
    public Axe() {
        super(60);
    }

    //override Weapon class
    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        
        int damage = DAMAGE - armor;
//        If armor is greater than 0 and less than 20, the axe will ignore
//all the armor points.
        if ( armor > 0 && armor < 20){
       //armor wont be counted 
       damage = DAMAGE + armor;
        }
        if (damage < 0) {
            return 0;
        }
        
       
        return damage;
    }
}
    

