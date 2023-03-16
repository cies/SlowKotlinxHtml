SlowKotlinxHtml
===============

Test project for benchmarking the compile speed of the [kotlinx.html](https://github.com/Kotlin/kotlinx.html) eDSL.

In [this issue](https://github.com/Kotlin/kotlinx.html/issues/204) the slowness and possible reasons are tracked.

Other related issues:

  * https://youtrack.jetbrains.com/issue/KT-51445/Nested-inlining-of-kotlinx.html.visitTag-produces-unnecessarily-complex-bytecode
  * https://youtrack.jetbrains.com/issue/KT-51416/Compilation-of-kotlinx-html-DSL-should-still-be-faster
  * https://youtrack.jetbrains.com/issue/KT-41510/Compilation-of-kotlin-html-DSL-is-still-too-slow

Run it with:

    ./run_benchmark.sh

The first run is likely an outlier and hence should be discarded as it downloads the dependencies.
It is advisable to run the benchmark several times and report average.




