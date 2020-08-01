package io.github.haykam821.pausedpanorama.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import io.github.haykam821.pausedpanorama.ClientMain;
import net.minecraft.client.gui.RotatingCubeMapRenderer;

@Mixin(RotatingCubeMapRenderer.class)
public class RotatingCubeMapRendererMixin {
	@ModifyArg(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/CubeMapRenderer;draw(Lnet/minecraft/client/MinecraftClient;FFF)V"), index = 1)
	private float modifyX(float x) {
		return ClientMain.getConfig().panoramaX;
	}

	@ModifyArg(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/CubeMapRenderer;draw(Lnet/minecraft/client/MinecraftClient;FFF)V"), index = 2)
	private float modifyY(float y) {
		return ClientMain.getConfig().panoramaY;
	}
}