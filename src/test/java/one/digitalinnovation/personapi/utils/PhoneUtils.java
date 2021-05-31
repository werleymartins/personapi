package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;

public class PhoneUtils {
    private static final long PHONE_ID = 1L;
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final String PHONE_NUMBER = "(21)987654321";

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .id(PHONE_ID)
                .type(PHONE_TYPE)
                .number(PHONE_NUMBER)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .type(PHONE_TYPE)
                .number(PHONE_NUMBER)
                .build();
    }
}
