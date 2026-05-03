# 🚀 Flight Reservation App – CI/CD Pipeline on AWS EKS

## 📌 Project Overview

This project demonstrates an end-to-end CI/CD pipeline for a **Spring Boot-based Flight Reservation application**.

The pipeline automates:
- Build process  
- Code quality analysis  
- Containerization  
- Deployment to Kubernetes (AWS EKS)  

🎯 The goal of this project is to showcase real-world DevOps practices including pipeline automation, containerization, and cloud deployment.

---

## 🏗️ Architecture


GitHub → Jenkins → Maven Build
→ SonarQube Analysis (Quality Gate)
→ Docker Build & Push (DockerHub)
→ AWS EKS Deployment (kubectl)


---

## ⚙️ Tech Stack

- **CI/CD:** Jenkins (Declarative Pipeline)  
- **Build Tool:** Maven  
- **Code Quality:** SonarQube  
- **Containerization:** Docker  
- **Orchestration:** Kubernetes (AWS EKS)  
- **Cloud:** AWS (EKS, EC2, RDS)  
- **Version Control:** Git & GitHub  

---

## 🔄 CI/CD Pipeline Stages

1. **Clone Repository**  
   - Pulls latest code from GitHub  

2. **Build**  
   - Compiles application using Maven  
   - Skips tests for faster execution  

3. **SonarQube Analysis**  
   - Performs static code analysis  
   - Ensures code quality standards  

4. **Quality Gate**  
   - Pipeline proceeds only if checks pass  

5. **Docker Build**  
   - Builds Docker image of the application  

6. **Docker Push**  
   - Pushes image to DockerHub repository  

7. **Update Kubeconfig**  
   - Connects Jenkins to AWS EKS cluster  

8. **Deploy to EKS**  
   - Deploys application using Kubernetes manifests  

---

## 📸 Screenshots

### 🚀 Jenkins Pipeline Success
![Jenkins](screenshots/jenkins.png)

### 🔍 SonarQube Quality Gate
![SonarQube](screenshots/sonarqube.png)

### ☸️ Kubernetes Pods Running
![Pods](screenshots/pods.png)

---

## 📦 Kubernetes Deployment

- **Namespace:** flight-reservation  
- **Deployment:** flight-reservation-app  
- **Service Type:** LoadBalancer  

---

## ▶️ How to Run

```bash
# Build application
mvn clean install

# Build Docker image
docker build -t <your-docker-username>/flight-app .

# Push image
docker push <your-docker-username>/flight-app

# Deploy to Kubernetes
kubectl apply -f k8s/


🎯 Key Learnings
Implemented Pipeline as Code using Jenkins
Integrated SonarQube Quality Gates
Automated Docker image build & push
Deployed application to AWS EKS
Managed Kubernetes resources


🚀 Future Improvements
Helm chart integration
Automated rollback strategy
Monitoring using Prometheus & Grafana
CI/CD pipeline optimization


⭐ Final Note

This project is built for learning and demonstration purposes, focusing on practical DevOps implementation rather than production-level optimization.
