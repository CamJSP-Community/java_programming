# Contribution Guide

Thank you for considering contributing to this project! This guide will help you understand how to contribute effectively and adhere to the conventions of this repository.

<div align="center">

<!-- License Badge -->
![License](https://img.shields.io/github/license/CamJSP-Community/java_programming?style=for-the-badge)

<!-- Star Badge -->
![GitHub Stars](https://img.shields.io/github/stars/CamJSP-Community/java_programming?style=for-the-badge)

<!-- Fork Badge -->
![GitHub Forks](https://img.shields.io/github/forks/CamJSP-Community/java_programming?style=for-the-badge)

</div>

---

## Repository Structure (Example)

```bash
java_programming/
├── sorting/
│   ├── pom.xml               
│   ├── src/
│   │   ├── BubbleSort.java
│   │   ├── InsertionSort.java
│   │   ├── QuickSort.java
│   │   └── Main.java
│   ├── docs/
│   │   ├── README.md
│   │   └── CONTRIBUTING.md
│   ├── tests/
│   │   └── SortTest.java
│   └── utils/
│       └── Utils.java
├── binary_search_tree/
│   ├── pom.xml               
│   ├── src/
│   │   ├── Search.java
│   │   └── Add.java
│   ├── docs/
│   │   ├── README.md
│   │   └── CONTRIBUTING.md
│   ├── tests/
│   │   └── TreeTest.java
│   └── utils/
│       └── Utils.java
```

Each project folder is a Maven project, making it easy to manage dependencies and install the project if needed.

---

## Steps to Contribute

### 1. Fork the Repository

Create a copy of the repository to your GitHub account by clicking the **"Fork"** button at the top of the page.

### 2. Clone the Repository Locally

Clone your fork locally to work on it:

```bash
git clone https://github.com/your_username/java_programming.git
```

### 3. Create a Branch for Your Changes

Create a new branch for your changes to keep the `main` branch clean:

```bash
git checkout -b your-branch-name
```

### 4. Make Your Changes

Make the modifications or additions you wish to contribute. Be sure to follow the project's coding conventions.

### 5. Commit Your Changes

Save your changes with a clear and concise message:

```bash
git add .
git commit -m "Added selection sort implementation"
```

### 6. Push Your Changes to GitHub

Push your branch to your GitHub fork:

```bash
git push origin your-branch-name
```

### 7. Open a Pull Request

Go to the original repository on GitHub and open a **Pull Request** from your branch.

---

## Coding Conventions

- **Code Style**: Follow the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).
- **Tests**: Add tests for any new feature or bug fix. Use the following command to run the tests:

```bash
mvn test
```

- **Documentation**: Use **Javadoc** to document your code. Here’s an example of how to generate documentation with Maven:

```bash
mvn javadoc:javadoc
```

This command will generate documentation in the `target/site/apidocs/` folder.

---

## License

This project is licensed under the [MIT](./LICENSE) license. By contributing, you agree that your contribution will be under this license.

---

## Useful Resources

- [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- [How to Write a Good Commit Message](https://chris.beams.io/posts/git-commit/)
- [Guide to Pull Requests on GitHub](https://docs.github.com/en/github/collaborating-with-pull-requests)

---

## Contact

For any questions or assistance, feel free to open an [issue](https://github.com/CamJSP-Community/java_programming/issues) or contact us directly.

---

*Thank you for your interest in contributing to this project! Your help is valuable in improving and expanding this repository.*