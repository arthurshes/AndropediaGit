pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

rootProject.name = "Andropedia"
include(":app")
include(":api:auth_api")
include(":local_datastore:security")
include(":local_datastore:local_db")
include(":study_materials:basic_study_mat")
include(":study_materials:advanced_study_mat")
include(":study_materials:indepth_study_mat")
include(":study_materials:core_logics")
include(":core")
include(":api:user_api")
include(":user_logics:transactions_logics")
