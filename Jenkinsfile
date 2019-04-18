pipeline {

   agent {
      label 'maven-ssh-dyn-slave'
   }
   
   stages{
       stage('Build') {
          steps {
             sh 'mvn clean package'
          } //setps
       } //stage
    } //stages
} //pipeline
