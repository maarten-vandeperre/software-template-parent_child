pluginManagement {
    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings
    val springBootPluginVersion: String by settings
    val springBootPluginId: String by settings
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
    plugins {
        id(quarkusPluginId) version quarkusPluginVersion
        id(springBootPluginId) version springBootPluginVersion
    }
}

include(":platform:quarkus-platform")
include(":platform:spring-platform")

include(":_submodules:software-template-parent:application:core:maarten-domain")
include(":_submodules:software-template-parent:application:core:maarten-core-utils")
include(":_submodules:software-template-parent:application:core:maarten-usecases")

include(":_submodules:software-template-parent:application:data-providers:in-memory-db:maarten-driver")

//include(":_submodules:software-template-parent:application:apis:maarten-jakarta-apis")

include(":_submodules:software-template-parent:application:configuration:quarkus:maarten-monolith")
include(":_submodules:software-template-parent:application:configuration:open-liberty:monolith")



rootProject.name="software-template-parent_kotlin"

// #### custom-code-start ####

rootProject.name="software-template-parent_child"

include(":_submodules:software-template-parent:application:core:domain")
include(":_submodules:software-template-parent:application:core:usecases")
include(":_submodules:software-template-parent:application:apis:jakartaapis")

// #### custom-code-end ####






rootProject.children
    .flatMap { child -> if (child.children.isEmpty()) listOf(child) else child.children }
    .flatMap { child -> if (child.children.isEmpty()) listOf(child) else child.children }
    .flatMap { child -> if (child.children.isEmpty()) listOf(child) else child.children }
    .flatMap { child -> if (child.children.isEmpty()) listOf(child) else child.children }
    .flatMap { child -> if (child.children.isEmpty()) listOf(child) else child.children }
    .flatMap { child -> if (child.children.isEmpty()) listOf(child) else child.children }
    .flatMap { child -> if (child.children.isEmpty()) listOf(child) else child.children }
    .flatMap { child -> if (child.children.isEmpty()) listOf(child) else child.children }
    .forEach { subproject ->
        println("configure: " + subproject.name + ".gradle.kts")
        subproject.buildFileName = subproject.name + ".gradle.kts"
    }
