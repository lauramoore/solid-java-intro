# Working with Junit

## Add new dependency using maven
Junit is a framework building, running, and managing java unit tests.  
As a third-party library it must be downloaded from the web and added to your project's build path before
you are able to reference it.  We'll do all this using Maven.

1. Google "Maven Central" to find [Maven Central Repository](http://search.maven.org/)
2  search for the term 'junit'
3. Go into artifact for groupId junit (version 4.12)
4. Copy the dependency XML for Maven
5. In your IDE open the project pom.xml
6. Add a  `<dependencies></dependencies>` tag and insert the copied xml into this new tag.
7  Update settings
```
'Right Click Project' > Maven > Update Project
```
What just happened?

Maven downloaded Junit and it's dependencies adding them to the project dependencies.
```
Open 'Maven Dependencies' and see the jars listed.
```

#### oops almost forgot!
It's best practice to exclude testing dependencies from core application.  To do this with maven simply add a tag to the Junit Dependency in pom.xml
```
 <scope>test</scope>
 ```
 rerun Maven > Update Project

