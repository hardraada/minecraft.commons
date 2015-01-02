package com.hardraada.minecraft.commons;

import net.canarymod.plugin.Plugin;
import net.canarymod.logger.Logman;
import net.canarymod.Canary;
import net.canarymod.commandsys.CommandListener;
import net.canarymod.commandsys.CommandDependencyException;
import net.canarymod.api.world.World;
import net.canarymod.api.world.position.Location;
import net.canarymod.api.world.effects.SoundEffect;

/**
  * Base plugin class with common functionality.
  * 
  * @author hardraada1
  */
public class PluginBase extends Plugin implements CommandListener {
	protected static Logman logger;
	
	public PluginBase( ) {
		logger = this.getLogman( );
	}
	
	@Override
	public void disable( ) {
		
	}
	
	@Override
	public boolean enable( ) {
		logger.info( "Starting up" );
		
		try {
			Canary.commands( ).registerCommands( this, this, false );
		} catch( CommandDependencyException e ) {
			logger.error( "An error occurred:  " + e.getMessage( ) );
		}
		
		return true;
	}
	
	public void playSound( Location location, SoundEffect.Type type ) {
		this.playSound( location, type, 1.0, 1.0 );
	}
	
	public void playSound( Location location, SoundEffect.Type type, double volume, double pitch ) {
		World world = location.getWorld( );
		if( world == null ) return;
		
		double x = location.getX( );
		double y = location.getY( );
		double z = location.getZ( );
		world.playSound( new SoundEffect( type, x, y, z, ( float )volume, ( float )pitch ) );
	}
}
