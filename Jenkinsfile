pipeline {
    agent any
    stages {
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