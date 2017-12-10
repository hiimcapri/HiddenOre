package com.github.devotedmc.hiddenore.util;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Achievement;
import org.bukkit.Effect;
import org.bukkit.EntityEffect;
import org.bukkit.GameMode;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Particle;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.Statistic;
import org.bukkit.WeatherType;
import org.bukkit.World;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Villager;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.Vector;

public class FakePlayer implements Player {
	private final ItemStack inHand;
	private final Location location;

	public FakePlayer(final Location location, final ItemStack inHand) {
		this.inHand = inHand;
		this.location = location;
	}

	@Override
	public String getName() {
		return "Spoof";
	}

	@Override
	public PlayerInventory getInventory() {
		return new PlayerInventory() {

			@Override
			public int getSize() {
				return 0;
			}

			@Override
			public int getMaxStackSize() {
				return 0;
			}

			@Override
			public void setMaxStackSize(int size) {
			}

			@Override
			public String getName() {
				return null;
			}

			@Override
			public ItemStack getItem(int index) {
				return null;
			}

			@Override
			public HashMap<Integer, ItemStack> addItem(ItemStack...items) throws IllegalArgumentException {
				return null;
			}

			@Override
			public HashMap<Integer, ItemStack> removeItem(ItemStack...items) throws IllegalArgumentException {
				return null;
			}

			@Override
			public ItemStack[] getContents() {
				return null;
			}

			@Override
			public void setContents(ItemStack[] items) throws IllegalArgumentException {
			}

			@Override
			public ItemStack[] getStorageContents() {
				return null;
			}

			@Override
			public void setStorageContents(ItemStack[] items) throws IllegalArgumentException {
			}

			@Override
			public boolean contains(int materialId) {
				return false;
			}

			@Override
			public boolean contains(Material material) throws IllegalArgumentException {
				return false;
			}

			@Override
			public boolean contains(ItemStack item) {
				return false;
			}

			@Override
			public boolean contains(int materialId, int amount) {
				return false;
			}

			@Override
			public boolean contains(Material material, int amount) throws IllegalArgumentException {
				return false;
			}

			@Override
			public boolean contains(ItemStack item, int amount) {
				return false;
			}

			@Override
			public boolean containsAtLeast(ItemStack item, int amount) {
				return false;
			}

			@Override
			public HashMap<Integer, ? extends ItemStack> all(int materialId) {
				return null;
			}

			@Override
			public HashMap<Integer, ? extends ItemStack> all(Material material) throws IllegalArgumentException {
				return null;
			}

			@Override
			public HashMap<Integer, ? extends ItemStack> all(ItemStack item) {
				return null;
			}

			@Override
			public int first(int materialId) {
				return 0;
			}

			@Override
			public int first(Material material) throws IllegalArgumentException {
				return 0;
			}

			@Override
			public int first(ItemStack item) {
				return 0;
			}

			@Override
			public int firstEmpty() {
				return 0;
			}

			@Override
			public void remove(int materialId) {
			}

			@Override
			public void remove(Material material) throws IllegalArgumentException {
			}

			@Override
			public void remove(ItemStack item) {
			}

			@Override
			public void clear(int index) {
			}

			@Override
			public void clear() {
			}

			@Override
			public List<HumanEntity> getViewers() {
				return null;
			}

			@Override
			public String getTitle() {
				return null;
			}

			@Override
			public InventoryType getType() {
				return null;
			}

			@Override
			public ListIterator<ItemStack> iterator() {
				return null;
			}

			@Override
			public ListIterator<ItemStack> iterator(int index) {
				return null;
			}

			@Override
			public Location getLocation() {
				return location;
			}

			@Override
			public ItemStack[] getArmorContents() {
				return null;
			}

			@Override
			public ItemStack[] getExtraContents() {
				return null;
			}

			@Override
			public ItemStack getHelmet() {
				return null;
			}

			@Override
			public ItemStack getChestplate() {
				return null;
			}

			@Override
			public ItemStack getLeggings() {
				return null;
			}

			@Override
			public ItemStack getBoots() {
				return null;
			}

			@Override
			public void setItem(int index, ItemStack item) {
			}

			@Override
			public void setArmorContents(ItemStack[] items) {
			}

			@Override
			public void setExtraContents(ItemStack[] items) {
			}

			@Override
			public void setHelmet(ItemStack helmet) {
			}

			@Override
			public void setChestplate(ItemStack chestplate) {
			}

			@Override
			public void setLeggings(ItemStack leggings) {
			}

			@Override
			public void setBoots(ItemStack boots) {
			}

			@Override
			public ItemStack getItemInMainHand() {
				return inHand;
			}

			@Override
			public void setItemInMainHand(ItemStack item) {
			}

			@Override
			public ItemStack getItemInOffHand() {
				return null;
			}

			@Override
			public void setItemInOffHand(ItemStack item) {
			}

			@Override
			public ItemStack getItemInHand() {
				return inHand;
			}

			@Override
			public void setItemInHand(ItemStack stack) {
			}

			@Override
			public int getHeldItemSlot() {
				return 0;
			}

			@Override
			public void setHeldItemSlot(int slot) {
			}

			@Override
			public int clear(int id, int data) {
				return 0;
			}

			@Override
			public HumanEntity getHolder() {
				return null;
			}
		};
	}

