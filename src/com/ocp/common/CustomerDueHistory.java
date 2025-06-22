package com.ocp.common;

import java.util.HashMap;
import java.util.Map;

public class CustomerDueHistory {
    public static Double getDueAmount(String customerId) {
        Map<String, Double> dueAmounts = new HashMap<>();
        dueAmounts.put("C9000891", 6710.30);
        dueAmounts.put("C9000849", 9010.30);
        dueAmounts.put("C9000991", 10410.30);
        dueAmounts.put("C9000899", 4710.30);
        dueAmounts.put("C9001851", 910.30);
        dueAmounts.put("C9000399", 18910.30);
        dueAmounts.put("C9000599", 4020.30);

        return dueAmounts.get(customerId);
    }
}
