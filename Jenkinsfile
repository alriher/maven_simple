pipeline {
  agent any
  stages {
    stage('FASE 1') {
      steps {
        withSonarQubeEnv('local_sonar') {
      // requires SonarQube Scanner for Maven 3.2+
      bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
        }
      }      
      }
      stage('FASE 2 SMC'){
        steps{
          git 'https://github.com/rtheunissen/foobar.git'
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