def buildApp() {
  echo 'building the application...'
}

def testApp(){
  echo 'building the application...'
}

def deployApp(){
  echo 'deploy the application...'
  echo "building version ${params.VERSION}"
}

return this
