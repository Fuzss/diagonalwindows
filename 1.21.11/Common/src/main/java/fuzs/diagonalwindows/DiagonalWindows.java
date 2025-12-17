package fuzs.diagonalwindows;

import fuzs.diagonalblocks.api.v2.block.type.DiagonalBlockType;
import fuzs.diagonalblocks.api.v2.block.type.DiagonalBlockTypes;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.minecraft.resources.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DiagonalWindows implements ModConstructor {
    public static final String MOD_ID = "diagonalwindows";
    public static final String MOD_NAME = "Diagonal Windows";
    public static final Logger LOGGER = LogManager.getLogger(DiagonalWindows.MOD_NAME);

    @Override
    public void onConstructMod() {
        DiagonalBlockType.register(DiagonalBlockTypes.WINDOW);
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
