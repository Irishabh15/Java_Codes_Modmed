import java.util.*;

import java.util.*;
interface ISaveable {
    List<String> write();
    void read(List<String> list);
}


public class Player implements ISaveable{
    private String name, weapon;
    private int hitPoints, strength;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName(){
        return name;
    }

    public String getWeapon(){
        return weapon;
    }

    public int getHitPoints(){
        return hitPoints;
    }

    public int getStrength(){
        return strength;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setWeapon(String weapon){
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public List<String> write(){
        List<String> ls = new ArrayList<>();
        ls.add(0, name);
        ls.add(1, ""+hitPoints);
        ls.add(2, ""+strength);
        ls.add(3, weapon);

        return ls;
    }

    public void read(List<String> ls){
        if(ls!=null && ls.size()>0){
            this.name = ls.get(0);
            this.hitPoints = Integer.parseInt(ls.get(1));
            this.strength = Integer.parseInt(ls.get(2));
            this.weapon = ls.get(3);
        }
    }

    public String toString(){
        return ("Player{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+", weapon='"+this.weapon+"'}");
    }
}

class Monster implements ISaveable{
    private String name;
    private int hitPoints, strength;

    public Monster(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName(){
        return name;
    }

    public int getHitPoints(){
        return hitPoints;
    }

    public int getStrength(){
        return strength;
    }

    public List<String> write(){
        List<String> ls = new ArrayList<>();
        ls.add(0, name);
        ls.add(1, ""+hitPoints);
        ls.add(2, ""+strength);

        return ls;
    }

    public void read(List<String> ls){
        if(ls!=null && ls.size()>0){
            this.name = ls.get(0);
            this.hitPoints = Integer.parseInt(ls.get(1));
            this.strength = Integer.parseInt(ls.get(2));
        }
    }

    public String toString(){
        return ("Monster{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+"}");
    }
}