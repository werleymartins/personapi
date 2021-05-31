package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME("HOME"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}
