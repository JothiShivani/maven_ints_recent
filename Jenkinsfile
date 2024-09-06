pipeline{
    agent any

   

    stages{
        stage('Checkout'){
            steps {
                git 'https://github.com/JothiShivani/maven_ints_recent.git'
            }
        }

        stage('Build'){
            steps{
                sh 'mvn clean install'
            }
        }
    }
}