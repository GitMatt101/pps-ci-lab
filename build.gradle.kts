import org.gradle.internal.jvm.inspection.JvmVendor

plugins {
    java
    scala
    groovy
    alias(libs.plugins.kotlin.jvm)
    jacoco
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.groovy)
    implementation(libs.scala.stdlib)
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}

val jvmVersion = libs.versions.jvm.get().toInt()

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(jvmVersion))
        vendor.set(JvmVendorSpec.ADOPTIUM)
    }
}

tasks.named("build") {
    dependsOn("javadoc")
    dependsOn("scaladoc")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)

    reports {
        xml.required.set(true)
    }
}

val coverageThreshold = BigDecimal("0.80")

tasks.jacocoTestCoverageVerification {
    violationRules {
        rule {
            limit {
                minimum = coverageThreshold
            }
        }
    }
}