	@Override
	public Inventory getEnderChest() {
		return null;
	}

	@Override
	public MainHand getMainHand() {
		return null;
	}

	@Override
	public boolean setWindowProperty(Property prop, int value) {
		return false;
	}

	@Override
	public InventoryView getOpenInventory() {
		return null;
	}

	@Override
	public InventoryView openInventory(Inventory inventory) {
		return null;
	}

	@Override
	public InventoryView openWorkbench(Location location, boolean force) {
		return null;
	}

	@Override
	public InventoryView openEnchanting(Location location, boolean force) {
		return null;
	}

	@Override
	public void openInventory(InventoryView inventory) {
	}

	@Override
	public InventoryView openMerchant(Villager trader, boolean force) {
		return null;
	}

	@Override
	public void closeInventory() {
	}

	@Override
	public ItemStack getItemInHand() {
		return inHand;
	}

	@Override
	public void setItemInHand(ItemStack item) {
	}

	@Override
	public ItemStack getItemOnCursor() {
		return null;
	}

	@Override
	public void setItemOnCursor(ItemStack item) {
	}

	@Override
	public boolean isSleeping() {
		return false;
	}

	@Override
	public int getSleepTicks() {
		return 0;
	}

	@Override
	public GameMode getGameMode() {
		return null;
	}

	@Override
	public void setGameMode(GameMode mode) {
	}

	@Override
	public boolean isBlocking() {
		return false;
	}

	@Override
	public int getExpToLevel() {
		return 0;
	}

	@Override
	public double getEyeHeight() {
		return 0;
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		return 0;
	}

	@Override
	public Location getEyeLocation() {
		return location;
	}

	@Override
	public List<Block> getLineOfSight(Set<Material> transparent, int maxDistance) {
		return null;
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		return null;
	}

