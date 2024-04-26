package exemplo.view;

import exemplo.model.Order;
import exemplo.model.OrderItem;
import exemplo.model.Payment;
import exemplo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PaymentView {

    private final PaymentService paymentService;

    private Order order;
    private Payment payment;

    @Autowired
    public PaymentView(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostConstruct
    public void init() {
        payment= new Payment();
    }
    public Payment save(){
        return paymentService.save(payment);

    }

    public Payment setPayment(){
        return this.payment = payment;
    }
    public Payment getPayment() {
        return this.payment = payment;
    }



}
