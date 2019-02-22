# android-storage

[![Build Status](https://cloud.drone.io/api/badges/v7lin/android-storage/status.svg)](https://cloud.drone.io/v7lin/android-storage)
[ ![Download](https://api.bintray.com/packages/v7lin/maven/storage-kind-android/images/download.svg) ](https://bintray.com/v7lin/maven/storage-kind-android/_latestVersion)
[ ![Download](https://api.bintray.com/packages/v7lin/maven/storage-trouble-android/images/download.svg) ](https://bintray.com/v7lin/maven/storage-trouble-android/_latestVersion)

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
