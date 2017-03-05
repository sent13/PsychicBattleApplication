package com.sent13.psychicbattleapplication.Entities2;

import com.sent13.psychicbattleapplication.Entities.Player;

/**
 * Created by sent13 on 2017/02/24.
 */

public class AttackEffect extends Effect{

    int power;  //威力

    public AttackEffect(String effectName,int timing,int duration,int power){
        super(effectName,timing,duration);
        this.power=power;
    }

    @Override
    public void exe(Player attacker,Player defender){
        System.out.println(defender.getName()+"に"+power+"のダメージ");
        defender.damage(power);
    }

    @Override
    public Effect copy() {
        Effect e=new AttackEffect(getEffectName(),getTiming(),getDuration(),power);
        return e;
    }
}
