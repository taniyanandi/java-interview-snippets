# Tricky Output — Answers

---

## Q1 Answer

```
true    ← Line A
false   ← Line B
true    ← Line C
```

**Why?**

Java caches `Integer` objects for values **-128 to 127** (the "Integer cache"). Autoboxing reuses these cached objects.

- `Integer a = 127` and `Integer b = 127` → both point to the **same cached object** → `a == b` is `true`
- `Integer c = 128` and `Integer d = 128` → 128 is **outside the cache** → two different heap objects are created → `c == d` is `false`
- `c.equals(d)` → compares value, not reference → both are 128 → `true`

> 🔑 **Rule:** Never use `==` to compare `Integer` objects. Use `.equals()` or unbox to `int`. The cache range (-128 to 127) is a JVM implementation detail that bites everyone.

---

## Q2 Answer

```
i=7, j=12
-2147483648
123
33
```

**Why?**

**Line 1 — i++ + ++i:**
- `i = 5`
- `i++` → uses `i` as `5`, then increments → `i` is now `6`
- `++i` → increments first → `i` is now `7`, uses `7`
- `j = 5 + 7 = 12`, `i = 7`

**Line 2 — Integer overflow:**
- `Integer.MAX_VALUE` = `2147483647` = `2³¹ - 1`
- Adding 1 wraps around to `Integer.MIN_VALUE` = `-2147483648`
- Java integers silently overflow — no exception thrown!

**Line 3 — `"1" + 2 + 3`:**
- Left to right: `"1" + 2` → `"12"` (int converts to String)
- Then `"12" + 3` → `"123"`

**Line 4 — `1 + 2 + "3"`:**
- Left to right: `1 + 2` → `3` (both ints, numeric addition)
- Then `3 + "3"` → `"33"` (int converts to String)

> 🔑 **Rules:**
> 1. `+` with String is **left-associative** — left operands determine whether it's numeric or string concatenation
> 2. Java integers silently overflow — no exception, no warning
> 3. `i++` evaluates to the *old* value; `++i` evaluates to the *new* value
