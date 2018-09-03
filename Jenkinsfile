pipeline {
  agent any
  stages {
      stage('FASE 1 SMC'){
        steps{
          git 'https://github.com/jenkins-docs/simple-java-maven-app.git'
        }
      }
      stage('FASE 2 ANALYSIS'){
        steps{
          withSonarQubeEnv('local_sonar'){
            bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
          }
        }
      }
  }
}







// stage('SCM') {
//     git 'https://github.com/foo/bar.git'
//   }
//   stage('SonarQube analysis') {
//     withSonarQubeEnv('My SonarQube Server') {
//       // requires SonarQube Scanner for Maven 3.2+
//       sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
//     }
//   }