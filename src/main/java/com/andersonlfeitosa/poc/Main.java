package com.andersonlfeitosa.poc;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

  public static void main(String[] args) {
    DecimalFormat decFormat = new DecimalFormat();
    DecimalFormatSymbols decSymbols = decFormat.getDecimalFormatSymbols();
    String localeProvidersList = System.getProperty("java.locale.providers", "JRE,SPI");
    System.out.println("Decimal separator is : " + decSymbols.getDecimalSeparator());
    System.out.println("Thousands separator is : " + decSymbols.getGroupingSeparator());
    System.out.println("Locale providers list : " + localeProvidersList);
  }

}