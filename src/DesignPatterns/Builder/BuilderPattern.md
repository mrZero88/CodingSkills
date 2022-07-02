# Builder Pattern

Separate the construction of a complex object from its representation so that the same construction processes can create different representations.

## Concept

The builder pattern is useful for creating complex objects that have multiple parts. The creational mechanism of an object should be independent of these parts. The construction process does not care about how these parts are assembled. The same construction process must allow us to create different representations of the objects.

![Structure](/out/src/DesignPatterns/Builder/Diagrams/structure/Structure.png)

Product is the complex object that you want to create. ConcreteBuilder constructs and assembles the parts of a product by implementing an abstract interface, Builder. The ConcreteBuilder objects build the product’s internal representations and define the creational process/assembling mechanisms. Builders can also provide methods to get an object that is created and available for use (notice the getVehicle() method in the Builder interface in the following implementation). Director is responsible for creating the final object using the Builder interface. In other words, Director uses Builder and controls the steps/sequence to build the final Product. Builders can also keep reference of the products that they built, so that they can be used again.

## Real-World Example

To complete an order for a computer, different parts are assembled based on customer preferences (e.g., one customer can opt for a 500 GB hard disk with an Intel processor, and another customer can choose a 250 GB hard disk with an AMD processor). Consider another example. Suppose that you intend to go on a tour with a travel company that provides various packages for the same tour (for example, they can provide special arrangements, a different kind of vehicle for the sightseeing, etc.). You can choose your package based on your budget.

## Computer-World Example

The builder pattern can be used when we want to convert one text format to another text format (e.g., RTF to ASCII text).

> **Note** The Java.util.Calendar.Builder class is an example in this category, but it is available in Java 8 and onward only. The java.lang.StringBuilder class is a close example in this context. But you need to remember that the GoF definition says that this pattern allows you to use the same construction process to make different representations. In this context, this example does not fully qualify for this pattern.

## Illustration

In this example, we have the following participants: Builder, Car, MotorCycle, Product, and Director. The first three are very straightforward; Car and MotorCycle are concrete classes and they implement the Builder interface. Builder is used to create parts of the Product object, where Product represents the complex object under construction. Since Car and MotorCycle are the concrete implementations of the Builder interface, they need to implement the methods that are declared in the Builder interface. That’s why they needed to supply the body for the startUpOperations() , buildBody() , insertWheels() , addHeadlights() , endOperations() , and getVehicle()methods . The first five methods are straightforward; they are used to perform an operation at the beginning (or end), build the body of the vehicle, insert the wheels, and add headlights. getVehicle() returns the final product. In this case, Director is responsible for constructing the final representation of these products using the Builder interface. (See the structure defined by the GoF). Notice that Director is calling the same construct() method to create different types of vehicles. Now go through the code to see how different parts are assembled for this pattern.

![Class](/out/src/DesignPatterns/Builder/Diagrams/class/Class.png)

## Book Reference
Sarcar, Vaskaran. Java Design Patterns (pp. 35-36). Apress. Edição do Kindle.  