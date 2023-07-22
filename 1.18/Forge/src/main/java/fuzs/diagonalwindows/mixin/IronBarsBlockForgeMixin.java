package fuzs.diagonalwindows.mixin;

import fuzs.diagonalwindows.client.extensions.DiagonalClientBlockExtensions;
import net.minecraft.world.level.block.CrossCollisionBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraftforge.client.IBlockRenderProperties;
import org.spongepowered.asm.mixin.Mixin;

import java.util.function.Consumer;

@Mixin(IronBarsBlock.class)
abstract class IronBarsBlockForgeMixin extends CrossCollisionBlock {

    public IronBarsBlockForgeMixin(float nodeWidth, float extensionWidth, float nodeHeight, float extensionHeight, float collisionY, Properties properties) {
        super(nodeWidth, extensionWidth, nodeHeight, extensionHeight, collisionY, properties);
    }

    @Override
    public void initializeClient(Consumer<IBlockRenderProperties> consumer) {
        consumer.accept(new DiagonalClientBlockExtensions());
    }
}
