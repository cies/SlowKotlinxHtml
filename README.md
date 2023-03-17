SlowKotlinxHtml
===============

Test project for benchmarking the compile speed of the [kotlinx.html](https://github.com/Kotlin/kotlinx.html) eDSL.

In [this issue](https://github.com/Kotlin/kotlinx.html/issues/204) the slowness and possible reasons are tracked.

Other related issues:

  * https://youtrack.jetbrains.com/issue/KT-51445/Nested-inlining-of-kotlinx.html.visitTag-produces-unnecessarily-complex-bytecode
  * https://youtrack.jetbrains.com/issue/KT-51416/Compilation-of-kotlinx-html-DSL-should-still-be-faster
  * https://youtrack.jetbrains.com/issue/KT-41510/Compilation-of-kotlin-html-DSL-is-still-too-slow

Run it with two arguments, the Kotlini Gradle plugin version number first and the kotlinx.html version second. For example:

    ./run_benchmark.sh 1.6.0 0.8.0

The first run is likely an outlier and hence should be discarded as it downloads the dependencies.
It is advisable to run the benchmark several times and report average.

Some [Kotlin Gradle plugin](https://plugins.gradle.org/plugin/org.jetbrains.kotlin.jvm) versions (conguate with Kotlin compiler versions):

    1.8.20-RC
    1.8.20-Beta
    1.8.10
    1.8.0
    1.7.22
    1.7.21
    1.7.20
    1.7.10
    1.7.0
    1.6.21
    1.6.20

Some [kotlinx.html](https://central.sonatype.com/artifact/org.jetbrains.kotlinx/kotlinx-html/0.8.1/versions) versions:

    0.8.1
    0.8.0
    0.7.5
    0.7.4
    0.7.3

Other parameters worth tweaking:

  * Heap space allocated, set in `gradle.properties` (e.g.: `org.gradle.jvmargs=-Xmx8g -Dkotlin.daemon.jvm.options=-Xmx6g`)
  * Use [our hacked version of the kotlinx-html-jvm](https://github.com/Stager-Software/kotlinx.html/) with the exception handling commented out by commenting out the dependency in `build.gradle.template`
  * Change the Kotlin compiler args in `build.gradle.template`
  * Reduce the max depth of eDSL nesting, this is done on the `reduce-nesting` branch
