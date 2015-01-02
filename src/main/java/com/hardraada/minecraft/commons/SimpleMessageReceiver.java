package com.hardraada.minecraft.commons;

import java.util.ArrayList;
import java.util.List;
import net.canarymod.api.chat.ChatComponent;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.chat.ReceiverType;

/**
  * This class is a simple implementation of MessageReceiver so that we can receive 
  * messages from the server when we do not have an in game context such as a Player.
  * 
  * @author hardraada1
  */
public class SimpleMessageReceiver extends Object implements MessageReceiver {
	List<String> messages = new ArrayList<String>( );
	
	public String getName( ) {
		return this.getClass( ).getSimpleName( );
	}
	
	public void notice( String message ) {
		this.message( message );
	}
	
	public void notice( CharSequence message ) {
		this.message( messages.toString( ) );
	}
	
	public void notice( CharSequence ... messages ) {
		this.message( messages.toString( ) );
	}
	
	public void notice( Iterable<? extends CharSequence> messages ) {
		this.message( messages );
	}
	
	public void message( String message ) {
		this.messages.add( message );
	}
	
	public void message( CharSequence message ) {
		this.message( message.toString( ) );
	}
	
	public void message( CharSequence ... messages ) {
		this.message( messages.toString( ) );
	}
	
	public void message( Iterable<? extends CharSequence> messages ) {
		for( CharSequence seq : messages ) {
			this.message( seq.toString( ) );
		}
	}
	
	public void message( ChatComponent ... chatComponents ) {
		this.message( chatComponents.toString( ) );
	}
	
	public boolean hasPermission( String node ) {
		return true;
	}
	
	public boolean safeHasPermission( String permission ) {
		return true;
	}
	
	public ReceiverType getReceiverType( ) {
		return ReceiverType.SERVER;
	}
	
	public String getLocale( ) {
		return "en-US";
	}
	
	public List<String> getMessages( ) {
		return this.messages;
	}
}
