package com.rdo.buscaminas.expedition;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "expedition")
@CrossOrigin("*")
public class ExpeditionController {

    @GetMapping
    public List<Expedition> getExpedition() {
        Expedition expedition = callApiExpedition();
        List<Expedition> expeditions = new ArrayList<>();
        return List.of(expedition);
    }

    private static Expedition callApiExpedition()
    {
        final String uri = "https://75jwlvujpd.execute-api.us-east-2.amazonaws.com/staging/expeditions";
        RestTemplate restTemplate = new RestTemplate();
        Expedition expedition = restTemplate.getForObject(uri, Expedition.class);
        return expedition;

    }
}
