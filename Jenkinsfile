pipeline {

   agent {
      docker {
         image 'jenkins-slave/latest'
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
