package com.sent13.psychicbattleapplication.Entities2;

import java.util.ArrayList;

/**
 * Created by sent13 on 2017/02/22.
 * スキルクラス
 */

public class Skill extends Can{

    //効果が１つしかない場合
    public Skill(String name,Effect effect){
        super(name,Can.PRIORITY,effect);
    }

    public Skill(String name,ArrayList<Effect> effects){
        super(name,Can.PRIORITY,effects);
    }

}
