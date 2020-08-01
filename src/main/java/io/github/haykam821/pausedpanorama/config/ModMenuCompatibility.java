package io.github.haykam821.pausedpanorama.config;

import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.minecraft.client.gui.screen.Screen;

public class ModMenuCompatibility implements ModMenuApi {
	@Override
	public String getModId() {
		return "pausedpanorama";
	}

	@Override
	public ConfigScreenFactory<Screen> getModConfigScreenFactory() {
		return screen -> AutoConfig.getConfigScreen(PausedPanoramaConfig.class, screen).get();
	}
}