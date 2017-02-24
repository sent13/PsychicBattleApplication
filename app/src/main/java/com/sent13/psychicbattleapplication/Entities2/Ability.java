package com.sent13.psychicbattleapplication.Entities2;

import com.sent13.psychicbattleapplication.Entities2.Skill;
import com.sent13.psychicbattleapplication.Entities2.Waza;

import java.util.ArrayList;

/**
 * Created by sent13 on 2017/02/22.
 * 能力クラス
 */

public class Ability {

    private String abilityName;         //能力名
    private ArrayList<Waza> wazas;      //この能力の技のリスト
    private ArrayList<Skill> skills;    //この能力のスキルのリスト

    public Ability(String abilityName,ArrayList<Waza> wazas,ArrayList<Skill> skills){
        this.abilityName=abilityName;
        this.wazas=wazas;
        this.skills=skills;
    }

}
