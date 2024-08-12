package fuzs.diagonalwindows.neoforge;

import fuzs.diagonalwindows.DiagonalWindows;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.neoforged.fml.common.Mod;

@Mod(DiagonalWindows.MOD_ID)
public class DiagonalWindowsNeoForge {

    public DiagonalWindowsNeoForge() {
        ModConstructor.construct(DiagonalWindows.MOD_ID, DiagonalWindows::new);
    }
}
