pipeline {
	agent any
    stages {
		stage('Checkout') {
			steps {
				git 'https://github.com/PetFactory1991/JavaSelenideJenkinsAllureDockerSelenoid.git'
            }
        }
        stage('Build') {
			steps {
				sh 'mvn clean test'
            }
        }
        stage('Allure Report') {
			steps {
				sh 'mvn allure:report'
            }
        }
    }
}