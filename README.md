# 🏦 Secure Fintech API: DevSecOps & Kubernetes IAC

![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4-6DB33F?logo=spring&logoColor=white)
![Kubernetes](https://img.shields.io/badge/Kubernetes-IaC-326CE5?logo=kubernetes&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-Build-2496ED?logo=docker&logoColor=white)
![Security](https://img.shields.io/badge/Security-Trivy_Scan-aquamarine)

### 🚧 Project Status: Production Ready Artifacts (CI/CD Passing)

This is a high-security RESTful API designed for the financial sector, featuring **Zero-Trust Architecture** via JWT authentication. It includes a fully automated **DevSecOps pipeline** that blocks vulnerabilities before deployment and **Infrastructure-as-Code (IaC)** manifests ready for any Cloud Provider (AWS/Azure/DO).


## ⚡ Key Features

* **🛡️ Automated Security Gate:** Integrated **Trivy** scanner in the CI/CD pipeline. The build **automatically fails** if Critical CVEs are detected in dependencies or the OS.
* **🔑 Zero-Trust Authentication:** Custom implementation of **JWT (JSON Web Tokens)** with Spring Security 6. No session storage on server (Stateless).
* **🐳 Containerized & Optimized:** Docker images built on `eclipse-temurin:17-jre-alpine` for minimal footprint (<150MB) and attack surface.
* **☁️ Cloud-Agnostic IaC:** Complete Kubernetes manifests (`Deployment`, `Service`, `Secret`) ready to deploy via `kubectl` on any cluster.

## 🛠️ Tech Stack

* **Core:** Java 17, Spring Boot 3.4.1, Maven.
* **Security:** Spring Security, io.jsonwebtoken (JJWT 0.12.3).
* **DevOps:** Docker, GitHub Actions (CI/CD).
* **DevSecOps:** Aquasecurity Trivy (Vulnerability Scanning).
* **Orchestration:** Kubernetes (K8s) Declarative YAMLs.

---

## 🚀 Installation & Deployment

### 1. Local Development (Run App)
You can run the application locally without Docker for testing logic.

```bash
# Clone the repo
git clone [https://github.com/alvaroarroyov/secure-fintech-backend.git](https://github.com/alvaroarroyov/secure-fintech-backend.git)
cd secure-fintech-backend

# Build & Run (Maven wrapper included)
./mvnw spring-boot:run
