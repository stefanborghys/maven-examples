# owasp-dependency-check Examples

Dependency-Check is a Software Composition Analysis (SCA) tool that attempts to detect publicly disclosed vulnerabilities contained within a project's dependencies.
It does this by determining if there is a Common Platform Enumeration (CPE) identifier for a given dependency.
If found, it will generate a report linking to the associated CVE entries.

Website: [jeremylong.github.io/DependencyCheck](https://jeremylong.github.io/DependencyCheck)  
GitHub: [github.com/jeremylong/DependencyCheck](https://github.com/jeremylong/DependencyCheck)

Maven Plugin:
- configuration: [jeremylong.github.io/DependencyCheck/dependency-check-maven/configuration.html](https://jeremylong.github.io/DependencyCheck/dependency-check-maven/configuration.html)
- suppression: [jeremylong.github.io/DependencyCheck/general/suppression.html](https://jeremylong.github.io/DependencyCheck/general/suppression.html)
- goals: [jeremylong.github.io/DependencyCheck/dependency-check-maven/plugin-info.html](https://jeremylong.github.io/DependencyCheck/dependency-check-maven/plugin-info.html)

## Requirements

At least maven version 3.1 or newer is required!

## Plugin Goals

Aggregate and check project dependencies and the dependencies of all child modules to see if they have any known published vulnerabilities.  
`mvn dependency-check:aggregate`

Generate the OWASP dependency-check report.  
`mvn site:site`

## Glossary

| Abbreviation | Description                    |
| ------------ | ------------------------------ |
| SCA          | Software Composition Analysis  |
| CPE          | Common Platform Enumeration    |
| GAV          | Maven Group, Artifact, Version |
