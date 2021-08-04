package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;

public interface MultiplicationService {

    // Create a Multiplication object with randomly generate factors
    //between 11 and 99
    // return a multiplication object with random factors
    Multiplication createRandomMultiplication();
}
