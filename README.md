# Jetpack Compose TopAppBar Practice Project

This repository contains a comprehensive practice project focused on implementing **various types of Top App Bars** using **Jetpack Compose**. The goal of this project is to explore the flexibility, customization, and dynamic behavior of TopAppBars as offered by **Material 3** in Android development.

---

## 🚀 Features Covered

### ✅ 1. Basic TopAppBar Types
This project demonstrates the use of **all standard TopAppBar variants** available in Jetpack Compose Material 3:

- **TopAppBar** – The classic app bar with title and actions.
- **CenterAlignedTopAppBar** – Title aligned to the center (ideal for medium width screens).
- **MediumTopAppBar** – Used in layouts with medium-sized vertical space.
- **LargeTopAppBar** – Offers more height, good for pages with hierarchy.
- **MediumFlexibleTopAppBar** – Medium app bar with scroll-based collapsing behavior.
- **LargeFlexibleTopAppBar** – Large app bar that collapses on scroll.

---

### 🔄 2. Dynamic Top App Bars
- Dynamically change the title or icon based on **scroll state** or **user interaction**.
- Example: AppBar switches between collapsed and expanded titles depending on scroll progress.

---

### 🧩 3. Custom TopAppBars
Created several **custom-designed TopAppBars** to explore different layouts:

- AppBar with custom icons and background.
- AppBar with search field inside.
- Fully tailored TopAppBars using `Row`, `Spacer`, `Image`, and `Box` to arrange elements freely.

---

### 📉 4. Collapsing & Expanding Behavior
Practiced **scroll-responsive** app bars using `TopAppBarScrollBehavior`:

- **enterAlwaysScrollBehavior**
- **exitUntilCollapsedScrollBehavior**
- Proper `nestedScroll` integration with `LazyColumn` to collapse/expand AppBars on scroll.
- Monitored `collapsedFraction` to trigger UI state changes.

---

### ☰ 5. Overflow Menu with Dropdown
Implemented a **DropdownMenu with an overflow icon**:

- Added an `IconButton` with the three-dot menu.
- Tapped icon shows a `DropdownMenu`.
- Menu includes clickable items with actions.

---

## 🛠️ Tech Stack

- **Language**: Kotlin
- **Framework**: Jetpack Compose
- **Material**: Material3 (M3)
- **Tools**: Android Studio, Kotlin DSL
