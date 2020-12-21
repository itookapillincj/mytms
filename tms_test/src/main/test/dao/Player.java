package dao;/*
 *ClassName:Player
 *UserName:小阎王丷
 *CreateTime:2020/10/22 14:38
 */

public class Player {
    private int play_id;
    private int team_id;
    private double height;

    public Player(int play_id, int team_id, double height) {
        this.play_id = play_id;
        this.team_id = team_id;
        this.height = height;
    }

    public int getPlay_id() {
        return play_id;
    }

    public void setPlay_id(int play_id) {
        this.play_id = play_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Player{" +
                "play_id=" + play_id +
                ", team_id=" + team_id +
                ", height=" + height +
                '}';
    }
}
