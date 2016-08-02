package me.Fupery.InventoryMenu.Utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import static me.Fupery.InventoryMenu.Utils.VersionHandler.*;

public enum SoundCompat {
    AMBIENT_CAVE(Sound_1_8.AMBIENCE_CAVE),
    BLOCK_ANVIL_BREAK(Sound_1_8.ANVIL_BREAK),
    BLOCK_ANVIL_DESTROY,
    BLOCK_ANVIL_FALL(Sound_1_8.ANVIL_LAND),
    BLOCK_ANVIL_HIT,
    BLOCK_ANVIL_LAND,
    BLOCK_ANVIL_PLACE,
    BLOCK_ANVIL_STEP,
    BLOCK_ANVIL_USE(Sound_1_8.ANVIL_USE),
    BLOCK_BREWING_STAND_BREW,
    BLOCK_CHEST_CLOSE(Sound_1_8.CHEST_CLOSE),
    BLOCK_CHEST_LOCKED,
    BLOCK_CHEST_OPEN(Sound_1_8.CHEST_OPEN),
    BLOCK_CHORUS_FLOWER_DEATH,
    BLOCK_CHORUS_FLOWER_GROW,
    BLOCK_CLOTH_BREAK,
    BLOCK_CLOTH_FALL,
    BLOCK_CLOTH_HIT(Sound_1_8.DIG_WOOL),
    BLOCK_CLOTH_PLACE,
    BLOCK_CLOTH_STEP(Sound_1_8.STEP_WOOL),
    BLOCK_COMPARATOR_CLICK(Sound_1_8.CLICK),
    BLOCK_DISPENSER_DISPENSE(Sound_1_8.CLICK),
    BLOCK_DISPENSER_FAIL,
    BLOCK_DISPENSER_LAUNCH,
    BLOCK_ENDERCHEST_CLOSE(Sound_1_8.CHEST_CLOSE),
    BLOCK_ENDERCHEST_OPEN(Sound_1_8.CHEST_OPEN),
    BLOCK_END_GATEWAY_SPAWN,
    BLOCK_FENCE_GATE_CLOSE(Sound_1_8.DOOR_CLOSE),
    BLOCK_FENCE_GATE_OPEN(Sound_1_8.DOOR_OPEN),
    BLOCK_FIRE_AMBIENT(Sound_1_8.FIRE),
    BLOCK_FIRE_EXTINGUISH(Sound_1_8.FIZZ),
    BLOCK_FURNACE_FIRE_CRACKLE(Sound_1_8.FIRE),
    BLOCK_GLASS_BREAK(Sound_1_8.GLASS),
    BLOCK_GLASS_FALL(Sound_1_8.GLASS),
    BLOCK_GLASS_HIT(Sound_1_8.GLASS),
    BLOCK_GLASS_PLACE(Sound_1_8.GLASS),
    BLOCK_GLASS_STEP(Sound_1_8.GLASS),
    BLOCK_GRASS_BREAK(Sound_1_8.DIG_GRASS),
    BLOCK_GRASS_FALL(Sound_1_8.STEP_GRASS),
    BLOCK_GRASS_HIT(Sound_1_8.DIG_GRASS),
    BLOCK_GRASS_PLACE(Sound_1_8.STEP_GRASS),
    BLOCK_GRASS_STEP(Sound_1_8.STEP_GRASS),
    BLOCK_GRAVEL_BREAK(Sound_1_8.DIG_GRAVEL),
    BLOCK_GRAVEL_FALL(Sound_1_8.STEP_GRAVEL),
    BLOCK_GRAVEL_HIT(Sound_1_8.DIG_GRAVEL),
    BLOCK_GRAVEL_PLACE(Sound_1_8.STEP_GRAVEL),
    BLOCK_GRAVEL_STEP(Sound_1_8.STEP_GRAVEL),
    BLOCK_IRON_DOOR_CLOSE(Sound_1_8.DOOR_OPEN),
    BLOCK_IRON_DOOR_OPEN(Sound_1_8.DOOR_CLOSE),
    BLOCK_IRON_TRAPDOOR_CLOSE(Sound_1_8.DOOR_OPEN),
    BLOCK_IRON_TRAPDOOR_OPEN(Sound_1_8.DOOR_CLOSE),
    BLOCK_LADDER_BREAK(Sound_1_8.STEP_LADDER),
    BLOCK_LADDER_FALL(Sound_1_8.STEP_LADDER),
    BLOCK_LADDER_HIT(Sound_1_8.STEP_LADDER),
    BLOCK_LADDER_PLACE(Sound_1_8.STEP_LADDER),
    BLOCK_LADDER_STEP(Sound_1_8.STEP_LADDER),
    BLOCK_LAVA_AMBIENT(Sound_1_8.LAVA),
    BLOCK_LAVA_EXTINGUISH(Sound_1_8.FIZZ),
    BLOCK_LAVA_POP(Sound_1_8.LAVA_POP),
    BLOCK_LEVER_CLICK(Sound_1_8.CLICK),
    BLOCK_METAL_BREAK,
    BLOCK_METAL_FALL,
    BLOCK_METAL_HIT,
    BLOCK_METAL_PLACE,
    BLOCK_METAL_PRESSUREPLATE_CLICK_OFF(Sound_1_8.CLICK),
    BLOCK_METAL_PRESSUREPLATE_CLICK_ON(Sound_1_8.CLICK),
    BLOCK_METAL_STEP,
    BLOCK_NOTE_BASEDRUM(Sound_1_8.NOTE_BASS_DRUM),
    BLOCK_NOTE_BASS(Sound_1_8.NOTE_BASS_GUITAR),
    BLOCK_NOTE_HARP(Sound_1_8.NOTE_PIANO),
    BLOCK_NOTE_HAT(Sound_1_8.NOTE_STICKS),
    BLOCK_NOTE_PLING(Sound_1_8.NOTE_PLING),
    BLOCK_NOTE_SNARE(Sound_1_8.NOTE_SNARE_DRUM),
    BLOCK_PISTON_CONTRACT(Sound_1_8.PISTON_RETRACT),
    BLOCK_PISTON_EXTEND(Sound_1_8.PISTON_EXTEND),
    BLOCK_PORTAL_AMBIENT(Sound_1_8.PORTAL),
    BLOCK_PORTAL_TRAVEL(Sound_1_8.PORTAL_TRAVEL),
    BLOCK_PORTAL_TRIGGER(Sound_1_8.PORTAL_TRIGGER),
    BLOCK_REDSTONE_TORCH_BURNOUT(Sound_1_8.FIZZ),
    BLOCK_SAND_BREAK(Sound_1_8.DIG_SAND),
    BLOCK_SAND_FALL(Sound_1_8.DIG_SAND),
    BLOCK_SAND_HIT(Sound_1_8.DIG_SAND),
    BLOCK_SAND_PLACE(Sound_1_8.STEP_SAND),
    BLOCK_SAND_STEP(Sound_1_8.STEP_SAND),
    BLOCK_SLIME_BREAK(Sound_1_8.SLIME_WALK2),
    BLOCK_SLIME_FALL(Sound_1_8.SLIME_WALK),
    BLOCK_SLIME_HIT(Sound_1_8.SLIME_WALK),
    BLOCK_SLIME_PLACE(Sound_1_8.SLIME_WALK),
    BLOCK_SLIME_STEP(Sound_1_8.SLIME_WALK),
    BLOCK_SNOW_BREAK(Sound_1_8.DIG_SNOW),
    BLOCK_SNOW_FALL(Sound_1_8.STEP_SNOW),
    BLOCK_SNOW_HIT(Sound_1_8.DIG_SNOW),
    BLOCK_SNOW_PLACE(Sound_1_8.STEP_SNOW),
    BLOCK_SNOW_STEP(Sound_1_8.STEP_SNOW),
    BLOCK_STONE_BREAK(Sound_1_8.DIG_STONE),
    BLOCK_STONE_BUTTON_CLICK_OFF(Sound_1_8.CLICK),
    BLOCK_STONE_BUTTON_CLICK_ON(Sound_1_8.CLICK),
    BLOCK_STONE_FALL(Sound_1_8.STEP_STONE),
    BLOCK_STONE_HIT(Sound_1_8.DIG_STONE),
    BLOCK_STONE_PLACE(Sound_1_8.STEP_STONE),
    BLOCK_STONE_PRESSUREPLATE_CLICK_OFF(Sound_1_8.CLICK),
    BLOCK_STONE_PRESSUREPLATE_CLICK_ON(Sound_1_8.STEP_STONE),
    BLOCK_STONE_STEP(Sound_1_8.STEP_STONE),
    BLOCK_TRIPWIRE_ATTACH,
    BLOCK_TRIPWIRE_CLICK_OFF(Sound_1_8.CLICK),
    BLOCK_TRIPWIRE_CLICK_ON(Sound_1_8.CLICK),
    BLOCK_TRIPWIRE_DETACH,
    BLOCK_WATERLILY_PLACE,
    BLOCK_WATER_AMBIENT(Sound_1_8.WATER),
    BLOCK_WOODEN_DOOR_CLOSE(Sound_1_8.DOOR_CLOSE),
    BLOCK_WOODEN_DOOR_OPEN(Sound_1_8.DOOR_OPEN),
    BLOCK_WOODEN_TRAPDOOR_CLOSE(Sound_1_8.DOOR_CLOSE),
    BLOCK_WOODEN_TRAPDOOR_OPEN(Sound_1_8.DOOR_OPEN),
    BLOCK_WOOD_BREAK(Sound_1_8.DIG_WOOD),
    BLOCK_WOOD_BUTTON_CLICK_OFF(Sound_1_8.WOOD_CLICK),
    BLOCK_WOOD_BUTTON_CLICK_ON(Sound_1_8.WOOD_CLICK),
    BLOCK_WOOD_FALL(Sound_1_8.STEP_WOOD),
    BLOCK_WOOD_HIT(Sound_1_8.DIG_WOOD),
    BLOCK_WOOD_PLACE(Sound_1_8.STEP_WOOD),
    BLOCK_WOOD_PRESSUREPLATE_CLICK_OFF(Sound_1_8.WOOD_CLICK),
    BLOCK_WOOD_PRESSUREPLATE_CLICK_ON(Sound_1_8.WOOD_CLICK),
    BLOCK_WOOD_STEP,
    ENCHANT_THORNS_HIT,
    ENTITY_ARMORSTAND_BREAK,
    ENTITY_ARMORSTAND_FALL,
    ENTITY_ARMORSTAND_HIT,
    ENTITY_ARMORSTAND_PLACE,
    ENTITY_ARROW_HIT(Sound_1_8.ARROW_HIT),
    ENTITY_ARROW_HIT_PLAYER(Sound_1_8.ARROW_HIT),
    ENTITY_ARROW_SHOOT(Sound_1_8.SHOOT_ARROW),
    ENTITY_BAT_AMBIENT(Sound_1_8.BAT_IDLE),
    ENTITY_BAT_DEATH(Sound_1_8.BAT_DEATH),
    ENTITY_BAT_HURT(Sound_1_8.BAT_HURT),
    ENTITY_BAT_LOOP(Sound_1_8.BAT_LOOP),
    ENTITY_BAT_TAKEOFF(Sound_1_8.BAT_TAKEOFF),
    ENTITY_BLAZE_AMBIENT,
    ENTITY_BLAZE_BURN,
    ENTITY_BLAZE_DEATH(Sound_1_8.BLAZE_DEATH),
    ENTITY_BLAZE_HURT(Sound_1_8.BLAZE_HIT),
    ENTITY_BLAZE_SHOOT(Sound_1_8.BLAZE_BREATH),
    ENTITY_BOBBER_SPLASH(Sound_1_8.SPLASH2),
    ENTITY_BOBBER_THROW,
    ENTITY_CAT_AMBIENT,
    ENTITY_CAT_DEATH(Sound_1_8.CAT_HIT),
    ENTITY_CAT_HISS(Sound_1_8.CAT_HISS),
    ENTITY_CAT_HURT(Sound_1_8.CAT_HIT),
    ENTITY_CAT_PURR(Sound_1_8.CAT_PURR),
    ENTITY_CAT_PURREOW(Sound_1_8.CAT_PURREOW),
    ENTITY_CHICKEN_AMBIENT,
    ENTITY_CHICKEN_DEATH(Sound_1_8.CHICKEN_HURT),
    ENTITY_CHICKEN_EGG(Sound_1_8.CHICKEN_EGG_POP),
    ENTITY_CHICKEN_HURT(Sound_1_8.CHICKEN_HURT),
    ENTITY_CHICKEN_STEP(Sound_1_8.CHICKEN_WALK),
    ENTITY_COW_AMBIENT(Sound_1_8.COW_IDLE),
    ENTITY_COW_DEATH(Sound_1_8.COW_HURT),
    ENTITY_COW_HURT(Sound_1_8.COW_HURT),
    ENTITY_COW_MILK,
    ENTITY_COW_STEP,
    ENTITY_CREEPER_DEATH(Sound_1_8.CREEPER_DEATH),
    ENTITY_CREEPER_HURT,
    ENTITY_CREEPER_PRIMED(Sound_1_8.CREEPER_HISS),
    ENTITY_DONKEY_AMBIENT(Sound_1_8.DONKEY_IDLE),
    ENTITY_DONKEY_ANGRY(Sound_1_8.DONKEY_ANGRY),
    ENTITY_DONKEY_CHEST(Sound_1_8.CHEST_OPEN),
    ENTITY_DONKEY_DEATH(Sound_1_8.DONKEY_DEATH),
    ENTITY_DONKEY_HURT(Sound_1_8.DONKEY_HIT),
    ENTITY_EGG_THROW,
    ENTITY_ELDER_GUARDIAN_AMBIENT,
    ENTITY_ELDER_GUARDIAN_AMBIENT_LAND,
    ENTITY_ELDER_GUARDIAN_CURSE,
    ENTITY_ELDER_GUARDIAN_DEATH,
    ENTITY_ELDER_GUARDIAN_DEATH_LAND,
    ENTITY_ELDER_GUARDIAN_HURT,
    ENTITY_ELDER_GUARDIAN_HURT_LAND,
    ENTITY_ENDERDRAGON_AMBIENT,
    ENTITY_ENDERDRAGON_DEATH(Sound_1_8.ENDERDRAGON_DEATH),
    ENTITY_ENDERDRAGON_FIREBALL_EXPLODE(Sound_1_8.EXPLODE),
    ENTITY_ENDERDRAGON_FLAP(Sound_1_8.ENDERDRAGON_WINGS),
    ENTITY_ENDERDRAGON_GROWL(Sound_1_8.ENDERDRAGON_GROWL),
    ENTITY_ENDERDRAGON_HURT(Sound_1_8.ENDERDRAGON_HIT),
    ENTITY_ENDERDRAGON_SHOOT(Sound_1_8.FIRE_IGNITE),
    ENTITY_ENDEREYE_LAUNCH(Sound_1_8.ENDERMAN_TELEPORT),
    ENTITY_ENDERMEN_AMBIENT(Sound_1_8.ENDERMAN_IDLE),
    ENTITY_ENDERMEN_DEATH(Sound_1_8.ENDERMAN_DEATH),
    ENTITY_ENDERMEN_HURT(Sound_1_8.ENDERMAN_HIT),
    ENTITY_ENDERMEN_SCREAM(Sound_1_8.ENDERMAN_SCREAM),
    ENTITY_ENDERMEN_STARE(Sound_1_8.ENDERMAN_STARE),
    ENTITY_ENDERMEN_TELEPORT(Sound_1_8.ENDERMAN_TELEPORT),
    ENTITY_ENDERMITE_AMBIENT,
    ENTITY_ENDERMITE_DEATH,
    ENTITY_ENDERMITE_HURT,
    ENTITY_ENDERMITE_STEP,
    ENTITY_ENDERPEARL_THROW(Sound_1_8.ENDERMAN_TELEPORT),
    ENTITY_EXPERIENCE_BOTTLE_THROW(Sound_1_8.GLASS),
    ENTITY_EXPERIENCE_ORB_PICKUP(Sound_1_8.ORB_PICKUP),
    ENTITY_EXPERIENCE_ORB_TOUCH(Sound_1_8.ORB_PICKUP),
    ENTITY_FIREWORK_BLAST,
    ENTITY_FIREWORK_BLAST_FAR,
    ENTITY_FIREWORK_LARGE_BLAST,
    ENTITY_FIREWORK_LARGE_BLAST_FAR,
    ENTITY_FIREWORK_LAUNCH,
    ENTITY_FIREWORK_SHOOT,
    ENTITY_FIREWORK_TWINKLE,
    ENTITY_FIREWORK_TWINKLE_FAR,
    ENTITY_GENERIC_BIG_FALL,
    ENTITY_GENERIC_BURN,
    ENTITY_GENERIC_DEATH,
    ENTITY_GENERIC_DRINK,
    ENTITY_GENERIC_EAT,
    ENTITY_GENERIC_EXPLODE,
    ENTITY_GENERIC_EXTINGUISH_FIRE,
    ENTITY_GENERIC_HURT,
    ENTITY_GENERIC_SMALL_FALL,
    ENTITY_GENERIC_SPLASH,
    ENTITY_GENERIC_SWIM,
    ENTITY_GHAST_AMBIENT,
    ENTITY_GHAST_DEATH,
    ENTITY_GHAST_HURT,
    ENTITY_GHAST_SCREAM,
    ENTITY_GHAST_SHOOT,
    ENTITY_GHAST_WARN,
    ENTITY_GUARDIAN_AMBIENT,
    ENTITY_GUARDIAN_AMBIENT_LAND,
    ENTITY_GUARDIAN_ATTACK,
    ENTITY_GUARDIAN_DEATH,
    ENTITY_GUARDIAN_DEATH_LAND,
    ENTITY_GUARDIAN_FLOP,
    ENTITY_GUARDIAN_HURT,
    ENTITY_GUARDIAN_HURT_LAND,
    ENTITY_HORSE_AMBIENT,
    ENTITY_HORSE_ANGRY,
    ENTITY_HORSE_ARMOR,
    ENTITY_HORSE_BREATHE,
    ENTITY_HORSE_DEATH,
    ENTITY_HORSE_EAT,
    ENTITY_HORSE_GALLOP,
    ENTITY_HORSE_HURT,
    ENTITY_HORSE_JUMP,
    ENTITY_HORSE_LAND,
    ENTITY_HORSE_SADDLE,
    ENTITY_HORSE_STEP,
    ENTITY_HORSE_STEP_WOOD,
    ENTITY_HOSTILE_BIG_FALL,
    ENTITY_HOSTILE_DEATH,
    ENTITY_HOSTILE_HURT,
    ENTITY_HOSTILE_SMALL_FALL,
    ENTITY_HOSTILE_SPLASH,
    ENTITY_HOSTILE_SWIM,
    ENTITY_IRONGOLEM_ATTACK,
    ENTITY_IRONGOLEM_DEATH,
    ENTITY_IRONGOLEM_HURT,
    ENTITY_IRONGOLEM_STEP,
    ENTITY_ITEMFRAME_ADD_ITEM,
    ENTITY_ITEMFRAME_BREAK,
    ENTITY_ITEMFRAME_PLACE,
    ENTITY_ITEMFRAME_REMOVE_ITEM,
    ENTITY_ITEMFRAME_ROTATE_ITEM,
    ENTITY_ITEM_BREAK,
    ENTITY_ITEM_PICKUP,
    ENTITY_LEASHKNOT_BREAK,
    ENTITY_LEASHKNOT_PLACE,
    ENTITY_LIGHTNING_IMPACT,
    ENTITY_LIGHTNING_THUNDER(Sound_1_8.AMBIENCE_THUNDER),
    ENTITY_LINGERINGPOTION_THROW(Sound_1_8.GLASS),
    ENTITY_MAGMACUBE_DEATH,
    ENTITY_MAGMACUBE_HURT,
    ENTITY_MAGMACUBE_JUMP,
    ENTITY_MAGMACUBE_SQUISH,
    ENTITY_MINECART_INSIDE,
    ENTITY_MINECART_RIDING,
    ENTITY_MOOSHROOM_SHEAR,
    ENTITY_MULE_AMBIENT,
    ENTITY_MULE_DEATH,
    ENTITY_MULE_HURT,
    ENTITY_PAINTING_BREAK,
    ENTITY_PAINTING_PLACE,
    ENTITY_PIG_AMBIENT,
    ENTITY_PIG_DEATH,
    ENTITY_PIG_HURT,
    ENTITY_PIG_SADDLE,
    ENTITY_PIG_STEP,
    ENTITY_PLAYER_ATTACK_CRIT,
    ENTITY_PLAYER_ATTACK_KNOCKBACK,
    ENTITY_PLAYER_ATTACK_NODAMAGE,
    ENTITY_PLAYER_ATTACK_STRONG,
    ENTITY_PLAYER_ATTACK_SWEEP,
    ENTITY_PLAYER_ATTACK_WEAK,
    ENTITY_PLAYER_BIG_FALL(Sound_1_8.FALL_BIG),
    ENTITY_PLAYER_BREATH,
    ENTITY_PLAYER_BURP,
    ENTITY_PLAYER_DEATH,
    ENTITY_PLAYER_HURT(Sound_1_8.HURT_FLESH),
    ENTITY_PLAYER_LEVELUP(Sound_1_8.LEVEL_UP),
    ENTITY_PLAYER_SMALL_FALL(Sound_1_8.FALL_SMALL),
    ENTITY_PLAYER_SPLASH(Sound_1_8.SPLASH),
    ENTITY_PLAYER_SWIM(Sound_1_8.SWIM),
    ENTITY_RABBIT_AMBIENT,
    ENTITY_RABBIT_ATTACK,
    ENTITY_RABBIT_DEATH,
    ENTITY_RABBIT_HURT,
    ENTITY_RABBIT_JUMP,
    ENTITY_SHEEP_AMBIENT,
    ENTITY_SHEEP_DEATH,
    ENTITY_SHEEP_HURT,
    ENTITY_SHEEP_SHEAR,
    ENTITY_SHEEP_STEP,
    ENTITY_SHULKER_AMBIENT,
    ENTITY_SHULKER_BULLET_HIT,
    ENTITY_SHULKER_BULLET_HURT,
    ENTITY_SHULKER_CLOSE,
    ENTITY_SHULKER_DEATH,
    ENTITY_SHULKER_HURT,
    ENTITY_SHULKER_HURT_CLOSED,
    ENTITY_SHULKER_OPEN,
    ENTITY_SHULKER_SHOOT,
    ENTITY_SHULKER_TELEPORT,
    ENTITY_SILVERFISH_AMBIENT,
    ENTITY_SILVERFISH_DEATH,
    ENTITY_SILVERFISH_HURT,
    ENTITY_SILVERFISH_STEP,
    ENTITY_SKELETON_AMBIENT,
    ENTITY_SKELETON_DEATH,
    ENTITY_SKELETON_HORSE_AMBIENT,
    ENTITY_SKELETON_HORSE_DEATH,
    ENTITY_SKELETON_HORSE_HURT,
    ENTITY_SKELETON_HURT,
    ENTITY_SKELETON_SHOOT,
    ENTITY_SKELETON_STEP,
    ENTITY_SLIME_ATTACK,
    ENTITY_SLIME_DEATH,
    ENTITY_SLIME_HURT,
    ENTITY_SLIME_JUMP,
    ENTITY_SLIME_SQUISH,
    ENTITY_SMALL_MAGMACUBE_DEATH,
    ENTITY_SMALL_MAGMACUBE_HURT,
    ENTITY_SMALL_MAGMACUBE_SQUISH,
    ENTITY_SMALL_SLIME_DEATH,
    ENTITY_SMALL_SLIME_HURT,
    ENTITY_SMALL_SLIME_JUMP,
    ENTITY_SMALL_SLIME_SQUISH,
    ENTITY_SNOWBALL_THROW,
    ENTITY_SNOWMAN_AMBIENT,
    ENTITY_SNOWMAN_DEATH,
    ENTITY_SNOWMAN_HURT,
    ENTITY_SNOWMAN_SHOOT,
    ENTITY_SPIDER_AMBIENT,
    ENTITY_SPIDER_DEATH,
    ENTITY_SPIDER_HURT,
    ENTITY_SPIDER_STEP,
    ENTITY_SPLASH_POTION_BREAK,
    ENTITY_SPLASH_POTION_THROW,
    ENTITY_SQUID_AMBIENT,
    ENTITY_SQUID_DEATH,
    ENTITY_SQUID_HURT,
    ENTITY_TNT_PRIMED,
    ENTITY_VILLAGER_AMBIENT,
    ENTITY_VILLAGER_DEATH,
    ENTITY_VILLAGER_HURT,
    ENTITY_VILLAGER_NO,
    ENTITY_VILLAGER_TRADING,
    ENTITY_VILLAGER_YES,
    ENTITY_WITCH_AMBIENT,
    ENTITY_WITCH_DEATH,
    ENTITY_WITCH_DRINK,
    ENTITY_WITCH_HURT,
    ENTITY_WITCH_THROW,
    ENTITY_WITHER_AMBIENT,
    ENTITY_WITHER_BREAK_BLOCK,
    ENTITY_WITHER_DEATH,
    ENTITY_WITHER_HURT,
    ENTITY_WITHER_SHOOT,
    ENTITY_WITHER_SPAWN,
    ENTITY_WOLF_AMBIENT,
    ENTITY_WOLF_DEATH,
    ENTITY_WOLF_GROWL,
    ENTITY_WOLF_HOWL,
    ENTITY_WOLF_HURT,
    ENTITY_WOLF_PANT,
    ENTITY_WOLF_SHAKE,
    ENTITY_WOLF_STEP,
    ENTITY_WOLF_WHINE,
    ENTITY_ZOMBIE_AMBIENT,
    ENTITY_ZOMBIE_ATTACK_DOOR_WOOD,
    ENTITY_ZOMBIE_ATTACK_IRON_DOOR,
    ENTITY_ZOMBIE_BREAK_DOOR_WOOD,
    ENTITY_ZOMBIE_DEATH,
    ENTITY_ZOMBIE_HORSE_AMBIENT,
    ENTITY_ZOMBIE_HORSE_DEATH,
    ENTITY_ZOMBIE_HORSE_HURT,
    ENTITY_ZOMBIE_HURT,
    ENTITY_ZOMBIE_INFECT,
    ENTITY_ZOMBIE_PIG_AMBIENT,
    ENTITY_ZOMBIE_PIG_ANGRY,
    ENTITY_ZOMBIE_PIG_DEATH,
    ENTITY_ZOMBIE_PIG_HURT,
    ENTITY_ZOMBIE_STEP,
    ENTITY_ZOMBIE_VILLAGER_AMBIENT,
    ENTITY_ZOMBIE_VILLAGER_CONVERTED,
    ENTITY_ZOMBIE_VILLAGER_CURE,
    ENTITY_ZOMBIE_VILLAGER_DEATH,
    ENTITY_ZOMBIE_VILLAGER_HURT,
    ENTITY_ZOMBIE_VILLAGER_STEP,
    ITEM_ARMOR_EQUIP_CHAIN,
    ITEM_ARMOR_EQUIP_DIAMOND,
    ITEM_ARMOR_EQUIP_GENERIC,
    ITEM_ARMOR_EQUIP_GOLD,
    ITEM_ARMOR_EQUIP_IRON,
    ITEM_ARMOR_EQUIP_LEATHER,
    ITEM_BOTTLE_FILL,
    ITEM_BOTTLE_FILL_DRAGONBREATH,
    ITEM_BUCKET_EMPTY,
    ITEM_BUCKET_EMPTY_LAVA,
    ITEM_BUCKET_FILL,
    ITEM_BUCKET_FILL_LAVA,
    ITEM_CHORUS_FRUIT_TELEPORT,
    ITEM_FIRECHARGE_USE,
    ITEM_FLINTANDSTEEL_USE,
    ITEM_HOE_TILL,
    ITEM_SHIELD_BLOCK,
    ITEM_SHIELD_BREAK,
    ITEM_SHOVEL_FLATTEN,
    MUSIC_CREATIVE,
    MUSIC_CREDITS,
    MUSIC_DRAGON,
    MUSIC_END,
    MUSIC_GAME,
    MUSIC_MENU,
    MUSIC_NETHER,
    RECORD_11,
    RECORD_13,
    RECORD_BLOCKS,
    RECORD_CAT,
    RECORD_CHIRP,
    RECORD_FAR,
    RECORD_MALL,
    RECORD_MELLOHI,
    RECORD_STAL,
    RECORD_STRAD,
    RECORD_WAIT,
    RECORD_WARD,
    UI_BUTTON_CLICK(Sound_1_8.CLICK),
    WEATHER_RAIN(Sound_1_8.AMBIENCE_RAIN),
    WEATHER_RAIN_ABOVE(Sound_1_8.AMBIENCE_RAIN),
    BLOCK_ENCHANTMENT_TABLE_USE,
    ENTITY_HUSK_AMBIENT,
    ENTITY_HUSK_DEATH,
    ENTITY_HUSK_HURT,
    ENTITY_HUSK_STEP,
    ENTITY_POLAR_BEAR_AMBIENT,
    ENTITY_POLAR_BEAR_BABY_AMBIENT,
    ENTITY_POLAR_BEAR_DEATH,
    ENTITY_POLAR_BEAR_HURT,
    ENTITY_POLAR_BEAR_STEP,
    ENTITY_POLAR_BEAR_WARNING,
    ENTITY_STRAY_AMBIENT,
    ENTITY_STRAY_DEATH,
    ENTITY_STRAY_HURT,
    ENTITY_STRAY_STEP,
    ENTITY_WITHER_SKELETON_AMBIENT,
    ENTITY_WITHER_SKELETON_DEATH,
    ENTITY_WITHER_SKELETON_HURT,
    ENTITY_WITHER_SKELETON_STEP,
    ITEM_ELYTRA_FLYING;

    SoundCompat() {
        this.sound = getSound(name());
    }

    SoundCompat(Sound_1_8 oldSound) {
        sound = (getVersion() == v1_8) ? Sound.values()[oldSound.ordinal()] : getSound(name());
    }
    private static Sound getSound(String name) {
        Sound sound;
        try {
            sound = Sound.valueOf(name);
        } catch (Exception e) {
            sound = null;
        }
        return sound;
    }
    private final Sound sound;

    public void play(Player player) {
        play(player, 1, 1);
    }

    public void play(Location location) {
        play(location, 1, 1);
    }

    public void play(Player player, int volume, int pitch) {
        if (sound != null) {
            player.playSound(player.getLocation(), sound, volume, pitch);
        }
    }

    public void play(Location location, int volume, int pitch) {
        if (sound != null) {
            location.getWorld().playSound(location, sound, volume, pitch);
        }
    }
    enum SupportedVersion {
        V1_8, V1_9, V1_10;
    }
}