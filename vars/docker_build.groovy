def call(String project, String tag , String DocUser){
  sh "docker build -t ${DocUser}/${project}:${tag} ."
  echo "docker image build sucess!"
}
