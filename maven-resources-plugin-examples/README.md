# maven-resources-plugin Examples

The `maven-resources-plugin` handles copying of project resources to the output directory.  
There are two different kinds of resources: **main** and **test resources**.

- main resources : resources associated to the main source code, mostly stored in `src/main/resources`
- test resources : resources associated to the test source code, mostly stored in `src/test/resources`

Website: [maven.apache.org/plugins/maven-resources-plugin](https://maven.apache.org/plugins/maven-resources-plugin)  
Maven repository: [mvnrepository.com/artifact/org.apache.maven.plugins/maven-resources-plugin](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-resources-plugin)

Goals: [maven.apache.org/plugins/maven-resources-plugin/plugin-info.html](https://maven.apache.org/plugins/maven-resources-plugin/plugin-info.html)

## Usage

### Copy of resources

By default resources from directories:
`src/main/resources` and `src/test/resources`
are copied to the target folder. When running plugin goals: `resources:resources` and `resources:testResources`

- `resources:resources` copies the resource files from `src/main/resources` to `target/classes`.
- `resources:testResources` copies the resource files from `src/test/resources` to `target/test-classes`.

### Filtering

Resource files can get values included from:
- system properties
- project properties (i.a. (.pom) property values)
- filter resources
- command line
  By using delimiters `${...}`, replacing '...' with the name of the property.  
  E.g.
    - `${project.name}` to get the value of the project's name (included in your pom file)
    - `${java.vendor}` to get the java vendor system property
    - `${largest.bird}` to get the largest bird property value from a custom filter resource (in this case `filter-values.properties`)

To activate the 'filtering' for values. Directories have to be explicitly configured and marked.  
Following configuration needs to be added to get this done:
```
...
<build>
    <resources>
        <resource>
            <directory>src/main/resources</directory>
        </resource>
        <resource>
            <directory>src/main/resources-filtered</directory>
            <filtering>true</filtering>
        </resource>
    </resources>
    <testResources>
        <testResource>
            <directory>src/test/resources</directory>
        </testResource>
        <testResource>
            <directory>src/test/resources-filtered</directory>
            <filtering>true</filtering>
        </testResource>
    </testResources>
</build>
...
```

Note that it's recommended to create a separate folder for filtered resources if the default resources folder contains binary content!

source: [maven.apache.org/plugins/maven-resources-plugin/examples/filter.html](https://maven.apache.org/plugins/maven-resources-plugin/examples/filter.html)

### Filtering from a properties file

Values can also be included from a custom properties file. To configure this simply add the 'filters' tag to the build configuration.
One or multiple 'filter's' can be added. Each including the location of where the properties file can be found.

```
...
<build>
    <filters>
        <filter>src/main/resources/filter-values.properties</filter>
    </filters>
    <resources>
        ...
    </resources>
    <testResources>
        ...
    </testResources>
</build>
...
```

source: [maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html](https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html)
