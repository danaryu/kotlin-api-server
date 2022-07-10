package world.haebang.truth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TruthApplication

fun main(args: Array<String>) {
	runApplication<TruthApplication>(*args)
}
