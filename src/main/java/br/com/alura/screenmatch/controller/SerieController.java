package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.dto.SerieDTO;
import br.com.alura.screenmatch.service.SerieService;
import org.aspectj.weaver.ast.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    public SerieService serieService;

    @GetMapping
    public List<SerieDTO> obterSeries() {
        return serieService.obterTodasSeries();
    }

    @GetMapping("/top5")
    public List<SerieDTO> obterTop5() {
        return serieService.obterTop5Avaliacoes();
    }

    @GetMapping("/lancamentos")
    public List<SerieDTO> obterLancamentos() {
        return serieService.obterLancamentos();
    }

    @GetMapping("/{id}")
    public SerieDTO buscarPorId(@PathVariable Long id) {
        return serieService.obterPorId(id);
    }
}
