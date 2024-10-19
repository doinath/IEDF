package GameModule.Graphics.assets;

import GameModule.Graphics.object.*;

public class AssetSetter  {
    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
        gp.obj[0] = new Obj_Key();
        gp.obj[0].worldX = 21 * gp.tileSize;
        gp.obj[0].worldY = 21 * gp.tileSize;

        gp.obj[1] = new Obj_Wheat();
        gp.obj[1].worldX = 42 *gp.tileSize;
        gp.obj[1].worldY = 42 *gp.tileSize;

        gp.obj[2] = new Obj_Door();
        gp.obj[2].worldX = 38 * gp.tileSize;
        gp.obj[2].worldY = 39 * gp.tileSize;
    }
}
