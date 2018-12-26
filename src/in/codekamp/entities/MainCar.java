package in.codekamp.entities;

import in.codekamp.Resource.Resources;

public class MainCar extends Entity{

    public MainCar(int x, int y) {
        super(x, y);
        this.yVel = 0;
        this.image= Resources.carImage;
    }
}
