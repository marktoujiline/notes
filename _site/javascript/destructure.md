# Destructuring

In JavaScript, extracting fields from objects and arrays is common enough to warrant <i>syntax sugar</i>.

## Objects
Here's an example of an object.
```
const user = {
    name: "Mark",
    age: 23
}
```
To access the variables, you can do:
```
user.name // "Mark"
user.age // 23
```
In cases of nested objects, you might want to create a new variable for the field you are extracting.
```
const user = {
    info: {
        name: {
            first: "Mark"
        }
    }
}

user.info.name.first // "Mark", but too long to type repeatedly

const first = user.info.name.first
first // "Mark"
```
Going back to the first example where we have the `user` object, let's say you needed to extract `name` and `age` and pass them to a function `printInfo`.
```
// option 1
printInfo(user.name, user.age)

// option 2
const name = user.name;
const age = user.age;
printInfo(name, age);
```
Option 1 is shorter, but duplicates the `user.` part. And for nested objects, it would become hard to understand.

Option 2 has more lines, but the call to printInfo is actually simpler. We would like to keep that line the same, but consolidate the variable assignments.
```
// option 3
const {name, age} = user;
printInfo(name, age);
```
Option 3 is identical to option 2 under the hood. It's just that JavaScript provides a special syntax for expressing the intent. This scales better for nested objects and for more than 2 fields.
```
const user = {
    info: {
        public: {
            ...
            name: "Mark",
            age: 23,
            height: 10,
            dob: "1/1/2000"
            ...
        },
        ...
    },
    ...
}

const {name, age, height, dob} = user.info.public;
```

What about extracting nested fields that belong to different fields?
```
const user = {
    public: {
        ...,
        name: "Mark",
        ...
    },
    private: {
        ...,
        dob: "1/1/2000",
        ...
    }
}
```
We want to get `name` and `dob`. Let's start with the most basic solution
```
// First try
const name = user.public.name;
const dob = user.private.dob;
```
Notice how the paths to the object are no longer the same (`user.public` vs `user.private`). We can convert the above to using destructuring like this.
```
const { name } = user.public;
const { dob } = user.private;
```
Not bad, but we'd like to ultimately do this on one line. First though, let's think of a different way to destructure:
```
const { public, private } = user; // start by getting public and private
const { name } = public; // then get name from public
const { dob } = private; // then get dob from private
```
We can replace the second line by destructuring `public` directly where it is being created:
```
const { public: {name}, private} = user;
const { dob } = private;
```
The same technique can be applied to `dob`.
```
const { public: { name }, private: { dob } } = user;
```
Note that `public` and `private` are <b>not</b> variables that become available to you. They just specify where `name` and `dob` should be extracted from.

You can keep adding to the path if getting a field from a deeply nested object:
```
const { public: {info: {name: {first}}}} = user;

// equivalent to
const first = user.public.info.name;
```
