# Prototype Pattern
---

Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

## Concept

In general, creating a new instance from scratch is a costly operation. Using the prototype pattern, you can create new instances by copying or cloning an instance of an existing one. This approach saves both time and money in creating a new instance from scratch.

![Structure](/out/src/DesignPatterns/Prototype/Diagrams/structure/Structure.png)

## Real-World Example

Suppose we have a master copy of a valuable document. We need to incorporate some changes to it to see the effect of the change. In such a case, we can make a photocopy of the original document and edit the changes. Consider another example. Suppose a group of people decide to celebrate the birthday of their friend Ron. They go to a bakery and buy a cake. To make it special, they request the seller to write, “Happy Birthday Ron” on the cake. From the seller’s point of view, he is not making any new model. He already defined the model and produces many cakes (which all look the same) every day by following the same process, and finally makes each special with some small changes.

## Computer-World Example

Let’s assume that you have an application that is very stable. In the future, you may want to update the application with some small modifications. So, you start with a copy of your original application, make changes, and analyze further. Surely, to save your time and money, you do not want to start from scratch.

> **Note** Consider the Object.clone() method as an example of a prototype.


## Illustration

Here, BasicCar is a basic prototype. Nano and Ford are the concrete prototypes that have implemented the clone() method defined in BasicCar. In this example, we have created a BasicCar class with a default price (in Indian currency). Later, we modify the price per model. PrototypePatternExample.java is the client in this implementation.

![Class](/out/src/DesignPatterns/Prototype/Diagrams/class/Class.png)

## Book Reference
Sarcar, Vaskaran. Java Design Patterns (pp. 35-36). Apress. Edição do Kindle.  