/*    */ package com.mark719.magicalcrops.config;
/*    */ 
/*    */ import java.io.File;
/*    */ import net.minecraftforge.common.config.Configuration;
/*    */ 
/*    */ 
/*    */ public class ConfigDisable
/*    */ {
/*  9 */   public static String vanilla = "1 disable/enable vanilla crops, true = Enabled, false = Disabled";
/* 10 */   public static String monster = "2 disable/enable monster/soul crops, true = Enabled, false = Disabled";
/* 11 */   public static String MOD = "3 disable/enable mod compatible crops, true = Enabled, false = Disabled";
/*    */   
/*    */   public static boolean AIR;
/*    */   
/*    */   public static boolean COAL;
/*    */   
/*    */   public static boolean DYE;
/*    */   
/*    */   public static boolean EARTH;
/*    */   
/*    */   public static boolean FIRE;
/*    */   public static boolean MINICIO;
/*    */   public static boolean NATURE;
/*    */   
/*    */   public static void init(File configFile) {
/* 26 */     Configuration config = new Configuration(configFile);
/* 27 */     config.load();
/*    */ 
/*    */     
/* 30 */     AIR = config.get(vanilla, "AIR CROP", true).getBoolean();
/* 31 */     COAL = config.get(vanilla, "COAL CROP", true).getBoolean();
/* 32 */     DYE = config.get(vanilla, "DYE CROP", true).getBoolean();
/* 33 */     EARTH = config.get(vanilla, "EARTH CROP", true).getBoolean();
/* 34 */     FIRE = config.get(vanilla, "FIRE CROP", true).getBoolean();
/* 35 */     MINICIO = config.get(vanilla, "MINICIO CROP", true).getBoolean();
/* 36 */     NATURE = config.get(vanilla, "NATURE CROP", true).getBoolean();
/* 37 */     WATER = config.get(vanilla, "WATER CROP", true).getBoolean();
/* 38 */     REDSTONE = config.get(vanilla, "REDSTONE CROP", true).getBoolean();
/* 39 */     GLOWSTONE = config.get(vanilla, "GLOWSTONE CROP", true).getBoolean();
/* 40 */     OBSIDIAN = config.get(vanilla, "OBSIDIAN CROP", true).getBoolean();
/* 41 */     NETHER = config.get(vanilla, "NETHER CROP", true).getBoolean();
/* 42 */     IRON = config.get(vanilla, "IRON CROP", true).getBoolean();
/* 43 */     GOLD = config.get(vanilla, "GOLD CROP", true).getBoolean();
/* 44 */     LAPIS = config.get(vanilla, "LAPIS CROP", true).getBoolean();
/* 45 */     EXPERIENCE = config.get(vanilla, "EXPERIENCE CROP", true).getBoolean();
/* 46 */     QUARTZ = config.get(vanilla, "QUARTZ CROP", true).getBoolean();
/* 47 */     DIAMOND = config.get(vanilla, "DIAMOND CROP", true).getBoolean();
/* 48 */     EMERALD = config.get(vanilla, "EMERALD CROP", true).getBoolean();
/*    */ 
/*    */     
/* 51 */     BLAZE = config.get(monster, "BLAZE CROP", true).getBoolean();
/* 52 */     CREEPER = config.get(monster, "CREEPER CROP", true).getBoolean();
/* 53 */     ENDERMAN = config.get(monster, "ENDERMAN CROP", true).getBoolean();
/* 54 */     GHAST = config.get(monster, "GHAST CROP", true).getBoolean();
/* 55 */     SKELETON = config.get(monster, "SKELETON CROP", true).getBoolean();
/* 56 */     SLIME = config.get(monster, "SLIME CROP", true).getBoolean();
/* 57 */     SPIDER = config.get(monster, "SPIDER CROP", true).getBoolean();
/* 58 */     WITHER = config.get(monster, "WITHER CROP", true).getBoolean();
/* 59 */     CHICKEN = config.get(monster, "CHICKEN CROP", true).getBoolean();
/* 60 */     COW = config.get(monster, "COW CROP", true).getBoolean();
/* 61 */     PIG = config.get(monster, "PIG CROP", true).getBoolean();
/* 62 */     SHEEP = config.get(monster, "SHEEP CROP", true).getBoolean();
/*    */ 
/*    */     
/* 65 */     ALUMINIUM = config.get(MOD, "ALUMINIUM CROP", true).getBoolean();
/* 66 */     ARDITE = config.get(MOD, "ARDITE CROP", true).getBoolean();
/* 67 */     COBALT = config.get(MOD, "COBALT CROP", true).getBoolean();
/* 68 */     COPPER = config.get(MOD, "COPPER CROP", true).getBoolean();
/* 69 */     CERTUSQUARTZ = config.get(MOD, "CERTUSQUARTZ CROP", true).getBoolean();
/* 70 */     LEAD = config.get(MOD, "LEAD CROP", true).getBoolean();
/* 71 */     NICKEL = config.get(MOD, "NICKEL CROP", true).getBoolean();
/* 72 */     OSMIUM = config.get(MOD, "OSMIUM CROP", true).getBoolean();
/* 73 */     PERIDOT = config.get(MOD, "PERIDOT CROP", true).getBoolean();
/* 74 */     RUBY = config.get(MOD, "RUBY CROP", true).getBoolean();
/* 75 */     SAPPHIRE = config.get(MOD, "SAPPHIRE CROP", true).getBoolean();
/* 76 */     PLATINUM = config.get(MOD, "PLATINUM CROP", true).getBoolean();
/* 77 */     RUBBER = config.get(MOD, "RUBBER CROP", true).getBoolean();
/* 78 */     SILVER = config.get(MOD, "SILVER CROP", true).getBoolean();
/* 79 */     TIN = config.get(MOD, "TIN CROP", true).getBoolean();
/* 80 */     SULFUR = config.get(MOD, "SULFUR CROP", true).getBoolean();
/* 81 */     YELLORITE = config.get(MOD, "YELLORITE CROP", true).getBoolean();
/* 82 */     ALUMITE = config.get(MOD, "ALUMITE CROP", true).getBoolean();
/* 83 */     BLIZZ = config.get(MOD, "BLIZZ CROP", true).getBoolean();
/* 84 */     BRONZE = config.get(MOD, "BRONZE CROP", true).getBoolean();
/* 85 */     ELECTRUM = config.get(MOD, "ELECTRUM CROP", true).getBoolean();
/* 86 */     ENDERIUM = config.get(MOD, "ENDERIUM CROP", true).getBoolean();
/* 87 */     FLUIX = config.get(MOD, "FLUIX CROP", true).getBoolean();
/* 88 */     INVAR = config.get(MOD, "INVAR CROP", true).getBoolean();
/* 89 */     LUMIUM = config.get(MOD, "LUMIUM CROP", true).getBoolean();
/* 90 */     MANASTEEL = config.get(MOD, "MANASTEEL CROP", true).getBoolean();
/* 91 */     MANYULLYN = config.get(MOD, "MANYULLYN CROP", true).getBoolean();
/* 92 */     SALTPETER = config.get(MOD, "SALTPETER CROP", true).getBoolean();
/* 93 */     SIGNALUM = config.get(MOD, "SIGNALUM CROP", true).getBoolean();
/* 94 */     STEEL = config.get(MOD, "STEEL CROP", true).getBoolean();
/* 95 */     TERRASTEEL = config.get(MOD, "TERRASTEEL CROP", true).getBoolean();
/*    */     
/* 97 */     config.save();
/*    */   }
/*    */   
/*    */   public static boolean WATER;
/*    */   public static boolean REDSTONE;
/*    */   public static boolean GLOWSTONE;
/*    */   public static boolean OBSIDIAN;
/*    */   public static boolean NETHER;
/*    */   public static boolean IRON;
/*    */   public static boolean GOLD;
/*    */   public static boolean LAPIS;
/*    */   public static boolean EXPERIENCE;
/*    */   public static boolean QUARTZ;
/*    */   public static boolean DIAMOND;
/*    */   public static boolean EMERALD;
/*    */   public static boolean BLAZE;
/*    */   public static boolean CREEPER;
/*    */   public static boolean ENDERMAN;
/*    */   public static boolean GHAST;
/*    */   public static boolean SKELETON;
/*    */   public static boolean SLIME;
/*    */   public static boolean SPIDER;
/*    */   public static boolean WITHER;
/*    */   public static boolean CHICKEN;
/*    */   public static boolean COW;
/*    */   public static boolean PIG;
/*    */   public static boolean SHEEP;
/*    */   public static boolean ALUMINIUM;
/*    */   public static boolean ARDITE;
/*    */   public static boolean COBALT;
/*    */   public static boolean COPPER;
/*    */   public static boolean CERTUSQUARTZ;
/*    */   public static boolean LEAD;
/*    */   public static boolean NICKEL;
/*    */   public static boolean OSMIUM;
/*    */   public static boolean PERIDOT;
/*    */   public static boolean RUBY;
/*    */   public static boolean SAPPHIRE;
/*    */   public static boolean PLATINUM;
/*    */   public static boolean RUBBER;
/*    */   public static boolean SILVER;
/*    */   public static boolean TIN;
/*    */   public static boolean SULFUR;
/*    */   public static boolean YELLORITE;
/*    */   public static boolean ALUMITE;
/*    */   public static boolean BLIZZ;
/*    */   public static boolean BRONZE;
/*    */   public static boolean ELECTRUM;
/*    */   public static boolean ENDERIUM;
/*    */   public static boolean FLUIX;
/*    */   public static boolean INVAR;
/*    */   public static boolean LUMIUM;
/*    */   public static boolean MANASTEEL;
/*    */   public static boolean MANYULLYN;
/*    */   public static boolean SALTPETER;
/*    */   public static boolean SIGNALUM;
/*    */   public static boolean STEEL;
/*    */   public static boolean TERRASTEEL;
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\config\ConfigDisable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */