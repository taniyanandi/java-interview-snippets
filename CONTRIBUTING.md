# Contributing

## Adding a question

1. Fork the repo and create a branch: `git checkout -b add-q-collections-hashmap`
2. Pick a folder that fits your question (or suggest a new topic)
3. Add `Q<n>.java` — keep it under 30 lines, runnable with plain `javac`
4. Add your question + answer to that folder's `ANSWER.md`
5. Open a PR

## What makes a good question

✅ Tests something Java *actually does* vs what you'd naively expect  
✅ Could appear on a whiteboard at a real interview  
✅ Under 30 lines  
✅ Has a clear "aha moment" in the explanation  

❌ Not: "what does this 100-line algorithm do"  
❌ Not: "which of these is better style" (opinion-based)

## Format

```java
// Q<n> — <Topic>: What is the output?

// ... code here ...
```

Answer in `ANSWER.md`:
```
## Q<n> Answer

output here

**Why?**

explanation here

> 🔑 **Rule:** the one-line takeaway
```

That's it. No tests needed, no build system.
