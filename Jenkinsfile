pipeline {
    agent any

    stages {
        stage('Clone') {
            sh "rm -rf *"
            echo "Dossier vidé."
            sh "git clone https://github.com/maramdane/demo"
            echo "Clone effectué"
        }
        stage('Build') {
            cd demo
            echo "Déplacement dans le dossier Git."
            sh "javac /src/main/java/com/example/App.java"
        }
        stage('Run') {
             sh "java -jar target/demo-01.jar"
            echo "Done."
        }
    }
}