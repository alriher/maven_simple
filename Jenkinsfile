pipeline {
  agent any
  stages {
      stage('FASE 1 SMC JUEVES'){
        steps{
          echo'           ------------------------------------------------  COMENZANDO LA DESCARGA DEL PROYECTO  ------------------------------------------------                        '
          git 'https://github.com/jenkins-docs/simple-java-maven-app.git'
        }
      }
      stage('FASE 2 SMC JUEVES'){
        steps{
          echo'           ------------------------------------------------  COMENZANDO LA CONSTRUCCIÓN DEL PROYECTO  ------------------------------------------------                        '
          bat 'mvn clean install'
          archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
        }
      }
      stage('FASE 3 ANALYSIS JUEVES'){
        steps{
          echo'           ------------------------------------------------  COMENZANDO ANÁLISIS DEL PROYECTO   ------------------------------------------------                        '
          
          echo BRANCH_NAME

          withSonarQubeEnv('local_sonar'){
            
            bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar -Dsonar.projectKey=com.mycompany.app:my-app -Dsonar.organization=mavesis-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=39acfca66c299343b8ac4427b69b5cb78db97cf1 -Dsonar.branch.name='+BRANCH_NAME
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