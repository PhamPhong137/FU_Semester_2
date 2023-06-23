/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btworkshop5;

/**
 *
 * @author PC-Phong
 */
public class IntPhoneNumber extends PhoneNumber {

    private String countryCode;

    public String getCountyCode() {
        return countryCode;
    }

    public void setCountyCode(String countyCode) {
        this.countryCode = countyCode;
    }

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String countyCode) {
        this.countryCode = countyCode;
    }

    public IntPhoneNumber(String countyCode, int area, String number) {
        super(area, number);
        this.countryCode = countyCode;
    }
    @Override
    public void display(){
       System.out.println(this.countryCode+" - "+super.getArea()+" - "+super.getNumber());
   }
   
                
        
    

}
