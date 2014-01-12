package hello.controller;

import hello.database.AddressRepository;
import hello.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by astrid on 12.01.14.
 */
@Controller
public class AddressController {
    @Autowired
    private AddressRepository addressRepository;

    @RequestMapping("/address")
    public String showAll(Model model) {
        model.addAttribute("addresses", addressRepository.findAll());
        return "address/all";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value="id") String id) {
        addressRepository.delete(id);
        return "redirect:/address";
    }


    @RequestMapping("/newaddress")
    public String showForm(Model model) {
        model.addAttribute("address", new Address("Ling"));
        return "address/form";
    }

    @RequestMapping(value = "/address", method = RequestMethod.POST)
    public String create(Address address) {
        addressRepository.save(address);
        return "redirect:/address";
    }
}
