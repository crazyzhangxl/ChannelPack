package config

class Versions{
    static def appName = "channel-pack"
    static def versionName = "1.0.0"
    static def versionCode = 1
    static def compileSdkVersion = 29
    static def minSdkVersion = 16
    static def targetSdkVersion = 29
    static def applicationId = "com.zxl.myapplication"

    static class Ali{
        static def appName = "channel-pack"
        static def versionName = "1.0.0"
        static def versionCode = 1
        static def compileSdkVersion = 29
        static def minSdkVersion = 16
        static def targetSdkVersion = 29
        static def applicationId = "com.zxl.myapplication"
        static def versionNameSuffix  = "_ali"
    }

    static class Baidu{
        static def appName = "channel-pack"
        static def versionName = "1.0.0"
        static def versionCode = 1
        static def compileSdkVersion = 29
        static def minSdkVersion = 16
        static def targetSdkVersion = 29
        static def applicationId = "com.zxl.myapplication"
        static def versionNameSuffix  = "_baidu"
    }

    static class Dep{
        static def appComp = "appComp2.5"
    }
}