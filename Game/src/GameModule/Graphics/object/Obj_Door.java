package GameModule.Graphics.object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Obj_Door extends SuperObject {
    public Obj_Door() {
        this.name = "Door";

        try {
            this.image = ImageIO.read(this.getClass().getResourceAsStream("/GameModule/Graphics/media/media/objects/door.png"));
        } catch (IOException var2) {
            IOException e = var2;
            e.printStackTrace();
        }

        this.collision = true;
    }
}
