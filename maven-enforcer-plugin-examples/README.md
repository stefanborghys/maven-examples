# maven-enforcer-plugin examples

Provides goals to control certain environmental constraints such as Maven version,
JDK version and OS family along with many more built-in rules and user created rules.

Website: [maven.apache.org/enforcer/maven-enforcer-plugin](https://maven.apache.org/enforcer/maven-enforcer-plugin)  
Overview of Built-In rules: [maven.apache.org/enforcer/enforcer-rules/index.html](https://maven.apache.org/enforcer/enforcer-rules/index.html)

## Setup

To be able to `mvn install` this project it's necessary to install the project in folder `maven-enforcer-rule-api-example` first. 
The `maven-enforcer-rule-api-example` creates a custom rule which is used by our `maven-enforcer-plugin` configuration. Just as an example.

## Writing a custom rule

An example implementation can be found in project `maven-enforcer-rule-api-example`.  
Which also has to be build and installed to get this example project working.

Writing a custom rule: [maven.apache.org/enforcer/enforcer-api/writing-a-custom-rule.html](https://maven.apache.org/enforcer/enforcer-api/writing-a-custom-rule.html)

