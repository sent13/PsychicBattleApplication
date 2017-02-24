package com.sent13.psychicbattleapplication.Entities;

import com.sent13.psychicbattleapplication.Entities2.Effect;

import java.util.ArrayList;

/**
 * Created by sent13 on 2017/02/24.
 */

public class Game {
    Player player;
    //Enemy enemy;
    ArrayList<Effect> beginGame;
    ArrayList<Effect> beginTurn;
    ArrayList<Effect> firstAttack;
    ArrayList<Effect> secondAttack;
    ArrayList<Effect> endTurn;

    public void initialize(){

    }

    public void play(){
     // trigger(biginGame);     ゲーム開始能力の発動
     /*while(!isGameOver()){
        selectWaza();

        trigger(firstAttack);
        trigger(secondAttack);
        trigger(endTurn);

         */
    }
}
