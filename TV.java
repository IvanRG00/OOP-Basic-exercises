/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.unwe;

/**
 *
 * @author USER
 */
public  class TV extends Electronics {
          int size;
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public double getSalePrice(){
      return  getPrice()* 0.85;
      }
}