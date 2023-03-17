Some results
============

These are simply some results from my dev machine, just to give a rough idea of what the impact is certain tweaks:

| Kotlin compiler version | kotlinx-html version | hacked kotlinx-html-jvm | reduced nesting | K2 compiler | Kotlin compiler args                                                              |   | realCPU | userCPU | peakMEM |
|-------------------------|----------------------|-------------------------|-----------------|-------------|-----------------------------------------------------------------------------------|---|---------|---------|---------|
| 1.6.20                  | 0.7.3                | no                      | no              | no          | none                                                                              |   | 1:14.58 |    1.38 |  102368 |
| 1.7.0                   | 0.7.3                | no                      | no              | no          | none                                                                              |   | 0:48.03 |    1.27 |  101316 |
| 1.7.22                  | 0.7.3                | no                      | no              | no          | none                                                                              |   | 0:48.97 |    1.27 |  101932 |
| 1.7.22                  | 0.8.0                | no                      | no              | no          | none                                                                              |   | 0:48.32 |    1.37 |  102016 |
| 1.8.0                   | 0.8.0                | no                      | no              | no          | none                                                                              |   | 0:48.45 |    1.34 |  100440 |
| 1.8.10                  | 0.8.0                | no                      | no              | no          | none                                                                              |   | 0:50.92 |    1.41 |  103060 |
| 1.8.20-Beta             | 0.8.0                | no                      | no              | no          | none                                                                              |   | 0:50.87 |    1.33 |  101252 |
| 1.8.20-RC               | 0.8.0                | no                      | no              | no          | none                                                                              |   | 0:49.83 |    1.32 |  102588 |
| 1.8.20-RC               | 0.8.0                | yes                     | no              | no          | none                                                                              |   | 0:30.80 |    1.23 |  102904 |
| 1.8.20-RC               | 0.8.0                | no                      | no              | yes         | "-Xuse-k2", "-Xbackend-threads=0", "-Xuse-fast-jar-file-system", "-Xlambdas=indy" |   | 2:03.16 |    1.93 |  104540 |
| 1.8.20-RC               | 0.8.0                | yes                     | no              | yes         | "-Xuse-k2", "-Xbackend-threads=0", "-Xuse-fast-jar-file-system", "-Xlambdas=indy" |   | 0:24.53 |    1.31 |  100968 |
| 1.8.20-RC               | 0.8.0                | yes                     | no              | yes         | "-Xuse-k2"                                                                        |   | 0:26.85 |    1.27 |  104620 |
| 1.8.20-RC               | 0.8.0                | yes                     | yes             | yes         | "-Xuse-k2", "-Xbackend-threads=0", "-Xuse-fast-jar-file-system", "-Xlambdas=indy" |   | 0:23.13 |    1.27 |  102436 |
| 1.8.20-RC               | 0.8.0                | no                      | yes             | yes         | none                                                                              |   | 0:36.71 |    1.35 |  102324 |

Some conclusions:

* kotlin 1.6.20 -> recent: 34.67%
* hacked kotlinx-html-jvm: 38.00%
* use compiler flags incl K2: 20.45%
* reduce nesting: 5.71%

Combining all improvements (fastest vs slowest): 69.44% speedup

