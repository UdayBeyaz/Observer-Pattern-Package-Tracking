# 📦 Package Tracking System - Observer Design Pattern

This repository contains a Java application demonstrating the **Observer Design Pattern**, developed for the **SE 3317 Software Design and Architecture** course at Yaşar University.

## 📌 Architectural Overview

The application implements the Observer pattern to handle real-time state changes and notify multiple dependent display/logging systems automatically when a package's status or location updates.

### Key Components
* **Subject (`PackageTracker`):** Maintains the list of observers, manages subscription/unsubscription (adding and removing observers), and triggers state updates.
* **Observers (`CustomerApp`, `CourierDashboard`, `TrackingLogger`):** Automatically receive and render updates when the subject's state changes.
* **UML Class Diagram:** Visualized using Visual Paradigm (`diagram.png`).

## 💻 Tech Stack
* **Language:** Java (JDK 8+)
* **Design Pattern:** Observer Pattern (Behavioral)
* **Tools:** Visual Paradigm, Git, GitHub

---
*Developed by Uday Beyaz - Yaşar University, Software Engineering*
