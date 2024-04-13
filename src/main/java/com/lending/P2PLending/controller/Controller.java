package com.lending.P2PLending.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.lending.P2PLending.dao.DummyDao;
import com.lending.P2PLending.entity.Dummy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@Slf4j
public class Controller {
    @Autowired
    DummyDao dummydao;
    @GetMapping("/")
    public ResponseEntity<Object> home(@RequestHeader(value = "name") String name){
        log.info("name {}",name);
//        Optional<Dummy> dummy = dummydao.findByIds(1);
//        log.info(dummy.get().getData());
        return ResponseEntity.ok().body(null);
    }

}
