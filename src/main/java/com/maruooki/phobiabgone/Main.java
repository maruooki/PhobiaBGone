package com.maruooki.phobiabgone;

import com.maruooki.phobiabgone.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.IResourcePack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import zone.rong.mixinbooter.IEarlyMixinLoader;
import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mod(
        modid = Tags.MOD_ID,
        name = Tags.MOD_NAME,
        version = Tags.VERSION
        //dependencies = Tags.DEPENDENCIES
)
public class Main implements ILateMixinLoader {

    public static Logger logger;

    @Mod.Instance(value = Tags.MOD_ID)
    public static Main instance;

    @SidedProxy(clientSide = "com.maruooki.phobiabgone.proxy.ClientProxy",
                serverSide = "com.maruooki.phobiabgone.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        event.getModMetadata().name = Tags.MOD_ID;

        proxy.preInit(event);
    }

    @Mod.EventHandler
        public void onInit(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @SideOnly(Side.CLIENT)
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Override
    public List<String> getMixinConfigs() {
        List<String> configs = new ArrayList<>();
        configs.add("mixins.phobiabgone.json");
        return configs;
    }
}
