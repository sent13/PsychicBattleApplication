package com.sent13.psychicbattleapplication.Entities2;

import java.util.ArrayList;

/**
 * Created by sent13 on 2017/02/22.
 * 技クラス
 */

public class Waza {
    public static final int NORMAL_PRIORITY=1;
    public static final int PRIORITY=2;
    public static final int MOST_PRIORITY=3;

    private String wazaName;        //技名
    private int priority;           //技の優先度
    private ArrayList<Effect> effects;  //技の効果のリスト

    public Waza(String wazaName,int priority,ArrayList<Effect> effects){
        this.wazaName=wazaName;
        this.priority=priority;
        this.effects=effects;
    }
}
