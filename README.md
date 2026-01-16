# ChatGames API

The **ChatGames API** is a developer-facing API for integrating with the [ChatGames](https://github.com/RareHyperIonYT/ChatGames) plugin. It allows you to listen to events when a game starts, end, or is won, and interact with game data such as questions, answers, rewards, and game types.

---

## Tabe of Contents

1. [Maven Setup](#maven-setup)
2. [Events](#events)
   - [ChatGameStartEvent](#chatgamestartevent)
   - [ChatGameEndEvent](#chatgameendevent)
   - [ChatGameWinEvent](#chatgamewinevent)
3. [Example Usage](#example-usage)

## Maven Setup

### Repository

Add the JitPack repository to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

### Dependency

Add the ChatGames API dependency:

```xml
<dependency>
    <groupId>com.github.RareHyperIonYT</groupId>
    <artifactId>chatgames-api</artifactId>
    <version>0.1.1</version>
</dependency>

```

## Events

### ChatGameStartEvent

Fired when a chat game starts.

**Properties:**
- `GameType type` - The type of game.
- `String question` - The question / prompt for the game.
- `String answer` - The correct answer for the game.
- `List<String> rewards` - The list of reward commands. 
- 
### ChatGameEndEvent

Fired when a chat game ends.

**Properties:**
- `GameType type` - The type of game.
- `String question` - The question / prompt for the game.
- `String answer` - The correct answer for the game.
- `List<String> rewards` - The list of reward commands.
- `EndReason reason` - The reason the game ended. (`TIMEOUT` or `COMMAND`).
- 
### ChatGameWinEvent

Fired when a player wins a chat game.

**Properties:**
- `Player player` - the player that won the game.
- `GameType type` - The type of game.
- `String question` - The question / prompt for the game.
- `String answer` - The correct answer for the game.
- `List<String> rewards` - The list of reward commands.

## Example Usage

```java
import dev.rarehyperion.chatgames.events.ChatGameWinEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

@EventHandler
public void onChatGameWin(final ChatGameWinEvent event) {
    final Player player = event.getPlayer();
    player.sendMessage("Congratulations! You won " + event.getPlayer());
    player.sendMessage("Your rewards:");
    event.getRewards().forEach(reward -> player.sendMessage("- " + reward));
}
```