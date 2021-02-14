# Main Filtered Resource

This MAIN resource SHOULD be filtered!
So variable(s) within delimiters `${...}` will be included.

## Pom property example
The project's name is: ${project.name}

## System property example
The java vendor is: ${java.vendor}

System Properties: [https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html](https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html)

## Filter resource example
The largest bird is: ${largest.bird}

The file was modified on: ${maven.build.timestamp}
