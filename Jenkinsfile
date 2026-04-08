pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'screenshots/*.png', fingerprint: true
        }
    }
}