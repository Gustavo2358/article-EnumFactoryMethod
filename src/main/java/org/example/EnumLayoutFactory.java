package org.example;

import java.util.Arrays;
import java.util.function.Supplier;

public enum EnumLayoutFactory {

    LAYOUT_1(Parameter.PARAM_1, LayoutImplementation1::new),
    LAYOUT_2(Parameter.PARAM_2, LayoutImplementation2::new),
    LAYOUT_3(Parameter.PARAM_3, LayoutImplementation3::new),
    LAYOUT_4(Parameter.PARAM_4, LayoutImplementation4::new),
    LAYOUT_5(Parameter.PARAM_5, LayoutImplementation5::new);

    private Parameter parameter;
    private Supplier<Layout> supplier;

    EnumLayoutFactory(Parameter parameter, Supplier supplier) {
        this.parameter = parameter;
        this.supplier = supplier;
    }

    public static Layout getInstance(Parameter parameter){
        return Arrays.stream(EnumLayoutFactory.values())
                .filter(value -> value.parameter.equals(parameter))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .supplier.get();
    }
}
