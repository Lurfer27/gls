pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                echo 'Testing...'
                sh "./gradlew test"
            }
            post {
                always {
                    junit 'app/build/test-results/test/*.xml'
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