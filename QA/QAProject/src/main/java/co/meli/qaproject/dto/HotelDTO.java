package co.meli.qaproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO {
    String codeHotel;
    String name;
    String city;
    String roomType;
    Integer nightPrice;
    String dateTo;
    String dateFrom;
    Boolean reserved;
}
