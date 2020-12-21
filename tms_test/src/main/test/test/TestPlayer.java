package test;/*
 *ClassName:TestPlayer
 *UserName:小阎王丷
 *CreateTime:2020/10/22 14:41
 */

import dao.Player;
import dao.Team;

import java.util.ArrayList;

public class TestPlayer {
    public static void main(String[] args) {
        ArrayList<Player> p=new ArrayList<>();
        p.add(new Player(1,1,2.15));
        p.add(new Player(2,2,2.01));
        p.add(new Player(3,3,1.89));
        p.add(new Player(4,4,1.95));
        p.add(new Player(5,2,2.10));
        p.add(new Player(6,4,1.79));
        ArrayList<Team> t=new ArrayList<>();
        t.add(new Team(1,"A"));
        t.add(new Team(2,"B"));
        t.add(new Team(3,"C"));
        t.add(new Team(4,"D"));
        int count=0;
        for (int i = 0; i <t.size() ; i++) {
            for (int j = 0; j <p.size() ; j++) {
                if (t.get(i).getTeam_id()==p.get(j).getTeam_id()){
                     if (p.get(j).getHeight()>1.9){
                         count++;
                     }
                }
            }
            System.out.println(t.get(i).getTeam_name()+"球队身高大于2的球员有"+count);
            count=0;
        }
    }
}
