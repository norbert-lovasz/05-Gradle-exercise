plugins {
    java
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "com.norbertlovasz.languageapp.SayHello"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}


