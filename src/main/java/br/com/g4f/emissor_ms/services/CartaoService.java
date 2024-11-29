package br.com.g4f.emissor_ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class CartaoService {

    @Autowired
    private EmailService emailService;

    public ResponseEntity<String> sendEmail(Long idProposta) throws IOException {
        //implementar registro do cartão

        var  resource = new ClassPathResource("templates/email-cartao.html");
        Path path = resource.getFile().toPath();
        String body = Files.readString(path, StandardCharsets.UTF_8);
        //atualizar dados do template

        if(!emailService.enviarEmail("jailton.viana2@hotmail.com","SEU NOVO CARTÃO CHEGOU",null,body)) {
            return ResponseEntity.ok("E-mail não disparado");
        }

        return ResponseEntity.ok("Verifique seu E-mail e procure por \"SEU NOVO CARTÃO CHEGOU\"");
    }

}
