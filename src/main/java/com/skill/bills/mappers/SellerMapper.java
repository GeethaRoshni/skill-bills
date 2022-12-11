package com.skill.bills.mappers;

import com.skill.bills.dtos.SellerDto;
import com.skill.bills.entity.Seller;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface SellerMapper {
    SellerDto sellerToSellerDto(Seller seller);
    Seller sellerDtoToSeller(SellerDto sellerDto);

    List<SellerDto> sellersToSellerDtos(List<Seller> sellers);
    List<Seller> sellerDtosToSellers(List<SellerDto> sellerDtos);
}
