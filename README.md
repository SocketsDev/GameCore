GameCore Documentation
================================

*Visit the [homepage](http://socketsdev.github.io/).*

GameCore is not a standalone! It is for developers to use.

What features does GameCore have?
-------------------------

* Serverwide game

* Manage game

* Manage players

* Manage teams

* Manage kits

* Game states

* Five gamestates (Lobby, starting, warmup, started, ending)

* File Management

* More

Usage
------------------------

Here are a couple of **examples** of what you can do! 

Let´s call our example game SuperMinigame.

1. First off we need to create a new instance of GameCore:

        GameCore game = new GameCore();

2. Now you need to create the Game and set the game´s current state:

        public void onEnable() {
            game.createGame("SuperMinigame", State.LOBBY);
        }

Basically what we did now was setup our basics for creating a game, now we get to the fun part called do it yourself :)

<dl>
  <dt>Warning</dt>
  <dd>The code shown-off might be different in separate versions of GameCore!</dd>
  <dt>Old Documentation</dt>
  <dd>I currently do not supply old documentation in downloads.</dd>
</dl>

GameCore versions
-------------

<table>
  <tr>
    <th>Version</th><th>Name</th>
  </tr>
  <tr>
    <td>0.1.0</td><td>GameCore Alpha (Untested)</td>
  </tr>
  <tr>
    <td>0.0.1</td><td>GameCore (Pre-development)</td>
  </tr>
</table>

Tutorial
------------

Tutorial on creating a simple game will be coming soon, here are a few examples instead.

Managing your base game
<pre>
GameCore core = new GameCore()
//This should be on top in your main class, and made accessible everywhere needed.

core.createGame(String name, State state)
//Now we are creating a class of the Game Object. With the name of your game and setting the starting GameState, which usally should be State.LOBBY, but you can go with any of the five game states.

core.getGame()
//Getting your game object. (Here you have a few setters/getters, such as: getPlayers, getName, getState, setState.
</pre>

Teams
<pre>
Team teamName = new Team(String name, ChatColor teamColor)
//Creating a new team object with a name and a color.

core.getTeamManager()
//Using this you will manage all your created teams. (Using: getTeam, addPlayer, removePlayer, removeTeam)
</pre>

Kits
<pre>
Kit kitName = new Kit(String name)
//Creating a new kit object with a name.

core.getKitManager()
//Using this you will manage all your created teams. (Using: getKit, addPlayer, removePlayer, removeKit)
</pre>

End of documentation
--------------------

Well thats all of my current documentation, got any questions?
*Message me: [mc-market](http://www.mc-market.org/conversations/add?to=Bill).*
