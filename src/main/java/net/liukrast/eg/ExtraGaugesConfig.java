package net.liukrast.eg;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ExtraGaugesConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.IntValue STRING_MAX_LENGTH = BUILDER
            .comment("Defines the max length of a string collected by a string gauge. Increase at your own risk")
            .defineInRange("stringGaugeMaxLength", 256, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.ConfigValue<String> STRING_TO_FLOAT_REGEX = BUILDER
            .comment("Defines the regex used by string gauge to convert from string to number")
            .define("stringGaugeToFloatRegex", "-?\\d+(\\.\\d+)?");

    public static final ModConfigSpec.ConfigValue<String> STRING_TO_REDSTONE_REGEX = BUILDER
            .comment("Defines the regex used by string gauge to convert from string to redstone")
            .define("stringGaugeToRedstoneRegex", "\\s*(true|1|on|yes|active|y)\\s*");

    public static final ModConfigSpec.IntValue DISPLAY_COLLECTOR_POLL_TICKS = BUILDER
            .comment("How often (in game ticks) the display collector re-reads its source,",
                    "if the source allows periodic refreshing. Sources that only push updates",
                    "are unaffected. Vanilla display links refresh every 100 ticks")
            .defineInRange("displayCollectorPollTicks", 10, 1, 1200);

    public static final ModConfigSpec.BooleanValue DISPLAY_COLLECTOR_REDSTONE_PAUSE = BUILDER
            .comment("Whether a redstone signal pauses the display collector, like it pauses",
                    "a vanilla display link. Disabled by default: collectors often sit in",
                    "redstone-heavy gauge builds where a stray signal silently freezes them")
            .define("displayCollectorRedstonePause", false);

    static final ModConfigSpec SPEC = BUILDER.build();
}
