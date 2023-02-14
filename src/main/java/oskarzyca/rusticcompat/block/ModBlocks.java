package oskarzyca.rusticcompat.block;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rustic.common.Config;
import rustic.common.blocks.BlockChair;
import rustic.common.blocks.BlockTable;

public class ModBlocks {
    // Painted Wood Blocks
    public static BlockChair CHAIR_RED_PAINTED;
    public static BlockChair CHAIR_BLUE_PAINTED;
    public static BlockChair CHAIR_YELLOW_PAINTED;
    public static BlockChair CHAIR_ORANGE_PAINTED;
    public static BlockChair CHAIR_GREEN_PAINTED;
    public static BlockChair CHAIR_PINK_PAINTED;
    public static BlockChair CHAIR_BLACK_PAINTED;
    public static BlockChair CHAIR_WHITE_PAINTED;
    public static BlockChair CHAIR_BROWN_PAINTED;
    public static BlockChair CHAIR_GRAY_PAINTED;
    public static BlockChair CHAIR_LIME_PAINTED;
    public static BlockChair CHAIR_MAGENTA_PAINTED;
    public static BlockChair CHAIR_PURPLE_PAINTED;
    public static BlockChair CHAIR_CYAN_PAINTED;
    public static BlockChair CHAIR_SILVER_PAINTED;
    public static BlockChair CHAIR_LIGHT_BLUE_PAINTED;

    public static BlockTable TABLE_RED_PAINTED;
    public static BlockTable TABLE_BLUE_PAINTED;
    public static BlockTable TABLE_YELLOW_PAINTED;
    public static BlockTable TABLE_ORANGE_PAINTED;
    public static BlockTable TABLE_GREEN_PAINTED;
    public static BlockTable TABLE_PINK_PAINTED;
    public static BlockTable TABLE_BLACK_PAINTED;
    public static BlockTable TABLE_WHITE_PAINTED;
    public static BlockTable TABLE_BROWN_PAINTED;
    public static BlockTable TABLE_GRAY_PAINTED;
    public static BlockTable TABLE_LIME_PAINTED;
    public static BlockTable TABLE_MAGENTA_PAINTED;
    public static BlockTable TABLE_PURPLE_PAINTED;
    public static BlockTable TABLE_CYAN_PAINTED;
    public static BlockTable TABLE_SILVER_PAINTED;
    public static BlockTable TABLE_LIGHT_BLUE_PAINTED;

    // Traverse
    public static BlockChair CHAIR_FIR;
    public static BlockTable TABLE_FIR;

    // Defiled Lands
    public static BlockChair CHAIR_TENEBRA;
    public static BlockTable TABLE_TENEBRA;

    // Better Nether
    public static BlockChair CHAIR_STALAGNATE;
    public static BlockChair CHAIR_REED;
    public static BlockTable TABLE_STALAGNATE;
    public static BlockTable TABLE_REED;

    public static void init() {
        if (Config.ENABLE_PAINTED_WOOD) {
            if (Config.ENABLE_CHAIRS) {
                CHAIR_RED_PAINTED = new BlockChair("red_painted");
                CHAIR_BLUE_PAINTED = new BlockChair("blue_painted");
                CHAIR_YELLOW_PAINTED = new BlockChair("yellow_painted");
                CHAIR_ORANGE_PAINTED = new BlockChair("orange_painted");
                CHAIR_PINK_PAINTED = new BlockChair("pink_painted");
                CHAIR_GREEN_PAINTED = new BlockChair("green_painted");
                CHAIR_BLACK_PAINTED = new BlockChair("black_painted");
                CHAIR_WHITE_PAINTED = new BlockChair("white_painted");
                CHAIR_BROWN_PAINTED = new BlockChair("brown_painted");
                CHAIR_GRAY_PAINTED = new BlockChair("gray_painted");
                CHAIR_LIME_PAINTED = new BlockChair("lime_painted");
                CHAIR_MAGENTA_PAINTED = new BlockChair("magenta_painted");
                CHAIR_PURPLE_PAINTED = new BlockChair("purple_painted");
                CHAIR_CYAN_PAINTED = new BlockChair("cyan_painted");
                CHAIR_SILVER_PAINTED = new BlockChair("silver_painted");
                CHAIR_LIGHT_BLUE_PAINTED = new BlockChair("light_blue_painted");
            }
            if (Config.ENABLE_TABLES) {
                TABLE_RED_PAINTED = new BlockTable("red_painted");
                TABLE_BLUE_PAINTED = new BlockTable("blue_painted");
                TABLE_YELLOW_PAINTED = new BlockTable("yellow_painted");
                TABLE_ORANGE_PAINTED = new BlockTable("orange_painted");
                TABLE_PINK_PAINTED = new BlockTable("pink_painted");
                TABLE_GREEN_PAINTED = new BlockTable("green_painted");
                TABLE_BLACK_PAINTED = new BlockTable("black_painted");
                TABLE_WHITE_PAINTED = new BlockTable("white_painted");
                TABLE_BROWN_PAINTED = new BlockTable("brown_painted");
                TABLE_GRAY_PAINTED = new BlockTable("gray_painted");
                TABLE_LIME_PAINTED = new BlockTable("lime_painted");
                TABLE_MAGENTA_PAINTED = new BlockTable("magenta_painted");
                TABLE_PURPLE_PAINTED = new BlockTable("purple_painted");
                TABLE_CYAN_PAINTED = new BlockTable("cyan_painted");
                TABLE_SILVER_PAINTED = new BlockTable("silver_painted");
                TABLE_LIGHT_BLUE_PAINTED = new BlockTable("light_blue_painted");
            }
        }
    }
    public static void traverseInit(){
        if (Config.ENABLE_CHAIRS) {
            CHAIR_FIR = new BlockChair("fir");
        }
        if (Config.ENABLE_TABLES) {
            TABLE_FIR = new BlockTable("fir");
        }
    }
    public static void defiledInit(){
        if (Config.ENABLE_CHAIRS) {
            CHAIR_TENEBRA = new BlockChair("tenebra");
        }
        if (Config.ENABLE_TABLES) {
            TABLE_TENEBRA = new BlockTable("tenebra");
        }
    }

