pipeline {
    agent any 
    stages {
        stage('Pull'){
            steps{
                git branch: 'main', url: 'https://github.com/mayurmwagh/flight-reservation-app.git'    
            }
        }
    }
}