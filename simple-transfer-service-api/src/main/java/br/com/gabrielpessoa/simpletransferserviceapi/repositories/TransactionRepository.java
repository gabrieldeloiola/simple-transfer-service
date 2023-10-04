package br.com.gabrielpessoa.simpletransferserviceapi.repositories;

import br.com.gabrielpessoa.simpletransferserviceapi.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
