#!groovy
pipeline {
    agent any
   stages {
    stage('BUILD') {
  	steps {
       		sh 'mvn clean package -DskipTests'
       	      }
     	}
     stage('TEST'){
     steps{
      sh 'mvn test'
     }
     }
     stage('DOCKER IMAGE'){
     steps{
      sh 'docker build -t prasanthkumar1/di:calimg .'
     }
     }
     stage('PUBLISH TO DockerHub')
 		{
 		    steps
 		    {
 	        	withDockerRegistry([ credentialsId: "DockerHub", url: "" ])
 	        	{
 	        		sh 'docker push prasanthkumar1/di:calimg'

 	      		}
 		    }
 		}
    stage('Deploy to Rundeck') {
      agent any
      steps {
        script {
          step([$class: "RundeckNotifier",
          rundeckInstance: "Rundeck",
          shouldFailTheBuild: true,
          shouldWaitForRundeckJob: true,
          options: """
            BUILD_VERSION=$BUILD_NUMBER
          """,
          jobId: "815ef864-36e0-4e6f-a77c-de18d322a5b8"])
        }
      }
    }
   }
 }