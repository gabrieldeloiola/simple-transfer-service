package br.com.gabrielpessoa.simpletransferserviceapi.services;

import br.com.gabrielpessoa.simpletransferserviceapi.domain.user.User;
import br.com.gabrielpessoa.simpletransferserviceapi.domain.user.UserType;
import br.com.gabrielpessoa.simpletransferserviceapi.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == UserType.MERCHANT) {
            throw new Exception("Usuário do tipo Lojista não está autorizado a realizar transações.");
        }
        if (sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Saldo insuficiente");
        }
    }



}
