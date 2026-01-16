package dev.rarehyperion.chatgames.events;

import dev.rarehyperion.chatgames.game.EndReason;
import dev.rarehyperion.chatgames.game.GameType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

public class ChatGameEndEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final GameType type;
    private final String question;
    private final String answer;
    private final List<String> rewards;
    private final EndReason reason;

    public ChatGameEndEvent(final GameType type, final String question, final String answer, final List<String> rewards, final EndReason reason) {
        this.type = type;
        this.question = question;
        this.answer = answer;
        this.rewards = rewards;
        this.reason = reason;
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

    public List<String> getRewards() {
        return this.rewards;
    }

    public EndReason getReason() {
        return this.reason;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

}
