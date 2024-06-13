# PITest Demo

This project demonstrates how to use PITest (PIT Mutation Testing) to evaluate the effectiveness of your test suite by introducing small changes (mutants) into your code and checking if your tests catch these modifications.

## What is PITest?

PITest (PIT Mutation Testing) is a mutation testing tool for Java that helps evaluate the effectiveness of your test suite by introducing small changes (mutants) into your code and checking if your tests catch these modifications. It enhances the robustness of your tests by identifying weaknesses and ensuring higher code quality.

## Documentation

[PITest website](http://pitest.org/).

## Purpose

1. **Check How Good Your Tests Are**: Ensures your tests can find mistakes in your code.
2. **Find Gaps in Testing**: Shows where your tests might be missing or not strong enough.
3. **Boost Code Quality**: Helps make your code better by ensuring thorough testing.

## Adding PITest to Your Maven Project

To include PITest in your Maven project, add the following dependency and plugin to your `pom.xml`:

### Dependency and Plugin Configuration

```xml
<project>
  ...
    <build>
        <plugins>
            <!-- mvn -DwithHistory test-compile org.pitest:pitest-maven:mutationCoverage -->
            <plugin>
                <groupId>org.pitest</groupId>
                <artifactId>pitest-maven</artifactId>
                <version>1.16.1</version>
                <configuration>
                    <targetClasses>
                        <param>com.example.*</param>
                    </targetClasses>
                    <targetTests>
                        <param>com.example.*</param>
                    </targetTests>
                    <excludedTestClasses>
                        <excludedTestClass>com.example**.*IT</excludedTestClass>
                    </excludedTestClasses>
                </configuration>
                <executions>
                    <execution>
                        <id>pit-report</id>
                        <phase>test</phase>
                        <goals>
                            <goal>mutationCoverage</goal>
                        </goals>
                    </execution>
                </executions>
                <dependencies>
                    <dependency>
                        <groupId>org.pitest</groupId>
                        <artifactId>pitest-junit5-plugin</artifactId>
                        <version>1.2.1</version>
                    </dependency>
                </dependencies>
            </plugin>
            ...
        </plugins>
    </build>
    ...
</project>
