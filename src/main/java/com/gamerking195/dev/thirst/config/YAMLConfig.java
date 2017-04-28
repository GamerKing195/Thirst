package com.gamerking195.dev.thirst.config;

import java.io.File;

import org.apache.commons.lang.math.NumberUtils;

import com.gamerking195.dev.thirst.Main;

import net.cubespace.Yamler.Config.Comment;
import net.cubespace.Yamler.Config.Comments;
import net.cubespace.Yamler.Config.YamlConfig;

public class YAMLConfig extends YamlConfig {
    /*
	 * TODO
	 * 
	 * - Something with sleep?
	 * - Add run sprinting multiplier.
	 */


    public YAMLConfig(Main plugin) {
        CONFIG_HEADER = new String[]
                                {
                                        "#################################",
                                        "                                #",
                                        "Thirst V" + Main.getInstance().getDescription().getVersion() + ", by " + Main.getInstance().getDescription().getAuthors() + "#",
                                        "                                #",
                                        "#################################",
                                };
        CONFIG_FILE = new File(plugin.getDataFolder(), "config.yml");
    }

    //CONFIG

    @Comments
            ({
                     "",
                     "DISPLAY_TYPE",
                     "Desc: Changes the way players see their thirst.",
                     "Type: Enum",
                     "Possible types: SCOREBOARD, ACTION, COMMAND, BOSSBAR",
                     "Default: ACTION",
                     "Note: The command /thirst view, and /thirst view %player% will always be enabled, use command to disable scoreboard, and action."
            })
    public String DisplayType = "ACTION";

    @Comments
            ({
                     "",
                     "BAR_COLOR",
                     "Desc: The colors for the bossbar, if that display type is chosen.",
                     "Type: Enum",
                     "Possible types: BLUE, GREEN, PINK, PURPLE, RED, YELLOW, WHITE",
                     "Default: BLUE",
            })
    public String BarColor = "BLUE";

    @Comments
            ({
                     "",
                     "BAR_STYLE",
                     "Desc: The style for the bossbar, if that display type is chosen.",
                     "Type: Enum",
                     "Possible types: SOLID, SEGMENTED_6, SEGMENTED_10, SEGMENTED_12, SEGMENTED_20",
                     "Default: SOLID",
            })
    public String BarStyle = "SOLID";

    @Comments
            ({
                     "",
                     "THIRST_QUENCHING_ITEM",
                     "Desc: The item that will quench the thirst of a player.",
                     "Type: Formatted string array",
                     "Default:",
                     "- POTION.20",
                     "- GOLDEN_APPLE.100.1",
                     "Requirements: Should be in format: ITEM.PERCENT.METADATE(metadata optional)"
            })
    public String[] ThirstQuenchingItems = {"POTION.20", "GOLDEN_APPLE.100.1"};

    @Comments
            ({
                     "",
                     "REMOVE_THIRST",
                     "Desc: The amount of thirst that will be removed every ThirstDelay",
                     "Type: int (100 or lower.)",
                     "Default: 1"
            })
    public int RemoveThirst = 1;

    @Comments
            ({
                     "",
                     "ALWAYS_SHOW_ACTION_BAR",
                     "Desc: If set to false the action bar will only display when a players thirst changes.",
                     "Type: Boolean",
                     "Default: false",
                     "Notes: For scoreboards & bossbar it will make the scoreboard pop up for 3 seconds then go away."
            })
    public boolean AlwaysShowActionBar = true;

    @Comments
            ({
                     "",
                     "CRITICAL_THIRST_PERCENT",
                     "Desc: The percent at which a players thirst becomes critical and the THIRST_LOW_MESSAGE and !!! will be displayed.",
                     "Type: Integer",
                     "Default: 10"
            })
    public int CriticalThristPercent = 10;

    @Comments
            ({
                     "",
                     "THIRST_DELAY",
                     "Desc: The delay in seconds before thirst is removed from every player.",
                     "Type: float (Time in seconds)",
                     "Default: 36 (will remove 100% over three days, just like in real life!)",
                     "Note: This does support values under one second without any changes in lag!"
            })
    public float ThirstDelay = 36;

    @Comments
            ({
                     "",
                     "IGNORE_CREATIVE",
                     "Desc: If true, anyone in creative will not be affected by Thirst.",
                     "Type: Boolean",
                     "Default: true"
            })
    public boolean IgnoreCreative = true;

    @Comments
            ({
                     "",
                     "IGNORE_OP",
                     "Desc: If true, anyone who is opped will not be affected by Thirst.",
                     "Type: Boolean",
                     "Default: false"
            })
    public boolean IgnoreOP = false;

    @Comments
            ({
                     "",
                     "DRINK_BLOCK_WATER",
                     "Desc: If true, players will recover 2% of their thirst every second, if they are swimming in water.",
                     "Type: Boolean",
                     "Default: false"
            })
    public boolean drinkBlockWater = false;

