pipeline {

   agent {
      docker {
         image 'jenkins/jnlp-agent-maven:latest'
         label 'maven'
       }
   }
   
   stages{
       stage('Build') {
          steps {
             sh 'mvn clean package'
          } //setps
       } //stage
    } //stages
} //pipeline
