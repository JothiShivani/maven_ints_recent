pipeline{
    agent any

   tools{
        maven 'Maven 3.8.1'
   }

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