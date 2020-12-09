package com.redruby.mods.init;

import com.redruby.mods.RedRubyMain;
import com.redruby.mods.blocks.Oven;
import com.redruby.mods.blocks.RubyBlock;
import com.redruby.mods.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RedRubyMain.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", Oven::new);
}
