package br.com.app.urlshortener;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class UrlData {

    private String originalURL;
    private long expirationTime;
}
