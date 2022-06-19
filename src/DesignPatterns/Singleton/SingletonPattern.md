# Singleton Pattern

Ensure a class only has one instance, and provide a global point of access to it.

## Concept

A class cannot have multiple instances. Once created, the next time onward, you use only the existing instance. This approach helps you restrict unnecessary object creations in a centralized system. The approach also promotes easy maintenance.

## Real-World Example

Let’s assume that you are a member of a sports team, and your team is participating in a tournament. Your team needs to play against multiple opponents throughout the tournament. Before each of these matches, as per the rules of the game, the captains of the two sides must do a coin toss. If your team does not have a captain, you need to elect someone as a captain. Prior to each game and each coin toss, you may not repeat the process of electing a captain if you already nominated a person as a captain for the team. Basically, from every team member’s perspective, there should be only one captain of the team.

## Computer-World Example

In some specific software systems, you may prefer to use only one file system for the centralized management of resources. Also, this pattern can implement a caching mechanism.

> **Note** You notice a similar pattern when you consider the getRuntime() method of the java.lang.Runtime class. It is implemented as an eager initialization of a Singleton class. You’ll learn about eager initialization shortly.


## Illustration

These are the key characteristics in the following implementation. The constructor is private to prevent the use of a “new” operator. You’ll create an instance of the class, if you did not create any such instance earlier; otherwise, you’ll simply reuse the existing one. To take care of thread safety, I use the “synchronized” keyword.

![Class](/out/src/DesignPatterns/Singleton/Diagrams/class/Class.png)

## Book Reference
Sarcar, Vaskaran. Java Design Patterns (pp. 35-36). Apress. Edição do Kindle.