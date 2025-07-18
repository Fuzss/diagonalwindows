package fuzs.diagonalwindows.fabric.client;

import fuzs.diagonalwindows.DiagonalWindows;
import fuzs.diagonalwindows.client.DiagonalWindowsClient;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import net.fabricmc.api.ClientModInitializer;

public class DiagonalWindowsFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(DiagonalWindows.MOD_ID, DiagonalWindowsClient::new);
    }
}
