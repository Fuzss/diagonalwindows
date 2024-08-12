package fuzs.diagonalwindows.neoforge;

import fuzs.diagonalwindows.DiagonalWindows;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;

@Mod(DiagonalWindows.MOD_ID)
@Mod.EventBusSubscriber(modid = DiagonalWindows.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiagonalWindowsNeoForge {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
        ModConstructor.construct(DiagonalWindows.MOD_ID, DiagonalWindows::new);
    }
}
