# Java EE 8 and MicroProfile Maven Archetype

you can generate java ee 8 and microprofile project in one to build microservice.

using command to generate skeleton project.

```
mvn archetype:generate                                  \
  -DarchetypeGroupId=com.chrisopal                      \
  -DarchetypeArtifactId=javaee8-microprofile-archetype  \
  -DarchetypeVersion=0.0.1                              \
  -DgroupId=<your project groupid>                      \
  -DartifactId=<you project artifactId>                 \
  -Dversion=<your project version>
``` 