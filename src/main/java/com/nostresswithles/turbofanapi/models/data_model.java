package com.nostresswithles.turbofanapi.models;

import javax.persistence.*;

@Entity
@Table(name = "data_model")
public class data_model {

    @Id
    @Column(name = "unit_number")
    private Integer unit_number;

    @Column(name = "time_in_cycles")
    private Integer time_in_cycles;

    @Column(name = "op_setting_1")
    private Double op_setting_1;

    @Column(name = "op_setting_2")
    private Double op_setting_2;

    @Column(name = "op_setting_3")
    private Double op_setting_3;

    @Column(name = "sensor_measurement_1")
    private Double sensor_measurement_1;

    @Column(name = "sensor_measurement_2")
    private Double sensor_measurement_2;

    @Column(name = "sensor_measurement_3")
    private Double sensor_measurement_3;

    @Column(name = "sensor_measurement_4")
    private Double sensor_measurement_4;

    @Column(name = "sensor_measurement_5")
    private Double sensor_measurement_5;

    @Column(name = "sensor_measurement_6")
    private Double sensor_measurement_6;

    @Column(name = "sensor_measurement_7")
    private Double sensor_measurement_7;

    @Column(name = "sensor_measurement_8")
    private Double sensor_measurement_8;

    @Column(name = "sensor_measurement_9")
    private Double sensor_measurement_9;

    @Column(name = "sensor_measurement_10")
    private Double sensor_measurement_10;

    @Column(name = "sensor_measurement_11")
    private Double sensor_measurement_11;

    @Column(name = "sensor_measurement_12")
    private Double sensor_measurement_12;

    @Column(name = "sensor_measurement_13")
    private Double sensor_measurement_13;

    @Column(name = "sensor_measurement_14")
    private Double sensor_measurement_14;

    @Column(name = "sensor_measurement_15")
    private Double sensor_measurement_15;

    @Column(name = "sensor_measurement_16")
    private Double sensor_measurement_16;

    @Column(name = "sensor_measurement_17")
    private Double sensor_measurement_17;

    @Column(name = "sensor_measurement_18")
    private Double sensor_measurement_18;

    @Column(name = "sensor_measurement_19")
    private Double sensor_measurement_19;

    @Column(name = "sensor_measurement_20")
    private Double sensor_measurement_20;

    @Column(name = "sensor_measurement_21")
    private Double sensor_measurement_21;

    @Column(name = "sensor_measurement_22")
    private Double sensor_measurement_22;

    @Column(name = "sensor_measurement_23")
    private Double sensor_measurement_23;

    @Column(name = "sensor_measurement_24")
    private Double sensor_measurement_24;

    @Column(name = "sensor_measurement_25")
    private Double sensor_measurement_25;

    @Column(name = "sensor_measurement_26")
    private Double sensor_measurement_26;

    public data_model() {
    }

    public data_model(Integer unit_number, Integer time_in_cycles, Double op_setting_1, Double op_setting_2, Double op_setting_3, Double sensor_measurement_1, Double sensor_measurement_2, Double sensor_measurement_3, Double sensor_measurement_4, Double sensor_measurement_5, Double sensor_measurement_6, Double sensor_measurement_7, Double sensor_measurement_8, Double sensor_measurement_9, Double sensor_measurement_10, Double sensor_measurement_11, Double sensor_measurement_12, Double sensor_measurement_13, Double sensor_measurement_14, Double sensor_measurement_15, Double sensor_measurement_16, Double sensor_measurement_17, Double sensor_measurement_18, Double sensor_measurement_19, Double sensor_measurement_20, Double sensor_measurement_21, Double sensor_measurement_22, Double sensor_measurement_23, Double sensor_measurement_24, Double sensor_measurement_25, Double sensor_measurement_26) {
        this.unit_number = unit_number;
        this.time_in_cycles = time_in_cycles;
        this.op_setting_1 = op_setting_1;
        this.op_setting_2 = op_setting_2;
        this.op_setting_3 = op_setting_3;
        this.sensor_measurement_1 = sensor_measurement_1;
        this.sensor_measurement_2 = sensor_measurement_2;
        this.sensor_measurement_3 = sensor_measurement_3;
        this.sensor_measurement_4 = sensor_measurement_4;
        this.sensor_measurement_5 = sensor_measurement_5;
        this.sensor_measurement_6 = sensor_measurement_6;
        this.sensor_measurement_7 = sensor_measurement_7;
        this.sensor_measurement_8 = sensor_measurement_8;
        this.sensor_measurement_9 = sensor_measurement_9;
        this.sensor_measurement_10 = sensor_measurement_10;
        this.sensor_measurement_11 = sensor_measurement_11;
        this.sensor_measurement_12 = sensor_measurement_12;
        this.sensor_measurement_13 = sensor_measurement_13;
        this.sensor_measurement_14 = sensor_measurement_14;
        this.sensor_measurement_15 = sensor_measurement_15;
        this.sensor_measurement_16 = sensor_measurement_16;
        this.sensor_measurement_17 = sensor_measurement_17;
        this.sensor_measurement_18 = sensor_measurement_18;
        this.sensor_measurement_19 = sensor_measurement_19;
        this.sensor_measurement_20 = sensor_measurement_20;
        this.sensor_measurement_21 = sensor_measurement_21;
        this.sensor_measurement_22 = sensor_measurement_22;
        this.sensor_measurement_23 = sensor_measurement_23;
        this.sensor_measurement_24 = sensor_measurement_24;
        this.sensor_measurement_25 = sensor_measurement_25;
        this.sensor_measurement_26 = sensor_measurement_26;
    }

    public Integer getUnit_number() {
        return unit_number;
    }

    public Integer getTime_in_cycles() {
        return time_in_cycles;
    }

    public Double getOp_setting_1() {
        return op_setting_1;
    }

    public Double getOp_setting_2() {
        return op_setting_2;
    }

    public Double getOp_setting_3() {
        return op_setting_3;
    }

    public Double getSensor_measurement_1() {
        return sensor_measurement_1;
    }

    public Double getSensor_measurement_2() {
        return sensor_measurement_2;
    }

    public Double getSensor_measurement_3() {
        return sensor_measurement_3;
    }

    public Double getSensor_measurement_4() {
        return sensor_measurement_4;
    }

    public Double getSensor_measurement_5() {
        return sensor_measurement_5;
    }

    public Double getSensor_measurement_6() {
        return sensor_measurement_6;
    }

    public Double getSensor_measurement_7() {
        return sensor_measurement_7;
    }

    public Double getSensor_measurement_8() {
        return sensor_measurement_8;
    }

    public Double getSensor_measurement_9() {
        return sensor_measurement_9;
    }

    public Double getSensor_measurement_10() {
        return sensor_measurement_10;
    }

    public Double getSensor_measurement_11() {
        return sensor_measurement_11;
    }

    public Double getSensor_measurement_12() {
        return sensor_measurement_12;
    }

    public Double getSensor_measurement_13() {
        return sensor_measurement_13;
    }

    public Double getSensor_measurement_14() {
        return sensor_measurement_14;
    }

    public Double getSensor_measurement_15() {
        return sensor_measurement_15;
    }

    public Double getSensor_measurement_16() {
        return sensor_measurement_16;
    }

    public Double getSensor_measurement_17() {
        return sensor_measurement_17;
    }

    public Double getSensor_measurement_18() {
        return sensor_measurement_18;
    }

    public Double getSensor_measurement_19() {
        return sensor_measurement_19;
    }

    public Double getSensor_measurement_20() {
        return sensor_measurement_20;
    }

    public Double getSensor_measurement_21() {
        return sensor_measurement_21;
    }

    public Double getSensor_measurement_22() {
        return sensor_measurement_22;
    }

    public Double getSensor_measurement_23() {
        return sensor_measurement_23;
    }

    public Double getSensor_measurement_24() {
        return sensor_measurement_24;
    }

    public Double getSensor_measurement_25() {
        return sensor_measurement_25;
    }

    public Double getSensor_measurement_26() {
        return sensor_measurement_26;
    }
}
