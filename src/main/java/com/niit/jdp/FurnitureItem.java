package com.niit.jdp;

public class FurnitureItem {
    String color;
    int furnitureCode;
    String FurnitureType;
    char gradeOfFurniture;
    String FurnitureUsage;
    double FurniturePrice;
    
    double calculateDiscount ( double priceOfFurniture ) {
        return priceOfFurniture + ( priceOfFurniture * 0.05 );
    }
    
}
