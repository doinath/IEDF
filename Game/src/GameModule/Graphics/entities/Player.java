package GameModule.Graphics.entities;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import GameModule.Graphics.assets.*;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyH;
    
    public final int screenX, screenY;

    BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;
        
        screenX = gp.screenWidth /2 - (gp.tileSize/2);
        screenY = gp.screenHeight /2 - (gp.tileSize/2);

        solidArea = new Rectangle(0, 0, gp.tileSize, gp.tileSize);
        solidArea.x = 8;
        solidArea.y = 16;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 32;
        solidArea.height = 32;
        
        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {
        worldX = gp.tileSize * 23;
        worldY = gp.tileSize * 21;
        speed = 4;
        direction = "down";
    }

    public void getPlayerImage() {
        try {
            up1 = ImageIO.read(getClass().getResourceAsStream("/GameModule/Graphics/media/media/player/up1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/GameModule/Graphics/media/media/player/up2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/GameModule/Graphics/media/media/player/left1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/GameModule/Graphics/media/media/player/left2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/GameModule/Graphics/media/media/player/right1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/GameModule/Graphics/media/media/player/right2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/GameModule/Graphics/media/media/player/down1.png.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/GameModule/Graphics/media/media/player/down2.png.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        
        
        if(keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true || keyH.rightPressed == true){
            if (keyH.upPressed) {
                direction = "up";
                
            }
            else if (keyH.leftPressed) {
                direction = "left";
                
            }
            else if (keyH.downPressed) {
                direction = "down"; // Fix: should set direction to "down"
                
            }
            else if (keyH.rightPressed) {
                direction = "right";
                
            }
            
            //checks tile collsion
            collisionOn = false;
            gp.cChecker.checkTile(this);
            
            //if collision isfalse, player can move
            if(collisionOn == false){
                switch(direction){
                    case "up":{
                        worldY -= speed;
                        break;
                    }
                    case "down":{
                        worldY += speed;
                        break;
                    }
                    case "left":{
                        worldX -= speed;
                        break;
                    }
                    case "right":{
                        worldX += speed;
                        break;
                    }
                    
                }
            }

            spriteCounter++;
            if(spriteCounter > 12){
                if(spriteNum == 1){
                    spriteNum = 2;
                }
                else if(spriteNum == 2){
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }
        
    }

    public void draw(Graphics2D g2) {
        BufferedImage image = null;

        switch (direction) {
            case "up":
                if(spriteNum == 1){
                    image = up1;
                
                }
                if(spriteNum == 2){
                    image = up2;
                }
                break;
            case "down":
                if(spriteNum == 1){
                    image =down1;
                
                }
                if(spriteNum == 2){
                    image = down2;
                }
                break;
            case "left":
                if(spriteNum == 1){
                    image = left1;
                
                }
                if(spriteNum == 2){
                    image = left2;
                }
                break;
            case "right":
                if(spriteNum == 1){
                    image = right1;
                
                }
                if(spriteNum == 2){
                    image = right2;
                }
                break;
        }

        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
    }
}
