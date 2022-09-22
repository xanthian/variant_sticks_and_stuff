package net.xanthian.vsas.config;

import com.mojang.datafixers.util.Pair;
import net.xanthian.vsas.Init;

import java.util.ArrayList;
import java.util.List;

public class VsasConfig implements SimpleConfig.DefaultConfig {

    private String configContents =
         """
                ##############################################################################################################################################
                # All Blocks includes : Campfires, Grindstones, Ladders, Levers, Rails & Torches
                # All Items includes : Arrows, Axes, Bows, Carrot on a Stick, Crossbows, Fishing Rods, Hoes, Fungus on a Stick, Pickaxes, Shovels, Sticks, Swords
                # All Tools includes : Axes, Hoes, Pickaxes, Shovels
                # All Weapons includes : Arrows, Bows, Crossbows, Swords
                # (Probably best to leave the 'All' configs as true and just disable individual elements)
                # Disabling recipes will remove the code based recipes for ALL items to allow you to make your own.
                # (>'.')> ~ Enter true to enable or false to disable ~ <('.'<)
                ##############################################################################################################################################
                """;

    public List<Pair> getConfigsList() {
        return configsList;
    }

    private final List<Pair> configsList = new ArrayList<>();

    public void addKeyValuePair(Pair<String, ?> keyValuePair) {
        configsList.add(keyValuePair);
        configContents +="\n"+ keyValuePair.getFirst() + "=" + keyValuePair.getSecond() + "\n";
    }

    @Override
    public String get(String namespace) {
        return configContents;
    }
    public static SimpleConfig CONFIG;
    private static VsasConfig configs;

    public static boolean blocks;
    public static boolean campfires;
    public static boolean grindstones;
    public static boolean ladders;
    public static boolean levers;
    public static boolean torches;
    public static boolean rails;

    public static boolean items;
    public static boolean fishingrods;
    public static boolean onastick;

    public static boolean tools;
    public static boolean axes;
    public static boolean hoes;
    public static boolean pickaxes;
    public static boolean shovels;

    public static boolean weapons;
    public static boolean arrows;
    public static boolean bows;
    public static boolean swords;

    public static boolean recipes;

    public static void registerConfigs() {
        configs = new VsasConfig();
        createConfigs();

        CONFIG = SimpleConfig.of(Init.MOD_ID + "_config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("all blocks", true));
        configs.addKeyValuePair(new Pair<>("campfires", true));
        configs.addKeyValuePair(new Pair<>("grindstones", true));
        configs.addKeyValuePair(new Pair<>("ladders", true));
        configs.addKeyValuePair(new Pair<>("levers", true));
        configs.addKeyValuePair(new Pair<>("rails", true));
        configs.addKeyValuePair(new Pair<>("torches", true));

        configs.addKeyValuePair(new Pair<>("all items", true));
        configs.addKeyValuePair(new Pair<>("fishingrods", true));
        configs.addKeyValuePair(new Pair<>("onastick", true));

        configs.addKeyValuePair(new Pair<>("all tools", true));
        configs.addKeyValuePair(new Pair<>("axes", true));
        configs.addKeyValuePair(new Pair<>("hoes", true));
        configs.addKeyValuePair(new Pair<>("pickaxes", true));
        configs.addKeyValuePair(new Pair<>("shovels", true));

        configs.addKeyValuePair(new Pair<>("all weapons", true));
        configs.addKeyValuePair(new Pair<>("arrows", true));
        configs.addKeyValuePair(new Pair<>("bows", true));
        configs.addKeyValuePair(new Pair<>("swords", true));

        configs.addKeyValuePair(new Pair<>("recipes", true));

    }

    private static void assignConfigs() {
        blocks = CONFIG.getOrDefault("all blocks", true);
        campfires = CONFIG.getOrDefault("campfires", true);
        grindstones = CONFIG.getOrDefault("grindstones", true);
        ladders = CONFIG.getOrDefault("ladders", true);
        levers = CONFIG.getOrDefault("levers", true);
        rails = CONFIG.getOrDefault("rails", true);
        torches = CONFIG.getOrDefault("torches", true);

        items = CONFIG.getOrDefault("all items", true);
        fishingrods = CONFIG.getOrDefault("fishingrods", true);
        onastick = CONFIG.getOrDefault("onastick", true);

        tools = CONFIG.getOrDefault("all tools", true);
        axes = CONFIG.getOrDefault("axes", true);
        hoes = CONFIG.getOrDefault("hoes", true);
        pickaxes = CONFIG.getOrDefault("pickaxes", true);
        shovels = CONFIG.getOrDefault("shovels", true);

        weapons = CONFIG.getOrDefault("all weapons", true);
        bows = CONFIG.getOrDefault("bows", true);
        arrows = CONFIG.getOrDefault("arrows", true);
        swords = CONFIG.getOrDefault("swords", true);

        recipes = CONFIG.getOrDefault("recipes", true);
    }
}