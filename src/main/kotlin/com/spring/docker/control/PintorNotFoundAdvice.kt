package com.spring.docker.control

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
internal class PintorNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(PintorNotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun comodoNotFoundHandler(ex: PintorNotFoundException): String? {
        return ex.message
    }
}