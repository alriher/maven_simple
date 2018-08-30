pipeline {
  agent any
  stages {
    stage('Download') {
      steps {
        build 'maven_simple_Descarga'
      }
    }
        stage('Build') {
      steps {
        build 'maven_simple_Build'
      }
    }
        stage('Analisys') {
      steps {
        build 'maven_simple_Analysus'
      }
    }
  }
}