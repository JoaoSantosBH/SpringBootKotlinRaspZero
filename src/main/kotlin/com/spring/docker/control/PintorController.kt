package com.spring.docker.control

import com.spring.docker.model.Pintor
import com.spring.docker.repository.PintorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class PintorController() {

    @Autowired
    lateinit var repository: PintorRepository

    @RequestMapping("/")
    fun home(): String? {
        return "Welcome to My Kotlin Docker Spring App on Raspberry PI Zero "
    }

    @GetMapping("/pintor")
    fun fetchAllPintor(): List<Pintor?>? {
        return repository.findAll()
                .sortedBy { it.nome }
    }

    @PostMapping("/pintor")
    fun createPainter(@RequestBody pinResponse: Pintor): Pintor? {
        return repository.save(pinResponse)
    }

    @GetMapping("/pintor/{id}")
    fun fetchPainterById(@PathVariable id: Int): Pintor? {
        return repository.findById(id)
                .orElseThrow { PintorNotFoundException(id) }
    }

    @PutMapping("/pintor/{id}")
    fun replacePainteres(@RequestBody pinResponse: Pintor, @PathVariable id: Int): Pintor? {
        return repository.findById(id)
                .map { Painter: Pintor ->
                    Painter.nome = pinResponse.nome
                    repository.save(Painter)
                }
                .orElseGet {
                    pinResponse.idPintor = id
                    repository.save(pinResponse)
                }
    }

    @DeleteMapping("/pintor/{id}")
    fun deletePainter(@PathVariable id: Int) {
        repository.deleteById(id)
    }
}