# Tests for the `krasa-jaxb-tools` project

Provides functional tests together with a showcase on how to invoke  [Jaxn Bean Validation Annotation Plugin `krasa-jaxb-tools`](https://github.com/fillumina/krasa-jaxb-tools) .

Note that `krasa-jaxb-tools` is compiled with **Java 8 (JDK 8)** because of some old projects still depending on it so these examples are compiled with the same JDK 8 and all dependencies are peeked from the latest versions able to maintain that compatibility. If you plan to use a newer JDK (which you should if you could) you might consider referring to a fork of this project with newest projects and dependencies and compiled with JDK 21: [fillumina/krasa-jaxb-tools-jdk21-example: Examples of usage of krasa-jaxb-tools using latest jakarta technologies (Java 21)](https://github.com/fillumina/krasa-jaxb-tools-jdk21-example).

Tests are performed with these XJC compatible plugins:

- [`maven-jaxb2-plugin`](https://github.com/highsource/jaxb-tools)

- [`jaxb2-maven-plugin`](https://github.com/mojohaus/jaxb2-maven-plugin)

- [`cxf-codegen-plugin`](https://cxf.apache.org/docs/maven-cxf-codegen-plugin-wsdl-to-java.html)

- [`cxf-xjc-plugin`](https://cxf.apache.org/cxf-xjc-plugin.html)
