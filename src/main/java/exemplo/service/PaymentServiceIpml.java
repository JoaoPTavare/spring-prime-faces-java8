package exemplo.service;

import exemplo.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import exemplo.repository.PaymentRepository;

@Service
public class PaymentServiceIpml implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentServiceIpml(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);

    }

}
