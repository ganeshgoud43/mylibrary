def gitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}
def gitBuild()
{
  sh "mvn package"
}
def gitDeploy(jobname,ipaddress,context)
{
  sh "/var/lib/jenkins/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${context}.war"
}
