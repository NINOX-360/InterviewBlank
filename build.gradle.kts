plugins {
    `java-library`
    kotlin("jvm") version "1.7.20" apply false
}

apply(plugin = "org.jetbrains.kotlin.jvm")

group = "com.ninox360"
version = "1.0-SNAPSHOT"

val versionArgs4J: String by project
val versionCommonsIO: String by project
val versionGuava: String by project
val versionCommonsLang: String by project
val versionJUnit: String by project

java {
    withJavadocJar()
    withSourcesJar()
    toolchain { languageVersion.set(JavaLanguageVersion.of(17)) }
}

tasks.withType<Javadoc> {
    isFailOnError = false
    enabled = false
}

repositories {
    mavenCentral()
    mavenLocal()
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    api("args4j:args4j:$versionArgs4J")
    api("org.apache.commons:commons-lang3:$versionCommonsLang")
    api("com.google.guava:guava:$versionGuava")
    api("commons-io:commons-io:$versionCommonsIO")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$versionJUnit")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$versionJUnit")
}

tasks.getByName<Test>("test") { useJUnitPlatform() }

tasks.create<JavaExec>("RunHelloWorld") {
    main = "HelloWord"
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "7.3.3"
}
