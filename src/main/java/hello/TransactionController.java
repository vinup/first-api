package hello;

import hello.domain.TransactionRequest;
import hello.domain.TransactionResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @RequestMapping(value = "/transact", method = RequestMethod.POST)
    public TransactionResponse transact(@RequestBody TransactionRequest transactionRequest) {
        return new TransactionResponse(transactionRequest.getTxnReference(), true);
    }


}
