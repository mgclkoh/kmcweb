package kr.mjc.koh.kmc2024

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan

@SpringBootApplication
@ServletComponentScan
class Kmc2024Application

fun main(args: Array<String>) {
    runApplication<Kmc2024Application>(*args)
    // applicationContext.beanDefinitionNames.forEach(::println)
}
