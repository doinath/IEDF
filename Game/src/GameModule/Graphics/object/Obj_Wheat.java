package GameModule.Graphics.object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Obj_Wheat extends SuperObject {
    public Obj_Wheat(){
        name = "Wheat";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/GameModule/Graphics/media/media/objects/wheat.png"));
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
