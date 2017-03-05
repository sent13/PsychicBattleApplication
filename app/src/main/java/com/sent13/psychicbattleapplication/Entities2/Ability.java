package com.sent13.psychicbattleapplication.Entities2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by sent13 on 2017/02/22.
 * 能力クラス
 */

public enum  Ability {

    ELECTRO("電気", new ArrayList<Waza>(){{
                add(new Waza("電撃", Waza.NORMAL_PRIORITY,new AttackEffect("威力150",Effect.ATTACK_TIME,1,150)));
                add(new Waza("超電磁砲", Waza.NORMAL_PRIORITY,new AttackEffect("威力300",Effect.ATTACK_TIME,1,300)));}},
            new Skill("何もしない",new AttackEffect("威力0",Effect.BEGIN_GAME,1,0)));

    private String abilityName;         //能力名
    private List<Waza> wazas;      //この能力の技のリスト
    private List<Skill> skills;    //この能力のスキルのリスト

    //スキルが１つしかない場合
    Ability(String abilityName,ArrayList<Waza> wazas,Skill skill){
        this.abilityName=abilityName;
        this.wazas=wazas;
        this.skills=new ArrayList<>();
        skills.add(skill);
    }

    Ability(String abilityName,ArrayList<Waza> wazas,ArrayList<Skill> skills){
        this.abilityName=abilityName;
        this.wazas=wazas;
        this.skills=skills;
    }

    public String getAbilityName() {
        return abilityName;
    }

    public List<Waza> getWazas() {
        return Collections.unmodifiableList(wazas);
    }

    public List<Skill> getSkills() {
        return Collections.unmodifiableList(skills);
    }

    //要求された時コピーを渡す
    public Can getWaza(int i){
        if(wazas.size()>i){
            return wazas.get(i).copy();
        }else{
            return wazas.get(0).copy();
        }
    }

    public Can getSkill(int i){
        if(skills.size()>i){
            return skills.get(i).copy();
        }else{
            return skills.get(0).copy();
        }
    }

}
