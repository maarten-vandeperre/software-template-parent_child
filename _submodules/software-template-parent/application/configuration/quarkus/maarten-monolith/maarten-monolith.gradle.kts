plugins {
    id("io.quarkus")
}

dependencies {
    implementation(platform(project(":platform:quarkus-platform")))

    implementation(project(":_submodules:software-template-parent:application:core:maarten-domain"))
    implementation(project(":_submodules:software-template-parent:application:core:maarten-core-utils"))
    implementation(project(":_submodules:software-template-parent:application:core:maarten-usecases"))
    implementation(project(":_submodules:software-template-parent:application:data-providers:in-memory-db:maarten-driver"))
//    implementation(project(":_submodules:software-template-parent:application:apis:maarten-jakarta-apis"))

    implementation("io.quarkus:quarkus-rest-jackson")
    implementation("io.quarkus:quarkus-rest")
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-rest-kotlin-serialization")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured")

// #### custom-dependencies-start ####
    implementation(project(":_submodules:software-template-parent:application:core:domain"))
    implementation(project(":_submodules:software-template-parent:application:core:usecases"))
    implementation(project(":_submodules:software-template-parent:application:apis:jakartaapis"))

// #### custom-dependencies-end ####
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}

allOpen {
    annotation("jakarta.ws.rs.Path")
    annotation("jakarta.enterprise.context.ApplicationScoped")
    annotation("jakarta.persistence.Entity")
    annotation("io.quarkus.test.junit.QuarkusTest")
}

// #### custom-code-start ####


// #### custom-code-end ####
