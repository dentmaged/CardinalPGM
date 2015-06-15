package in.twizmwaz.cardinal.module.modules.nicks;

import in.twizmwaz.cardinal.module.Module;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerQuitEvent;

public class NickModule implements Module {

    private static Map<UUID, String> nicknames = new HashMap<UUID, String>();

    public void removeNick(Player player) {
        nicknames.remove(player.getUniqueId());
    }

    public void setNick(Player player, String nick) {
        nicknames.put(player.getUniqueId(), nick);
    }

    public String getNick(Player player) {
        return nicknames.get(player.getUniqueId());
    }

    public void onPlayerQuit(PlayerQuitEvent event) {
        nicknames.remove(event.getPlayer().getUniqueId());
    }

    @Override
    public void unload() {
        HandlerList.unregisterAll(this);
    }

}
