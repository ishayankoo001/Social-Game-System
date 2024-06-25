# SGS: A Social Game System 🎮🌐

This project aims to implement a system for simulation of SGS Games.

**Players and the Universe:**

* Players are members of a numerable set called the universe 🌌, representing the total player population(Active and Inactive).
* Only a finite subset of players is active 🕹️ in the game at any given time.

**Network of Acquaintances:**

* Active players connect with each other, forming a network of acquaintances 🤝.
* Each player has a neighborhood, represented by an array of length `k`, where `k` is the maximum number of acquaintances a player can have.
* The first position in a player's neighborhood is always the player itself 🧍‍♂️🧍‍♀️.
* The neighborhood relationship is not necessarily transitive (i.e., friend of a friend isn't necessarily your friend 🙅‍♂️🙅‍♀️).
* This network can evolve over time as players form new connections or lose existing ones 🔄.

**Game Dynamics:**

* SGS is a game of emergence 🌱, where complex behaviors arise from individual interactions within the network.

