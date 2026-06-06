import java.util.*;

class Phone{

private int phoneid;
private String os;
private String brand;
private int price;


Phone(int phoneid,String os, String brand, int price){
    this.phoneid = phoneid;
    this.os = os;
    this.brand = brand;
    this.price = price;
}


int getPhoneid(){
    return this.phoneid;
}
void setPhoneid(int i){
    this.phoneid = i;
}

String getOs(){
    return this.os;
}
void setOs(String o){
    this.os = o;
}

String getBrand(){
    return this.brand;
}
void setBrand(String b){
    this.brand = b;
}

int getPrice(){
    return this.price;
}
void setPrice(int p){
    this.price = p;
}

class PhoneSolution{

    
    public static void main(String[]args){

    }



}

}
