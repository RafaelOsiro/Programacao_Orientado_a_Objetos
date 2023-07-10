package io.ucb.rafael.bluefoodpay;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class SBPayService {
	private static final String AUTH_TOKEN = "r2d2";
	
	@PostMapping(path = "/pay", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PaymentResponse> pagar(
			@RequestHeader("Token") String token,
			@Valid @RequestBody DadosCartao dadosCartao,
			Errors errors) {
		
		if (!AUTH_TOKEN.equals(token)) {
			return ResponseEntity.badRequest().body(new PaymentResponse("Token inválido"));
		}
		
		if (errors.hasErrors()) {
			return ResponseEntity.ok(new PaymentResponse(StatusPagamento.CartaoInvalido));
		}
		
		String numCartao = dadosCartao.getNumCartao();
		
		StatusPagamento status = StatusPagamento.Autorizado;
		
		if (numCartao.startsWith("0") || numCartao.startsWith("1") || numCartao.startsWith("2") || numCartao.startsWith("3") || numCartao.startsWith("4") || numCartao.startsWith("5") || numCartao.startsWith("6") || numCartao.startsWith("7") || numCartao.startsWith("8") || numCartao.startsWith("9")) {
			status = StatusPagamento.Autorizado;
		} else {
			status = StatusPagamento.NaoAutorizado;
		}
		
		return ResponseEntity.ok(new PaymentResponse(status));
	}
}
