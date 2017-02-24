package com.sent13.psychicbattleapplication.Entities2;

import java.util.ArrayList;

/**
 * Created by sent13 on 2017/02/22.
 * スキルクラス
 */

public class Skill {
    private String skillName;       //スキル名
    private ArrayList<Effect> effects;  //スキルの効果のリスト

    public Skill(String skillName,ArrayList<Effect> effects){
        this.skillName=skillName;
        this.effects=effects;
    }
}
