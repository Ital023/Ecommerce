package io.github.Ital023.EcommerceItalo.controller.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateUserDto(@NotBlank String fullName,
                            @NotBlank String address,
                            @NotBlank String number,
                            String complement) {
}
