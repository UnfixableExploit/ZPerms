package org.tyrannyofheaven.bukkit.zPermissions.vault;

import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

// Implementation of all non-OfflinePlayer-based player methods
public abstract class ChatCompatibility extends Chat {

    public ChatCompatibility(Permission perms) {
        super(perms);
    }

    @Override
    public String getPlayerPrefix(String world, String player) {
        @SuppressWarnings("deprecation")
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return "";
        return getPlayerPrefix(world, offlinePlayer);
    }

    @Override
    public void setPlayerPrefix(String world, String player, String prefix) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return;
        setPlayerPrefix(world, offlinePlayer, prefix);
    }

    @Override
    public String getPlayerSuffix(String world, String player) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return "";
        return getPlayerSuffix(world, offlinePlayer);
    }

    @Override
    public void setPlayerSuffix(String world, String player, String suffix) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return;
        setPlayerSuffix(world, offlinePlayer, suffix);
    }

    @Override
    public int getPlayerInfoInteger(String world, String player, String node, int defaultValue) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return defaultValue;
        return getPlayerInfoInteger(world, offlinePlayer, node, defaultValue);
    }

    @Override
    public void setPlayerInfoInteger(String world, String player, String node, int value) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return;
        setPlayerInfoInteger(world, offlinePlayer, node, value);
    }

    @Override
    public double getPlayerInfoDouble(String world, String player, String node, double defaultValue) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return defaultValue;
        return getPlayerInfoDouble(world, offlinePlayer, node, defaultValue);
    }

    @Override
    public void setPlayerInfoDouble(String world, String player, String node, double value) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return;
        setPlayerInfoDouble(world, offlinePlayer, node, value);
    }

    @Override
    public boolean getPlayerInfoBoolean(String world, String player, String node, boolean defaultValue) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return defaultValue;
        return getPlayerInfoBoolean(world, offlinePlayer, node, defaultValue);
    }

    @Override
    public void setPlayerInfoBoolean(String world, String player, String node, boolean value) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return;
        setPlayerInfoBoolean(world, offlinePlayer, node, value);
    }

    @Override
    public String getPlayerInfoString(String world, String player, String node, String defaultValue) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return defaultValue;
        return getPlayerInfoString(world, offlinePlayer, node, defaultValue);
    }

    @Override
    public void setPlayerInfoString(String world, String player, String node, String value) {
        @SuppressWarnings("deprecation")
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
        if (offlinePlayer == null) return;
        setPlayerInfoString(world, offlinePlayer, node, value);
    }

}
