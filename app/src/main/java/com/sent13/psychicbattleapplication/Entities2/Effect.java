package com.sent13.psychicbattleapplication.Entities2;

import com.sent13.psychicbattleapplication.Entities.Player;

/**
 * Created by sent13 on 2017/02/22.
 * 効果クラス
 */

public abstract class Effect{

    /* 発動タイミング */
    public static final int BEGIN_GAME=1;
    public static final int BEGIN_TURN=2;
    public static final int ATTACK_TIME=3;
    public static final int END_TURN=4;




    private String effectName;      //効果名

    private int timing;             //発動のタイミング

    private int duration;               //効果の持続時間
    
    public Effect(String effectName,int timing,int duration){
        this.effectName=effectName;
        this.timing=timing;
        this.duration=duration;
    }

    public int getTiming() {
        return timing;
    }

    public int getDuration() {
        return duration;
    }

    public String getEffectName() {
        return effectName;
    }

    public boolean isSameTiming(int timing){
        return this.timing==timing;
    }

    public boolean isDelete(){
        if(duration==0){
            return true;
        }else{
            return false;
        }
    }

    public void run(Player player1,Player player2){
        minusDuration();
        exe(player1,player2);
    }

    public abstract void exe(Player player1,Player player2);   //効果の内容、継承先による,引数は影響を及ぼされるプレイヤー

    public abstract Effect copy();

    public void minusDuration(){
        duration-=1;
    }


}
