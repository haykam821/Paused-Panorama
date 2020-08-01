package io.github.haykam821.pausedpanorama;

import io.github.haykam821.pausedpanorama.config.PausedPanoramaConfig;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

public class ClientMain implements ClientModInitializer {
	private static final PausedPanoramaConfig CONFIG = AutoConfig.register(PausedPanoramaConfig.class, GsonConfigSerializer::new).getConfig();

	@Override
	public void onInitializeClient() {
		return;
	}

	public static PausedPanoramaConfig getConfig() {
		return CONFIG;
	}
} 