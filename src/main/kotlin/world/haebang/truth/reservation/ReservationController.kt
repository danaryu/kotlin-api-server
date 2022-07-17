package world.haebang.truth.reservation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/reservation")
class ReservationController {

    @GetMapping("/")
    fun search(): String {
        return "hello";
    }

}