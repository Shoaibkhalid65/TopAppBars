# 🚀 Jetpack Compose TopAppBar Practice Project

This repository presents a hands-on exploration of **Jetpack Compose Top App Bars** using **Material 3** and **Material 3 Expressive**. It focuses on the design, behavior, and customization of various TopAppBar types in modern Android UI development.

---

## 🎯 Project Objective

To thoroughly practice and demonstrate the capabilities of **TopAppBars** in Jetpack Compose, including their **standard variants**, **dynamic behavior**, **custom layouts**, and **scroll-responsive collapsing features**.

---

## ✨ Features Covered

### ✅ 1. Standard TopAppBar Variants

Implemented all key variants from **Material 3**:

* `TopAppBar` – Traditional bar with title and action icons.
* `CenterAlignedTopAppBar` – Centered title for balance and clarity.
* `MediumTopAppBar` – For medium-density layouts.
* `LargeTopAppBar` – Spacious app bar for prominent screens.
* `MediumFlexibleTopAppBar` – Medium app bar with scroll-collapsing interaction.
* `LargeFlexibleTopAppBar` – Expands and collapses based on scroll state.

---

### 🔄 2. Dynamic TopAppBars

* Changes in **title**, **icon**, or **layout** based on scroll state or user interactions.
* Example: Switching between expanded and collapsed states dynamically.

---

### 🧩 3. Custom TopAppBars

Created unique custom app bars using Composables:

* Custom icons, backgrounds, and images.
* AppBars with embedded search fields.
* Layouts built with `Row`, `Box`, `Spacer`, etc., for creative flexibility.

---

### 📉 4. Scroll-Responsive AppBars

Used `TopAppBarScrollBehavior` for animated scroll effects:

* `enterAlwaysScrollBehavior`
* `exitUntilCollapsedScrollBehavior`
* Integrated with `LazyColumn` and `nestedScroll` for smooth collapsing.
* Observed `collapsedFraction` to trigger UI logic on scroll.

---

### ☰ 5. Overflow Menu & Dropdowns

* Added **overflow (three-dot)** icon with a **DropdownMenu**.
* Menu displays action items with defined click handlers.

---

## 🎥 Demo Videos

🔼 **Expandable TopAppBar**       
https://github.com/user-attachments/assets/7d2c6c79-e642-46a3-9cf8-c9bd92061d14
🔄 **Dynamic TopAppBar Behavior** 
https://github.com/user-attachments/assets/5ecd01a9-a99c-4a5d-bd2e-f0d7058d6240
---

## 🛠️ Tech Stack

- **Language**: Kotlin
- **Framework**: Jetpack Compose
- **Material**: Material3 (M3)
- **Tools**: Android Studio, Kotlin DSL
