# Stateless REST API with JWT Authentication (Spring Boot 3.x + Vanilla HTML5/JS)

A completely decoupled, stateless authentication infrastructure featuring a **Spring Boot 3.x** backend using an embedded, in-memory database alongside automated database seeders, paired with a modern, vanilla **HTML5 / JavaScript** standalone client interface.

---

## 🏗️ Repository Architecture
```text
.
├── backend-core/         # Spring Boot 3.x Source Infrastructure (Port 8080)
└── frontend-client/      # Decoupled Plain HTML/JS Web Layer (Port 3000)
```

---

## 📋 Prerequisites Checklist

Before executing launch routines, ensure your matching system ecosystem fulfills the version criteria below:

### 1. Ubuntu 22.04.5 LTS
Open your terminal window and verify or install missing dependencies natively:
```bash
# Verify installations
java -version
mvn -version
python3 --version

# If missing, install OpenJDK 17 and Apache Maven package engines
sudo apt update
sudo apt install openjdk-17-jdk maven python3 -y
```

### 2. Windows 11 / 10
* **Java Development Kit (JDK 17+):** Download the installer bundle from [Oracle](https://oracle.com) or [Adoptium](https://adoptium.net).
* **Apache Maven:** Download from the [Official Maven Site](https://apache.org) and extract it, then ensure both Java and Maven binary directories (`/bin`) are declared explicitly inside your system's **Environment Variables (`PATH`)**.
* **Python 3:** Download and install from the Microsoft Store or Python.org. **Ensure the "Add Python to PATH" checkbox is checked during installation.**
* Open **PowerShell** or **Command Prompt** to verify:
  ```cmd
  java -version
  mvn -version
  python --version
  ```

### 3. macOS (Macintosh)
The cleanest installation workflow uses the **Homebrew** package engine layer:
```bash
# Install Homebrew if you don't have it already
/bin/bash -c "\$(curl -fsSL https://githubusercontent.com)"

# Ingest software development dependencies instantly
brew install openjdk@17 maven python3

# Bind your OpenJDK installation to system wrappers
sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk

# Verify installations
java -version
mvn -version
python3 --version
```

---

## 🚀 Cloning and Initial Environment Setup

Run this structural workflow inside your target host command terminal to synchronize your workspace environment natively across all operating systems:

```bash
# 1. Pull down the repository baseline structures
git clone https://github.com
cd your-repo-name
```

---

## ⚙️ How to Compile & Launch the Application Stack

### Step 1: Run the Backend Architecture (All OS Platforms)
Navigate inside your dedicated backend core layer, package up the Java codebase, and boot the standalone application server framework:

* **Ubuntu / macOS Terminal:**
  ```bash
  cd backend-core/demo
  mvn clean package
  mvn spring-boot:run
  ```
* **Windows Command Line (CMD / PowerShell):**
  ```powershell
  cd backend-core\demo
  mvn clean package
  mvn spring-boot:run
  ```
*(The backend layer is now active on `http://localhost:8080`. Leave this terminal instance running active in the background)*

### Step 2: Run the Front-End User Interface (All OS Platforms)
Open a completely **separate, second terminal pane or window tab** to host your decoupled client web view without risking preflight blocking restrictions:

* **Ubuntu / macOS Terminal:**
  ```bash
  cd frontend-client
  python3 -m http.server 3000
  ```
* **Windows Command Line (CMD / PowerShell):**
  ```powershell
  cd frontend-client
  python -m http.server 3000
  ```
*(Your lightweight client hosting platform is now listening securely on `http://localhost:3000`)*

---

## 🧪 Step-by-Step E2E Integration Verification

Now that both elements are running simultaneously, complete the following test loop directly from your preferred modern web browser interface:

1. Open your web browser and navigate to **`http://localhost:3000`**.
2. Trigger the browser logging interface by pressing **`F12`** (or right-click anywhere -> select **Inspect**) and tracking the live operations inside the **Console** tab pane.
3. Click the **"Clear Token (Logout)"** button on screen once to drop any legacy browser data cache parameters.
4. Test the **Admin Profile** authentication access layer:
   * Input Username: `admin` | Password: `admin123`
   * Click **"Authenticate & Get Token"** -> Token yields an HTTP `200 OK` structure and saves cleanly within browser `localStorage`.
   * Click **"Query Admin Endpoint"** -> The endpoint returns a successful confirmation message from the Spring Boot controller: `"Welcome to the Secure Admin Panel!"`
5. Test the **User Profile** authentication access layer:
   * Click **"Logout"** to wipe existing credentials from local storage.
   * Input Username: `user` | Password: `user123`
   * Click **"Authenticate & Get Token"** -> Validates and stores the client token.
   * Click **"Query User Dashboard"** -> Bypasses gateway restrictions seamlessly to populate your view structure instantly.

---

## 🛑 How to Shut Down the Active Application Services
When you are done testing the demo codebase structures:
1. Click inside each of your active terminal sessions (one for the port 8080 backend, one for the port 3000 frontend).
2. Press **`Ctrl + C`** on your keyboard.
3. This safely halts the runtime pipelines, unbinds the local communication ports, and cleanly updates the console state.
