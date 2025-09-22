def call(String project, String tag , String DocUser){
  echo 'this is building the code'
  sh "docker build -t ${DocUser}/${project}:${tag} ."
  echo "docker image build sucess!"
