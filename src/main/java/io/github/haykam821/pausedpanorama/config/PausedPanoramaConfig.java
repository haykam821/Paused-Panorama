package io.github.haykam821.pausedpanorama.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "pausedpanorama")
@Config.Gui.Background("minecraft:textures/block/netherrack.png")
public class PausedPanoramaConfig implements ConfigData {
	@ConfigEntry.Gui.Tooltip
	public float panoramaX = 0;

	@ConfigEntry.Gui.Tooltip
	public float panoramaY = 0;
}