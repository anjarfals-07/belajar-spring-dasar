package com.anjar.spring.core.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class CyclicA {

    public CyclicB cyclicB;

}
