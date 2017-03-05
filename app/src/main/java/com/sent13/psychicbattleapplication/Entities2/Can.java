package com.sent13.psychicbattleapplication.Entities2;

import com.sent13.psychicbattleapplication.Entities.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sent13 on 2017/03/05.
 */

public class Can implements Cloneable{
    public static final int NORMAL_PRIORITY=1;
    public static final int PRIORITY=2;
    public static final int MOST_PRIORITY=3;

    private String name;        //名前
    private int priority;           //優先度(スキルの場合はデフォに）
    private List<Effect> effects;  //効果のリスト

    //効果が１つしかない場合
    public Can(String name,int priority,Effect effect){
        this.name=name;
        this.priority=priority;
        effects=new ArrayList<Effect>();
        effects.add(effect);
    }

    public Can(String name,int priority,List<Effect> effects){
        this.name=name;
        this.priority=priority;
        this.effects=effects;
    }

    public List<Effect> getEffects() {
        return effects;
    }

    public int getEffectsSize(){return effects.size();}

    public void delEffect(Effect effect){
        effects.remove(effect);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){return name;}

    public int getPriority() {
        return priority;
    }

    public Can copy(){
        List<Effect> ecopy=new ArrayList<>();
        for(Effect e:effects){
            ecopy.add(e.copy());
        }
        Can can=new Can(name,priority,ecopy);
        return can;
    }


}
