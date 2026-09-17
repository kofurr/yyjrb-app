// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.compose.compiler) apply false
}

android {
    // ... 其他配置 ...

    lint {
        abortOnError false   // Lint 有错误时不中断构建
        checkReleaseBuilds false  // Release 构建时不跑 Lint
    }
}
