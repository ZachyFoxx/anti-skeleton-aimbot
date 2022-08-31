package sh.foxboy.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

  @Override
  public void onLoad() {

  }

  @Override
  public void onEnable() {
    getLogger().info("Hello :)");
  }

  @Override
  public void onDisable() {

  }
}
