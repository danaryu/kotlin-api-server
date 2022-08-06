package world.haebang.truth.reservation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/reservation")
class ReservationController {

    /**
     * 지역 별 예약정보 조회
     */
    @GetMapping("/{region}")
    fun search(@PathVariable region: String): String {

        // 각 region 별 지점을 조회

        // 스크래핑 비동기 요청

        // List로 응답

        return "hello";
    }

}