	@Override
	public Block getTargetBlock(Set<Material> transparent, int maxDistance) {
		return null;
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent, int maxDistance) {
		return null;
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(Set<Material> transparent, int maxDistance) {
		return null;
	}

	@Override
	public int getRemainingAir() {
		return 0;
	}

	@Override
	public void setRemainingAir(int ticks) {
	}

	@Override
	public int getMaximumAir() {
		return 0;
	}

	@Override
	public void setMaximumAir(int ticks) {
	}

	@Override
	public int getMaximumNoDamageTicks() {
		return 0;
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
	}

	@Override
	public double getLastDamage() {
		return 0;
	}

	@Override
	public void setLastDamage(double damage) {

	}

	@Override
	public int getNoDamageTicks() {

		return 0;
	}

	@Override
	public void setNoDamageTicks(int ticks) {

	}

	@Override
	public Player getKiller() {

		return null;
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect) {

		return false;
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect, boolean force) {

		return false;
	}

	@Override
	public boolean addPotionEffects(Collection<PotionEffect> effects) {

		return false;
	}

	@Override
	public boolean hasPotionEffect(PotionEffectType type) {

		return false;
	}

	@Override
	public void removePotionEffect(PotionEffectType type) {

	}

	@Override
	public Collection<PotionEffect> getActivePotionEffects() {

		return null;
	}

	@Override
	public boolean hasLineOfSight(Entity other) {

		return false;
	}

	@Override
	public boolean getRemoveWhenFarAway() {

		return false;
	}

	@Override
	public void setRemoveWhenFarAway(boolean remove) {

	}

	@Override
	public EntityEquipment getEquipment() {

		return null;
	}

	@Override
	public void setCanPickupItems(boolean pickup) {

	}

	@Override
	public boolean getCanPickupItems() {

		return false;
	}

	@Override
	public boolean isLeashed() {

		return false;
	}

	@Override
	public Entity getLeashHolder() throws IllegalStateException {

		return null;
	}

	@Override
	public boolean setLeashHolder(Entity holder) {

		return false;
	}

	@Override
	public boolean isGliding() {

		return false;
	}

	@Override
	public void setGliding(boolean gliding) {

	}

	@Override
	public void setAI(boolean ai) {

	}

	@Override
	public boolean hasAI() {

		return false;
	}

	@Override
	public void setCollidable(boolean collidable) {

	}

	@Override
	public boolean isCollidable() {

		return false;
	}

	@Override
	public AttributeInstance getAttribute(Attribute attribute) {

		return null;
	}

	@Override
	public Location getLocation() {
		return location;
	}

	@Override
	public Location getLocation(Location loc) {
		return location;
	}

	@Override
	public void setVelocity(Vector velocity) {

	}

	@Override
	public Vector getVelocity() {

		return null;
	}

	@Override
	public World getWorld() {
		return location.getWorld();
	}

	@Override
	public boolean teleport(Location location) {

		return false;
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {

		return false;
	}

	@Override
	public boolean teleport(Entity destination) {

		return false;
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {

		return false;
	}

	@Override
	public List<Entity> getNearbyEntities(double x, double y, double z) {

		return null;
	}

	@Override
	public int getEntityId() {

		return 0;
	}

	@Override
	public int getFireTicks() {

		return 0;
	}

	@Override
	public int getMaxFireTicks() {

		return 0;
	}

	@Override
	public void setFireTicks(int ticks) {

	}

	@Override
	public void remove() {

	}

	@Override
	public boolean isDead() {

		return false;
	}

	@Override
	public boolean isValid() {

		return false;
	}

	@Override
	public Server getServer() {

		return null;
	}

	@Override
	public Entity getPassenger() {

		return null;
	}

	@Override
	public boolean setPassenger(Entity passenger) {

		return false;
	}

	@Override
	public boolean isEmpty() {

		return false;
	}

	@Override
	public boolean eject() {

		return false;
	}

	@Override
	public float getFallDistance() {

		return 0;
	}

	@Override
	public void setFallDistance(float distance) {

	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {

	}

	@Override
	public EntityDamageEvent getLastDamageCause() {

		return null;
	}

	@Override
	public UUID getUniqueId() {

		return null;
	}

	@Override
	public int getTicksLived() {

		return 0;
	}

	@Override
	public void setTicksLived(int value) {

	}

	@Override
	public void playEffect(EntityEffect type) {

	}

	@Override
	public EntityType getType() {

		return null;
	}

	@Override
	public boolean isInsideVehicle() {

		return false;
	}

	@Override
	public boolean leaveVehicle() {

		return false;
	}

	@Override
	public Entity getVehicle() {

		return null;
	}

	@Override
	public void setCustomName(String name) {

	}

	@Override
	public String getCustomName() {

		return "Spoof";
	}

	@Override
	public void setCustomNameVisible(boolean flag) {

	}

	@Override
	public boolean isCustomNameVisible() {

		return false;
	}

	@Override
	public void setGlowing(boolean flag) {

	}

	@Override
	public boolean isGlowing() {

		return false;
	}

	@Override
	public void setInvulnerable(boolean flag) {

	}

	@Override
	public boolean isInvulnerable() {

		return false;
	}

	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {

	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {

		return null;
	}

	@Override
	public boolean hasMetadata(String metadataKey) {

		return false;
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin) {

	}

	@Override
	public void sendMessage(String message) {

	}

	@Override
	public void sendMessage(String[] messages) {

	}

	@Override
	public boolean isPermissionSet(String name) {

		return false;
	}

	@Override
	public boolean isPermissionSet(Permission perm) {

		return false;
	}

	@Override
	public boolean hasPermission(String name) {

		return false;
	}

	@Override
	public boolean hasPermission(Permission perm) {

		return false;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {

		return null;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin) {

		return null;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {

		return null;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {

		return null;
	}

	@Override
	public void removeAttachment(PermissionAttachment attachment) {

	}

	@Override
	public void recalculatePermissions() {

	}

	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {

		return null;
	}

	@Override
	public boolean isOp() {

		return false;
	}

	@Override
	public void setOp(boolean value) {

	}

	@Override
	public void damage(double amount) {

	}

	@Override
	public void damage(double amount, Entity source) {

	}
	
	@Override
	public double getHealth() {

		return 0;
	}

	@Override
	public void setHealth(double health) {

	}

	@Override
	public double getMaxHealth() {

		return 0;
	}

	@Override
	public void setMaxHealth(double health) {

	}

	@Override
	public void resetMaxHealth() {

	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {

		return null;
	}

	@Override
	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector velocity) {

		return null;
	}

	@Override
	public boolean isConversing() {

		return false;
	}

	@Override
	public void acceptConversationInput(String input) {

	}

	@Override
	public boolean beginConversation(Conversation conversation) {

		return false;
	}

	@Override
	public void abandonConversation(Conversation conversation) {

	}

	@Override
	public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {

	}

	@Override
	public boolean isOnline() {

		return false;
	}

	@Override
	public boolean isBanned() {

		return false;
	}

	@Override
	public boolean isWhitelisted() {

		return false;
	}

	@Override
	public void setWhitelisted(boolean value) {

	}

	@Override
	public Player getPlayer() {

		return null;
	}

	@Override
	public long getFirstPlayed() {

		return 0;
	}

	@Override
	public long getLastPlayed() {

		return 0;
	}

	@Override
	public boolean hasPlayedBefore() {

		return false;
	}

	@Override
	public Map<String, Object> serialize() {

		return null;
	}

	@Override
	public void sendPluginMessage(Plugin source, String channel, byte[] message) {

	}

	@Override
	public Set<String> getListeningPluginChannels() {

		return null;
	}

	@Override
	public String getDisplayName() {
		return "Spoof";
	}

	@Override
	public void setDisplayName(String name) {

	}

	@Override
	public String getPlayerListName() {
		return "Spoof";
	}

	@Override
	public void setPlayerListName(String name) {

	}

	@Override
	public void setCompassTarget(Location loc) {

	}

	@Override
	public Location getCompassTarget() {

		return null;
	}

	@Override
	public InetSocketAddress getAddress() {

		return null;
	}

	@Override
	public void sendRawMessage(String message) {

	}

	@Override
	public void kickPlayer(String message) {

	}

	@Override
	public void chat(String msg) {

	}

	@Override
	public boolean performCommand(String command) {

		return false;
	}

	@Override
	public boolean isSneaking() {

		return false;
	}

	@Override
	public void setSneaking(boolean sneak) {

	}

	@Override
	public boolean isSprinting() {

		return false;
	}

	@Override
	public void setSprinting(boolean sprinting) {

	}

	@Override
	public void saveData() {

	}

	@Override
	public void loadData() {

	}

	@Override
	public void setSleepingIgnored(boolean isSleeping) {

	}

	@Override
	public boolean isSleepingIgnored() {

		return false;
	}

	@Override
	public void playNote(Location loc, byte instrument, byte note) {

	}

	@Override
	public void playNote(Location loc, Instrument instrument, Note note) {

	}

	@Override
	public void playSound(Location location, Sound sound, float volume, float pitch) {

	}

	@Override
	public void playSound(Location location, String sound, float volume, float pitch) {

	}

	@Override
	public void playEffect(Location loc, Effect effect, int data) {

	}

	@Override
	public <T> void playEffect(Location loc, Effect effect, T data) {

	}

	@Override
	public void sendBlockChange(Location loc, Material material, byte data) {

	}

	@Override
	public boolean sendChunkChange(Location loc, int sx, int sy, int sz, byte[] data) {

		return false;
	}

	@Override
	public void sendBlockChange(Location loc, int material, byte data) {

	}

	@Override
	public void sendSignChange(Location loc, String[] lines) throws IllegalArgumentException {

	}

	@Override
	public void sendMap(MapView map) {

	}

	@Override
	public void updateInventory() {

	}

	@Override
	public void awardAchievement(Achievement achievement) {

	}

	@Override
	public void removeAchievement(Achievement achievement) {

	}

	@Override
	public boolean hasAchievement(Achievement achievement) {

		return false;
	}

	@Override
	public void incrementStatistic(Statistic statistic) throws IllegalArgumentException {

	}

	@Override
	public void decrementStatistic(Statistic statistic) throws IllegalArgumentException {

	}

	@Override
	public void incrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {

	}

	@Override
	public void decrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {

	}

	@Override
	public void setStatistic(Statistic statistic, int newValue) throws IllegalArgumentException {

	}

	@Override
	public int getStatistic(Statistic statistic) throws IllegalArgumentException {

		return 0;
	}

	@Override
	public void incrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {

	}

	@Override
	public void decrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {

	}

	@Override
	public int getStatistic(Statistic statistic, Material material) throws IllegalArgumentException {

		return 0;
	}

	@Override
	public void incrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {

	}

	@Override
	public void decrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {

	}

	@Override
	public void setStatistic(Statistic statistic, Material material, int newValue) throws IllegalArgumentException {

	}

	@Override
	public void incrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {

	}

	@Override
	public void decrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {

	}

	@Override
	public int getStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {

		return 0;
	}

	@Override
	public void incrementStatistic(Statistic statistic, EntityType entityType, int amount)
			throws IllegalArgumentException {

	}

	@Override
	public void decrementStatistic(Statistic statistic, EntityType entityType, int amount) {

	}

	@Override
	public void setStatistic(Statistic statistic, EntityType entityType, int newValue) {

	}

	@Override
	public void setPlayerTime(long time, boolean relative) {

	}

	@Override
	public long getPlayerTime() {

		return 0;
	}

	@Override
	public long getPlayerTimeOffset() {

		return 0;
	}

	@Override
	public boolean isPlayerTimeRelative() {

		return false;
	}

	@Override
	public void resetPlayerTime() {

	}

	@Override
	public void setPlayerWeather(WeatherType type) {

	}

	@Override
	public WeatherType getPlayerWeather() {

		return null;
	}

	@Override
	public void resetPlayerWeather() {

	}

	@Override
	public void giveExp(int amount) {

	}

	@Override
	public void giveExpLevels(int amount) {

	}

	@Override
	public float getExp() {

		return 0;
	}

	@Override
	public void setExp(float exp) {

	}

	@Override
	public int getLevel() {

		return 0;
	}

	@Override
	public void setLevel(int level) {

	}

	@Override
	public int getTotalExperience() {

		return 0;
	}

	@Override
	public void setTotalExperience(int exp) {

	}

	@Override
	public float getExhaustion() {

		return 0;
	}

	@Override
	public void setExhaustion(float value) {

	}

	@Override
	public float getSaturation() {

		return 0;
	}

	@Override
	public void setSaturation(float value) {

	}

	@Override
	public int getFoodLevel() {

		return 0;
	}

	@Override
	public void setFoodLevel(int value) {

	}

	@Override
	public Location getBedSpawnLocation() {

		return null;
	}

	@Override
	public void setBedSpawnLocation(Location location) {

	}

	@Override
	public void setBedSpawnLocation(Location location, boolean force) {

	}

	@Override
	public boolean getAllowFlight() {

		return false;
	}

	@Override
	public void setAllowFlight(boolean flight) {

	}

	@Override
	public void hidePlayer(Player player) {

	}

	@Override
	public void showPlayer(Player player) {

	}

	@Override
	public boolean canSee(Player player) {

		return false;
	}

	@Override
	public boolean isOnGround() {

		return false;
	}

	@Override
	public boolean isFlying() {

		return false;
	}

	@Override
	public void setFlying(boolean value) {

	}

	@Override
	public void setFlySpeed(float value) throws IllegalArgumentException {

	}

	@Override
	public void setWalkSpeed(float value) throws IllegalArgumentException {

	}

	@Override
	public float getFlySpeed() {

		return 0;
	}

	@Override
	public float getWalkSpeed() {

		return 0;
	}

	@Override
	public void setTexturePack(String url) {

	}

	@Override
	public void setResourcePack(String url) {

	}

	@Override
	public Scoreboard getScoreboard() {

		return null;
	}

	@Override
	public void setScoreboard(Scoreboard scoreboard) throws IllegalArgumentException, IllegalStateException {

	}

	@Override
	public boolean isHealthScaled() {

		return false;
	}

	@Override
	public void setHealthScaled(boolean scale) {

	}

	@Override
	public void setHealthScale(double scale) throws IllegalArgumentException {

	}

	@Override
	public double getHealthScale() {

		return 0;
	}

	@Override
	public Entity getSpectatorTarget() {

		return null;
	}

	@Override
	public void setSpectatorTarget(Entity entity) {

	}

	@Override
	public void sendTitle(String title, String subtitle) {

	}

	@Override
	public void resetTitle() {

	}

	@Override
	public void spawnParticle(Particle particle, Location location, int count) {

	}

	@Override
	public void spawnParticle(Particle particle, double x, double y, double z, int count) {

	}

	@Override
	public <T> void spawnParticle(Particle particle, Location location, int count, T data) {

	}

	@Override
	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, T data) {

	}

	@Override
	public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ) {

	}

	@Override
	public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ) {

	}

	@Override
	public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ, T data) {

	}

	@Override
	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, T data) {

	}

	@Override
	public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ, double extra) {

	}

	@Override
	public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, double extra) {

	}

	@Override
	public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY,
			double offsetZ, double extra, T data) {

	}

