package exemplo.view.converter;

import exemplo.model.Customer;
import exemplo.service.CustomerService;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.view.ViewScoped;

@FacesConverter(forClass = Customer.class)
@Component
public class CustomerConverter implements Converter {

    private final CustomerService customerService;

    public CustomerConverter(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            Long customerId = Long.valueOf(value);
            return customerService.findById(customerId); // Método para encontrar o Customer pelo ID
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Customer) {
            Customer customer = (Customer) value;
            return String.valueOf(customer.getId());
        }
        return null;
    }
}
