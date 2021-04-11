# Projet RPNCalculator :
## Introduction
Ce projet sert à réaliser une Calculatrice en mode RPN(Reverse Polish Notation)ou notation post-fixée , qui réalise les opérations d'une calculatrice basique (/,-,+ et * ) avec 2 autre Operations : exit pour finir l'exécution et undo pour supprimer le dernier opérande.
<br>
   <u>**réalisé par:**</u>
<br>    RAHMANI Nadjib
<br>    YOUSFI Yacine

## Aspects techniques et choix de conception sur le projet
### Le pattern COMMAND
Le pattern demandé pour la relation de ce projet est command : ce pattern encapsule la notion d'invocation. Il permet de séparer complètement le code initiateur de l'action et a notre cas l'action c'est évaluer les opérations de la calculatrice ,undo et exit et celà à partir de l'interface Command et les classes  qui l'implémentent(undo , quit )
### Outils de travail
#### Maven
###### JDK 11
Ce qu'est demandé
```xml
            <properties>
                <maven.compiler.source>11</maven.compiler.source>
                <maven.compiler.target>11</maven.compiler.target>
            </properties>
```
###### Checkstyle
```xml
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-checkstyle-plugin</artifactId>
                    <version>3.1.2</version>
                    <configuration>
                        <configLocation>checkstyle.xml</configLocation>
                        <encoding>UTF-8</encoding>
                        <consoleOutput>true</consoleOutput>
                        <failsOnError>true</failsOnError>
                        <linkXRef>false</linkXRef>
                    </configuration>
                    <executions>
                        <execution>
                            <id>validate</id>
                            <phase>validate</phase>
                            <goals>
                                <goal>check</goal>
                            </goals>
                        </execution>
                    </executions>
                </plugin>
```
```xml
             <plugin>
                 <groupId>org.apache.maven.plugins</groupId>
                 <artifactId>maven-checkstyle-plugin</artifactId>
                 <version>3.1.2</version>
                 <reportSets>
                     <reportSet>
                         <reports>
                             <report>checkstyle</report>
                         </reports>
                     </reportSet>
                 </reportSets>
             </plugin>
```
###### Javadoc
qui gère la documentation de projet 
```xml
             <dependency>
                        <groupId>org.apache.maven.plugins</groupId>
                        <artifactId>maven-javadoc-plugin</artifactId>
                        <version>3.2.0</version>
             </dependency>
```
```xml
                          <plugin>
                                <groupId>org.apache.maven.plugins</groupId>
                                <artifactId>maven-javadoc-plugin</artifactId>
                                <version>3.2.0</version>
                                <configuration>
                                    <show>private</show>
                               </configuration>
                          </plugin>
```
```xml
               <plugin>
                   <groupId>org.apache.maven.plugins</groupId>
                   <artifactId>maven-javadoc-plugin</artifactId>
                   <version>3.2.0</version>
                   <configuration>
                       <stylesheetfile>${basedir}/src/main/javadoc/stylesheet.css</stylesheetfile>
                       <show>public</show>
                   </configuration>
               </plugin>
```
###### Junit4
pour les tests 
```xml
                <dependency>
                    <groupId>junit</groupId>
                    <artifactId>junit</artifactId>
                    <version>4.13.1</version>
                    <scope>test</scope>
                </dependency>
```
### Explications
à partir de l'interface Command, on a implémenté les classes Undo,Quit et EnregistrerCommand . Et pour les opérations arithmétiques on a fait un enum pour éviter 4 classes  et une méthode abstraite oper pour évaluer le résultat ou les opérandes ce trouve dans une pile.



