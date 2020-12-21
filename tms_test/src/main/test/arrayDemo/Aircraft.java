package arrayDemo;/*
 *ClassName:Aircraft
 *UserName:小阎王丷
 *CreateTime:2020/9/22 14:37
 */

public class Aircraft {
    private int state=100;//状态
    private int x;
    private int y;
    private int HP;//血量

    public Aircraft() {
    }

    public Aircraft(int state, int x, int y, int HP) {
        this.state = state;
        this.x = x;
        this.y = y;
        this.HP = HP;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "state=" + state +
                ", x=" + x +
                ", y=" + y +
                ", HP=" + HP +
                '}';
    }
}
