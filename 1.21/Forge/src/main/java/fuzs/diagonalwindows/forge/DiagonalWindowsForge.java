package fuzs.diagonalwindows.forge;

import fuzs.diagonalwindows.DiagonalWindows;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;

@Mod(DiagonalWindows.MOD_ID)
@Mod.EventBusSubscriber(modid = DiagonalWindows.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiagonalWindowsForge {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
        ModConstructor.construct(DiagonalWindows.MOD_ID, DiagonalWindows::new);
    }
}
