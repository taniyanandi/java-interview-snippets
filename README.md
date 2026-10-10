# ☕ Java Interview Snippets

**Short Java programs. Real interview questions. Know the output before you're asked.**

This repo is for developers preparing for SDE interviews at companies like Razorpay, PayPal, Goldman Sachs, Google, and Amazon — where a 10-line snippet on a whiteboard can make or break your round.

Each question is:
- **Self-contained** — copy, paste, run
- **Tricky** — tests what Java *actually* does, not what you think it does
- **Explained** — the answer tells you *why*, not just *what*

---

## 📂 Topics

| # | Topic | What's tested |
|---|-------|--------------|
| [01](01-polymorphism/) | **Polymorphism** | Runtime dispatch, method hiding, covariant return |
| [02](02-overloading-overriding/) | **Overloading vs Overriding** | Which method gets called and why |
| [03](03-this-super/) | **`this` and `super`** | Constructor chaining, field shadowing |
| [04](04-static/) | **Static** | Class vs instance, static blocks, order of execution |
| [05](05-strings/) | **Strings** | `==` vs `.equals()`, String pool, immutability |
| [06](06-exceptions/) | **Exceptions** | try-catch-finally order, checked vs unchecked |
| [07](07-collections/) | **Collections** | equals/hashCode, ConcurrentModification, generics |
| [08](08-tricky-output/) | **Tricky output** | Classic Java gotchas — autoboxing, integer cache, NaN |

---

## 🚀 How to use this repo

1. **Read the snippet** — don't run it yet
2. **Write your answer** in the comments below the code
3. **Reveal the answer** in the `ANSWER.md` in each folder
4. **Run it yourself** to confirm: `javac Q1.java && java Q1`

> No IDE required. All snippets run with plain `javac`.

---

## 🤝 Contributing

Found a snippet that tripped you up in an interview? **Open a PR.**

- One file per question: `Q<n>.java` + add it to the folder's `ANSWER.md`
- Keep it under 30 lines
- The "tricky" ones are the best ones — something that looks obvious but isn't

See [CONTRIBUTING.md](CONTRIBUTING.md).

---

## ⭐ Star this repo if it helped you

Share it with someone preparing for Java interviews. The more people practice, the fewer people fail on things that are totally learnable.

---

*Built by a backend engineer who failed a Java round and decided to fix it.*
