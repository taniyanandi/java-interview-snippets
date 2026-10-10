# Polymorphism — Answers

---

## Q1 Answer

```
Animal        ← Line A
Dog barks     ← Line B
```

**Why?**

- **Fields are NOT polymorphic.** `a.name` uses the *reference type* (`Animal`), so it sees `Animal.name = "Animal"`. Field access is resolved at compile time.
- **Methods ARE polymorphic.** `a.speak()` uses the *actual object type* (`Dog`) at runtime, so it calls `Dog.speak()`.

> 🔑 **Rule:** Overriding applies to methods. Fields are always resolved by the declared type of the reference.

---

## Q2 Answer

```
Drawing Circle, radius = 0
Circle created, radius = 5
```

**Why?**

1. `new Circle()` → calls `super()` → `Shape()` constructor runs
2. Inside `Shape()`, `draw()` is called — but `draw()` is overridden by `Circle`, so `Circle.draw()` runs **even though `Circle` is not fully constructed yet**
3. `radius` has not been initialized yet (the instance initializer `int radius = 5` runs *after* `super()` returns), so it's `0`
4. After `super()` returns, `radius` is set to `5`, and the `Circle` constructor prints the second line

> 🔑 **Rule:** Never call overridable methods from a constructor. The subclass method runs before the subclass is initialized.

---

## Q3 Answer

```
Parent static    ← Line A
Child instance   ← Line B
```

**Why?**

- **Static methods are NOT overridden — they are hidden.** `p.staticMethod()` is resolved at compile time using the *reference type* (`Parent`). So `Parent.staticMethod()` runs.
- **Instance methods are overridden.** `p.instanceMethod()` is resolved at runtime using the *actual object type* (`Child`). So `Child.instanceMethod()` runs.

> 🔑 **Rule:** Static methods belong to the class, not the object. Polymorphism does not apply to them.