    @Comments
            ({
                     "",
                     "ENABLE_UPDATER",
                     "Desc: If true, the auto-updater will ping the spigot site and alert you about new updates, and even automatically install them.",
                     "Type: Boolean",
                     "Default: true"
            })
    public boolean EnableUpdater = true;

    @Comment("---------------Multipliers---------------")
    @Comments
            ({
                     "",
                     "BIOMES",
                     "Desc: List all biomes you want to modify players thirst percent. Ex: desert.5 will make players thirst go down 5 seconds quicker",
                     "Type: Formatted string array",
                     "Default:",
                     "DESERT.5",
                     "HELL.10"
            })
    public String[] Biomes = new String[]{"DESERT.5", "HELL.10"};
    @Comments
            ({
                     "",
                     "ARMOR",
                     "Desc: List all armor types you want to modify players thirst percent. Ex: leather.5 will make players thirst go down 5 seconds quicker in full leather armor",
                     "Type: Formatted string array",
                     "Default:",
                     "LEATHER.5",
                     "IRON_CHESTPLATE.10"
            })
    public String[] Armor = new String[]{"LEATHER.5", "IRON_CHESTPLATE.10"};
    @Comments
            ({
                     "",
                     "SPRINT",
                     "Desc: How much quicker you want thirst to be removed when sprinting, put -1 to make no thirst removed.",
                     "Type: Integer",
                     "Default: -1"
            })
    public int Sprint = -1;
    @Comments
            ({
                     "",
                     "DAY_MULTIPLIER",
                     "Desc: How much quicker you want thirst to be removed when it is day, put 0 to make no thirst removed, put negative to make thirst take longer to be removed.",
                     "Type: Integer",
                     "Default: 0"
            })
    public int DayMultiplier = 0;
    @Comments
            ({
                     "",
                     "NIGHT_MULTIPLIER",
                     "Desc: How much quicker you want thirst to be removed when it is night, put 0 to make no thirst removed, put negative to make thirst take longer to be removed.",
                     "Type: Integer",
                     "Default: 0"
            })
    public int NightMultiplier = 0;

    @Comment("---------------Effects---------------")
    @Comments
            ({
                     "",
                     "ENABLED",
                     "Desc: If false, all potion effects will not be given.",
                     "Type: Boolean",
                     "Default: true"
            })
    public boolean Enabled = true;

    @Comments
            ({
                     "",
                     "EFFECTS",
                     "Desc: If false, all potion effects will not be given.",
                     "Type: Formatted string array",
                     "Default:",
                     "- 10.SLOW_DIGGING.30.1",
                     "- 0.DAMAGE.2.3",
                     "Requirements: Should be in format 'PERCENT.POTIONEFFECT_DURATION-IN-SECONDS_AMPLIFIER'",
                     "Note: To damage a player use the effect damage the duration will be the time between each damage",
                     "and the amplifier is how much damage done (out of 20)."
            })
    public String[] Effects = {"10.CONFUSION.30.1", "0.DAMAGE.2.3"};


    @Comment("---------------Messages---------------")

    @Comments
            ({
                     "",
                     "THIRST_MESSAGE",
                     "Desc: Changes the message displayed in the display_type.",
                     "Type: String",
                     "Variables: %thirstbar%, %percent%, %player%, %removespeed%",
                     "Default: &bTHIRST &f- &8[%thirstbar%&8] %percent%"
            })
    public String ThirstMessage = "&b&lTHIRST &f- &8[%thirstbar%&8] %percent%";

    @Comments
            ({
                     "",
                     "THIRST_LOW_MESSAGE",
                     "Desc: The message that will be displayed to a player when their thirst is below the critical thirst amount.",
                     "Type: String",
                     "Variables: %percent%, %player%",
                     "Default: &8[&bThirst&8] &aWatch out &e%player%, &ayour thirst is at &e%percent%!"
            })
    public String ThirstLowMessage = "&8[&1Thirst&8] &bWatch out &f%player%, &byour thirst is at &f%percent%!";

    @Comments
            ({
                     "",
                     "THIRST_DEATH_MESSAGE",
                     "Desc: The message that will be sent when a player dies of thirst.",
                     "Type: String",
                     "Variables: %player%",
                     "Default: &f%player% didn't drink his water bottle."
            })
    public String ThirstDeathMessage = "&f%player% didn't drink his water bottle.";

    @Comments
            ({
                     "",
                     "THIRST_VIEW_PLAYER_MESSAGE",
                     "Desc: The message that will be sent when someone does /thirst view %player%",
                     "Type: String",
                     "Variables: %player%, %thirstbar%, %percent%, %thirstmessage%, %removespeed%",
                     "Default: &f%player%'s &bthirst: %thirstmessage%"
            })
    public String ThirstViewPlayerMessage = "&8[&1Thirst&8] &f%player%'s &bthirst: %thirstmessage%";

