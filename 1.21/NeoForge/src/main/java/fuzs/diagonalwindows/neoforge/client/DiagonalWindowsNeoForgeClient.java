package fuzs.diagonalwindows.neoforge.client;

import fuzs.diagonalwindows.DiagonalWindows;
import fuzs.diagonalwindows.client.DiagonalWindowsClient;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;

@Mod.EventBusSubscriber(modid = DiagonalWindows.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DiagonalWindowsNeoForgeClient {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
        ClientModConstructor.construct(DiagonalWindows.MOD_ID, DiagonalWindowsClient::new);
    }
}
