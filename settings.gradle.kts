pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Android_UI"
include(":webview01")
include(":viewdemo3")
include(":viewdemo2")
include(":viewdemo1")
include(":tabdemo")
include(":radio")
include(":listview3")
include(":listview2")
include(":listview1")
include(":layout01")
include(":imageview2")
include(":imageview1")
include(":dialog01")
include(":gridview01")
include(":constraintlayout01")
include(":checkbox2")
include(":checkbox1")
include(":button1")
