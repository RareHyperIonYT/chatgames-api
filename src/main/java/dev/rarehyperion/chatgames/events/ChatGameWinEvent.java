package dev.rarehyperion.chatgames.events;

import dev.rarehyperion.chatgames.game.GameType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

public class ChatGameWinEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final GameType type;
    private final String question;
    private final String answer;
    private final List<String> rewards;

    public ChatGameWinEvent(final Player player, final GameType type, final String question, final String answer, final List<String> rewards) {
        this.player = player;
        this.type = type;
        this.question = question;
        this.answer = answer;
        this.rewards = rewards;
    }

    public Player getPlayer() {
        return this.player;
    }

    public List<String> getRewards() {
        return this.rewards;
    }

    public GameType getType() {
        return this.type;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

}
