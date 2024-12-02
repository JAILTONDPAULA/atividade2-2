package br.com.g4f.emissor_ms.controller;

import br.com.g4f.emissor_ms.dtos.CartaoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/cartoes")
public class CartaoController {

    @PostMapping("/{idProposta}")
    public ResponseEntity<CartaoDto> send(@PathVariable Long idProposta) throws IOException {
        CartaoDto cartaoDto = new CartaoDto(999999999999L,"Cartão foi gerado com sucesso, acesse seu E-mail e procure por \"SEU NOVO CARTÃO CHEGOU\" para mais informações");
        return ResponseEntity.status(HttpStatus.CREATED).body(cartaoDto);
    }

}
