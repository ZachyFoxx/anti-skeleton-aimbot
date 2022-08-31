package sh.foxboy.anti_skeleton_aimbot;

import java.util.Random;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.util.Vector;

public class Plugin extends JavaPlugin implements Listener {

  @Override
  public void onLoad() {

  }

  @Override
  public void onEnable() {
    getLogger().info("Bye bye skeleton accuracy!");
    getServer().getPluginManager().registerEvents(this, this);
  }

  @Override
  public void onDisable() {

  }

  // This doesn't need another class, it's super simple.
  @EventHandler
  public void onProjectileLaunch(ProjectileLaunchEvent event) {
    if (((Entity) event.getEntity().getShooter()).getType() == EntityType.SKELETON) {
      int x = getRandom();
      int y = getRandom();
      int z = getRandom();
      event.getEntity().setVelocity(new Vector(x,y,z));
    }
  }
  private int getRandom() {
    Random random = new Random();
    return random.nextInt(2)-2;
  }
}
