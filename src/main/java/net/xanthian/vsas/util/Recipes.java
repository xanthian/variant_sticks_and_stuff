package net.xanthian.vsas.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import static net.xanthian.vsas.Init.MOD_ID;

public class Recipes {

    // Ladder
    public static JsonObject createLadderRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        // Loot condition
        JsonObject json = new JsonObject();
        //If modded item
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        // Type
        json.addProperty("type", "minecraft:crafting_shaped");
        // Pattern
        JsonArray pattern = new JsonArray();
        pattern.add("S S");
        pattern.add("SSS");
        pattern.add("S S");
        json.add("pattern", pattern);
        // Keys
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        // Result
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":ladders/" + material + "_ladder");
        result.addProperty("count", 3);
        json.add("result", result);
        return json;
    }

    // Stick
    public static JsonObject createStickRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("P");
        pattern.add("P");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        json.add("key", keyList);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        result.addProperty("count", 4);
        json.add("result", result);
        return json;
    }

    // Torch
    public static JsonObject createTorchRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("C");
        pattern.add("S");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonArray items = new JsonArray();
        JsonObject iKey = new JsonObject();
        JsonObject iKey2 = new JsonObject();
        iKey.addProperty("item", "minecraft:coal");
        iKey2.addProperty("item", "minecraft:charcoal");
        items.add(iKey);
        items.add(iKey2);
        keyList.add("C", items);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":torches/" + material + "_torch");
        result.addProperty("count", 4);
        json.add("result", result);
        return json;
    }

    // Crossbow
    public static JsonObject createCrossbowRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("VIV");
        pattern.add("STS");
        pattern.add(" V ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:string");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("V", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:iron_ingot");
        keyList.add("I", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:tripwire_hook");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":crossbows/" + material + "_crossbow");
        json.add("result", result);
        return json;
    }

    // Bow
    public static JsonObject createBowRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" VS");
        pattern.add("V S");
        pattern.add(" VS");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:string");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("V", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":bows/" + material + "_bow");
        json.add("result", result);
        return json;
    }

    // Arrow
    public static JsonObject createArrowRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("L");
        pattern.add("S");
        pattern.add("F");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:flint");
        keyList.add("L", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:feather");
        keyList.add("F", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":arrows/" + material + "_arrow");
        result.addProperty("count", 4);
        json.add("result", result);
        return json;
    }

    // Wood Axe
    public static JsonObject createWoodAxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PP ");
        pattern.add("PS ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":axes/" + material + "_wooden_axe");
        json.add("result", result);
        return json;
    }

    // Wood Sword
    public static JsonObject createWoodSwordRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" P ");
        pattern.add(" P ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":swords/" + material + "_wooden_sword");
        json.add("result", result);
        return json;
    }

    // Wood Pickaxe
    public static JsonObject createWoodPickaxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PPP");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":pickaxes/" + material + "_wooden_pickaxe");
        json.add("result", result);
        return json;
    }

    // Wood Shovel
    public static JsonObject createWoodShovelRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" P ");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":shovels/" + material + "_wooden_shovel");
        json.add("result", result);
        return json;
    }

    // Wood Hoe
    public static JsonObject createWoodHoeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PP ");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":hoes/" + material + "_wooden_hoe");
        json.add("result", result);
        return json;
    }

    // Stone Axe
    public static JsonObject createStoneAxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PP ");
        pattern.add("PS ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("tag", "minecraft:stone_tool_materials");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":axes/" + material + "_stone_axe");
        json.add("result", result);
        return json;
    }

    // Stone Sword
    public static JsonObject createStoneSwordRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" P ");
        pattern.add(" P ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("tag", "minecraft:stone_tool_materials");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":swords/" + material + "_stone_sword");
        json.add("result", result);
        return json;
    }

    // Stone Pickaxe
    public static JsonObject createStonePickaxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PPP");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("tag", "minecraft:stone_tool_materials");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":pickaxes/" + material + "_stone_pickaxe");
        json.add("result", result);
        return json;
    }

    // Stone Shovel
    public static JsonObject createStoneShovelRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" P ");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("tag", "minecraft:stone_tool_materials");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":shovels/" + material + "_stone_shovel");
        json.add("result", result);
        return json;
    }

    // Stone Hoe
    public static JsonObject createStoneHoeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PP ");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("tag", "minecraft:stone_tool_materials");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":hoes/" + material + "_stone_hoe");
        json.add("result", result);
        return json;
    }

    // Iron Axe
    public static JsonObject createIronAxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PP ");
        pattern.add("PS ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:iron_ingot");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":axes/" + material + "_iron_axe");
        json.add("result", result);
        return json;
    }

    // Iron Sword
    public static JsonObject createIronSwordRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" P ");
        pattern.add(" P ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:iron_ingot");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":swords/" + material + "_iron_sword");
        json.add("result", result);
        return json;
    }

    // Iron Pickaxe
    public static JsonObject createIronPickaxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PPP");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:iron_ingot");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":pickaxes/" + material + "_iron_pickaxe");
        json.add("result", result);
        return json;
    }

    // Iron Shovel
    public static JsonObject createIronShovelRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" P ");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:iron_ingot");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":shovels/" + material + "_iron_shovel");
        json.add("result", result);
        return json;
    }

    // Iron Hoe
    public static JsonObject createIronHoeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PP ");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:iron_ingot");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":hoes/" + material + "_iron_hoe");
        json.add("result", result);
        return json;
    }

    // Golden Axe
    public static JsonObject createGoldenAxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PP ");
        pattern.add("PS ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:gold_ingot");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":axes/" + material + "_golden_axe");
        json.add("result", result);
        return json;
    }

    // Golden Sword
    public static JsonObject createGoldenSwordRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" P ");
        pattern.add(" P ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:gold_ingot");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":swords/" + material + "_golden_sword");
        json.add("result", result);
        return json;
    }

    // Golden Pickaxe
    public static JsonObject createGoldenPickaxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PPP");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:gold_ingot");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":pickaxes/" + material + "_golden_pickaxe");
        json.add("result", result);
        return json;
    }

    // Golden Shovel
    public static JsonObject createGoldenShovelRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" P ");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:gold_ingot");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":shovels/" + material + "_golden_shovel");
        json.add("result", result);
        return json;
    }

    // Golden Hoe
    public static JsonObject createGoldenHoeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PP ");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:gold_ingot");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":hoes/" + material + "_golden_hoe");
        json.add("result", result);
        return json;
    }

    // Diamond Axe
    public static JsonObject createDiamondAxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PP ");
        pattern.add("PS ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:diamond");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":axes/" + material + "_diamond_axe");
        json.add("result", result);
        return json;
    }

    // Diamond Sword
    public static JsonObject createDiamondSwordRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" P ");
        pattern.add(" P ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:diamond");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":swords/" + material + "_diamond_sword");
        json.add("result", result);
        return json;
    }

    // Diamond Pickaxe
    public static JsonObject createDiamondPickaxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PPP");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:diamond");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":pickaxes/" + material + "_diamond_pickaxe");
        json.add("result", result);
        return json;
    }

    // Diamond Shovel
    public static JsonObject createDiamondShovelRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" P ");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:diamond");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":shovels/" + material + "_diamond_shovel");
        json.add("result", result);
        return json;
    }

    // Diamond Hoe
    public static JsonObject createDiamondHoeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("PP ");
        pattern.add(" S ");
        pattern.add(" S ");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:diamond");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":hoes/" + material + "_diamond_hoe");
        json.add("result", result);
        return json;
    }

    // RedstoneTorch
    public static JsonObject createRedstoneTorchRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("R");
        pattern.add("S");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:redstone");
        keyList.add("R", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":torches/" + material + "_redstone_torch");
        json.add("result", result);
        return json;
    }

    // Soul Torch
    public static JsonObject createSoulTorchRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("C");
        pattern.add("S");
        pattern.add("F");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonArray items = new JsonArray();
        JsonObject iKey = new JsonObject();
        JsonObject iKey2 = new JsonObject();
        iKey.addProperty("item", "minecraft:coal");
        iKey2.addProperty("item", "minecraft:charcoal");
        items.add(iKey);
        items.add(iKey2);
        keyList.add("C", items);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        iKey = new JsonObject();
        iKey.addProperty("tag", "minecraft:soul_fire_base_blocks");
        keyList.add("F", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":torches/" + material + "_soul_torch");
        result.addProperty("count", 4);
        json.add("result", result);
        return json;
    }

    // Fishing Rod
    public static JsonObject createFishingRodRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("  V");
        pattern.add(" VS");
        pattern.add("V S");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:string");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("V", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":fishingrods/" + material + "_fishing_rod");
        json.add("result", result);
        return json;
    }

    // Carrot on a Stick
    public static JsonObject createCarrotOnAStickRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("F ");
        pattern.add(" C");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:carrot");
        keyList.add("C", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":fishingrods/" + material + "_fishing_rod");
        keyList.add("F", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":onastick/" + material + "_carrot_on_a_stick");
        json.add("result", result);
        return json;
    }

    // Fungus on a Stick
    public static JsonObject createFungusOnAStickRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("F ");
        pattern.add(" W");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:warped_fungus");
        keyList.add("W", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":fishingrods/" + material + "_fishing_rod");
        keyList.add("F", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":onastick/" + material + "_warped_fungus_on_a_stick");
        json.add("result", result);
        return json;
    }

    // Rails
    public static JsonObject createRailRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("I I");
        pattern.add("ISI");
        pattern.add("I I");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:iron_ingot");
        keyList.add("I", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":rails/" + material + "_rail");
        json.add("result", result);
        result.addProperty("count", 16);
        return json;
    }

    // Activator Rail
    public static JsonObject createActivatorRailRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("ISI");
        pattern.add("IRI");
        pattern.add("ISI");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:iron_ingot");
        keyList.add("I", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":torches/" + material + "_redstone_torch");
        keyList.add("R", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":rails/" + material + "_activator_rail");
        json.add("result", result);
        result.addProperty("count", 6);
        return json;
    }

    // Detector Rail
    public static JsonObject createDetectorRailRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("I I");
        pattern.add("ISI");
        pattern.add("I I");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:iron_ingot");
        keyList.add("I", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":rails/" + material + "_rail");
        json.add("result", result);
        result.addProperty("count", 16);
        return json;
    }

    // Powered Rail
    public static JsonObject createPoweredRailRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("G G");
        pattern.add("GSG");
        pattern.add("GRG");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:gold_ingot");
        keyList.add("G", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:redstone");
        keyList.add("R", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":rails/" + material + "_powered_rail");
        json.add("result", result);
        result.addProperty("count", 6);
        return json;
    }


    //                                   //
    // Netherite Smithing Tools & Weapons//
    //                                   //

    public static JsonObject createNetheriteAxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":axes/" + material + "_diamond_axe");
        json.add("base", iKey);
        JsonObject iKey2 = new JsonObject();
        iKey2.addProperty("item", "minecraft:netherite_ingot");
        json.add("addition", iKey2);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":axes/" + material + "_netherite_axe");
        json.add("result", result);
        return json;
    }

    public static JsonObject createNetheriteHoeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":hoes/" + material + "_diamond_hoe");
        json.add("base", iKey);
        JsonObject iKey2 = new JsonObject();
        iKey2.addProperty("item", "minecraft:netherite_ingot");
        json.add("addition", iKey2);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":hoes/" + material + "_netherite_hoe");
        json.add("result", result);
        return json;
    }

    public static JsonObject createNetheritePickaxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":pickaxes/" + material + "_diamond_pickaxe");
        json.add("base", iKey);
        JsonObject iKey2 = new JsonObject();
        iKey2.addProperty("item", "minecraft:netherite_ingot");
        json.add("addition", iKey2);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":pickaxes/" + material + "_netherite_pickaxe");
        json.add("result", result);
        return json;
    }

    public static JsonObject createNetheriteShovelRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":shovels/" + material + "_diamond_shovel");
        json.add("base", iKey);
        JsonObject iKey2 = new JsonObject();
        iKey2.addProperty("item", "minecraft:netherite_ingot");
        json.add("addition", iKey2);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":shovels/" + material + "_netherite_shovel");
        json.add("result", result);
        return json;
    }

    public static JsonObject createNetheriteSwordRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:smithing");
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID + ":swords/" + material + "_diamond_sword");
        json.add("base", iKey);
        JsonObject iKey2 = new JsonObject();
        iKey2.addProperty("item", "minecraft:netherite_ingot");
        json.add("addition", iKey2);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":swords/" + material + "_netherite_sword");
        json.add("result", result);
        return json;
    }
}