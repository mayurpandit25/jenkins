pipeline {
    agent any

    stages {
        stage ('checkout') {
            steps {
                git 'https://github.com/Pritam-Khergade/student-ui.git'
                echo "pull successful"
            }
        }
        stage ('build') {
            steps {
                echo 'build successful'
            }
        }
        steps ('testing') {
            steps {
                echo 'test successful'
            }
        }
        stage ('deoloy') {
            steps {
                echo "deploy successful"
            }
        }
    }
}