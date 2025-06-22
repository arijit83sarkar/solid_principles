
package com.srp.goodexample;

import java.util.List;

public class AuditService {

    // SAVE AUDIT DETAILS - MAINTAIN A LOG FOR THE CHANGES IN THE ENTITIES
    public String saveAuditDetails(List<AuditDetails> auditDetails) {
        // LOGIC TO SAVE AUDIT DETAILS IN DB
        // ...

        System.out.println("Audit details saved successfully.");
        return "SUCCESS";
    }
}
