package com.pump.infocollection.domain.sheetContent;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/21 0021.
 *
 */
public class FamilyFinance implements Serializable {

    private String annualIncome;                //家庭年收入
    private String annualExpenditure;           //家庭年支出
    private String isDebt;                      //或有负债

    public String getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getAnnualExpenditure() {
        return annualExpenditure;
    }

    public void setAnnualExpenditure(String annualExpenditure) {
        this.annualExpenditure = annualExpenditure;
    }

    public String getIsDebt() {
        return isDebt;
    }

    public void setIsDebt(String isDebt) {
        this.isDebt = isDebt;
    }
}
