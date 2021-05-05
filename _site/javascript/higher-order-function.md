# Higher Order Function
A higher order function (HOF) either:
- takes a function as an argument
- returns a function

## Function Argument
### Non-code Example
A function is an abstraction over a procedure. Let's say you want to give your friend directions to your house from their house:
```
1. Turn left out of your driveway
2. Stop at the light
3. Turn right
4. House is on the left.
```

In programming terms, this is an <i>algorithm</i>; a sequence of steps. Call this function `getDirections`

Let's say there are 2 ways to get to the house. One faster, one more scenic:
```
1. Turn left out of your driveway
2. Stop at the light
3. Depending on which route you want:
    i. Scenic ...
    ii. Faster ...
4. House is on the left
```
Your friend gives you which route they want, and you give them a different set of instructions depending on what they told you.

What if you have 2 friends at different houses? You might not know where they live, but assume they know how to get to Whole Foods, and you know the directions from there to your house.

As long as they tell you how to get from their house to Whole Foods, you can tell them how to get from their house to your house.
```
// Friend gives you directions from house to WF
// You give them the following instructions

1. DIR_TO_WHOLE_FOODS
2. Turn right
3. ...
4. Depending on which route you want:
    i. Scenic ...
    ii. Faster ...
6. House is on the left
```
You couldn't give them instructions until they gave <i>you</i> some instructions. Once they did, you used those instructions to come up with yours.

This is fundamentally how function arguments work. Here's how you would express the above situation in pseudocode:
```
const getDirections(routeType, dirToWF) => {
    // pseudocode
    dirToWF() // go to whole foods from your house
    turnRight()
    ...
    if (routeType === 'scenic') {
        ...
    } else {
        ...
    }
    houseOnLeft()
}
```
### Practical Examples
The most useful example of this feature is the `map` and `filter` functions.
They abstract over some idea:
- map: perform some operation on each element
- filter: remove elements that don't pass some test

You can write your own when you want to make a function's behavior more general.
## Function Return
TODO
## Currying
TODO