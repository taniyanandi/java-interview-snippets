# Strings — Answers

---

## Q1 Answer

```
true    ← Line A
false   ← Line B
true    ← Line C
true    ← Line D
false   ← Line E
true    ← Line F
```

**Why?**

- **Line A: `true`** — `"hello"` and `"hello"` are both string literals → same object in the **String pool**. `==` compares references → same reference → `true`.
- **Line B: `false`** — `new String("hello")` **always creates a new object on the heap**, outside the pool. Different reference → `false`.
- **Line C: `true`** — `c.intern()` returns the pool version of `"hello"`. `a` is also the pool version. Same reference → `true`.
- **Line D: `true`** — `.equals()` compares content, not references. Both have content `"hello"` → `true`. **Always use `.equals()` for string comparison.**
- **Line E: `false`** — `x + "lo"` involves a variable (`x`), so Java can't fold it at compile time. At runtime, `+` creates a **new String object** on the heap → different reference from pool → `false`.
- **Line F: `true`** — `"hel" + "lo"` is two **compile-time constants**. The compiler folds it to `"hello"` and interns it → same pool object as `a` → `true`.

> 🔑 **Rules:**
> 1. Use `.equals()` for string comparison. Never `==`.
> 2. String literals go to the pool and are reused. `new String(...)` bypasses the pool.
> 3. Compile-time constant expressions are folded by the compiler. Runtime concatenation is not.