    public static void betnetInit(){
        if (Config.ENABLE_CHAIRS) {
            CHAIR_STALAGNATE = new BlockChair("stalagnate");
            CHAIR_REED = new BlockChair("reed");
        }
        if (Config.ENABLE_TABLES) {
            TABLE_STALAGNATE = new BlockTable("stalagnate");
            TABLE_REED = new BlockTable("reed");
        }
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
            if(Config.ENABLE_PAINTED_WOOD){
            if (Config.ENABLE_CHAIRS) {
                CHAIR_RED_PAINTED.initModel();
                CHAIR_BLUE_PAINTED.initModel();
                CHAIR_YELLOW_PAINTED.initModel();
                CHAIR_ORANGE_PAINTED.initModel();
                CHAIR_PINK_PAINTED.initModel();
                CHAIR_GREEN_PAINTED.initModel();
                CHAIR_BLACK_PAINTED.initModel();
                CHAIR_WHITE_PAINTED.initModel();
                CHAIR_BROWN_PAINTED.initModel();
                CHAIR_GRAY_PAINTED.initModel();
                CHAIR_LIME_PAINTED.initModel();
                CHAIR_MAGENTA_PAINTED.initModel();
                CHAIR_PURPLE_PAINTED.initModel();
                CHAIR_CYAN_PAINTED.initModel();
                CHAIR_SILVER_PAINTED.initModel();
                CHAIR_LIGHT_BLUE_PAINTED.initModel();

            }
            if (Config.ENABLE_TABLES) {
                TABLE_RED_PAINTED.initModel();
                TABLE_BLUE_PAINTED.initModel();
                TABLE_YELLOW_PAINTED.initModel();
                TABLE_ORANGE_PAINTED.initModel();
                TABLE_PINK_PAINTED.initModel();
                TABLE_GREEN_PAINTED.initModel();
                TABLE_BLACK_PAINTED.initModel();
                TABLE_WHITE_PAINTED.initModel();
                TABLE_BROWN_PAINTED.initModel();
                TABLE_GRAY_PAINTED.initModel();
                TABLE_LIME_PAINTED.initModel();
                TABLE_MAGENTA_PAINTED.initModel();
                TABLE_PURPLE_PAINTED.initModel();
                TABLE_CYAN_PAINTED.initModel();
                TABLE_SILVER_PAINTED.initModel();
                TABLE_LIGHT_BLUE_PAINTED.initModel();
            }
        }
    }
    @SideOnly(Side.CLIENT)
    public static void traverseInitModels(){
        if (Config.ENABLE_CHAIRS) {
            CHAIR_FIR.initModel();
        }
        if (Config.ENABLE_TABLES) {
            TABLE_FIR.initModel();
        }
    }
    @SideOnly(Side.CLIENT)
    public static void defiledInitModels(){
        if (Config.ENABLE_CHAIRS) {
            CHAIR_TENEBRA.initModel();
        }
        if (Config.ENABLE_TABLES) {
            TABLE_TENEBRA.initModel();
        }
    }
    @SideOnly(Side.CLIENT)
    public static void betnetInitModels(){
        if (Config.ENABLE_CHAIRS) {
            CHAIR_STALAGNATE.initModel();
            CHAIR_REED.initModel();
        }
        if (Config.ENABLE_TABLES) {
            TABLE_STALAGNATE.initModel();
            TABLE_REED.initModel();
        }
    }

}
