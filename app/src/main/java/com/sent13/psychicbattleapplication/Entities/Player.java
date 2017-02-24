package com.sent13.psychicbattleapplication.Entities;

import com.sent13.psychicbattleapplication.Entities2.Ability;
import com.sent13.psychicbattleapplication.Entities2.Effect;
import com.sent13.psychicbattleapplication.Entities2.Skill;

import java.util.ArrayList;

/**
 * Created by sent13 on 2017/02/22.
 */

public class Player {
    public static final int MAX_HP=1000;
    public static final double DEFAULT_ATTACK=1.00;
    public static final double DEFAULT_DEFENCE=1.00;

    private String name;            //プレイヤーの名前
    private int hp;                 //プレイヤーのHP
    private double attack;             //プレイヤーの攻撃力
    private double defence;            //プレイヤーの守備力

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

        Skill skill=new Skill("攻撃３０％UP",new ArrayList<Effect>(new Effect("攻撃力３０％UP",Effect.BEGIN_GAME)));
        ability=new Ability("電気");
    }

    /*public static void main(String[] args){
        System.out.println("Hello World");
    }*/

}