	@Override
	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, double extra, T data) {

	}

	@Override
	public Spigot spigot() {
		return null;
	}

	@Override
	public boolean isSilent() {
		return false;
	}

	@Override
	public void setSilent(boolean flag) {
	}

	@Override
	public boolean hasGravity() {
		return false;
	}

	@Override
	public void setGravity(boolean gravity) {
	}

	@Override
	public void stopSound(Sound sound) {
	}

	@Override
	public void stopSound(String sound) {
	}

	@Override
	public int getCooldown(Material arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Entity getShoulderEntityLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getShoulderEntityRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasCooldown(Material arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHandRaised() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public InventoryView openMerchant(Merchant arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCooldown(Material arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShoulderEntityLeft(Entity arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShoulderEntityRight(Entity arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PotionEffect getPotionEffect(PotionEffectType arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addPassenger(Entity arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addScoreboardTag(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Entity> getPassengers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PistonMoveReaction getPistonMoveReaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPortalCooldown() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<String> getScoreboardTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean removePassenger(Entity arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeScoreboardTag(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPortalCooldown(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AdvancementProgress getAdvancementProgress(Advancement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void playSound(Location arg0, Sound arg1, SoundCategory arg2, float arg3, float arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(Location arg0, String arg1, SoundCategory arg2, float arg3, float arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendTitle(String arg0, String arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResourcePack(String arg0, byte[] arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopSound(Sound arg0, SoundCategory arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopSound(String arg0, SoundCategory arg1) {
		// TODO Auto-generated method stub
		
	}
}
