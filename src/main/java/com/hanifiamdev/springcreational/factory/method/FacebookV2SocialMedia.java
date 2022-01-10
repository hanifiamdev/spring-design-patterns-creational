package com.hanifiamdev.springcreational.factory.method;

import lombok.Getter;


public class FacebookV2SocialMedia implements SocialMedia{

    @Getter
    private final String name = "FACEBOOKV2";

    @Getter
    private final String link = "https://web.facebook.com";

    @Getter
    private  final SocialMediaType type = SocialMediaType.FACEBOOK;

}
