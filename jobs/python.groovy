project_name= "jenkins-pipeline-python"
repo = "git@github.com:hacosta333/jenkinstest.git"
repo_name= "repo"


pipelineJob(project_name){
   definition{
      triggers{
        scm('* * * * *')
      }

      cpsScm{
        scm{
          git{
             remote{
                name(repo_name)
                url(repo)
             }
          }
          scriptPath("Jenkinsfile")
        }
      }
   }
}
