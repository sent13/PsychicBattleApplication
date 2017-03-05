package com.sent13.psychicbattleapplication.Entities2;

import java.util.ArrayList;

/**
 * Created by sent13 on 2017/02/22.
 * 技クラス
 */

public class Waza extends Can{

    //効果が１つしかない場合
    public Waza(String name,int priority,Effect effect){
        super(name,priority,effect);
    }

    public Waza(String name,int priority,ArrayList<Effect> effects){
        super(name, priority, effects);
    }

}
