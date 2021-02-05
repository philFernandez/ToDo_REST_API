package com.googhcl.hellojwt.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtResponse implements Serializable {

    private static final long serialVersionUID = 3615668190905389504L;
    private final String jwttoken;
}
