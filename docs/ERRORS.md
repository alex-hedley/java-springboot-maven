# Errors

[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project demo: Fatal error compiling: error: release version 17 not supported -> [Help 1]

`echo $JAVA_HOME`
> /Users/alexhedley/.sdkman/candidates/java/current


`java --version`
> openjdk 11.0.11 2021-04-20
> OpenJDK Runtime Environment AdoptOpenJDK-11.0.11+9 (build 11.0.11+9)
> OpenJDK 64-Bit Server VM AdoptOpenJDK-11.0.11+9 (build 11.0.11+9, mixed mode)

`sdk list java`

```bash
================================================================================
Available Java Versions for macOS 64bit
================================================================================
 Vendor        | Use | Version      | Dist    | Status     | Identifier
--------------------------------------------------------------------------------
 Corretto      |     | 20.0.2       | amzn    |            | 20.0.2-amzn         
               |     | 20.0.1       | amzn    |            | 20.0.1-amzn         
               | >>> | 17.0.8       | amzn    | installed  | 17.0.8-amzn         
               |     | 17.0.7       | amzn    |            | 17.0.7-amzn         
               |     | 11.0.20      | amzn    |            | 11.0.20-amzn        
               |     | 11.0.19      | amzn    |            | 11.0.19-amzn        
               |     | 8.0.382      | amzn    |            | 8.0.382-amzn        
               |     | 8.0.372      | amzn    |            | 8.0.372-amzn        
 Gluon         |     | 22.1.0.1.r17 | gln     |            | 22.1.0.1.r17-gln
```

Update to a v17.

`sdk install java 17.0.8-amzn`

```bash
...
Installing: java 17.0.8-amzn
Done installing!

Do you want java 17.0.8-amzn to be set as default? (Y/n): Y
Setting java 17.0.8-amzn as default.
```

`java --version`

```bash
openjdk 17.0.8 2023-07-18 LTS
OpenJDK Runtime Environment Corretto-17.0.8.7.1 (build 17.0.8+7-LTS)
OpenJDK 64-Bit Server VM Corretto-17.0.8.7.1 (build 17.0.8+7-LTS, mixed mode, sharing)
```

`mvn clean compile`
