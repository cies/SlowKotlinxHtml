package sample1

import kotlinx.html.FlowContent
import kotlinx.html.div

private object Foo8 {

    fun FlowContent.foo() {
        div {
            +"dsad2"
            div {
                +"Dasda"
                div {
                    +"Dasda"
                    div {
                        foo_1()
                    }
                }
            }
            div {
                +"Dasda"
                div {
                    +"Dasda"
                    div {
                        +"Dasda"
                        foo_2()
                    }
                }
            }
        }
    }

    fun FlowContent.foo_1() {
        +"Dasda"
        div {
            +"Dasda"
            div {
                +"Dasda"
                div {
                    +"Dasda"
                    div {
                        +"Dasda"
                        foo_1_1()
                    }
                }
            }
        }
    }

    fun FlowContent.foo_1_1(){
        div {
            +"Dasda"
            div {
                +"Dasda"
                div {
                    +"Dasda"
                    div {
                        +"Dasda"
                        foo_1_1_1()
                    }
                }
            }
        }
    }

    fun FlowContent.foo_1_1_1() {
        div {
            +"Dasda"
            div {
                +"Dasda"
            }
        }
    }

    fun FlowContent.foo_2() {
        div {
            +"Dasda"
            div {
                +"Dasda"
                div {
                    +"Dasda"
                    div {
                        +"Dasda"
                        foo_2_1()
                    }
                }
            }
        }
    }

    fun FlowContent.foo_2_1() {
        div {
            +"Dasda"
            div {
                +"Dasda"
                div {
                    +"Dasda"
                    div {
                        +"Dasda"
                        foo_2_1_1()
                    }
                }
            }
        }
    }

    fun FlowContent.foo_2_1_1() {
        div {
            +"Dasda"
            div {
                +"Dasda"
            }
        }
    }

    fun FlowContent.didntFinishInOneMinute() {
        div {
            +"dsad"
            div {
                +"Dasda"
                div {
                    +"ASdas"
                    div {
                        +"Asda"
                        didntFinishInOneMinute_1()
                    }
                }
            }
        }
    }

    fun FlowContent.didntFinishInOneMinute_1() {
        div {
            +"ASdasd"
            div {
                +"asdasd"
                div {
                    +"asdasda"
                    div {
                        +"Asdasda"
                        didntFinishInOneMinute_1_1()
                    }
                }
                +"asdasd"
                div {
                    +"asdasda"
                    div {
                        +"Asdasda"
                        didntFinishInOneMinute_1_2()
                    }
                }
                +"asdasd"
                div {
                    +"asdasda"
                    div {
                        +"Asdasda"
                        didntFinishInOneMinute_1_3()
                    }
                }
                +"asdasd"
                div {
                    +"asdasda"
                    div {
                        +"Asdasda"
                        didntFinishInOneMinute_1_4()
                    }
                }
                +"asdasd"
                div {
                    +"asdasda"
                    div {
                        +"Asdasda"
                        didntFinishInOneMinute_1_5()
                    }
                }
                +"asdasd"
                div {
                    +"asdasda"
                    div {
                        +"Asdasda"
                        didntFinishInOneMinute_1_6()
                    }
                }
            }
        }
    }

    fun FlowContent.didntFinishInOneMinute_1_1() {
        div {
            +"Asd"
            div {
                +"ASdasdas"
            }
        }
    }

    fun FlowContent.didntFinishInOneMinute_1_2() {
        div {
            +"Asd"
            div {
                +"ASdasdas"
            }
        }
    }

    fun FlowContent.didntFinishInOneMinute_1_3() {
        div {
            +"Asd"
            div {
                +"ASdasdas"
            }
        }
    }

    fun FlowContent.didntFinishInOneMinute_1_4() {
        div {
            +"Asd"
            div {
                +"ASdasdas"
            }
        }
    }

    fun FlowContent.didntFinishInOneMinute_1_5() {
        div {
            +"Asd"
            div {
                +"ASdasdas"
            }
        }
    }

    fun FlowContent.didntFinishInOneMinute_1_6() {
        div {
            +"Asd"
            div {
                +"ASdasdas"
            }
        }
    }

}