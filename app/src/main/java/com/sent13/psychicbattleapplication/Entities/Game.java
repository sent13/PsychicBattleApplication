package com.sent13.psychicbattleapplication.Entities;

import com.sent13.psychicbattleapplication.Entities2.AttackEffect;
import com.sent13.psychicbattleapplication.Entities2.Can;
import com.sent13.psychicbattleapplication.Entities2.Effect;
import com.sent13.psychicbattleapplication.Entities2.EffectAble;
import com.sent13.psychicbattleapplication.Entities2.Waza;
import com.sent13.psychicbattleapplication.Utils.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sent13 on 2017/02/24.
 */

public class Game {
    Player player;
    Enemy enemy;
    List<EffectAble> effectAbles;      //実行する効果のリスト

    Can pSelectWaza;
    Can eSelectWaza;

    public Game(){
        player=new Player(Util.InputStr("プレイヤー名を入力してください"));
        enemy=new Enemy("Enemy");
        initialize();
    }

    public void initialize(){

        effectAbles=new ArrayList<>();
        //プレイヤーのスキルをリストに加える処理
        //エネミーのスキルをリストに加える処理
    }

    //これを実行するだけ
    public void play(){
        execute(Effect.BEGIN_GAME);
        while(!isGameOver()) {
            System.out.println();
            show();

            pSelectWaza=player.selectWaza();
            setEffectAble(player,pSelectWaza);

            eSelectWaza=enemy.selectWaza();
            setEffectAble(enemy,eSelectWaza);

            execute(Effect.ATTACK_TIME);
            execute(Effect.END_TURN);
        }
    }

    public void setEffectAble(Player player, Can can){
        effectAbles.add(new EffectAble(player,can));
    }

    //技の優先度も考えた作りにする
    public void execute(int timing){
        if(isPlayerFirstAttack()) {
            trigger(player,enemy,timing);     //ゲーム開始能力の発動
            trigger(enemy,player,timing);
        }else{
            trigger(enemy,player,timing);
            trigger(player,enemy,timing);
        }
    }
    //発動タイミングとプレイヤーを渡し一致する効果を実行する
    public void trigger(Player player1,Player player2,int timing){
        List<EffectAble> delList=new ArrayList<>();
        for(EffectAble e:effectAbles){
            if(e.isSamePlayer(player1)){
                e.exe(player1,player2,timing);
                if(e.isDelete()) delList.add(e);
            }
        }

        for(EffectAble e:delList){
            effectAbles.remove(e);
        }
    }

    public boolean isGameOver(){
        if(player.getHp()>0 && enemy.getHp()>0){
            return false;
        }
        return true;
    }

    public boolean isPlayerFirstAttack(){
        if(pSelectWaza!=null && eSelectWaza!=null) {
            if (pSelectWaza.getPriority() > eSelectWaza.getPriority()) {
                return true;
            } else if (eSelectWaza.getPriority() > pSelectWaza.getPriority()) {
                return false;
            } else {
                return player.getSpeed() >= enemy.getSpeed();
            }
        }else{
            return player.getSpeed() >= enemy.getSpeed();
        }
    }

    public void show(){
        System.out.println(player+"\t"+enemy);
    }

    public static void main(String[] args){
        Game game=new Game();
        game.play();
    }
}
