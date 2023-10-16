plugins {
    id("java")
}

group = "search-engine"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    implementation("org.seleniumhq.selenium:selenium-java:4.13.0")
    implementation("org.jsoup:jsoup:1.16.1")
    implementation("org.apache.httpcomponents:httpclient:4.5.14")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}


