package com.tech.sharekart;

import java.io.Serializable;

public interface Identifiable<T extends Serializable> {
    String getUserID();
}