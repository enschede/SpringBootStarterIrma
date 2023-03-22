package nl.marcenschede.springbootstarterirma

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.client.RestTemplate

@Controller
class Step1 {
    @Autowired
    private val restTemplate: RestTemplate? = null

    @get:GetMapping("/aanmelden")
    val attributes: Unit
        get() {}
}