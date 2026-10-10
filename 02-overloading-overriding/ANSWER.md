# Overloading vs Overriding — Answers

---

## Q1 Answer

```
int: 5       ← Line A
long: 5      ← Line B
double: 5.0  ← Line C
int: 65      ← Line D
```

**Why?**

- `print(5)` → exact match: `print(int)`
- `print(5L)` → exact match: `print(long)`
- `print(5.0)` → exact match: `print(double)`
- `print('A')` → **no `char` overload**, so Java widens `char` to `int` (char's numeric value). `'A'` = 65.

> 🔑 **Rule:** When there's no exact match, Java widens the argument in this order: `byte → short → int → long → float → double`. No `char` overload → char widens to `int`.

---

## Q2 Answer

```
Base.show(Base)      ← Line A
Base.show(Base)      ← Line B
Base.show(Base)      ← Line C
Derived.show(Derived)← Line D
```

**Why?**

`Derived.show(Derived d)` is an **overload**, NOT an override. The method `Base.show(Base b)` has a different signature, so it's still inherited separately.

- **Line A:** `b` is `Base` reference → only sees `show(Base)` → calls `Base.show(Base)`
- **Line B:** `b` is `Base` reference → only sees `show(Base)`. Even though `d` is a `Derived`, the reference is `Base`, so overload resolution picks `show(Base)` → calls `Base.show(Base)`
- **Line C:** `d` is `Derived` reference → sees both `show(Base)` and `show(Derived)`. `b` is type `Base` → picks `show(Base)` → calls `Base.show(Base)`
- **Line D:** `d` is `Derived` reference → sees both. `d` is type `Derived` → picks `show(Derived)` → calls `Derived.show(Derived)`

> 🔑 **Rule:** **Overloading is resolved at compile time** using the *declared type* of the argument. **Overriding is resolved at runtime** using the *actual type* of the object. They are completely different mechanisms.
