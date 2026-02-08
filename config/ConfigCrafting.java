/*     */ package com.mark719.magicalcrops.config;
/*     */ 
/*     */ import java.io.File;
/*     */ import net.minecraftforge.common.config.Configuration;
/*     */ 
/*     */ 
/*     */ public class ConfigCrafting
/*     */ {
/*     */   public static int outPutCoal;
/*     */   public static int outPutIron;
/*     */   public static int outPutRedstone;
/*     */   public static int outPutGlowstone;
/*     */   public static int outPutGold;
/*     */   public static int outPutDiamond;
/*     */   public static int outPutLapis;
/*     */   public static int outPutEmerald;
/*     */   public static int outPutObsidian;
/*     */   public static int outPutDye;
/*     */   
/*     */   public static void init(File configFile) {
/*  21 */     Configuration config = new Configuration(configFile);
/*  22 */     config.load();
/*     */     
/*  24 */     outPutCoal = config.get("output_1 vanilla essence crafting", "Coal, default 12, Max 64, Min 1", 12).getInt();
/*  25 */     outPutIron = config.get("output_1 vanilla essence crafting", "Iron Ore, default 8, Max 64, Min 1", 8).getInt();
/*  26 */     outPutRedstone = config.get("output_1 vanilla essence crafting", "Redstone dust, default 24, Max 64, Min 1", 24).getInt();
/*  27 */     outPutGlowstone = config.get("output_1 vanilla essence crafting", "Glowstone dust, default 12, Max 64, Min 1", 12).getInt();
/*  28 */     outPutGold = config.get("output_1 vanilla essence crafting", "Gold Ore, default 5, Max 64, Min 1", 5).getInt();
/*  29 */     outPutDiamond = config.get("output_1 vanilla essence crafting", "Diamond, default 1, Max 64, Min 1", 1).getInt();
/*  30 */     outPutLapis = config.get("output_1 vanilla essence crafting", "Lapis Lazuli, default 12, Max 64, Min 1", 12).getInt();
/*  31 */     outPutEmerald = config.get("output_1 vanilla essence crafting", "Emerald, default 1, Max 64, Min 1", 1).getInt();
/*  32 */     outPutObsidian = config.get("output_1 vanilla essence crafting", "Obsidian, default 8, Max 64, Min 1", 8).getInt();
/*  33 */     outPutDye = config.get("output_1 vanilla essence crafting", "Dye, default 6, Max 64, Min 1", 6).getInt();
/*  34 */     outPutXP = config.get("output_1 vanilla essence crafting", "Experience Orb, default 1, Max 64, Min 4", 4).getInt();
/*  35 */     outPutQuartz = config.get("output_1 vanilla essence crafting", "Nether Quartz, default 8, Max 64, Min 1", 8).getInt();
/*  36 */     outPutWood = config.get("output_1 vanilla essence crafting", "Wood Logs, default 8, Max 64, Min 1", 8).getInt();
/*  37 */     outPutSnowBalls = config.get("output_1 vanilla essence crafting", "Snow Balls, default 32, Max 64, Min 1", 32).getInt();
/*  38 */     outPutClayBall = config.get("output_1 vanilla essence crafting", "Clay Balls, default 32, Max 64, Min 1", 32).getInt();
/*  39 */     outPutCobblestone = config.get("output_1 vanilla essence crafting", "Cobblestone, default 32, Max 64, Min 1", 32).getInt();
/*  40 */     outPutDirt = config.get("output_1 vanilla essence crafting", "Dirt, default 64, Max 64, Min 1", 64).getInt();
/*  41 */     outPutSand = config.get("output_1 vanilla essence crafting", "Sand, default 32, Max 64, Min 1", 32).getInt();
/*  42 */     outPutGravel = config.get("output_1 vanilla essence crafting", "Gravel, default 16, Max 64, Min 1", 16).getInt();
/*     */     
/*  44 */     outPutMossyCobble = config.get("output_2 nature essence crafting", "Mossy Cobblestone, default 8, Max 64, Min 1", 8).getInt();
/*  45 */     outPutMossyBrick = config.get("output_2 nature essence crafting", "Mossy Stone Brick, default 8, Max 64, Min 1", 8).getInt();
/*  46 */     outPutVines = config.get("output_2 nature essence crafting", "Vines, default 32, Max 16, Min 1", 16).getInt();
/*  47 */     outPutLily = config.get("output_2 nature essence crafting", "Lily Pads, default 8, Max 64, Min 1", 8).getInt();
/*  48 */     outPutMycelium = config.get("output_2 nature essence crafting", "Mycelium, default 8, Max 64, Min 1", 8).getInt();
/*  49 */     outPutCactus = config.get("output_2 nature essence crafting", "Cactus, default 8, Max 64, Min 1", 8).getInt();
/*     */     
/*  51 */     outPutSoul = config.get("output_3 nether essence crafting", "Soul sand, default 8, Max 64, Min 1", 8).getInt();
/*  52 */     outPutNether = config.get("output_3 nether essence crafting", "Netherrack, default 816, Max 64, Min 1", 16).getInt();
/*  53 */     outPutNetherbrick = config.get("output_3 nether essence crafting", "Nether Brick, default 4, Max 64, Min 1", 4).getInt();
/*     */     
/*  55 */     outPutCowLeather = config.get("output_2 vanilla mob drop output", "Cow Mob Drop Leather, default 8, Max 64, Min 1", 8).getInt();
/*  56 */     outPutCowBeef = config.get("output_2 vanilla mob drop output", "Cow Mob Drop Raw Beef, default 4, Max 64, Min 1", 4).getInt();
/*  57 */     outPutCreeperHead = config.get("output_2 vanilla mob drop output", "Creeper Mob Drop Creeper Head, default 1, Max 64, Min 1", 1).getInt();
/*  58 */     outPutCreeperGun = config.get("output_2 vanilla mob drop output", "Creeper Mob Drop Gunpowder, default 8, Max 64, Min 1", 8).getInt();
/*  59 */     outPutMagmaCream = config.get("output_2 vanilla mob drop output", "Magma Mob Drop Magma Cream, default 6, Max 64, Min 1", 6).getInt();
/*  60 */     outPutSkeleSkull = config.get("output_2 vanilla mob drop output", "Skeleton Mob Drop Skull, default 1, Max 64, Min 1", 1).getInt();
/*  61 */     outPutBones = config.get("output_2 vanilla mob drop output", "Skeleton Mob Drop Bones, default 8, Max 64, Min 1", 8).getInt();
/*  62 */     outPutArrows = config.get("output_2 vanilla mob drop output", "Skeleton Mob Drop Arrows, default 4, Max 64, Min 1", 4).getInt();
/*  63 */     outPutWitherSkull = config.get("output_2 vanilla mob drop output", "Wither Skeleton Mob Drop Wither Skull, default 1, Max 64, Min 1", 1).getInt();
/*  64 */     outPutSlimeBall = config.get("output_2 vanilla mob drop output", "Slime Mob Drop Slime Balls, default 8, Max 64, Min 1", 8).getInt();
/*  65 */     outPutSpiderString = config.get("output_2 vanilla mob drop output", "Spider Mob Drop String, default 8, Max 64, Min 1", 8).getInt();
/*  66 */     outPutSpiderEye = config.get("output_2 vanilla mob drop output", "Spider Mob Drop Spider Eye, default 8, Max 64, Min 1", 8).getInt();
/*  67 */     outPutGhastTear = config.get("output_2 vanilla mob drop output", "Ghast Mob Drop Ghast Tear, default 2, Max 64, Min 1", 2).getInt();
/*  68 */     outPutXPBottles = config.get("output_2 vanilla mob drop output", "Mob Drop Bottle 'o' Enchanting, default 3, Max 64, Min 2", 2).getInt();
/*  69 */     outPutPigPork = config.get("output_2 vanilla mob drop output", "Pig Mob Drop Raw Pork, default 4, Max 64, Min 1", 4).getInt();
/*  70 */     outPutChicken = config.get("output_2 vanilla mob drop output", "Chicken Mob Drop Raw Chicken, default 4, Max 64, Min 1", 4).getInt();
/*  71 */     outPutFeather = config.get("output_2 vanilla mob drop output", "Chicken Mob Drop Feather, default 8, Max 64, Min 1", 8).getInt();
/*  72 */     outPutFeather = config.get("output_2 vanilla mob drop output", "Chicken Mob Drop Feather, default 8, Max 64, Min 1", 8).getInt();
/*  73 */     outPutEggs = config.get("output_2 vanilla mob drop output", "Chicken Mob Drop Eggs, default 4, Max 64, Min 1", 4).getInt();
/*  74 */     outPutBlazerod = config.get("output_2 vanilla mob drop output", "Blaze Mob Drop Blaze Rod, default 4, Max 64, Min 1", 4).getInt();
/*  75 */     outPutEnderPearl = config.get("output_2 vanilla mob drop output", "Enderman Mob Drop Ender Pearl, default 4, Max 64, Min 1", 4).getInt();
/*     */     
/*  77 */     outPutAluminium = config.get("output_4 mod compat", "Aluminium Ore, default 4, Max 64, Min 1", 4).getInt();
/*  78 */     outPutArdite = config.get("output_4 mod compat", "Ardite Ore, default 1, Max 64, Min 1", 1).getInt();
/*  79 */     outPutCobalt = config.get("output_4 mod compat", "Cobalt Ore, default 1, Max 64, Min 1", 1).getInt();
/*  80 */     outPutCopper = config.get("output_4 mod compat", "Copper Ore, default 4, Max 64, Min 1", 4).getInt();
/*  81 */     outPutCertusQuartz = config.get("output_4 mod compat", "Certus Quartz Ore, default 4, Max 64, Min 1", 4).getInt();
/*  82 */     outPutLead = config.get("output_4 mod compat", "Lead Ore, default 4, Max 64, Min 1", 4).getInt();
/*  83 */     outPutNickel = config.get("output_4 mod compat", "Nickel Ore, default 2, Max 64, Min 1", 2).getInt();
/*  84 */     outPutOsmium = config.get("output_4 mod compat", "Osmium Ore, default 4, Max 64, Min 1", 4).getInt();
/*  85 */     outPutPeridot = config.get("output_4 mod compat", "Peridot, default 1, Max 64, Min 1", 1).getInt();
/*  86 */     outPutRuby = config.get("output_4 mod compat", "Ruby, default 1, Max 64, Min 1", 1).getInt();
/*  87 */     outPutSapphire = config.get("output_4 mod compat", "Sapphire, default 1, Max 64, Min 1", 1).getInt();
/*  88 */     outPutPlatinum = config.get("output_4 mod compat", "Platinum Ingot, default 1, Max 64, Min 1", 1).getInt();
/*  89 */     outPutRubber = config.get("output_4 mod compat", "Raw Rubber, default 6, Max 64, Min 1", 6).getInt();
/*  90 */     outPutSilver = config.get("output_4 mod compat", "Silver Ore, default 4, Max 64, Min 1", 4).getInt();
/*  91 */     outPutTin = config.get("output_4 mod compat", "Tin Ore, default 4, Max 64, Min 1", 4).getInt();
/*  92 */     outPutSulfur = config.get("output_4 mod compat", "Sulfur Dust, default 6, Max 64, Min 1", 6).getInt();
/*  93 */     outPutYellorite = config.get("output_4 mod compat", "Yellorite Ore, default 4, Max 64, Min 1", 4).getInt();
/*  94 */     outPutAlumite = config.get("output_4 mod compat", "Alumite Ingot, default 1, Max 64, Min 1", 1).getInt();
/*  95 */     outPutBlizz = config.get("output_4 mod compat", "Blizz Rod, default 2, Max 64, Min 1", 2).getInt();
/*  96 */     outPutBronze = config.get("output_4 mod compat", "Bronze Ingots, default 2, Max 64, Min 1", 2).getInt();
/*  97 */     outPutElectrum = config.get("output_4 mod compat", "Electrum Ingots, default 2, Max 64, Min 1", 2).getInt();
/*  98 */     outPutEnderium = config.get("output_4 mod compat", "Enderium Ingots, default 1, Max 64, Min 1", 1).getInt();
/*  99 */     outPutFluix = config.get("output_4 mod compat", "Fluix Crystal, default 2, Max 64, Min 1", 2).getInt();
/* 100 */     outPutInvar = config.get("output_4 mod compat", "Invar Ingot, default 2, Max 64, Min 1", 2).getInt();
/* 101 */     outPutLumium = config.get("output_4 mod compat", "Lumium Ingot, default 2, Max 64, Min 1", 2).getInt();
/* 102 */     outPutManasteel = config.get("output_4 mod compat", "Manasteel Ingot, default 1, Max 64, Min 1", 1).getInt();
/* 103 */     outPutManyullyn = config.get("output_4 mod compat", "Manyullyn Ingot, default 1, Max 64, Min 1", 1).getInt();
/* 104 */     outPutSaltpeter = config.get("output_4 mod compat", "Saltpeter Dust, default 6, Max 64, Min 1", 6).getInt();
/* 105 */     outPutSignalum = config.get("output_4 mod compat", "Signalum Ingot, default 2, Max 64, Min 1", 2).getInt();
/* 106 */     outPutSteel = config.get("output_4 mod compat", "Steel Ingot, default 2, Max 64, Min 1", 2).getInt();
/* 107 */     outPutTerrasteel = config.get("output_4 mod compat", "Terrasteel Ingot, default 1, Max 64, Min 1", 1).getInt();
/*     */     
/* 109 */     config.save();
/*     */   }
/*     */   
/*     */   public static int outPutXP;
/*     */   public static int outPutQuartz;
/*     */   public static int outPutLeaves;
/*     */   public static int outPutSnowBalls;
/*     */   public static int outPutClayBall;
/*     */   public static int outPutCobblestone;
/*     */   public static int outPutDirt;
/*     */   public static int outPutSand;
/*     */   public static int outPutMossyCobble;
/*     */   public static int outPutMossyBrick;
/*     */   public static int outPutVines;
/*     */   public static int outPutLily;
/*     */   public static int outPutMycelium;
/*     */   public static int outPutCactus;
/*     */   public static int outPutCowLeather;
/*     */   public static int outPutCowBeef;
/*     */   public static int outPutCreeperHead;
/*     */   public static int outPutCreeperGun;
/*     */   public static int outPutMagmaCream;
/*     */   public static int outPutSkeleSkull;
/*     */   public static int outPutBones;
/*     */   public static int outPutArrows;
/*     */   public static int outPutWitherSkull;
/*     */   public static int outPutSlimeBall;
/*     */   public static int outPutSpiderString;
/*     */   public static int outPutSpiderEye;
/*     */   public static int outPutGhastTear;
/*     */   public static int outPutXPBottles;
/*     */   public static int outPutPigPork;
/*     */   public static int outPutChicken;
/*     */   public static int outPutFeather;
/*     */   public static int outPutSheepWool;
/*     */   public static int outPutBlazerod;
/*     */   public static int outPutEnderPearl;
/*     */   public static int outPutEggs;
/*     */   public static int outPutGravel;
/*     */   public static int outPutSoul;
/*     */   public static int outPutNether;
/*     */   public static int outPutNetherbrick;
/*     */   public static int outPutWood;
/*     */   public static int outPutAluminium;
/*     */   public static int outPutArdite;
/*     */   public static int outPutCobalt;
/*     */   public static int outPutCopper;
/*     */   public static int outPutCertusQuartz;
/*     */   public static int outPutLead;
/*     */   public static int outPutNickel;
/*     */   public static int outPutOsmium;
/*     */   public static int outPutPeridot;
/*     */   public static int outPutRuby;
/*     */   public static int outPutSapphire;
/*     */   public static int outPutPlatinum;
/*     */   public static int outPutRubber;
/*     */   public static int outPutSilver;
/*     */   public static int outPutTin;
/*     */   public static int outPutSulfur;
/*     */   public static int outPutYellorite;
/*     */   public static int outPutAlumite;
/*     */   public static int outPutBlizz;
/*     */   public static int outPutBronze;
/*     */   public static int outPutElectrum;
/*     */   public static int outPutEnderium;
/*     */   public static int outPutFluix;
/*     */   public static int outPutInvar;
/*     */   public static int outPutLumium;
/*     */   public static int outPutManasteel;
/*     */   public static int outPutManyullyn;
/*     */   public static int outPutSaltpeter;
/*     */   public static int outPutSignalum;
/*     */   public static int outPutSteel;
/*     */   public static int outPutTerrasteel;
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\config\ConfigCrafting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */