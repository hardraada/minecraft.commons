package com.hardraada.minecraft.commons;

import java.util.List;
import java.util.UUID;

import com.mojang.authlib.GameProfile;

import net.canarymod.api.DamageType;
import net.canarymod.api.GameMode;
import net.canarymod.api.NetServerHandler;
import net.canarymod.api.PlayerListAction;
import net.canarymod.api.PlayerListData;
import net.canarymod.api.PlayerListEntry;
import net.canarymod.api.attributes.AttributeMap;
import net.canarymod.api.chat.ChatComponent;
import net.canarymod.api.entity.Entity;
import net.canarymod.api.entity.EntityItem;
import net.canarymod.api.entity.EntityType;
import net.canarymod.api.entity.living.LivingBase;
import net.canarymod.api.entity.living.humanoid.HumanCapabilities;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.inventory.Inventory;
import net.canarymod.api.inventory.Item;
import net.canarymod.api.inventory.PlayerInventory;
import net.canarymod.api.nbt.BaseTag;
import net.canarymod.api.nbt.CompoundTag;
import net.canarymod.api.packet.Packet;
import net.canarymod.api.potion.Potion;
import net.canarymod.api.potion.PotionEffect;
import net.canarymod.api.potion.PotionEffectType;
import net.canarymod.api.statistics.Achievement;
import net.canarymod.api.statistics.Achievements;
import net.canarymod.api.statistics.Stat;
import net.canarymod.api.statistics.Statistics;
import net.canarymod.api.world.World;
import net.canarymod.api.world.blocks.Sign;
import net.canarymod.api.world.position.Direction;
import net.canarymod.api.world.position.Location;
import net.canarymod.api.world.position.Position;
import net.canarymod.api.world.position.Vector3D;
import net.canarymod.hook.player.TeleportHook.TeleportCause;
import net.canarymod.permissionsystem.PermissionProvider;
import net.canarymod.user.Group;

/**
  * This class is a simple implementation of Player so that we can receive messages 
  * from the server when we do not have an in game player context.
  * 
  * @author hardraada1
  */
@SuppressWarnings( "deprecation" )
public class SimplePlayer extends SimpleMessageReceiver implements Player {
	private String name = "simpleplayer";
	
	public String getDisplayName( ) {		
		return this.name;
	}
	
	public void setDisplayName( String display ) {		
		this.name = display;
	}
	
	public void destroyItemHeld( ) {		
		
	}
	
	public Item getItemHeld( ) {		
		return null;
	}
	
	public void dropItem( Item item ) {		
		
	}
	
	public PlayerInventory getInventory( ) {		
		return null;
	}
	
	public EntityItem[ ] dropInventory( ) {		
		return null;
	}
	
	public void giveItem( Item item ) {		
		
	}
	
	public String getPrefix( ) {		
		return null;
	}
	
	public void setPrefix( String prefix ) {		
		
	}
	
	public boolean isBlocking( ) {		
		return false;
	}
	
	public boolean isShooting( ) {		
		return false;
	}
	
	public HumanCapabilities getCapabilities( ) {		
		return null;
	}
	
	public boolean isSleepingIgnored( ) {		
		return false;
	}
	
	public void setSleepingIgnored( boolean ignored ) {		
		
	}
	
	public boolean isUsingItem( ) {		
		return false;
	}
	
	public Item getItemInUse( ) {		
		return null;
	}
	
	public float getHealth( ) {		
		return 0;
	}
	
	public void setHealth( float health ) {		
		
	}
	
	public void increaseHealth( float health ) {		
		
	}
	
	public double getMaxHealth( ) {		
		return 0;
	}
	
	public void setMaxHealth( double maxHealth ) {		
		
	}
	
	public boolean canSee( LivingBase entity ) {		
		return false;
	}
	
	public int getDeathTicks( ) {		
		return 0;
	}
	
	public void setDeathTicks( int ticks ) {		
		
	}
	
	public int getInvulnerabilityTicks( ) {		
		return 0;
	}
	
	public void setInvulnerabilityTicks( int ticks ) {		
		
	}
	
	public int getAge( ) {		
		return 0;
	}
	
	public void setAge( int age ) {		
		
	}
	
	public void kill( ) {		
		
	}
	
	public void dealDamage( DamageType type, float damage ) {		
		
	}
	
	public void knockBack( double xForce, double zForce ) {		
		
	}
	
	public void addPotionEffect( PotionEffect effect ) {		
		
	}
	
	public void addPotionEffect( PotionEffectType type, int duration, int amplifier ) {		
		
	}
	
	public void removePotionEffect( PotionEffectType type ) {		
		
	}
	
	public void removeAllPotionEffects( ) {		
		
	}
	
	public boolean isPotionActive( Potion potion ) {		
		return false;
	}
	
	public PotionEffect getActivePotionEffect( Potion potion ) {		
		return null;
	}
	
	public List<PotionEffect> getAllActivePotionEffects( ) {		
		return null;
	}
	
	public void setRevengeTarget( LivingBase target ) {		
		
	}
	
	public LivingBase getRevengeTarget( ) {		
		return null;
	}
	
	public void setLastAssailant( LivingBase entity ) {		
		
	}
	
	public LivingBase getLastAssailant( ) {		
		return null;
	}
	
	public void lookAt( double x, double y, double z ) {		
		
	}
	
	public void lookAt( Location location ) {		
		
	}
	
	public void lookAt( Entity entity ) {		
		
	}
	
	public int getArrowCountInEntity( ) {		
		return 0;
	}
	
	public void setArrowCountInEntity( int arrows ) {		
		
	}
	
	public void swingArm( ) {		
		
	}
	
	public void attackEntity( LivingBase target, float damage ) {		
		
	}
	
	public float getHeadRotation( ) {		
		return 0;
	}
	
	public void setHeadRotation( float rot ) {		
		
	}
	
	public AttributeMap getAttributeMap( ) {		
		return null;
	}
	
	public Entity getTargetLookingAt( ) {		
		return null;
	}
	
	public Entity getTargetLookingAt( int searchRadius ) {		
		return null;
	}
	
	public double getX( ) {		
		return 0;
	}
	
	public double getY( ) {		
		return 0;
	}
	
	public double getZ( ) {		
		return 0;
	}
	
	public double getMotionX( ) {		
		return 0;
	}
	
	public double getMotionY( ) {		
		return 0;
	}
	
	public double getMotionZ( ) {		
		return 0;
	}
	
	public float getPitch( ) {		
		return 0;
	}
	
	public float getRotation( ) {		
		return 0;
	}
	
	public Position getPosition( ) {		
		return null;
	}
	
	public Location getLocation( ) {		
		return null;
	}
	
	public float getEyeHeight( ) {		
		return 0;
	}
	
	public int getID( ) {		
		return 0;
	}
	
	public UUID getUUID( ) {		
		return null;
	}
	
	public void setX( double x ) {	
		
	}
	
	public void setX( int x ) {		
		
	}
	
	public void setY( double y ) {		
		
	}
	
	public void setY( int y ) {		
		
	}
	
	public void setZ( double z ) {		
		
	}
	
	public void setZ( int z ) {		
		
	}
	
	public void setMotionX( double motionX ) {		
		
	}
	
	public void setMotionY( double motionY ) {		
		
	}
	
	public void setMotionZ( double motionZ ) {		
		
	}
	
	public void setPitch( float pitch ) {		
		
	}
	
	public void setRotation( float rotation ) {		
		
	}
	
	public Vector3D getMotion( ) {		
		return null;
	}
	
	public Vector3D getForwardVector( ) {		
		return null;
	}
	
	public void translate( Vector3D factor ) {		
		
	}
	
	public void moveEntity( double motionX, double motionY, double motionZ ) {		
		
	}
	
	public void teleportTo( double x, double y, double z ) {		
		
	}
	
	public void teleportTo( double x, double y, double z, World world ) {		
		
	}
	
	public void teleportTo( double x, double y, double z, float pitch, float rotation ) {		
		
	}
	
	public void teleportTo( double x, double y, double z, float pitch, float rotation, World dim ) {		
		
	}
	
	public void teleportTo( Location location ) {		
		
	}
	
	public void teleportTo( Position position ) {		
		
	}
	
	public World getWorld( ) {		
		return null;
	}
	
	public boolean isSprinting( ) {		
		return false;
	}
	
	public void setSprinting( boolean sprinting ) {		
		
	}
	
	public boolean isSneaking( ) {		
		return false;
	}
	
	public void setSneaking( boolean sneaking ) {		
		
	}
	
	public void setFireTicks( int ticks ) {		
		
	}
	
	public int getFireTicks( ) {		
		return 0;
	}
	
	public boolean isLiving( ) {		
		return false;
	}
	
	public boolean isItem( ) {		
		return false;
	}
	
	public boolean isMob( ) {		
		return false;
	}
	
	public boolean isAnimal( ) {		
		return false;
	}
	
	public boolean isPlayer( ) {		
		return false;
	}
	
	public boolean isGolem( ) {		
		return false;
	}
	
	public boolean isNPC( ) {		
		return false;
	}
	
	public EntityItem dropLoot( int itemId, int amount ) {		
		return null;
	}
	
	public EntityItem dropLoot( Item item ) {		
		return null;
	}
	
	public String getFqName( ) {		
		return null;
	}
	
	public boolean canSpawn( ) {		
		return false;
	}
	
	public boolean spawn( ) {		
		return false;
	}
	
	public boolean spawn( Entity rider ) {		
		return false;
	}
	
	public boolean isRiding( ) {		
		return false;
	}
	
	public boolean isRidden( ) {		
		return false;
	}
	
	public Entity getRiding( ) {		
		return null;
	}
	
	public Entity getRider( ) {		
		return null;
	}
	
	public void setRider( Entity rider ) {		
		
	}
	
	public void mount( Entity entity ) {		
		
	}
	
	public void dismount( ) {		
		
	}
	
	public void destroy( ) {		
		
	}
	
	public boolean isDead( ) {		
		return false;
	}
	
	public CompoundTag getNBT( ) {		
		return null;
	}
	
	@SuppressWarnings( "rawtypes" )
	public void setNBT( BaseTag tag ) {		
		
	}
	
	public boolean isInvisible( ) {		
		return false;
	}
	
	public void setInvisible( boolean invisible ) {		
		
	}
	
	public CompoundTag getMetaData( ) {		
		return null;
	}
	
	public EntityType getEntityType( ) {		
		return null;
	}
	
	public boolean isAmbient( ) {		
		return false;
	}
	
	public boolean isOnGround( ) {		
		return false;
	}
	
	public boolean isInWeb( ) {		
		return false;
	}
	
	public boolean isInWater( ) {		
		return false;
	}
	
	public boolean isInLava( ) {		
		return false;
	}
	
	public boolean hasDisplayName( ) {		
		return false;
	}
	
	public boolean showingDisplayName( ) {		
		return false;
	}
	
	public void setShowDisplayName( boolean show ) {		
		
	}
	
	public boolean isEating( ) {		
		return false;
	}
	
	public PermissionProvider getPermissionProvider( ) {		
		return null;
	}
	
	public Group getGroup( ) {		
		return null;
	}
	
	public boolean isOnline( ) {		
		return false;
	}
	
	public void setGroup( Group group ) {		
		
	}
	
	public void addGroup( Group group ) {		
		
	}
	
	public boolean removeGroup( Group g ) {		
		return false;
	}
	
	public boolean removeGroup( String g ) {		
		return false;
	}
	
	public boolean isInGroup( Group group, boolean parents ) {		
		return false;
	}
	
	public boolean isInGroup( String group, boolean parents ) {		
		return false;
	}
	
	public String getUUIDString( ) {		
		return null;
	}
	
	public boolean isMuted( ) {		
		return false;
	}
	
	public void setMuted( boolean muted ) {		
		
	}
	
	public Group[ ] getPlayerGroups( ) {		
		return null;
	}
	
	public String getFirstJoined( ) {		
		return null;
	}
	
	public long getTimePlayed( ) {		
		return 0;
	}
	
	public GameMode getMode( ) {		
		return null;
	}
	
	public int getModeId( ) {		
		return 0;
	}
	
	public void setMode( GameMode mode ) {		
		
	}
	
	public void setModeId( int mode ) {		
		
	}
	
	public boolean isOperator( ) {		
		return false;
	}
	
	public boolean isAdmin( ) {		
		return false;
	}
	
	public boolean canBuild( ) {		
		return false;
	}
	
	public void setCanBuild( boolean canModify ) {		
		
	}
	
	public boolean canIgnoreRestrictions( ) {		
		return false;
	}
	
	public void setCanIgnoreRestrictions( boolean canIgnore ) {		
		
	}
	
	public void addExhaustion( float exhaustion ) {		
		
	}
	
	public void setExhaustion( float exhaustion ) {		
		
	}
	
	public float getExhaustionLevel( ) {		
		return 0;
	}
	
	public void setHunger( int hunger ) {		
		
	}
	
	public int getHunger( ) {		
		return 0;
	}
	
	public void addExperience( int experience ) {		
		
	}
	
	public void removeExperience( int experience ) {		
		
	}
	
	public int getExperience( ) {		
		return 0;
	}
	
	public void setExperience( int xp ) {		
		
	}
	
	public int getLevel( ) {		
		return 0;
	}
	
	public void setLevel( int level ) {		
		
	}
	
	public void addLevel( int level ) {		
		
	}
	
	public void removeLevel( int level ) {		
		
	}
	
	public void setHome( Location loc ) {		
		
	}
	
	public Location getHome( ) {		
		return null;
	}
	
