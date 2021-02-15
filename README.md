# Maven Examples

🎉 Playground for testing and experimenting with various Maven plugins and configuration.

## 🔌 Maven Plugins
| Project                | Description                                                                                                            | Website                                                                                                        |
| ---------------------- | ---------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| maven-resources-plugin | Handles copying of project resources to the output directory                                                           | [maven.apache.org/plugins/maven-resources-plugin](https://maven.apache.org/plugins/maven-resources-plugin)     |
| maven-enforcer-plugin  | Require environmental contraints (Maven & Java version, properties, ...) to be fulfilled by configuring (custom) rules | [maven.apache.org/enforcer/maven-enforcer-plugin](https://maven.apache.org/enforcer/maven-enforcer-plugin)     |
| maven-archetype-plugin | Archetype to generate a sample Maven plugin                                                                            | [maven.apache.org/archetype/maven-archetype-plugin](https://maven.apache.org/archetype/maven-archetype-plugin) |

### maven-archetype-plugin

Allows to create a Maven project from an existing template called an archetype.  
And to create an archetype from an existing project.

Website: [maven.apache.org/archetype/maven-archetype-plugin](https://maven.apache.org/archetype/maven-archetype-plugin)

## 🔖 Maven Archetypes

Archetype is a Maven project templating toolkit.

Introduction to Archetypes: [maven.apache.org/guides/introduction/introduction-to-archetypes.html](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html)  
Guide to Creating Archetypes: [maven.apache.org/guides/mini/guide-creating-archetypes.html](https://maven.apache.org/guides/mini/guide-creating-archetypes.html)

| Project                    | Description                                  | Website                                                                                                                  |
| -------------------------- | -------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------ |
| maven-archetype-quickstart | Archetype to generate a sample Maven project | [maven.apache.org/archetypes/maven-archetype-quickstart](https://maven.apache.org/archetypes/maven-archetype-quickstart) |

### maven-archetype-quickstart

Allows to generate a sample Maven project.

Website: [maven.apache.org/archetypes/maven-archetype-quickstart](https://maven.apache.org/archetypes/maven-archetype-quickstart)

Create a new maven project without command-line interaction:  
`mvn archetype:generate -DgroupId=be.seriousbusiness.serious-app -DartifactId=serious-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false`

Source - Maven in 5 minutes, Creating a project: [maven.apache.org/guides/getting-started/maven-in-five-minutes.html#creating-a-project](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html#creating-a-project)
