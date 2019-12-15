# akka

## Actor System
> Envision a group of people and assign sub-tasks to them, arrange their functions into an organizational structure and think about how to escalate failure.

>  One actor, which is to oversee a certain function in the program might want to split up its task into smaller, more manageable pieces. For this purpose, it starts child actors.

### Guidelines
* If one actor carries very important data, this actor should source out any possibly dangerous sub-tasks to children and handle failures of these children as appropriate. (Error Kernel Pattern)
* If one actor depends on another actor for carrying out its duty, it should watch that other actor’s liveness and act upon receiving a termination notice.
* If one actor has multiple responsibilities each responsibility can often be pushed into a separate child to make the logic and state more simple.
* Actors should be like nice co-workers: do their job efficiently without bothering everyone else needlessly and avoid hogging resources.
* Do not pass mutable objects between actors.
* The top-level actor of the actor system is the innermost part of your Error Kernel, it should only be responsible for starting the various sub systems of your application

Several actor systems with different configurations may co-exist within the same JVM without problems, there is no global shared state within Akka itself.

### Actor
Can only communicate by exchanging messages and upon reception of a message an Actor can do the following three fundamental actions:
* send a finite number of messages to Actors it knows
* create a finite number of new Actors
* designate the behavior to be applied to the next message