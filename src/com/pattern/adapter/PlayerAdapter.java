package com.pattern.adapter;

/**
 * Created by Administrator on 2017/6/12.
 */
public class PlayerAdapter extends Play {
    public PlayerAdapter(String name, Player2 player) {
        super(name);
        this.player = player;
    }


    private Player2 player=new Player2("姚明");

    @Override
    public void attack() {
        player.cattack();
    }

    @Override
    public void defense() {
        player.cDefense();
    }
}
