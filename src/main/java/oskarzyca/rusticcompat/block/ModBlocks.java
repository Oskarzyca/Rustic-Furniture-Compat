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

    // Quark
    public static BlockChair CHAIR_RED_STAINED;
    public static BlockChair CHAIR_BLUE_STAINED;
    public static BlockChair CHAIR_YELLOW_STAINED;
    public static BlockChair CHAIR_ORANGE_STAINED;
    public static BlockChair CHAIR_GREEN_STAINED;
    public static BlockChair CHAIR_PINK_STAINED;
    public static BlockChair CHAIR_BLACK_STAINED;
    public static BlockChair CHAIR_WHITE_STAINED;
    public static BlockChair CHAIR_BROWN_STAINED;
    public static BlockChair CHAIR_GRAY_STAINED;
    public static BlockChair CHAIR_LIME_STAINED;
    public static BlockChair CHAIR_MAGENTA_STAINED;
    public static BlockChair CHAIR_PURPLE_STAINED;
    public static BlockChair CHAIR_CYAN_STAINED;
    public static BlockChair CHAIR_LIGHT_GRAY_STAINED;
    public static BlockChair CHAIR_LIGHT_BLUE_STAINED;

    public static BlockTable TABLE_RED_STAINED;
    public static BlockTable TABLE_BLUE_STAINED;
    public static BlockTable TABLE_YELLOW_STAINED;
    public static BlockTable TABLE_ORANGE_STAINED;
    public static BlockTable TABLE_GREEN_STAINED;
    public static BlockTable TABLE_PINK_STAINED;
    public static BlockTable TABLE_BLACK_STAINED;
    public static BlockTable TABLE_WHITE_STAINED;
    public static BlockTable TABLE_BROWN_STAINED;
    public static BlockTable TABLE_GRAY_STAINED;
    public static BlockTable TABLE_LIME_STAINED;
    public static BlockTable TABLE_MAGENTA_STAINED;
    public static BlockTable TABLE_PURPLE_STAINED;
    public static BlockTable TABLE_CYAN_STAINED;
    public static BlockTable TABLE_LIGHT_GRAY_STAINED;
    public static BlockTable TABLE_LIGHT_BLUE_STAINED;

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
    public static void quarkInit(){
        if (Config.ENABLE_CHAIRS) {
            CHAIR_RED_STAINED = new BlockChair("red_stained");
            CHAIR_BLUE_STAINED = new BlockChair("blue_stained");
            CHAIR_YELLOW_STAINED = new BlockChair("yellow_stained");
            CHAIR_ORANGE_STAINED = new BlockChair("orange_stained");
            CHAIR_PINK_STAINED = new BlockChair("pink_stained");
            CHAIR_GREEN_STAINED = new BlockChair("green_stained");
            CHAIR_BLACK_STAINED = new BlockChair("black_stained");
            CHAIR_WHITE_STAINED = new BlockChair("white_stained");
            CHAIR_BROWN_STAINED = new BlockChair("brown_stained");
            CHAIR_GRAY_STAINED = new BlockChair("gray_stained");
            CHAIR_LIME_STAINED = new BlockChair("lime_stained");
            CHAIR_MAGENTA_STAINED = new BlockChair("magenta_stained");
            CHAIR_PURPLE_STAINED = new BlockChair("purple_stained");
            CHAIR_CYAN_STAINED = new BlockChair("cyan_stained");
            CHAIR_LIGHT_GRAY_STAINED = new BlockChair("light_gray_stained");
            CHAIR_LIGHT_BLUE_STAINED = new BlockChair("light_blue_stained");
        }
        if (Config.ENABLE_TABLES) {
            TABLE_RED_STAINED = new BlockTable("red_stained");
            TABLE_BLUE_STAINED = new BlockTable("blue_stained");
            TABLE_YELLOW_STAINED = new BlockTable("yellow_stained");
            TABLE_ORANGE_STAINED = new BlockTable("orange_stained");
            TABLE_PINK_STAINED = new BlockTable("pink_stained");
            TABLE_GREEN_STAINED = new BlockTable("green_stained");
            TABLE_BLACK_STAINED = new BlockTable("black_stained");
            TABLE_WHITE_STAINED = new BlockTable("white_stained");
            TABLE_BROWN_STAINED = new BlockTable("brown_stained");
            TABLE_GRAY_STAINED = new BlockTable("gray_stained");
            TABLE_LIME_STAINED = new BlockTable("lime_stained");
            TABLE_MAGENTA_STAINED = new BlockTable("magenta_stained");
            TABLE_PURPLE_STAINED = new BlockTable("purple_stained");
            TABLE_CYAN_STAINED = new BlockTable("cyan_stained");
            TABLE_LIGHT_GRAY_STAINED = new BlockTable("light_gray_stained");
            TABLE_LIGHT_BLUE_STAINED = new BlockTable("light_blue_stained");
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
    @SideOnly(Side.CLIENT)
    public static void quarkInitModels(){
        if (Config.ENABLE_CHAIRS) {
            CHAIR_RED_STAINED.initModel();
            CHAIR_BLUE_STAINED.initModel();
            CHAIR_YELLOW_STAINED.initModel();
            CHAIR_ORANGE_STAINED.initModel();
            CHAIR_PINK_STAINED.initModel();
            CHAIR_GREEN_STAINED.initModel();
            CHAIR_BLACK_STAINED.initModel();
            CHAIR_WHITE_STAINED.initModel();
            CHAIR_BROWN_STAINED.initModel();
            CHAIR_GRAY_STAINED.initModel();
            CHAIR_LIME_STAINED.initModel();
            CHAIR_MAGENTA_STAINED.initModel();
            CHAIR_PURPLE_STAINED.initModel();
            CHAIR_CYAN_STAINED.initModel();
            CHAIR_LIGHT_GRAY_STAINED.initModel();
            CHAIR_LIGHT_BLUE_STAINED.initModel();
        }
        if (Config.ENABLE_TABLES){
            TABLE_RED_STAINED.initModel();
            TABLE_BLUE_STAINED.initModel();
            TABLE_YELLOW_STAINED.initModel();
            TABLE_ORANGE_STAINED.initModel();
            TABLE_PINK_STAINED.initModel();
            TABLE_GREEN_STAINED.initModel();
            TABLE_BLACK_STAINED.initModel();
            TABLE_WHITE_STAINED.initModel();
            TABLE_BROWN_STAINED.initModel();
            TABLE_GRAY_STAINED.initModel();
            TABLE_LIME_STAINED.initModel();
            TABLE_MAGENTA_STAINED.initModel();
            TABLE_PURPLE_STAINED.initModel();
            TABLE_CYAN_STAINED.initModel();
            TABLE_LIGHT_GRAY_STAINED.initModel();
            TABLE_LIGHT_BLUE_STAINED.initModel();
        }

    }

}
