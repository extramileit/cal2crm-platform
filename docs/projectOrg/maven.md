The reason your **`core-parent` POM** doesn’t have a `<modules>` section is because it’s a **configuration parent**, not an **aggregator**.

---

## 📖 Distinction between Parent and Aggregator
- **Aggregator POM**
    - Declares `<modules>` to orchestrate builds.
    - Example: your **root project** (`cal2crm-platform`) lists `core-api`, `core-engine`, etc.
    - Purpose: tells Maven which subprojects to build together.

- **Parent POM**
    - Declares `<dependencyManagement>`, `<pluginManagement>`, `<properties>`.
    - Provides inheritance for children.
    - Does **not** list `<modules>` because it’s not responsible for orchestrating builds.

---

## 🧩 How this applies to `core-parent`
- `core-parent` is a **domain parent**.
- It exists only to provide **shared configuration** for `core-api`, `core-engine`, etc.
- It doesn’t need `<modules>` because the **root aggregator** already knows which modules to build.
- Child modules reference `core-parent` in their `<parent>` tag, inheriting its settings.

---

## 🎯 Best Practice
- **Root POM (`cal2crm-platform`)** → has `<modules>` listing all buildable submodules.
- **Domain parent POMs (`core-parent`, `delivery-parent`)** → no `<modules>`, only configuration.
- **Child modules (`core-api`, `core-engine`)** → inherit from domain parent, not root directly.

---

## ⭐ Final Takeaway
- `core-parent` doesn’t need `<modules>` because it’s not an aggregator — it’s a **configuration POM**.
- The **root POM** handles aggregation, while **domain parents** handle inheritance.
- This separation keeps your build clean: **root orchestrates, parents configure, children build**.

---

👉 Would you like me to sketch a **visual hierarchy diagram** (root → domain parents → child modules) so you can see exactly which POMs have `<modules>` and which don’t?