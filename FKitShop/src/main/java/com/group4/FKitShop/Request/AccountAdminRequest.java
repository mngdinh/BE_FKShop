package com.group4.FKitShop.Request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountAdminRequest {

    String fullName;
    Date dob;
    @Size(min = 10, message = "Phone number at 10 digits")
    String phoneNumber;
    String email;
    int status;
    String role; // "user, staff, manager, admin
    String adminID;

}