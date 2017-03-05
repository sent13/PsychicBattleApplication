package com.sent13.psychicbattleapplication.Entities;

import com.sent13.psychicbattleapplication.Entities2.Ability;
import com.sent13.psychicbattleapplication.Entities2.Can;

import java.util.Random;

/**
 * Created by sent13 on 2017/02/24.
 */

public class Enemy extends Player {

    public Enemy(String name){
        super(name);
    }

    @Override
    public Can selectWaza(){
        Ability ability=getAbility();
        int size=ability.getWazas().size();
        Random random=new Random();
        return ability.getWaza(random.nextInt(size));
    }

}
