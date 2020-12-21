package List;/*
 *ClassName:Cart1
 *UserName:小阎王丷
 *CreateTime:2020/10/19 10:25
 */

public class Cart1 {
    private String flower;
    private String face;

    public Cart1(String face) {
        this.face = face;
    }

    public Cart1(String flower, String face) {
        this.flower = flower;
        this.face = face;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "flower='" + flower + '\'' +
                ", face='" + face + '\'' +
                '}';
    }
}
