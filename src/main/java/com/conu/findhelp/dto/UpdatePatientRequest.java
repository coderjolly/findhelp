package com.conu.findhelp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePatientRequest {
    String counsellorEmail;
    String patientEmail;
    String status;
    String reason;
    String doctorEmail;
}
