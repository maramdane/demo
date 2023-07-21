pipeline {
    agent any

    stages {
        stage('Clone') {
            steps{
                sh "rm -rf *"
                echo "Dossier vidé."
                sh "git clone https://github.com/maramdane/demo"
                echo "Clone effectué."
            }
        }
        stage('Build') {
            steps{
                sh "cd demo && mvn clean install compile test package verify"
            }
        }
        stage('Run') {
            steps{
                sh "cd demo && java -jar target/demo-0.1.jar"
                echo "Done."
            }
        }
    }
}