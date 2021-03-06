package uk.co.drnaylor.minecraft.hammer.bukkit.coreimpl;

import uk.co.drnaylor.minecraft.hammer.bukkit.HammerBukkit;
import uk.co.drnaylor.minecraft.hammer.core.interfaces.IConfigurationProvider;

public class BukkitConfigurationProvider implements IConfigurationProvider {

    private final HammerBukkit plugin;

    public BukkitConfigurationProvider(HammerBukkit plugin) {
        this.plugin = plugin;
    }

    @Override
    public String getServerName() {
        return plugin.getConfig().getString("server.name");
    }

    @Override
    public int getServerId() {
        return plugin.getConfig().getInt("server.id");
    }

    @Override
    public boolean notifyServerOfBans() {
        return plugin.getConfig().getBoolean("notifyAllOnBan");
    }
}
