package io.github.Ital023.EcommerceItalo.service;

import io.github.Ital023.EcommerceItalo.controller.dto.CreateUserDto;
import io.github.Ital023.EcommerceItalo.entities.BillingAddressEntity;
import io.github.Ital023.EcommerceItalo.entities.UserEntity;
import io.github.Ital023.EcommerceItalo.repository.BillingAddressRepository;
import io.github.Ital023.EcommerceItalo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BillingAddressRepository billingAddressRepository;

    public UserService(UserRepository userRepository, BillingAddressRepository billingAddressRepository) {
        this.userRepository = userRepository;
        this.billingAddressRepository = billingAddressRepository;
    }

    public UserEntity createUser(CreateUserDto dto) {

        BillingAddressEntity billingAddress = new BillingAddressEntity();
        billingAddress.setAddress(dto.address());
        billingAddress.setNumber(dto.number());
        billingAddress.setComplement(dto.complement());

        var savedBillingAddress = billingAddressRepository.save(billingAddress);

        UserEntity user = new UserEntity();
        user.setFullName(dto.fullName());
        user.setBillingAddress(savedBillingAddress);

        return userRepository.save(user);
    }


}
