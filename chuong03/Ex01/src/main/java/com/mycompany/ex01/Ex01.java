/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex01;

/**
 *
 * @author Admin
 */
.thenApply(result -> {
    System.out.println("Truoc khi sap xep: " + result);
    // Sort by GPA in descending order (highest first)
    result.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
    return result;
})