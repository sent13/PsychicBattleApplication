package com.sent13.psychicbattleapplication.Entities2;

import com.sent13.psychicbattleapplication.Entities.Player;

/**
 * Created by sent13 on 2017/02/22.
 * 効果クラス
 */

public abstract class Effect {

    /* 発動タイミング */
    public static final int BEGIN_GAME=1;
    public static final int BEGIN_TURN=2;
    public static final int FIRST_ATTACK=3;
    public static final int SECOND_ATTACK=4;
    public static final int END_TURN=5;



    private String effectName;      //効果名
    private int timing;             //発動のタイミング
    private int time;               //効果の持続時間

    public Effect(String effectName,int timing){
        this.effectName=effectName;
        this.timing=timing;
    }

    public abstract void run(Player p1, Player p2);     //効果の内容、継承先による

}
