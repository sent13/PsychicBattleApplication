package com.sent13.psychicbattleapplication.Entities2;

import com.sent13.psychicbattleapplication.Entities.Player;

/**
 * Created by sent13 on 2017/02/25.
 */

public class ChangeEffect extends Effect {

    public static final int ATTACK=1;
    public static final int DEFENCE=2;
    public static final int SPEED=3;

    public static final int UP=4;
    public static final int DOWN=5;

    private int parameter;
    private int updown;

    public ChangeEffect(String effectName, int timing,int duration,int parameter,int updown){
        super(effectName,timing,duration);
        this.parameter=parameter;
        this.updown=updown;
    }

    @Override
    public void exe(Player player1,Player player2){

    }

    @Override
    public Effect copy(){
        Effect e=new ChangeEffect(getEffectName(),getTiming(),getDuration(),parameter,updown);
        return e;
    }
}
