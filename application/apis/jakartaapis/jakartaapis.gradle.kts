dependencies {
    implementation(platform(project(":platform:quarkus-platform"))) //TODO should become quarkus unaware

    implementation(project(":application:core:domain"))
    implementation(project(":application:core:usecases"))
    implementation(project(":_submodules:software-template-parent:parent-application:core:maarten-domain"))
    implementation(project(":_submodules:software-template-parent:parent-application:core:maarten-core-utils"))
    implementation("jakarta.ws.rs:jakarta.ws.rs-api")
}
