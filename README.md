<!-- README.md -->

<!-- Centered Logo with Bouncing Animation -->
<div align="center">
  <img src="./java.svg" alt="Java Logo" width="200" style="animation: bounce 3s infinite ease-in-out;">
</div>

<!-- Title with Glitch Animation -->
<h1 align="center" style="font-family: 'Montserrat', sans-serif; font-size: 3.5rem; color: #ff6f61; letter-spacing: 2px;">
  <b><span class="glitch" data-text="JAVA_PROGRAMMING">JAVA_PROGRAMMING</span></b>
</h1>

<!-- Badges with Shadow and Hover Effects -->
<p align="center">
  <a href="https://github.com/CamJSP-Community/java_learning">
    <img src="https://img.shields.io/github/stars/CamJSP-Community/java_learning?style=for-the-badge&color=brightgreen" alt="Stars Badge"/>
  </a>
  <a href="https://github.com/CamJSP-Community/java_learning/issues">
    <img src="https://img.shields.io/github/issues/CamJSP-Community/java_learning?style=for-the-badge&color=blue" alt="Issues Badge"/>
  </a>
  <a href="https://github.com/CamJSP-Community/java_learning/network/members">
    <img src="https://img.shields.io/github/forks/CamJSP-Community/java_learning?style=for-the-badge&color=orange" alt="Forks Badge"/>
  </a>
  <a href="https://github.com/CamJSP-Community/java_learning/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/CamJSP-Community/java_learning?style=for-the-badge&color=yellow" alt="License Badge"/>
  </a>
</p>

<!-- A brief description in dynamic glowing effect -->
<p align="center" style="font-size: 1.2rem; line-height: 1.8; max-width: 800px; margin: 0 auto; color: #ffffff; background: #333333; border-radius: 12px; padding: 10px 20px; text-shadow: 2px 2px 5px #000;">
  A repository packed with Java-based algorithms, classic problems, and advanced data structures. 
  Designed for both beginners and seasoned developers looking to level up their Java skills.  
  <em>Join us in mastering Java!</em>
</p>

<!-- Table of Contents with Fade-in Animation -->
<h2 align="center" style="font-family: 'Courier New', monospace;">📑 Table of Contents</h2>

<div align="center">
  <details>
    <summary style="cursor: pointer; font-size: 1.5em;">🔹 Arrays</summary>
    <ul style="font-size: 1.2rem;">
      <li>Search Algorithms</li>
      <li>Array Manipulation</li>
      <li>Rotation Problems</li>
    </ul>
  </details>

  <details>
    <summary style="cursor: pointer; font-size: 1.5em;">🔹 Sorting Algorithms</summary>
    <ul style="font-size: 1.2rem;">
      <li>Quick Sort</li>
      <li>Merge Sort</li>
      <li>Bubble Sort</li>
    </ul>
  </details>

  <details>
    <summary style="cursor: pointer; font-size: 1.5em;">🔹 Tree Structures</summary>
    <ul style="font-size: 1.2rem;">
      <li>Binary Search Tree</li>
      <li>AVL Tree</li>
      <li>Red-Black Tree</li>
    </ul>
  </details>
</div>

<!-- Installation with sleek formatting -->
<h2 style="font-family: 'Courier New', monospace;">🔧 Installation</h2>

<p style="font-size: 1.1rem;">
  Follow these steps to set up the repository on your local machine:
</p>

<ol style="font-size: 1.1rem; line-height: 1.6;">
  <li>Clone the repository:
    <pre><code>git clone https://github.com/CamJSP-Community/java_learning.git</code></pre>
  </li>

  <li>Navigate into the directory:
    <pre><code>cd JAVA_PROGRAMMING</code></pre>
  </li>

  <li>Compile the project:
    <pre><code>mvn clean install</code></pre>
  </li>

  <li>Run the tests:
    <pre><code>mvn test</code></pre>
  </li>
</ol>

<!-- Contributing Section with Special Font and Color -->
<h2 style="font-family: 'Courier New', monospace;">🤝 Contributing</h2>
<p style="font-size: 1.2rem;">
  Contributions are always welcome! See the <a href="./CONTRIBUTING.md" style="color: #ff6f61; font-weight: bold;">contributing guidelines</a> to get started.
</p>

<!-- Keyframe Animations for Logo Bounce & Glitchy Text -->
<style>
  @keyframes bounce {
    0%, 20%, 50%, 80%, 100% {
      transform: translateY(0);
    }
    40% {
      transform: translateY(-20px);
    }
    60% {
      transform: translateY(-10px);
    }
  }

  .glitch {
    position: relative;
    color: #ff6f61;
    font-size: 3.5rem;
    letter-spacing: 2px;
  }

  .glitch::before, .glitch::after {
    content: attr(data-text);
    position: absolute;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    color: #00f2ff;
    z-index: -1;
  }

  .glitch::before {
    left: 2px;
    text-shadow: -2px 0 red;
    animation: glitch-anim-1 1s infinite linear alternate-reverse;
  }

  .glitch::after {
    left: -2px;
    text-shadow: -2px 0 blue;
    animation: glitch-anim-2 1s infinite linear alternate-reverse;
  }

  @keyframes glitch-anim-1 {
    0% { transform: translate(0); }
    20% { transform: translate(-2px, 2px); }
    40% { transform: translate(-2px, -2px); }
    60% { transform: translate(2px, 2px); }
    80% { transform: translate(2px, -2px); }
    100% { transform: translate(0); }
  }

  @keyframes glitch-anim-2 {
    0% { transform: translate(0); }
    20% { transform: translate(2px, -2px); }
    40% { transform: translate(2px, 2px); }
    60% { transform: translate(-2px, -2px); }
    80% { transform: translate(-2px, 2px); }
    100% { transform: translate(0); }
  }

  summary:hover {
    color: #00f2ff;
    text-shadow: 0px 0px 5px rgba(0, 242, 255, 0.8);
  }

</style>
