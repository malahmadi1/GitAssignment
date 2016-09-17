/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_se;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        //creating a new object type sword,
        //the sword class will call BasicWeapon and pass 50 for a damage 
        
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        //hit will have 50-30 = 20 
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with "+armor+ " points.");
   
       
      
         Weapon arrow = WeaponFactory.getWeapon("arrow");
         
         System.out.println("Arrow has " + arrow.hit() + " of damage.");
         System.out.println("Arrow was able to do " + arrow.hit(armor) + " of damage due to an armor with "+armor+ " points, ignoring 5 of them.");
   
         //damage 60
          Weapon axe = WeaponFactory.getWeapon("axe");
          System.out.println("Axe has " + axe.hit() + " of damage.");
          System.out.println("Axe was able to do " + axe.hit(armor) + " of damage due to an armor with "+armor+ " points, ignoring armor points if it's greater than 0 and less than 20 ");
   
          //damage 80
          Weapon magic = WeaponFactory.getWeapon("magicstaff");
         System.out.println("MagicStaff has " + magic.hit() + " of damage.");
        System.out.println("MagicStaff was able to do " + magic.hit(armor) + " of damage due to an armor with "+armor+ " points, ignoring 20% of armor points");
   
    }
}
