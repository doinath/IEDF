package GameModule.Graphics.object;

import javax.imageio.ImageIO;
import java.io.IOException;

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
