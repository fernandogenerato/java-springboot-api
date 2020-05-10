package xyz.dev.controller;

import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.dev.service.ClientService;
import xyz.dev.vo.ClientVO;


@ResponseBody
@RestController
public class rootController {

    @Autowired
    private ClientService clientService;

    private Logger logger;

    @GetMapping("/")
    public String test() {
        return " TEST";
    }

    @PostMapping("/client/")
    public ResponseEntity<String> cadastrarCliente(@RequestBody String payload) {
        try {
            Gson gson = new Gson();
            ClientVO vo = gson.fromJson(payload, ClientVO.class);
            clientService.createClient(vo);

        } catch (Exception e) {
            logger.error(">>>>>>>>>>>>>> : ", e.getMessage());
            return new ResponseEntity<String>(String.valueOf(e.getCause()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

}