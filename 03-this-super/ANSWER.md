# `this` and `super` — Answers

---

## Q1 Answer

```
A constructor, x = 10
B constructor, x = 20
super.x = 10
this.x = 20
```

**Why?**

1. `new B()` → Java inserts `super()` implicitly as the first line → `A()` runs, prints `x = 10` (A's x)
2. `B()` body runs: `B.x` is now initialized to `20`
3. `x` and `this.x` both refer to `B`'s own `x` = 20
4. `super.x` explicitly reaches up to `A`'s `x` = 10

> 🔑 **Rule:** `super.x` accesses the *parent's* field. `this.x` (or just `x`) accesses the *current class's* field when there's shadowing.

---

## Q2 Answer

```
full constructor, x = 42, label = default
int constructor, x = 42
no-arg constructor
```

**Why?**

`this()` constructor chaining works like a call stack — the chain runs all the way to the end, then prints unwind in reverse (LIFO):

1. `Q2()` calls `this(42)` — execution jumps to `Q2(int)`
2. `Q2(int)` calls `this(42, "default")` — execution jumps to `Q2(int, String)`
3. `Q2(int, String)` runs fully → prints "full constructor"
4. Returns to `Q2(int)` → prints "int constructor"
5. Returns to `Q2()` → prints "no-arg constructor"

> 🔑 **Rule:** `this()` or `super()` must be the **first statement** in a constructor. You can't have both. The chain runs deepest-first, prints on the way back up.
