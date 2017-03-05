package com.sent13.psychicbattleapplication.Entities2;

import com.sent13.psychicbattleapplication.Entities.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sent13 on 2017/02/26.
 */

public class EffectAble {
    Player player;      //効果の持ち主
    Can can;      //発動する効果

    public EffectAble(Player player,Can can){
        this.player=player;
        this.can=can;
    }

    public Can getCan(){
        return can;
    }

    public Player getPlayer(){
        return player;
    }

    public boolean isSamePlayer(Player p){
        return p==player;
    }

    public boolean isDelete(){
        if(can.getEffectsSize()>0){
            return false;
        }else{
            return true;
        }
    }

    public void exe(Player player1,Player player2,int timing){
        List<Effect> delEffect=new ArrayList<>();

        for(Effect effect:can.getEffects()){
            if(effect.isSameTiming(timing)){
                System.out.println(player.getName()+"の"+can+"!");
                effect.run(player1,player2);
                if(effect.isDelete()) delEffect.add(effect);
            }
        }

        for(Effect effect:delEffect){
            can.delEffect(effect);
        }
    }
}
