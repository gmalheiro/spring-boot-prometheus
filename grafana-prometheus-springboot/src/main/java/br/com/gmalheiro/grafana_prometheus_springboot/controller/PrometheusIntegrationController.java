package br.com.gmalheiro.grafana_prometheus_springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrometheusIntegrationController {
    final static Logger logger = LoggerFactory.getLogger(PrometheusIntegrationController.class);

    @GetMapping("")
    public ResponseEntity<String> createLogs () {
        logger.warn("Just checking");
        return ResponseEntity.ok().body("All ok");
    }
}
