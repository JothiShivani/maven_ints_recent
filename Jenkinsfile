pipeline{
    agent any

    environment {
         scannerHome = tool 'SonarQube Scanner'
         SONAR_TOKEN = ''
    }

    stages{
        stage('Checkout'){
            steps {
                git 'https://github.com/JothiShivani/maven_ints_recent.git'
            }
        }

        stage('Build'){
            steps{
                sh 'mvn compile test clean install'
            }
        }
    }
}