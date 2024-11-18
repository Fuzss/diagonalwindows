package fuzs.diagonalwindows.neoforge.client;

import fuzs.diagonalwindows.DiagonalWindows;
import fuzs.diagonalwindows.client.DiagonalWindowsClient;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = DiagonalWindows.MOD_ID, dist = Dist.CLIENT)
public class DiagonalWindowsNeoForgeClient {

    public DiagonalWindowsNeoForgeClient() {
        ClientModConstructor.construct(DiagonalWindows.MOD_ID, DiagonalWindowsClient::new);
    }
}
