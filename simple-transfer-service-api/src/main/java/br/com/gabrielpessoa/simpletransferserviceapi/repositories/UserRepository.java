package br.com.gabrielpessoa.simpletransferserviceapi.repositories;

import br.com.gabrielpessoa.simpletransferserviceapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findUserByDocument(String document);
}
