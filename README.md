SlowKotlinxHtml
===============

Test project for benchmarking the compile speed of the [kotlinx.html](https://github.com/Kotlin/kotlinx.html) eDSL.

In [this issue](https://github.com/Kotlin/kotlinx.html/issues/204) the slowness and possible reasons are tracked.

Other related issues:

  * https://youtrack.jetbrains.com/issue/KT-51445/Nested-inlining-of-kotlinx.html.visitTag-produces-unnecessarily-complex-bytecode
  * https://youtrack.jetbrains.com/issue/KT-51416/Compilation-of-kotlinx-html-DSL-should-still-be-faster
  * https://youtrack.jetbrains.com/issue/KT-41510/Compilation-of-kotlin-html-DSL-is-still-too-slow

To run the benchmark it is important to ensure caches are dropped and Gradle's deamon is not started.
Hence we run like:

    /usr/bin/time -f 'Resource usage: %E realCPU, %U userCPU, %M peakMEM' \
      ./gradlew clean compileKotlinJvm --no-daemon

The first run should be discarded as it downloads the dependencies.
It is advisable to run the benchmark several times and report average.




