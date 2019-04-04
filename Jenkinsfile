pipeline {

   agent label 'maven'
   
   stages{
       stage('Build') {
          steps {
             sh 'mvn clean package'
          } //setps
       } //stage
    } //stages
} //pipeline
