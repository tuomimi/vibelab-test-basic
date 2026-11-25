# vibelab-test-basic

VibeLab 提交测试工程 1：**基线用例**。

- 单一 Application module（`:app`），产物为 release APK
- Gradle wrapper 8.13 / AGP 8.13.2 / compileSdk 35 / targetSdk 35 / minSdk 26
- Java 17 源与目标版本，无 Kotlin、无 NDK、无第三方依赖
- 无签名配置、无 `local.properties`、无 `org.gradle.java.home`
- 包名 `com.tuomimi.vibelab.basic`，非模板默认值

用途：验证「提交仓库地址 + 40 位 commit id → 云端构建 → 安装启动」这一条主链路是否通了。若该工程构建失败，问题在平台侧而不在工程内容。
