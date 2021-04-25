package io.swagger.api;

import io.swagger.model.Extrato;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-25T01:28:00.559Z")

@Controller
public class ExtratoApiController implements ExtratoApi {

    private static final Logger log = LoggerFactory.getLogger(ExtratoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ExtratoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Extrato> consultaExtrato(@ApiParam(value = "",required=true) @PathVariable("agencia") Integer agencia,@ApiParam(value = "",required=true) @PathVariable("numero") Long numero,@ApiParam(value = "",required=true) @PathVariable("digito") Integer digito,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Extrato>(objectMapper.readValue("{  \"transacoes\" : [ {    \"tipo\" : \"debito\",    \"data\" : \"2000-01-23T04:56:07.000+00:00\",    \"valor\" : 6.027456183070403,    \"id\" : 0  }, {    \"tipo\" : \"debito\",    \"data\" : \"2000-01-23T04:56:07.000+00:00\",    \"valor\" : 6.027456183070403,    \"id\" : 0  } ]}", Extrato.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Extrato>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Extrato>(HttpStatus.NOT_IMPLEMENTED);
    }

}
