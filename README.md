COMP373 Composite-Pattern: Project 4

#By Louie + Adil Created on 4/22/2017

Definition of Composite Pattern from notes + online: Composite pattern is used where we need to treat a group of objects
in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as
well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree
structure of group of objects.

Example of Composite Pattern: Adil and Louie want to compile a list of our favorite music. The list would be
disorganized if we made it by hand so we decide to program it using a composite design. We can start this by creating a
'Component' which will be inherited by the 'Composite'. Inside the composite will be either groups of songs, and/or the
names of the groups. From this sprouts the individual songs known as the 'Leafs'. The difference between the composite
and the leaf being that the composite can contain songs or groups of songs, while a leaf has no children at all.
Therefore a composite can contain never ending amount of groupings. For example; It can contain 4 of Louie's favorite
songs, or my favorite song group which includes 3 songs from that category.

#Supporting Documentation(s):

https://www.tutorialspoint.com/design_pattern/composite_pattern.htm

Good basic overview of the Composite Pattern. The implementation steps from this site have been a huge help in the
design of our own design of the pattern. The breakdown of the coding example is a definite help as well.

https://www.youtube.com/watch?v=2HUnoKyC9l0

Great Youtube video about the structure and summary of the composite pattern. The pictures of the structure, along with
the live coding demonstration were helpful too. He went really in-depth to the pattern and explained the process clearly,
and concisely. I did not know that the composite part of the implementation can be can be further broken down into
'Leafs' which is something new I learned from watching this guide.

http://www.avajava.com/tutorials/lessons/composite-pattern.html?page=2

I thought the demo for this resource was really unique. Gave us a good representation of how the composite pattern can
work in a 'real-world' environment. The implementation of the arraylist combined with the simplicity of the example was
easy to understand and follow.