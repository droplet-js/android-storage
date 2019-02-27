# android-storage

[![Build Status](https://cloud.drone.io/api/badges/v7lin/android-storage/status.svg)](https://cloud.drone.io/v7lin/android-storage)
[![GitHub tag](https://img.shields.io/github/tag/v7lin/android-storage.svg)](https://github.com/v7lin/android-storage/releases)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)

### snapshot

````
ext {
    latestVersion = '1.0.0-SNAPSHOT'
}

allprojects {
    repositories {
        ...
        maven {
            url 'https://oss.jfrog.org/artifactory/oss-snapshot-local'
        }
        ...
    }
}
````

### release

````
ext {
    latestVersion = '1.0.0'
}

allprojects {
    repositories {
        ...
        jcenter()
        ...
    }
}
````

### usage

android
````
...
dependencies {
    ...
    // implementation "io.github.v7lin:storage-kind-android:${latestVersion}"
    // implementation "io.github.v7lin:storage-trouble-android:${latestVersion}"
    implementation "io.github.v7lin:storage-trouble-android:${latestVersion}"
    ...
}
...
````
