package com.test.compose.build.configurations
import com.test.compose.build.dependencies.Versions

object ProjectConfigs {
    const val compileSdkVersion = 31
    const val minSdkVersion = 25
    const val targetSdkVersion = 31
    const val applicationId = "com.test.compose"
    const val kolinCompilerExtensionVersion = Versions.compose  //kotlin 兼容对应compose 的版本
}