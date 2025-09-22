def call(String project, String Image , String DocUser){
  echo 'this is building the code'
  sh "docker build -t ${DocUser}/${project}:${Iamge} ."
  echo "docker image build sucess!"
