package me.jeonguk.spring.playground.controller

import domain.Sample
import me.jeonguk.spring.playground.service.SampleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService
) {

    @GetMapping("/home")
    fun home(): List<Sample.SampleDto> = sampleService.getHome()

    @GetMapping("/homeadd")
    fun homeAdd() {
        sampleService.addHome();
    }

}