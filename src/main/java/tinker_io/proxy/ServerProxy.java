package tinker_io.proxy;

import net.minecraft.entity.player.EntityPlayer;
import tconstruct.util.config.PHConstruct;
import tinker_io.TileEntity.FIMTileEntity;
import tinker_io.TileEntity.SOTileEntity;
import tinker_io.TileEntity.TileEntityWhatABeautifulBlockEntity;
import tinker_io.handler.GuiHandler;
import tinker_io.main.Main;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy{
	
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
	
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(FIMTileEntity.class, Main.MODID+"TileEntityFIM");
		GameRegistry.registerTileEntity(SOTileEntity.class, Main.MODID+"SOTileEntity");
		//GameRegistry.registerTileEntity(TileEntityWhatABeautifulBlockEntity.class, Main.MODID+"WABTileEntity");
	}
	public EntityPlayer getPlayerEntity(MessageContext ctx) {
		 return ctx.getServerHandler().playerEntity;
	}
}
