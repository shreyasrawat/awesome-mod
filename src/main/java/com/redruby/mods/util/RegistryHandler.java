package com.redruby.mods.util;

import BlockItemBase;
import com.redruby.mods.blocks.RubyBlock;
import com.redruby.mods.blocks.RubyOre;
import com.redruby.mods.items.ItemBase;
import com.redruby.mods.items.PoisonApple;
import com.redruby.mods.tools.ModItemTier;
import com.redruby.mods.RedRubyMain;
import com.redruby.mods.armor.ModArmorMaterial;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> Items
            = DeferredRegister.create(ForgeRegistries.ITEMS, RedRubyMain.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, RedRubyMain.MOD_ID);


    public static void init() {
        Items.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> RUBY = Items.register("ruby", ItemBase::new);
    public static final RegistryObject<PoisonApple> POISON_APPLE = Items.register("poison_apple", PoisonApple::new);

    // Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = Items.register("ruby_sword", ()->
            new SwordItem(ModItemTier.RUBY, 4, -2.4F, new Item.Properties().group(RedRubyMain.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = Items.register("ruby_pickaxe", ()->
            new PickaxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(RedRubyMain.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = Items.register("ruby_shovel", ()->
            new ShovelItem(ModItemTier.RUBY, 0.5F, -3.0F, new Item.Properties().group(RedRubyMain.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = Items.register("ruby_axe", ()->
            new AxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(RedRubyMain.TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = Items.register("ruby_hoe", ()->
            new HoeItem(ModItemTier.RUBY, -3,-1.0F, new Item.Properties().group(RedRubyMain.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = Items.register("ruby_helmet", ()->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(RedRubyMain.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = Items.register("ruby_chestplate", ()->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(RedRubyMain.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = Items.register("ruby_leggings", ()->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(RedRubyMain.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = Items.register("ruby_boots", ()->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(RedRubyMain.TAB)));
    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = Items.register("ruby_block",
            ()-> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = Items.register("ruby_ore",
            ()-> new BlockItemBase(RUBY_ORE.get()));

}
