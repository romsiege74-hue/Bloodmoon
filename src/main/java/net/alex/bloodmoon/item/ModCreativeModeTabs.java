package net.alex.bloodmoon.item;

import net.alex.bloodmoon.Bloodmoon;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Bloodmoon.MODID);

    public static final RegistryObject<CreativeModeTab> BLOODMOON_TAB = CREATIVE_MODE_TAB.register("bloodmoon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DAITEM.get()))
                    .title(Component.translatable("creativetab.bloodmoon_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DAITEM.get());
                        output.accept(ModItems.QUISTIAN.get());
                        output.accept(ModItems.ROBBY.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
