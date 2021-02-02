pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh "./gradlew clean build"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh "./gradlew cleanTest test"
            }
            post {
                always {
                    junit testResults: '**/test-results/test/*.xml'
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'DEPLOY'
            }
        }
    }
}