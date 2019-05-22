package com.hu.bean;

import java.util.List;

public class Team {
    int id;
    String name;
    List<Player> PlayerList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayerList() {
        return PlayerList;
    }

    public void setPlayerList(List<Player> playerList) {
        PlayerList = playerList;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", PlayerList=" + PlayerList +
                '}';
    }
}
