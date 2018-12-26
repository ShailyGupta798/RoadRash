package in.codekamp.entities;

import in.codekamp.Resource.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cars extends Entity {

    public Cars(int x, int y) {
        super(x, y);
        this.yVel = 3;
        this.image = Resources.cars3;
        this.height =100;
        this.width=100;


    }


}
