package com.skill.bills.dtos;

public class ProductDto {
    private Long id;

    private String name;

    private ManufacturerDto manufacturer;

    private String barcode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ManufacturerDto getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerDto manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
