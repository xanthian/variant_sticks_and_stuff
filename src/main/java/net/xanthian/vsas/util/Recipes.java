package net.xanthian.vsas.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import static net.xanthian.vsas.Init.MOD_ID;

public class Recipes {

    public static JsonObject createLadderRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        // Loot condition
        JsonObject json = new JsonObject();
        //If modded item
        if (modList.size() > 0)
        {
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
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        // Result
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":ladders/" + material + "_ladder");
        result.addProperty("count",3);
        json.add("result", result);
        return json;
    }

    // Stick
    public static JsonObject createStickRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
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
        result.addProperty("count",4);
        json.add("result", result);
        return json;
    }

    // Torch
    public static JsonObject createTorchRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
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
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":torches/" + material + "_torch");
        result.addProperty("count",4);
        json.add("result", result);
        return json;
    }

    // Crossbow
    public static JsonObject createCrossbowRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
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
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("V", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:iron_ingot");
        keyList.add("I", iKey);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:tripwire_hook");
        keyList.add("T", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":crossbows/" + material + "_crossbow");
        result.addProperty("count",1);
        json.add("result", result);
        return json;
    }

    // Bow
    public static JsonObject createBowRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" SV");
        pattern.add("S V");
        pattern.add(" SV");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:string");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("V", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":bows/" + material + "_bow");
        result.addProperty("count",1);
        json.add("result", result);
        return json;
    }

    // Campfire
    public static JsonObject createCampfireRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add(" S ");
        pattern.add("SCS");
        pattern.add("LLL");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_log");
        keyList.add("L", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        iKey = new JsonObject();
        iKey.addProperty("tag", "minecraft:coals");
        keyList.add("C", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":campfires/" + material + "_campfire");
        result.addProperty("count",1);
        json.add("result", result);
        System.out.println(json);
        return json;
    }

    // Arrow
    public static JsonObject createArrowRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("S");
        pattern.add("L");
        pattern.add("F");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
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
        result.addProperty("count",4);
        json.add("result", result);
        return json;
    }

    // Axe
    public static JsonObject createWoodAxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
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
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":axes/" + material + "_wooden_axe");
        result.addProperty("count",1);
        json.add("result", result);
        return json;
    }
    // Sword
    public static JsonObject createWoodSwordRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
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
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":swords/" + material + "_wooden_sword");
        result.addProperty("count",1);
        json.add("result", result);
        return json;
    }

    // Pickaxe
    public static JsonObject createWoodPickaxeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
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
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":pickaxes/" + material + "_wooden_pickaxe");
        result.addProperty("count",1);
        json.add("result", result);
        return json;
    }

    // Shovel
    public static JsonObject createWoodShovelRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
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
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":shovels/" + material + "_wooden_shovel");
        result.addProperty("count",1);
        json.add("result", result);
        return json;
    }

    // Hoe
    public static JsonObject createWoodHoeRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
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
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material + "_planks");
        keyList.add("P", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":hoes/" + material + "_wooden_hoe");
        result.addProperty("count",1);
        json.add("result", result);
        return json;
    }

    // RedstoneTorch
    public static JsonObject createRedstoneTorchRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
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
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":torches/" + material + "_redstone_torch");
        result.addProperty("count",1);
        json.add("result", result);
        return json;
    }

    // Soul Torch
    public static JsonObject createSoulTorchRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0)
        {
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
        iKey.addProperty("item", MOD_ID +":sticks/" + material + "_stick");
        keyList.add("S", iKey);
        iKey = new JsonObject();
        iKey.addProperty("tag", "minecraft:soul_fire_base_blocks");
        keyList.add("F", iKey);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":torches/" + material + "_soul_torch");
        result.addProperty("count",4);
        json.add("result", result);
        return json;
    }
}
