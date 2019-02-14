# android-storage

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