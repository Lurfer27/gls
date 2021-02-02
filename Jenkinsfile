pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                echo 'Testing...'
                sh "./gradlew test"
            }
        }
        stage('Build') {
            steps {
                echo 'BUILD'
            }
        }
        stage('Deploy') {
            steps {
                echo 'DEPLOY'
            }
        }
    }
}