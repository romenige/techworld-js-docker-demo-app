
pipeline {
  
  agent any
  
  /*environment {
    NEW_VERSION = '1.3.0'
    SERVER_CREDENTIALS = credentials()
  }*/
  
  parameters {
    choice(name:'VERSION', choices:['1.1.0', '1.2.0', '1.3.0'], description: '')
    booleanParam(name: 'executeTests', defaultValue: true, description: '')
  }
  
  stages {
    
    stage("build") {
     /* when {
        expression {
          BRANCH_NAME == 'dev' && CODE_CHANGES == true
        }
      }*/
      steps {
        echo 'building the application...'
        echo "building version ${params.VERSION}"
      }
    }
    
    stage("test"){
     /* when {
        expression {
          BRANCH_NAME == 'dev' || BRANCH_NAME == 'master'
        }
      }*/
      steps {
        echo 'testing the application...'
      }
    }
    
    stage("deploy") {
      
      steps {
        echo'deploying the application...'
      }
    }
  }
 /* 
  post {  // Execute some logic AFTER all stages executed
    always {  // condition
      //
    }
    sucess {  // condition
    
    }
    failure { // condition
    
    }
    
  }*/
}
