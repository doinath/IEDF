package GameModule.Graphics.object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Obj_Key extends SuperObject {
    public Obj_Key(){
        name = "Key";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/GameModule/Graphics/media/media/objects/key.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
