/*    */ package com.mark719.magicalcrops.config;
/*    */ 
/*    */ import java.io.File;
/*    */ import net.minecraftforge.common.config.Configuration;
/*    */ 
/*    */ public class ConfigMain {
/*    */   public static boolean essOreOverworld;
/*    */   public static boolean essOreNether;
/*    */   public static boolean essOreEnd;
/*    */   public static int maxVeinSize;
/*    */   public static int maxVeinSizeNether;
/*    */   public static int maxVeinSizeEnd;
/*    */   public static int oreGenerateYCord;
/*    */   public static int SECOND_SEED_CHANCE;
/*    */   public static int WEAK_DURABILITY;
/*    */   
/*    */   public static void init(File configFile) {
/* 18 */     Configuration config = new Configuration(configFile);
/* 19 */     config.load();
/*    */     
/* 21 */     MOB_ESS_DROP = config.get("monster drop options", "Can mobs drop essence on death (universal switch for all mobs), default true", true).getBoolean();
/* 22 */     DRAGON_ESS_DROP = config.get("monster drop options", "Ender dragon drops Zivicio essence when killed, default true", true).getBoolean();
/* 23 */     WITHER_ESS_DROP = config.get("monster drop options", "Wither drops Zivicio essence when killed, default true", true).getBoolean();
/* 24 */     HOSTILE_ESS_DROP = config.get("monster drop options", "Monsters e.g. Zombies, Skeletons and Creepers, drop Minicio essence when killed, default true", true).getBoolean();
/* 25 */     PASSIVE_ESS_DROP = config.get("monster drop options", "Animals e.g. Pigs, Sheep and Chickens, drop Minicio essence when killed, default true", true).getBoolean();
/* 26 */     HOSTILE_DROP_CHANCE = config.get("monster drop options", "Chance of monsters dropping Minicio essence when killed in percent, default 20", 20).getInt();
/* 27 */     PASSIVE_DROP_CHANCE = config.get("monster drop options", "Chance of animals dropping Minicio essence when killed in percent, default 10", 10).getInt();
/* 28 */     DRGAON_ESS_DROP_AMOUNT = config.get("monster drop options", "If they can, how many zivicio dusts should Ender Dragons drop when killed, default 4", 4).getInt();
/* 29 */     WITHER_ESS_DROP_AMOUNT = config.get("monster drop options", "If they can, how many zivicio dusts should the Wither Boss drop when killed, default 2", 2).getInt();
/*    */     
/* 31 */     config.getCategory("essence ore options");
/* 32 */     essOreOverworld = config.get("essence ore options", "Essence ore spawns in the overworld", true).getBoolean();
/* 33 */     essOreNether = config.get("essence ore options", "Nether Essence ore spawns in the nether", true).getBoolean();
/* 34 */     essOreEnd = config.get("essence ore options", "End Essence ore spawns in the end", true).getBoolean();
/* 35 */     maxVeinSize = config.get("essence ore options", "Edit max amount of Essence ore that can generate per vein, default = 4", 4).getInt();
/* 36 */     maxVeinSizeNether = config.get("essence ore options", "Edit max amount of Nether Essence ore that can generate per vein, default = 6", 6).getInt();
/* 37 */     maxVeinSizeEnd = config.get("essence ore options", "Edit max amount of End Essence ore that can generate per vein, default = 4", 4).getInt();
/* 38 */     oreGenerateYCord = config.get("essence ore options", "Edit the number to change the Y Cord that essence ore starts generating in the overworld, default = 45", 45).getInt();
/*    */     
/* 40 */     config.getCategory("crop options");
/* 41 */     CROP_EFFECTS = config.get("crop options", "Magical crops display particle effects, default true", true).getBoolean();
/* 42 */     PLANT_ON_BREAK = config.get("crop options", "Magical crops when broke/harvested re-plant themselves, default true", true).getBoolean();
/* 43 */     CROP_DAMAGE = config.get("crop options", "Magical Crops deal Magic damage when walked on, default true", true).getBoolean();
/*    */     
/* 45 */     config.getCategory("seed options");
/* 46 */     SECOND_SEED_CHANCE = config.get("seed options", "Number in percent for the chance of getting a second seed from Magical Crops, 0 = disabled, default = 10, Max = 100", 10).getInt();
/* 47 */     SEED_OUTPUT = config.get("seed options", "Number of seeds you get from crafting, default 1, Max 64", 1).getInt();
/*    */     
/* 49 */     config.getCategory("infusion stone options");
/* 50 */     INFUSION_DURABILITY = config.get("infusion stone options", "1 Infusion stones have durability", true).getBoolean();
/* 51 */     WEAK_DURABILITY = config.get("infusion stone options", "2 Durability of the weak infusion stone", 256).getInt();
/* 52 */     REGULAR_DURABILITY = config.get("infusion stone options", "3 Durability of the regular infusion stone", 512).getInt();
/* 53 */     STRONG_DURABILITY = config.get("infusion stone options", "4 Durability of the strong infusion stone", 1024).getInt();
/* 54 */     EXTREME_DURABILITY = config.get("infusion stone options", "5 Durability of the extreme infusion stone", 2048).getInt();
/*    */     
/* 56 */     config.getCategory("mutation options");
/* 57 */     CROP_MUTATION = config.get("mutation options", "1 Do crops mutate to gain magical seeds, default true", true).getBoolean();
/* 58 */     ACCIO_MUTATION = config.get("mutation options", "2 Mutation chance for accio based crops, e.g. Coal, default 25, max 100", 25).getInt();
/* 59 */     CRUCIO_MUTATION = config.get("mutation options", "3 Mutation chance for crucio based crops, e.g. redstone, default 25, max 100", 25).getInt();
/* 60 */     IMPERIO_MUTATION = config.get("mutation options", "4 Mutation chance for imperio based crops, e.g. gold, default 25, max 100", 25).getInt();
/* 61 */     ZIVICIO_MUTATION = config.get("mutation options", "5 Mutation chance for zivicio based crops, e.g. diamond, default 25, max 100", 25).getInt();
/*    */     
/* 63 */     ENCHANT_CRAFT = config.get("misc options", "You can use essence to craft enchanting books, default true", true).getBoolean();
/* 64 */     EXTRA_PICKAXE = config.get("misc options", "Accio, Crucio, Imperio & Zivicio Pickaxes give extra drops when mining Minicio Ores, default true", true).getBoolean();
/* 65 */     EXTRA_HOE = config.get("misc options", "Accio, Crucio, Imperio & Zivicio Hoes give extra drops when harvesting Minicio Crops, default true", true).getBoolean();
/* 66 */     ESSENCE_INGOTS = config.get("misc options", "How many Essence ingots do you get when crafted, default 3, Max 64", 3).getInt();
/* 67 */     APPLES = config.get("misc options", "Ultimate Diamond, Emerald and Ultimate Apple apples are active, default true", true).getBoolean();
/* 68 */     ARMOUR_FLIGHT = config.get("misc options", "Full Zivicio armour gives you creatve flight, default true", true).getBoolean();
/*    */ 
/*    */     
/* 71 */     config.save();
/*    */   }
/*    */   
/*    */   public static int REGULAR_DURABILITY;
/*    */   public static int STRONG_DURABILITY;
/*    */   public static int EXTREME_DURABILITY;
/*    */   public static int SEED_OUTPUT;
/*    */   public static int ACCIO_MUTATION;
/*    */   public static int CRUCIO_MUTATION;
/*    */   public static int IMPERIO_MUTATION;
/*    */   public static int ZIVICIO_MUTATION;
/*    */   public static int ESSENCE_INGOTS;
/*    */   public static int DRGAON_ESS_DROP_AMOUNT;
/*    */   public static int WITHER_ESS_DROP_AMOUNT;
/*    */   public static int HOSTILE_DROP_CHANCE;
/*    */   public static int PASSIVE_DROP_CHANCE;
/*    */   public static boolean essdrop;
/*    */   public static boolean CROP_EFFECTS;
/*    */   public static boolean essCropSeedDrop;
/*    */   public static boolean PLANT_ON_BREAK;
/*    */   public static boolean INFUSION_DURABILITY;
/*    */   public static boolean CROP_MUTATION;
/*    */   public static boolean ENCHANT_CRAFT;
/*    */   public static boolean EXTRA_PICKAXE;
/*    */   public static boolean EXTRA_HOE;
/*    */   public static boolean CROP_DAMAGE;
/*    */   public static boolean DRAGON_ESS_DROP;
/*    */   public static boolean WITHER_ESS_DROP;
/*    */   public static boolean HOSTILE_ESS_DROP;
/*    */   public static boolean PASSIVE_ESS_DROP;
/*    */   public static boolean MOB_ESS_DROP;
/*    */   public static boolean APPLES;
/*    */   public static boolean ARMOUR_FLIGHT;
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\config\ConfigMain.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */