package com.github.revival.common.enums;

public enum EnumCoinType {
    NORMAL(1),
    HELL(0);
    public int targetDimension;

    private EnumCoinType(int var3) {
        this.targetDimension = var3;
    }
}
