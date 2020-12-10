package com.redruby.mods.init;

import com.redruby.mods.RedRubyMain;
import com.redruby.mods.blocks.BlockItemBase;
import com.redruby.mods.items.ItemBase;
import com.redruby.mods.items.ModSpawnEggItem;
import com.redruby.mods.items.PoisonApple;
import com.redruby.mods.util.enums.ModArmorMaterial;
import com.redruby.mods.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, RedRubyMain.MOD_ID);

    // Items
    public static final RegistryObject<Item> RUBY = Items.register("ruby", ItemBase::new);
    public static final RegistryObject<PoisonApple> POISON_APPLE = Items.register("poison_apple", PoisonApple::new);

    public static final RegistryObject<ModSpawnEggItem> HOG_SPAWN_EGG = Items.register("hog_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.HOG, 0xF1BF7B, 0x705128, new Item.Properties().group(RedRubyMain.TAB)));

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = Items.register("ruby_block",
            ()-> new BlockItemBase(ModBlocks.RUBY_BLOCK.get()));

    public static final RegistryObject<Item> RUBY_ORE_ITEM = Items.register("ruby_ore",
            ()-> new BlockItemBase(ModBlocks.RUBY_ORE.get()));

    public static final RegistryObject<Item> OVEN_ITEM = Items.register("oven",
            ()-> new BlockItemBase(ModBlocks.OVEN.get()));

    // Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = Items.register("ruby_sword",
            ()-> new SwordItem(ModItemTier.RUBY, 4, -2.4F, new Item.Properties().group(RedRubyMain.TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = Items.register("ruby_pickaxe",
            ()-> new PickaxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(RedRubyMain.TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = Items.register("ruby_shovel",
            ()-> new ShovelItem(ModItemTier.RUBY, 0.5F, -3.0F, new Item.Properties().group(RedRubyMain.TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = Items.register("ruby_axe",
            ()-> new AxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(RedRubyMain.TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = Items.register("ruby_hoe",
            ()-> new HoeItem(ModItemTier.RUBY, -3,-1.0F, new Item.Properties().group(RedRubyMain.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = Items.register("ruby_helmet",
            ()-> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(RedRubyMain.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = Items.register("ruby_chestplate",
            ()-> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(RedRubyMain.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = Items.register("ruby_leggings",
            ()-> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(RedRubyMain.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = Items.register("ruby_boots",
            ()-> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(RedRubyMain.TAB)));
}
