package com.sent13.psychicbattleapplication.Entities;

import com.sent13.psychicbattleapplication.Entities2.Ability;
import com.sent13.psychicbattleapplication.Entities2.Can;
import com.sent13.psychicbattleapplication.Entities2.Effect;
import com.sent13.psychicbattleapplication.Entities2.Skill;
import com.sent13.psychicbattleapplication.Entities2.Waza;
import com.sent13.psychicbattleapplication.Utils.Util;

import java.util.ArrayList;

/**
 * Created by sent13 on 2017/02/22.
 */

public class Player {
    public static final int MAX_HP=1000;
    public static final double DEFAULT_ATTACK=1.00;
    public static final double DEFAULT_DEFENCE=1.00;
    public static final int DEFAULT_SPEED=100;

    private String name;            //プレイヤーの名前
    private int hp;                 //プレイヤーのHP

    private double attack;             //プレイヤーの攻撃力

    private double defence;            //プレイヤーの守備力
    private int speed;                  //プレイヤーの素早さ

    private Ability ability;        //プレイヤーの能力

    private Skill skill;            //ランダムで割り当てられる１つのスキル

    public Player(String name){
        this.name=name;
        initialize();
    }

    public void initialize(){
        hp=MAX_HP;
        attack=DEFAULT_ATTACK;
        defence=DEFAULT_DEFENCE;
        ability=Ability.ELECTRO;
    }

    //標準入力から数字を受け取り技を返す
    public Can selectWaza(){
        StringBuilder stringBuilder=new StringBuilder("技を選択:");
        int count=0;
        for(Waza waza:ability.getWazas()){
            stringBuilder.append(" "+waza.getName()+"("+(count++)+")");
        }
        int n=Util.InputInt(stringBuilder.toString());

        if(ability.getWazas().size()>n){
            return ability.getWaza(n);
        }else{
            return ability.getWaza(0);
        }
    }

    public double getAttack() {
        return attack;
    }

    public double getDefence() {
        return defence;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    //要求された時コピーを渡す
    public Can getSkill() {
        return skill.copy();
    }

    public int getSpeed() {
        return speed;
    }

    public Ability getAbility() {
        return ability;
    }

    public int damage(int damage){
        if(hp<damage){
            int a=damage-hp;
            hp=0;
            return a;
        }
        hp-=damage;
        return damage;
    }


    public String toString(){
        return name+":"+hp;
    }
}
