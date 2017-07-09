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

Example class
------------

<pre>
placeholder

placeholderplaceholder

placeholder

placeholderplaceholderplaceholder

placeholderplaceholder

placeholder

placeholderplaceholder

placeholder

placeholderplaceholderplaceholder

placeholderplaceholderplaceholder

placeholder
</pre>

GameCore versions
-------------

(these are placeholders)

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

End of documentation
--------------------

Well thats all of my current documentation, got any questions?
*Message me: [mc-market](http://www.mc-market.org/conversations/add?to=Bill).*
