plugins {
    java
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.7.4")
    testImplementation(platform("org.junit:junit-bom:6.0.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named("build") {
    dependsOn("javadoc")
    dependsOn("scaladoc")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
