pipeline {
    agent any
    stages {
        stage ('checkout') {
            steps {
                git 'https://github.com/Pritam-Khergade/student-ui.git'  
                echo 'pull successful'
            }
        }
        stage ('Build') {
            steps {
                echo 'build successful'
            }
        }
        stage ('test') {
            steps {
                echo 'test successful'
            }
        }
        stage ('deploy') {
            steps {
                echo 'deploy successful'
            }
        }
    }
}