    @Comments
            ({
                     "",
                     "THIRST_VIEW_MESSAGE",
                     "Desc: The message sent when a player does /thirst view",
                     "Type: String",
                     "Variables: %player%",
                     "Default: &8[&1Thirst&8] &bYour thist: ",
                     "Note: This message will be displayed before the %thirstmessage%",
                     "Note: There will not be a space between messages unless you add one."
            })
    public String ThirstViewMessage = "&8[&1Thirst&8] &bYour thirst: ";

    @Comments
            ({
                     "",
                     "INVALID_COMMAND_MESSAGE",
                     "Desc: The message that wil be sent when someone does /thirst view %player% with an invalid playername.",
                     "Type: String",
                     "Default: &8[&1Thirst&8] &bInvalid command syntax!"
            })
    public String InvalidCommandMessage = "&8[&1Thirst&8] &bInvalid command syntax!";

    @Comments
            ({
                     "",
                     "NO_PERMISSION_MESSAGE",
                     "Desc: The message that will be sent when a player does not have permission to do something.",
                     "Type: String",
                     "Default: &8[&1Thirst&8] &bYou do not have permission to do that!"
            })
    public String NoPermissionMesage = "&8[&1Thirst&8] &bYou do not have permission to do that!";

    @Comments
            ({
                     "",
                     "SCOREBOARD_NAME",
                     "Desc: Only applies if display_type is set to SCOREBOARD.",
                     "Type: String",
                     "Variables: %player%",
                     "Default: &f&lTHIRST"
            })
    public String ScoreboardName = "&f&lTHIRST";

    @Comment("---------------Disabled Areas---------------")

    @Comments
            ({
                     "",
                     "DISABLED_WORLDS",
                     "Desc: List all of the worlds that will be unnaffected by thirst.",
                     "Type: String Array",
                     "Default: []"
            })
    public String[] DisabledWorlds = new String[0];

    @Comments
            ({
                     "",
                     "DISABLED_REGIONS",
                     "Desc: List all of the worldgaurd regions that will be unnaffected by thirst..",
                     "Type: String Array",
                     "Default: []"
            })
    public String[] DisabledRegions = new String[0];

    //CLASSES

    public class ThirstItem extends YamlConfig {
        private String item = "POTION";
        private int quenchPercent = 20;
        private int metaData = 0;

        public ThirstItem(String s) {
            if (!s.contains(".")) {
                Main.getInstance().printPluginError("Error while reading the config.", "String '" + s + "' is in an invalid format!");

                item = "NULL";
                quenchPercent = 0;
                return;
            }

            String[] parts = s.split("\\.");

            if (!NumberUtils.isNumber(parts[1]) || parts.length > 3) {
                Main.getInstance().printPluginError("Error while reading the config.", "String '" + s + "' is in an invalid format!");

                item = "NULL";
                quenchPercent = 0;
                return;
            }

            if (parts.length == 3) {
                metaData = Integer.valueOf(parts[2]);
            }

            item = parts[0];
            quenchPercent = Integer.valueOf(parts[1]);
        }

        public String toString() {
            return "" + item.toUpperCase() + "-" + quenchPercent;
        }

        public void setItem(String itemString) {
            item = itemString;
        }

        public String getItem() {
            return item;
        }

        public void setQuenchPercent(int percent) {
            quenchPercent = percent;
        }

        public int getQuenchPercent() {
            return quenchPercent;
        }

        public int getMetaData() {
            return metaData;
        }

        public void setMetaData(int metaData) {
            this.metaData = metaData;
        }
    }

    //METHODS

    public int getDamageInterval() {
        for (String s : Effects) {
            String[] parts = s.split("\\.");
            if (parts.length != 4) {
                Main.getInstance().printPluginError("Error while reading the config.", "String '" + s + "' is in an invalid format!");

                return -1;
            }

            if (parts[1].equalsIgnoreCase("DAMAGE")) {
                return Integer.valueOf(parts[2]);
            }
        }
        return -1;
    }

    public int getDamageAmount() {
        for (String s : Effects) {
            String[] parts = s.split("\\.");
            if (parts.length != 4) {
                Main.getInstance().printPluginError("Error while reading the config.", "String '" + s + "' is in an invalid format!");

                return -1;
            }

            if (parts[1].equalsIgnoreCase("DAMAGE")) {
                return Integer.valueOf(parts[3]);
            }
        }
        return -1;
    }

    public int getDamagePercent() {
        for (String s : Effects) {
            String[] parts = s.split("\\.");
            if (parts.length != 4) {
                Main.getInstance().printPluginError("Error while reading the config.", "String '" + s + "' is in an invalid format!");
                return -1;
            }

            int percent = Integer.valueOf(parts[0]);

            if (parts[1].startsWith("DAMAGE")) {
                return percent;
            }
        }
        return -1;
    }
}