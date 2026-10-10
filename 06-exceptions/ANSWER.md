# Exceptions — Answers

---

## Q1 Answer

```
try
finally
result = 1
```

**Why?**

- `try` block runs, hits `return 1` — but **`finally` always runs before the method actually returns**
- `finally` prints "finally"
- The `return 1` from `try` is used as the result
- `catch` never runs because no exception was thrown

**If you uncomment `return 3` in `finally`:**
```
try
finally
result = 3
```
The `finally`'s `return 3` **overrides** the `try`'s `return 1`. This is a notorious Java gotcha — a `return` in `finally` silently swallows the earlier return value (and would also swallow any exception in flight).

> 🔑 **Rules:**
> 1. `finally` **always** runs (except `System.exit()` or JVM crash)
> 2. A `return` in `finally` overrides any earlier `return` — avoid this pattern
> 3. Order: `try` → (if exception) `catch` → `finally` → caller gets the value

---

## Q2 Answer

```
A
D
F
G
```

**Why?**

1. "A" prints
2. `arr[10] = 1` throws `ArrayIndexOutOfBoundsException`
3. "B" is skipped — execution jumps to catch blocks
4. `catch (NullPointerException)` → doesn't match → skip
5. `catch (RuntimeException)` → **matches!** `ArrayIndexOutOfBoundsException` extends `RuntimeException` → prints "D"
6. `finally` runs → prints "F"
7. Exception is handled, execution continues after try-catch → prints "G"

> 🔑 **Rules:**
> 1. Catch blocks are checked **top to bottom** — first match wins
> 2. Always put **specific** exceptions before **general** ones (compiler enforces this for checked exceptions)
> 3. `finally` runs whether or not the exception was caught
> 4. `ArrayIndexOutOfBoundsException → IndexOutOfBoundsException → RuntimeException → Exception → Throwable`
