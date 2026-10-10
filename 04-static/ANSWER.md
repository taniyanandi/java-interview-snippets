# Static — Answers

---

## Q1 Answer

```
a.id = 1
b.id = 2
Total: 3
b.count = 10
```

**Why?**

- `count` is `static` — shared across all instances. Each `new Counter()` increments it, so after 3 objects: `count = 3`
- `id` is instance-specific: a=1, b=2, c=3
- `Counter.showCount()` prints `count = 3`
- `a.count = 10` sets the **static field** via instance reference. It's the same as `Counter.count = 10`. So `b.count` also returns `10` — there's only one `count`

> 🔑 **Rule:** Static fields belong to the **class**, not the instance. Accessing them via an instance reference (`a.count`) is misleading but valid — it always modifies the single shared copy.

**Bonus:** The commented-out line `System.out.println(id)` in `showCount()` would be a **compile error** because `id` is an instance field and static methods have no `this` reference.

---

## Q2 Answer

```
initX called
Static block 1: x=10, y=20
initZ called
Static block 2: z=30
main: x=10, y=20, z=30
```

**Why?**

Static initialization runs **top to bottom, once, when the class is first loaded**:

1. `static int x = initX()` → calls `initX()` → prints "initX called" → `x = 10`
2. First `static { }` block → `y = 20` → prints "Static block 1"
3. `static int z = initZ()` → calls `initZ()` → prints "initZ called" → `z = 30`
4. Second `static { }` block → prints "Static block 2"
5. `main()` runs → prints the values

> 🔑 **Rule:** Static initializers and static field assignments run **in source-code order**, top to bottom, before `main()` runs. They run exactly once per JVM lifetime.
