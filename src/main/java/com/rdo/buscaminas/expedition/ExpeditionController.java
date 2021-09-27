package com.rdo.buscaminas.expedition;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "expedition")
public class ExpeditionController {



//    @GetMapping
//    public List<Expedition> hello() {
//
//        Expedition expedition = getExpedition();
//        List<Expedition> expeditions = new ArrayList<>();
////        return String.format("Buscaminas va a la expedicion: \n Cordenadas en X: %s! \n" +
////                "Cordenadas en Y: %s \n" +
////                "Tamaño del deposito : %s", expedition.getX(), expedition.getY(), expedition.getTamano());
//        return List.of(expedition);
//    }


    @GetMapping
    public String hello() {

        Expedition expedition = getExpedition();
        return String.format("<h1>Buscaminas va a la expedicion</h1> <br> Cordenadas en X: %s" +
                "<br>Cordenadas en Y: %s " +
                "<br>Tamaño del deposito : %s", expedition.getX(), expedition.getY(), expedition.getTamano());

    }
    private static Expedition getExpedition()
    {
        final String uri = "https://75jwlvujpd.execute-api.us-east-2.amazonaws.com/staging/expeditions";

//		RestTemplate restTemplate = new RestTemplate();
//		String result = restTemplate.getForObject(uri, String.class);

        RestTemplate restTemplate = new RestTemplate();
        Expedition expedition = restTemplate.getForObject(uri, Expedition.class);

        System.out.println(expedition.toString());

        return expedition;

    }
}
