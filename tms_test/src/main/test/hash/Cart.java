package hash;/*
 *ClassName:Cart
 *UserName:小阎王丷
 *CreateTime:2020/10/16 11:13
 */

public class Cart {
    private String flower;
    private String face;

    public Cart(String face) {
        this.face = face;
    }

    public Cart(String flower, String face) {
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