	public boolean hasHome( ) {		
		return false;
	}
	
	public String[ ] getAllowedIPs( ) {		
		return null;
	}
	
	public String getIP( ) {		
		return null;
	}
	
	public String getLastJoined( ) {		
		return null;
	}
	
	public void setStat( Stat stat, int value ) {
				
	}
	
	public void setStat( Statistics stat, int value ) {
				
	}
	
	public void increaseStat( Stat stat, int value ) {
		
	}
	
	public void increaseStat( Statistics stat, int value ) {
		
	}
	
	public void decreaseStat( Stat stat, int value ) {
		
	}
	
	public void decreaseStat( Statistics stat, int value ) {
		
	}
	
	public int getStat( Stat stat ) {
		return 0;
	}
	
	public int getStat( Statistics stat ) {
		return 0;
	}
	
	public boolean hasAchievement( Achievement achievement ) {
		return false;
	}
	
	public boolean hasAchievement( Achievements achievement ) {
		return false;
	}
	
	public void removeAchievement( Achievement achievement ) {
		
	}
	
	public void removeAchievement( Achievements achievement ) {
		
	}
	
	public void awardAchievement( Achievement achievement ) {
		
	}
	
	public void awardAchievement( Achievements achievement ) {
		
	}
	
	public void initPlayerData( ) {
		
	}
	
	public void chat( String message ) {
		
	}
	
	public Location getSpawnPosition( ) {
		return null;
	}
	
	public void setSpawnPosition( Location spawn ) {
		
	}
	
	public boolean executeCommand( String[ ] command ) {
		return false;
	}
	
	public void sendPacket( Packet packet ) {
		
	}
	
	public NetServerHandler getNetServerHandler( ) {
		return null;
	}
	
	public Inventory getEnderChestInventory( ) {
		return null;
	}
	
	public void teleportTo( Location location, TeleportCause cause ) {
		
	}
	
	public void kick( String reason ) {
		
	}
	
	public void kickNoHook( String reason ) {
		
	}
	
	public Direction getCardinalDirection( ) {
		return null;
	}
	
	public int getPing( ) {
		return 0;
	}
	
	@Deprecated
	public PlayerListEntry getPlayerListEntry( boolean shown ) {
		return null;
	}
	
	public PlayerListData getPlayerListData( PlayerListAction action ) {
		return null;
	}
	
	public void sendPlayerListEntry( PlayerListEntry plentry ) {
		
	}
	
	public void sendPlayerListData( PlayerListData data ) {
		
	}
	
	public boolean isSleeping( ) {
		return false;
	}
	
	public boolean isDeeplySleeping( ) {
		return false;
	}
	
	public void refreshCreativeMode( ) {
		
	}
	
	public void updateCapabilities( ) {
		
	}
	
	public void openInventory( Inventory inventory ) {
		
	}
	
	public void createAndOpenWorkbench( ) {
		
	}
	
	public void createAndOpenAnvil( ) {
		
	}
	
	public void createAndOpenEnchantmentTable( int bookshelves ) {
		
	}
	
	public void openSignEditWindow( Sign sign ) {
		
	}
	
	public void closeWindow( ) {
		
	}
	
	public void sendChatComponent( ChatComponent chatComponent ) {
		
	}
	
	public String getPreviousIP( ) {
		return null;
	}
	
	@Deprecated
	public void hidePlayer( Player player ) {
		
	}
	
	public void hideFrom( Player player ) {
		
	}
	
	@Deprecated
	public void hidePlayerGlobal( ) {
		
	}
	
	public void hideFromAll( ) {
		
	}
	
	@Deprecated
	public void showPlayer( Player player ) {
		
	}
	
	public void showTo( Player player ) {
		
	}
	
	@Deprecated
	public void showPlayerGlobal( ) {
		
	}
	
	public void showToAll( ) {
		
	}
	
	@Deprecated
	public boolean isPlayerHidden( Player player, Player isHidden ) {
		return false;
	}
	
	public boolean isHiddenFrom( Player player ) {
		return false;
	}
	
	public boolean isHiddenFromAll( ) {
		return false;
	}
	
	public void setCompassTarget( int x, int y, int z ) {
		
	}
	
	public GameProfile getGameProfile( ) {
		return null;
	}
	
	public ChatComponent getDisplayNameComponent( ) {
		return null;
	}
	
	public void setDisplayNameComponent( ChatComponent component ) {
		
	}
	
	public Inventory getSecondInventory( ) {
		return null;
	}
	
	public void showTitle( ChatComponent title ) {
		
	}
	
	public void showTitle( ChatComponent title, ChatComponent subtitle ) {
		
	}
	
}
